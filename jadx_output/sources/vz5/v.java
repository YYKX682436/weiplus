package vz5;

/* loaded from: classes7.dex */
public abstract class v {
    public static final void a(java.io.Reader reader, yz5.l action) {
        kotlin.jvm.internal.o.g(reader, "<this>");
        kotlin.jvm.internal.o.g(action, "action");
        java.io.BufferedReader bufferedReader = reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, 8192);
        try {
            java.util.Iterator it = b(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            vz5.b.a(bufferedReader, null);
        } finally {
        }
    }

    public static final q26.n b(java.io.BufferedReader bufferedReader) {
        kotlin.jvm.internal.o.g(bufferedReader, "<this>");
        return q26.y.b(new vz5.s(bufferedReader));
    }

    public static final java.lang.String c(java.io.Reader reader) {
        kotlin.jvm.internal.o.g(reader, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        java.lang.String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.o.f(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
