package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerManager.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/workspace/8-2-build-solaris-amd64/jdk8u112/7884/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, September 22, 2016 10:36:53 PM UTC
*/


/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
public interface ServerManager extends ServerManagerOperations, com.sun.corba.se.PortableActivationIDL.Activator, com.sun.corba.se.PortableActivationIDL.Locator
{
} // interface ServerManager