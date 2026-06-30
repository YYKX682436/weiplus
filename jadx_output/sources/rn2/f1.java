package rn2;

/* loaded from: classes8.dex */
public final class f1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f397729d;

    /* renamed from: e, reason: collision with root package name */
    public rn2.f f397730e;

    /* renamed from: f, reason: collision with root package name */
    public rn2.g f397731f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f397732g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f397733h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f397729d = "FinderLiveLotteryCreateUIC";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.apq;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f397730e = new rn2.c1(getActivity());
        android.view.View rootView = getRootView();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        rn2.t2 t2Var = new rn2.t2(rootView, (com.tencent.mm.ui.MMActivity) activity, this.f397730e);
        this.f397731f = t2Var;
        rn2.f fVar = this.f397730e;
        if (fVar != null) {
            ((rn2.c1) fVar).onAttach(t2Var);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        rn2.f fVar = this.f397730e;
        if (fVar != null) {
            ((rn2.c1) fVar).onDetach();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.f397732g;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        android.view.View decorView;
        android.view.Window window = getActivity().getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new rn2.e1(this));
    }
}
