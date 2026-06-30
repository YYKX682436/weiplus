package o50;

/* loaded from: classes.dex */
public final class b extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f343059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        this.f343059d = r26.n0.f0(stringExtra == null ? "" : stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new o50.a(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.AfterForwardEnterChattingUIC", "EnterChattingAfterTrans AfterForwardEnterChattingUIC onCreateAfter ".concat(getActivity().getClass().getSimpleName()));
    }
}
