package t03;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t03.k0 k0Var) {
        super(1);
        this.f414495d = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kk4.b it = (kk4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kk4.v vVar = (kk4.v) it;
        kk4.c cVar = vVar.f308577b;
        long propertyLong = cVar != null ? ((kk4.f0) cVar).getPropertyLong(205) : 0L;
        kk4.c cVar2 = vVar.f308577b;
        int videoWidth = cVar2 != null ? ((kk4.f0) cVar2).getVideoWidth() : 0;
        kk4.c cVar3 = vVar.f308577b;
        int videoHeight = cVar3 != null ? ((kk4.f0) cVar3).getVideoHeight() : 0;
        t03.k0 k0Var = this.f414495d;
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "setInputContentInfo, size:[" + videoWidth + ", " + videoHeight + "], rotate:" + propertyLong);
        k0Var.f414467i.m(videoWidth, videoHeight, (int) propertyLong);
        return jz5.f0.f302826a;
    }
}
