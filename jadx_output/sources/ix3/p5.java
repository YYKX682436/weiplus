package ix3;

/* loaded from: classes.dex */
public final class p5 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295531d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f295532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295531d = jz5.h.b(new ix3.n5(this));
        this.f295532e = jz5.h.b(ix3.o5.f295523d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emq;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("视频路径调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.j5(this));
        }
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(stringExtra, longExtra);
        if (k17 == null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = "消息不存在";
            e4Var.c();
            return;
        }
        t21.v2 g17 = ((t21.w2) ((wf0.w1) ((jz5.n) this.f295532e).getValue())).g(k17.z0());
        if (g17 == null) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(activity2);
            e4Var2.f211776c = "视频信息不存在";
            e4Var2.c();
            return;
        }
        java.lang.String d17 = g17.d();
        java.lang.String str = g17.S;
        jz5.g gVar = this.f295531d;
        em.r3 r3Var = (em.r3) ((jz5.n) gVar).getValue();
        if (r3Var.f254762d == null) {
            r3Var.f254762d = (android.widget.Button) r3Var.f254759a.findViewById(com.tencent.mm.R.id.vmk);
        }
        r3Var.f254762d.setOnClickListener(new ix3.k5(k17, d17, this, longExtra));
        em.r3 r3Var2 = (em.r3) ((jz5.n) gVar).getValue();
        if (r3Var2.f254760b == null) {
            r3Var2.f254760b = (android.widget.Button) r3Var2.f254759a.findViewById(com.tencent.mm.R.id.sxm);
        }
        r3Var2.f254760b.setOnClickListener(new ix3.l5(k17, this, longExtra));
        em.r3 r3Var3 = (em.r3) ((jz5.n) gVar).getValue();
        if (r3Var3.f254761c == null) {
            r3Var3.f254761c = (android.widget.Button) r3Var3.f254759a.findViewById(com.tencent.mm.R.id.unj);
        }
        r3Var3.f254761c.setOnClickListener(new ix3.m5(str, this, k17, longExtra));
    }
}
