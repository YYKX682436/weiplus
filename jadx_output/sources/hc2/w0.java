package hc2;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hc2.w0 f280343d = new hc2.w0();

    public w0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            java.io.InputStream open = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("email/WCFinderStringHighlightToolTopHost.txt");
            kotlin.jvm.internal.o.f(open, "open(...)");
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(open, r26.c.f368865a);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                vz5.v.a(bufferedReader, new vz5.u(arrayList));
                vz5.b.a(bufferedReader, null);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(r26.n0.u0((java.lang.String) it.next()).toString());
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    if (((java.lang.String) next).length() > 0) {
                        arrayList3.add(next);
                    }
                }
                return kz5.n0.X0(arrayList3);
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderStringExt", "load tld file error", e17);
            return kz5.r0.f314002d;
        }
    }
}
