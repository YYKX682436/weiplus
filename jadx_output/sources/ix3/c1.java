package ix3;

/* loaded from: classes.dex */
public final class c1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295375d = jz5.h.b(new ix3.b1(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emh;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("表情消息调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.z0(this));
        }
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        em.y2 y2Var = (em.y2) ((jz5.n) this.f295375d).getValue();
        if (y2Var.f254944b == null) {
            y2Var.f254944b = (android.widget.Button) y2Var.f254943a.findViewById(com.tencent.mm.R.id.upa);
        }
        y2Var.f254944b.setOnClickListener(new ix3.a1(stringExtra, longExtra, this));
    }
}
