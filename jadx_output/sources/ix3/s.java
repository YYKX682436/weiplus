package ix3;

/* loaded from: classes.dex */
public final class s extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295549d = jz5.h.b(new ix3.r(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emb;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("AppMsg消息调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.o(this));
        }
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(stringExtra, longExtra);
        jz5.g gVar = this.f295549d;
        em.t2 t2Var = (em.t2) ((jz5.n) gVar).getValue();
        if (t2Var.f254816c == null) {
            t2Var.f254816c = (android.widget.Button) t2Var.f254814a.findViewById(com.tencent.mm.R.id.upa);
        }
        t2Var.f254816c.setOnClickListener(new ix3.p(k17, this, longExtra));
        em.t2 t2Var2 = (em.t2) ((jz5.n) gVar).getValue();
        if (t2Var2.f254815b == null) {
            t2Var2.f254815b = (android.widget.Button) t2Var2.f254814a.findViewById(com.tencent.mm.R.id.t98);
        }
        t2Var2.f254815b.setOnClickListener(new ix3.q(k17, this));
    }
}
