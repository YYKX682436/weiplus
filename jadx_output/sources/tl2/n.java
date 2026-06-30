package tl2;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.n1 f420260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl2.u f420261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420262f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var, tl2.u uVar, java.lang.String str) {
        super(0);
        this.f420260d = n1Var;
        this.f420261e = uVar;
        this.f420262f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f420262f;
        tl2.u uVar = this.f420261e;
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = this.f420260d;
        tl2.m mVar = new tl2.m(uVar, n1Var, str);
        if (n1Var.f187434q && uVar.n()) {
            android.app.Activity activity = uVar.f420274d;
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null) {
                mMActivity.addOnConfigurationChangedListener(new tl2.k(uVar, mVar));
            }
            com.tencent.mm.ui.MMActivity mMActivity2 = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity2 != null) {
                mMActivity2.setRequestedOrientation(1);
            }
        } else {
            mVar.run();
        }
        return jz5.f0.f302826a;
    }
}
