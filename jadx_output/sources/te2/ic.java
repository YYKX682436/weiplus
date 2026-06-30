package te2;

/* loaded from: classes10.dex */
public final class ic extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.jc f418123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(te2.jc jcVar) {
        super(1);
        this.f418123d = jcVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        te2.jc jcVar = this.f418123d;
        com.tencent.mars.xlog.Log.i(jcVar.c(), "showMusicView - loadMoreData callback, size: " + intValue);
        if (intValue <= 0) {
            te2.lc lcVar = jcVar.f418153h;
            if (lcVar != null) {
                lcVar.d(true);
            }
            bm2.x8 x8Var = jcVar.f418154i;
            if (x8Var != null) {
                x8Var.m();
            }
        } else {
            te2.lc lcVar2 = jcVar.f418153h;
            if (lcVar2 != null) {
                lcVar2.e();
            }
            bm2.x8 x8Var2 = jcVar.f418154i;
            if (x8Var2 != null) {
                x8Var2.b(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
