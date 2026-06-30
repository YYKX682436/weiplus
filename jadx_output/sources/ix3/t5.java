package ix3;

/* loaded from: classes.dex */
public final class t5 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295567d = jz5.h.b(new ix3.s5(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ems;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("语音消息调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.q5(this));
        }
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        em.s3 s3Var = (em.s3) ((jz5.n) this.f295567d).getValue();
        if (s3Var.f254784b == null) {
            s3Var.f254784b = (android.widget.Button) s3Var.f254783a.findViewById(com.tencent.mm.R.id.upa);
        }
        s3Var.f254784b.setOnClickListener(new ix3.r5(stringExtra, longExtra, this));
    }
}
