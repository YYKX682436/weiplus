package hk5;

/* loaded from: classes9.dex */
public final class r extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.i();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        fc5.i model = (fc5.i) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.u0 u0Var = new mi5.u0();
        fc5.i iVar = u0Var.f326926c;
        u0Var.f326926c = model;
        u0Var.c(iVar, model);
        return u0Var.a(getActivity());
    }

    @Override // o50.j
    public void X6(android.view.View previewChattingView) {
        kotlin.jvm.internal.o.g(previewChattingView, "previewChattingView");
        previewChattingView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
    }
}
