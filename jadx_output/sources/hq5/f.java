package hq5;

/* loaded from: classes.dex */
public final class f extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f283226d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f283227e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f283228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283226d = jz5.h.b(new hq5.b(this));
        this.f283227e = jz5.h.b(new hq5.e(this));
        this.f283228f = jz5.h.b(new hq5.a(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eqp;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        mMActivity.setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        mMActivity.setMMTitle("");
        mMActivity.hideActionbarLine();
        mMActivity.setBackBtn(new hq5.c(mMActivity));
        jz5.g gVar = this.f283227e;
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText((java.lang.String) ((jz5.n) this.f283226d).getValue());
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) ((jz5.n) gVar).getValue()).getPaint());
        ((android.view.View) ((jz5.n) this.f283228f).getValue()).setOnClickListener(new hq5.d(mMActivity));
    }
}
