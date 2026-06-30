package zi2;

/* loaded from: classes3.dex */
public final class d implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473103d;

    public d(zi2.w wVar) {
        this.f473103d = wVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean c17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        zi2.w wVar = this.f473103d;
        wVar.getClass();
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.X2).getValue()).r()).intValue() == 0) {
            c17 = true;
        } else {
            c17 = wVar.w1().c();
            com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "isEnablePkBarClick: " + c17);
        }
        if (c17) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "pk bar clicked, is red team " + booleanValue);
            ((ni2.w) ((jz5.n) wVar.f473160w).getValue()).z(booleanValue ? fj2.k.f263175d : fj2.k.f263176e, null);
        }
        return jz5.f0.f302826a;
    }
}
