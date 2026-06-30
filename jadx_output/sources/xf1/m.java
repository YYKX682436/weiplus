package xf1;

/* loaded from: classes7.dex */
public final class m extends xf1.o {

    /* renamed from: e, reason: collision with root package name */
    public static final xf1.l f454244e = new xf1.l(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f454245d;

    public m(java.lang.String str, long j17, java.util.List list, kotlin.jvm.internal.i iVar) {
        super(str, j17);
        this.f454245d = list;
    }

    @Override // xf1.o
    public org.json.JSONObject a() {
        try {
            org.json.JSONObject a17 = super.a();
            if (a17 == null) {
                return null;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = this.f454245d.iterator();
            while (it.hasNext()) {
                jSONArray.put(((xf1.o) it.next()).a());
            }
            a17.put("subMetas", jSONArray);
            return a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "DirMetaData#toJson, fail since " + e17);
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.tencent.mm.vfs.r6 r13) {
        /*
            r12 = this;
            java.lang.String r0 = "unzipDir"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = r13.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            long r2 = r13.B()
            com.tencent.mm.vfs.r6[] r13 = r13.G()
            kotlin.jvm.internal.o.d(r13)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r13.length
            r4.<init>(r5)
            int r5 = r13.length
            r6 = 0
        L22:
            if (r6 >= r5) goto L50
            r7 = r13[r6]
            kotlin.jvm.internal.o.d(r7)
            boolean r8 = r7.y()
            if (r8 == 0) goto L39
            xf1.l r8 = xf1.m.f454244e
            xf1.m r7 = r8.a(r7)
            kotlin.jvm.internal.o.d(r7)
            goto L4a
        L39:
            xf1.o r8 = new xf1.o
            java.lang.String r9 = r7.getName()
            kotlin.jvm.internal.o.f(r9, r1)
            long r10 = r7.B()
            r8.<init>(r9, r10)
            r7 = r8
        L4a:
            r4.add(r7)
            int r6 = r6 + 1
            goto L22
        L50:
            r12.<init>(r0, r2)
            r12.f454245d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xf1.m.<init>(com.tencent.mm.vfs.r6):void");
    }
}
