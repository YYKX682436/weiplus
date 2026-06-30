package w46;

/* loaded from: classes12.dex */
public class c implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Throwable f442931d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(w46.b bVar) {
        this.f442931d = null;
        if (!(bVar instanceof java.lang.Throwable)) {
            throw new java.lang.IllegalArgumentException("The Nestable implementation passed to the NestableDelegate(Nestable) constructor must extend java.lang.Throwable");
        }
        this.f442931d = (java.lang.Throwable) bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(java.io.PrintWriter printWriter) {
        java.lang.Throwable b17;
        java.lang.Throwable th6 = this.f442931d;
        if (w46.a.f442929c != null) {
            if (th6 instanceof w46.b) {
                ((w46.d) ((w46.b) th6)).a(printWriter);
                return;
            } else {
                th6.printStackTrace(printWriter);
                return;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Throwable th7 = th6;
        while (th7 != null) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter((java.io.Writer) stringWriter, true);
            if (th7 instanceof w46.b) {
                ((w46.d) ((w46.b) th7)).a(printWriter2);
            } else {
                th7.printStackTrace(printWriter2);
            }
            java.lang.String stringBuffer = stringWriter.getBuffer().toString();
            java.lang.Object obj = w46.a.f442927a;
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(stringBuffer, u46.m.f424686b);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (stringTokenizer.hasMoreTokens()) {
                arrayList2.add(stringTokenizer.nextToken());
            }
            arrayList.add((java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]));
            synchronized (w46.a.f442927a) {
                b17 = w46.a.b(th7, w46.a.f442928b);
            }
            th7 = b17;
        }
        int size = arrayList.size() - 1;
        while (size > 0) {
            java.lang.String[] strArr = (java.lang.String[]) arrayList.get(size);
            int i17 = size - 1;
            java.lang.String[] strArr2 = (java.lang.String[]) arrayList.get(i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(java.util.Arrays.asList(strArr));
            java.util.ArrayList arrayList4 = new java.util.ArrayList(java.util.Arrays.asList(strArr2));
            java.lang.Object obj2 = w46.a.f442927a;
            int size2 = arrayList3.size() - 1;
            int size3 = arrayList4.size();
            while (true) {
                size3--;
                if (size2 < 0 || size3 < 0) {
                    break;
                }
                if (((java.lang.String) arrayList3.get(size2)).equals((java.lang.String) arrayList4.get(size3))) {
                    arrayList3.remove(size2);
                }
                size2--;
            }
            int length = strArr.length - arrayList3.size();
            if (length > 0) {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("\t... ");
                stringBuffer2.append(length);
                stringBuffer2.append(" more");
                arrayList3.add(stringBuffer2.toString());
                arrayList.set(size, arrayList3.toArray(new java.lang.String[arrayList3.size()]));
            }
            size = i17;
        }
        synchronized (printWriter) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (java.lang.String str : (java.lang.String[]) it.next()) {
                    printWriter.println(str);
                }
                if (it.hasNext()) {
                    printWriter.print("Caused by: ");
                }
            }
        }
    }
}
