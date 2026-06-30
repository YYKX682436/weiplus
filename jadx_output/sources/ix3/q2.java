package ix3;

/* loaded from: classes8.dex */
public final class q2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295535d = jz5.h.b(new ix3.p2(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxx;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("荣耀风险Api调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.m2(this));
        }
        jz5.g gVar = this.f295535d;
        em.c3 c3Var = (em.c3) ((jz5.n) gVar).getValue();
        if (c3Var.f254175c == null) {
            c3Var.f254175c = (android.widget.Button) c3Var.f254173a.findViewById(com.tencent.mm.R.id.f484072hh4);
        }
        c3Var.f254175c.setOnClickListener(new ix3.n2(this));
        em.c3 c3Var2 = (em.c3) ((jz5.n) gVar).getValue();
        if (c3Var2.f254174b == null) {
            c3Var2.f254174b = (android.widget.Button) c3Var2.f254173a.findViewById(com.tencent.mm.R.id.hnl);
        }
        c3Var2.f254174b.setOnClickListener(new ix3.o2(this));
    }
}
