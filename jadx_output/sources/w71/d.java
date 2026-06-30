package w71;

/* loaded from: classes11.dex */
public final class d implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.e70 f443392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443393b;

    public d(bw5.e70 e70Var, yz5.l lVar) {
        this.f443392a = e70Var;
        this.f443393b = lVar;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        yz5.l lVar = this.f443393b;
        if (obj == null || !(obj instanceof com.tencent.mm.protocal.protobuf.FinderObject)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ting" + ".".concat("TingFinderSourcePlugin"), "requestMediaInfo fail, errType: " + i17 + ", errCode: " + i18);
            if (lVar != null) {
                lVar.invoke(new byte[0]);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMediaInfo success, tid:");
        java.lang.String tid = this.f443392a.getTid();
        kotlin.jvm.internal.o.d(tid);
        sb6.append((java.lang.Object) jz5.x.a(r26.q0.c(tid)));
        com.tencent.mars.xlog.Log.i("MicroMsg.Ting" + ".".concat("TingFinderSourcePlugin"), sb6.toString());
        if (lVar != null) {
            byte[] byteArray = ((com.tencent.mm.protocal.protobuf.FinderObject) obj).toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            lVar.invoke(byteArray);
        }
    }
}
