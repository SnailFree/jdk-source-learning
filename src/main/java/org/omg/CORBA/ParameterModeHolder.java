package org.omg.CORBA;

/**
* org/omg/CORBA/ParameterModeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u40/2855/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Tuesday, February 10, 2015 9:55:25 PM PST
*/


/**
   * Enumeration of parameter modes for Parameter.  Possible vaues:
   * <ul>
   *   <li>PARAM_IN - Represents an "in" parameter.</li>
   *   <li>PARAM_OUT - Represents an "out" parameter.</li>
   *   <li>PARAM_INOUT - Represents an "inout" parameter.</li>
   * </ul>
   */
public final class ParameterModeHolder implements org.omg.CORBA.portable.Streamable
{
  public ParameterMode value = null;

  public ParameterModeHolder ()
  {
  }

  public ParameterModeHolder (ParameterMode initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ParameterModeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ParameterModeHelper.write (o, value);
  }

  public TypeCode _type ()
  {
    return ParameterModeHelper.type ();
  }

}
