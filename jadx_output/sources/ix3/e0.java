package ix3;

/* loaded from: classes.dex */
public final class e0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295391d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295391d = jz5.h.b(new ix3.d0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emo;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("TraceInfo");
        em.n3 n3Var = (em.n3) ((jz5.n) this.f295391d).getValue();
        if (n3Var.f254645b == null) {
            n3Var.f254645b = (android.widget.TextView) n3Var.f254644a.findViewById(com.tencent.mm.R.id.vgq);
        }
        n3Var.f254645b.setText(stringExtra);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.addIconOptionMenu(0, com.tencent.mm.R.string.w_, com.tencent.mm.R.raw.actionbar_icon_dark_more, new ix3.z(this));
        }
    }
}
