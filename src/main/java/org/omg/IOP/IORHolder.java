package org.omg.IOP;

/**
* org/omg/IOP/IORHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u40/2855/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, February 10, 2015 9:55:25 PM PST
*/

public final class IORHolder implements org.omg.CORBA.portable.Streamable
{
  public IOR value = null;

  public IORHolder ()
  {
  }

  public IORHolder (IOR initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IORHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IORHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IORHelper.type ();
  }

}