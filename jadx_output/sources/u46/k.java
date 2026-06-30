package u46;

/* loaded from: classes7.dex */
public abstract class k {
    static {
        java.lang.String.valueOf('\"');
    }

    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter(str.length() * 2);
            b(stringWriter, str, true, true);
            return stringWriter.toString();
        } catch (java.io.IOException e17) {
            throw new u46.n(e17);
        }
    }

    public static void b(java.io.Writer writer, java.lang.String str, boolean z17, boolean z18) {
        if (writer == null) {
            throw new java.lang.IllegalArgumentException("The Writer must not be null");
        }
        if (str == null) {
            return;
        }
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            if (charAt > 4095) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("\\u");
                stringBuffer.append(d(charAt));
                writer.write(stringBuffer.toString());
            } else if (charAt > 255) {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("\\u0");
                stringBuffer2.append(d(charAt));
                writer.write(stringBuffer2.toString());
            } else if (charAt > 127) {
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("\\u00");
                stringBuffer3.append(d(charAt));
                writer.write(stringBuffer3.toString());
            } else if (charAt < ' ') {
                switch (charAt) {
                    case '\b':
                        writer.write(92);
                        writer.write(98);
                        break;
                    case '\t':
                        writer.write(92);
                        writer.write(116);
                        break;
                    case '\n':
                        writer.write(92);
                        writer.write(110);
                        break;
                    case 11:
                    default:
                        if (charAt > 15) {
                            java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("\\u00");
                            stringBuffer4.append(d(charAt));
                            writer.write(stringBuffer4.toString());
                            break;
                        } else {
                            java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer("\\u000");
                            stringBuffer5.append(d(charAt));
                            writer.write(stringBuffer5.toString());
                            break;
                        }
                    case '\f':
                        writer.write(92);
                        writer.write(102);
                        break;
                    case '\r':
                        writer.write(92);
                        writer.write(114);
                        break;
                }
            } else if (charAt == '\"') {
                writer.write(92);
                writer.write(34);
            } else if (charAt == '\'') {
                if (z17) {
                    writer.write(92);
                }
                writer.write(39);
            } else if (charAt == '/') {
                if (z18) {
                    writer.write(92);
                }
                writer.write(47);
            } else if (charAt != '\\') {
                writer.write(charAt);
            } else {
                writer.write(92);
                writer.write(92);
            }
        }
    }

    public static java.lang.String c(java.lang.String str) {
        if (str == null) {
            return null;
        }
        u46.f fVar = u46.f.f424677e;
        fVar.getClass();
        java.io.StringWriter stringWriter = new java.io.StringWriter((int) (str.length() + (str.length() * 0.1d)));
        try {
            int length = str.length();
            for (int i17 = 0; i17 < length; i17++) {
                char charAt = str.charAt(i17);
                java.lang.String a17 = ((u46.d) fVar.f424678a).a(charAt);
                if (a17 != null) {
                    stringWriter.write(38);
                    stringWriter.write(a17);
                    stringWriter.write(59);
                } else if (charAt > 127) {
                    stringWriter.write("&#");
                    stringWriter.write(java.lang.Integer.toString(charAt, 10));
                    stringWriter.write(59);
                } else {
                    stringWriter.write(charAt);
                }
            }
            return stringWriter.toString();
        } catch (java.io.IOException e17) {
            throw new u46.n(e17);
        }
    }

    public static java.lang.String d(char c17) {
        return java.lang.Integer.toHexString(c17).toUpperCase(java.util.Locale.ENGLISH);
    }

    public static java.lang.String e(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter(str.length());
            f(stringWriter, str);
            return stringWriter.toString();
        } catch (java.io.IOException e17) {
            throw new u46.n(e17);
        }
    }

    public static void f(java.io.Writer writer, java.lang.String str) {
        if (writer == null) {
            throw new java.lang.IllegalArgumentException("The Writer must not be null");
        }
        if (str == null) {
            return;
        }
        int length = str.length();
        x46.a aVar = new x46.a(4);
        boolean z17 = false;
        boolean z18 = false;
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            if (z18) {
                aVar.a(charAt);
                if (aVar.f451940e == 4) {
                    try {
                        writer.write((char) java.lang.Integer.parseInt(aVar.toString(), 16));
                        int i18 = aVar.f451940e;
                        if (i18 > 0) {
                            aVar.f451940e = 0;
                        } else if (i18 < 0) {
                            aVar.d(0);
                            aVar.f451940e = 0;
                            for (int i19 = aVar.f451940e; i19 < 0; i19++) {
                                aVar.f451939d[i19] = 0;
                            }
                        }
                        z17 = false;
                        z18 = false;
                    } catch (java.lang.NumberFormatException e17) {
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Unable to parse unicode value: ");
                        stringBuffer.append(aVar);
                        throw new w46.d(stringBuffer.toString(), e17);
                    }
                } else {
                    continue;
                }
            } else if (z17) {
                if (charAt == '\"') {
                    writer.write(34);
                } else if (charAt == '\'') {
                    writer.write(39);
                } else if (charAt == '\\') {
                    writer.write(92);
                } else if (charAt == 'b') {
                    writer.write(8);
                } else if (charAt == 'f') {
                    writer.write(12);
                } else if (charAt == 'n') {
                    writer.write(10);
                } else if (charAt == 'r') {
                    writer.write(13);
                } else if (charAt == 't') {
                    writer.write(9);
                } else if (charAt != 'u') {
                    writer.write(charAt);
                } else {
                    z17 = false;
                    z18 = true;
                }
                z17 = false;
            } else if (charAt == '\\') {
                z17 = true;
            } else {
                writer.write(charAt);
            }
        }
        if (z17) {
            writer.write(92);
        }
    }

    public static java.lang.String g(java.lang.String str) {
        if (str == null) {
            return null;
        }
        u46.f fVar = u46.f.f424677e;
        fVar.getClass();
        int indexOf = str.indexOf(38);
        if (indexOf < 0) {
            return str;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter((int) (str.length() + (str.length() * 0.1d)));
        try {
            fVar.b(stringWriter, str, indexOf);
            return stringWriter.toString();
        } catch (java.io.IOException e17) {
            throw new u46.n(e17);
        }
    }
}
