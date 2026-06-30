package ix3;

/* loaded from: classes.dex */
public final class x3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295606d;

    /* renamed from: e, reason: collision with root package name */
    public l15.c f295607e;

    /* renamed from: f, reason: collision with root package name */
    public s15.w f295608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295606d = jz5.h.b(new ix3.w3(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emn;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("聊天记录消息调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.t3(this));
        }
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(stringExtra, longExtra);
        jz5.g gVar = this.f295606d;
        em.l3 l3Var = (em.l3) ((jz5.n) gVar).getValue();
        if (l3Var.f254571b == null) {
            l3Var.f254571b = (android.widget.Button) l3Var.f254570a.findViewById(com.tencent.mm.R.id.txw);
        }
        l3Var.f254571b.setOnClickListener(new ix3.u3(stringExtra, longExtra, this));
        em.l3 l3Var2 = (em.l3) ((jz5.n) gVar).getValue();
        if (l3Var2.f254572c == null) {
            l3Var2.f254572c = (android.widget.Button) l3Var2.f254570a.findViewById(com.tencent.mm.R.id.t97);
        }
        l3Var2.f254572c.setOnClickListener(new ix3.v3(k17, this));
    }
}
