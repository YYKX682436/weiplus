package hw2;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f285527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hw2.t tVar) {
        super(1);
        this.f285527d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", booleanValue);
        hw2.t tVar = this.f285527d;
        tVar.f285561f.w(ju3.c0.f301907v, bundle);
        if (!booleanValue) {
            android.view.KeyEvent.Callback findViewById = tVar.e().findViewById(com.tencent.mm.R.id.ept);
            os5.p pVar = findViewById instanceof os5.p ? (os5.p) findViewById : null;
            android.view.KeyEvent.Callback findViewById2 = tVar.e().findViewById(com.tencent.mm.R.id.epl);
            os5.o oVar = findViewById2 instanceof os5.o ? (os5.o) findViewById2 : null;
            if (pVar != null) {
                pVar.setSuitMode(true);
            }
            if (oVar != null) {
                ((com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView) oVar).b(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
