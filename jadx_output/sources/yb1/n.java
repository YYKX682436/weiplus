package yb1;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f460668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f460669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17, kotlinx.coroutines.q qVar) {
        super(1);
        this.f460668d = i17;
        this.f460669e = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r3 == null) goto L9;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getOuterHTML callbackId:"
            r0.<init>(r1)
            int r1 = r2.f460668d
            r0.append(r1)
            java.lang.String r1 = ", params:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.GetPageContentService"
            com.tencent.mars.xlog.Log.i(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3b
            r0.<init>(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = "data"
            org.json.JSONObject r3 = r0.optJSONObject(r3)     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L38
            java.lang.String r0 = "outerHTML"
            java.lang.String r3 = r3.optString(r0)     // Catch: java.lang.Exception -> L3b
            goto L39
        L38:
            r3 = 0
        L39:
            if (r3 != 0) goto L3d
        L3b:
            java.lang.String r3 = ""
        L3d:
            java.lang.Object r3 = kotlin.Result.m521constructorimpl(r3)
            kotlinx.coroutines.q r0 = r2.f460669e
            kotlinx.coroutines.r r0 = (kotlinx.coroutines.r) r0
            r0.resumeWith(r3)
            jz5.f0 r3 = jz5.f0.f302826a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yb1.n.invoke(java.lang.Object):java.lang.Object");
    }
}
