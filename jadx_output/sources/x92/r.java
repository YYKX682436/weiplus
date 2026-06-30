package x92;

/* loaded from: classes2.dex */
public class r extends com.tencent.mm.ui.component.UIComponent implements x92.q {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f452719d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f452720e;

    /* renamed from: f, reason: collision with root package name */
    public x92.f f452721f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public void O6(int i17, java.lang.String str) {
    }

    public void P6(int i17, java.lang.String str) {
    }

    public void Q6() {
        x92.f fVar = this.f452721f;
        if (fVar != null) {
            fVar.b(getActivity());
        }
    }

    public void R6() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) getActivity().findViewById(com.tencent.mm.R.id.f482591io);
        this.f452720e = frameLayout;
        if ((frameLayout != null ? frameLayout.getChildCount() : -1) == 0 && (getActivity() instanceof t92.b)) {
            android.view.LayoutInflater.Factory activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.base.config.IHeaderConfig");
            int N2 = ((t92.b) activity).N2();
            if (N2 > 0) {
                android.view.View inflate = com.tencent.mm.ui.id.b(getActivity()).inflate(N2, (android.view.ViewGroup) null);
                android.widget.FrameLayout frameLayout2 = this.f452720e;
                if (frameLayout2 != null) {
                    frameLayout2.addView(inflate);
                }
            }
        }
    }

    public void S6(com.tencent.mm.protobuf.f fVar) {
        T6(fVar);
        U6();
    }

    public void T6(com.tencent.mm.protobuf.f fVar) {
        this.f452719d = fVar;
        x92.f fVar2 = this.f452721f;
        if (fVar2 == null) {
            return;
        }
        fVar2.f452691a = fVar;
    }

    public void U6() {
        z5();
    }

    public void b2() {
    }

    @Override // x92.q
    public java.lang.String d2() {
        java.lang.String a17;
        x92.f fVar = this.f452721f;
        return (fVar == null || (a17 = fVar.a()) == null) ? "" : a17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.LayoutInflater.Factory activity = getActivity();
        t92.a aVar = activity instanceof t92.a ? (t92.a) activity : null;
        this.f452721f = aVar != null ? aVar.o6() : null;
        Q6();
        R6();
    }

    public void setNormalStyle() {
    }
}
