package qq;

/* loaded from: classes9.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final qq.q f365881d = new qq.q();

    public q() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        kotlin.jvm.internal.o.g(context, "context");
        android.app.Dialog dialog = new android.app.Dialog(context);
        dialog.setTitle("Oracle Test");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText("点我测试 Oracle");
        textView.setTextSize(18.0f);
        textView.setPadding(48, 48, 48, 48);
        textView.setBackgroundColor(-2039584);
        textView.setOnClickListener(qq.p.f365880d);
        pq.r rVar = (pq.r) i95.n0.c(pq.r.class);
        bw5.p8 p8Var = new bw5.p8();
        p8Var.f31487d = true;
        boolean[] zArr = p8Var.f31492i;
        zArr[1] = true;
        p8Var.f31488e = true;
        zArr[2] = true;
        p8Var.f31489f = true;
        zArr[3] = true;
        p8Var.f31490g = 3000L;
        zArr[4] = true;
        p8Var.f31491h = 3000L;
        zArr[5] = true;
        t20.g gVar = (t20.g) rVar;
        gVar.getClass();
        t20.i iVar = new t20.i(gVar);
        iVar.f414679e = p8Var;
        iVar.f414676b = qq.m.f365877d;
        iVar.f414677c = qq.n.f365878d;
        iVar.f414678d = new qq.o(context);
        iVar.a(textView, "ecs_test_oracle");
        frameLayout.addView(textView);
        dialog.setContentView(frameLayout);
        dialog.show();
        return jz5.f0.f302826a;
    }
}
