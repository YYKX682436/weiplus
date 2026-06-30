package eu0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f256716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gu0.k2 k2Var) {
        super(1);
        this.f256716d = k2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gu0.k2 k2Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        gu0.k2 k2Var2 = this.f256716d;
        boolean z17 = false;
        if (k2Var2 != null) {
            com.tencent.mars.xlog.Log.i("MJCC.Session", "onMusicPanelClose");
            k2Var2.f275734j = false;
        }
        if (!booleanValue) {
            gu0.k2 k2Var3 = this.f256716d;
            if (k2Var3 != null && k2Var3.f275733i) {
                z17 = true;
            }
            if (!z17 && (k2Var = this.f256716d) != null) {
                k2Var.t();
            }
        }
        return jz5.f0.f302826a;
    }
}
