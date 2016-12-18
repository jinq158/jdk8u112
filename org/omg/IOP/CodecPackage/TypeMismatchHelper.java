package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/TypeMismatchHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/workspace/8-2-build-solaris-amd64/jdk8u112/7884/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, September 22, 2016 10:36:53 PM UTC
*/

abstract public class TypeMismatchHelper
{
  private static String  _id = "IDL:omg.org/IOP/Codec/TypeMismatch:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.IOP.CodecPackage.TypeMismatch that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.IOP.CodecPackage.TypeMismatch extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (org.omg.IOP.CodecPackage.TypeMismatchHelper.id (), "TypeMismatch", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.IOP.CodecPackage.TypeMismatch read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.IOP.CodecPackage.TypeMismatch value = new org.omg.IOP.CodecPackage.TypeMismatch ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.IOP.CodecPackage.TypeMismatch value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}