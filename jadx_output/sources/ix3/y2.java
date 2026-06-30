package ix3;

/* loaded from: classes3.dex */
public final class y2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295615d = jz5.h.b(new ix3.x2(this));
    }

    public final em.e3 T6() {
        return (em.e3) ((jz5.n) this.f295615d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dw7;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("图片消息调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.r2(this));
        }
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(stringExtra, longExtra);
        em.e3 T6 = T6();
        if (T6.f254283b == null) {
            T6.f254283b = (android.widget.Button) T6.f254282a.findViewById(com.tencent.mm.R.id.s8j);
        }
        T6.f254283b.setOnClickListener(new ix3.s2(k17, this, longExtra));
        em.e3 T62 = T6();
        if (T62.f254284c == null) {
            T62.f254284c = (android.widget.Button) T62.f254282a.findViewById(com.tencent.mm.R.id.rqt);
        }
        T62.f254284c.setOnClickListener(new ix3.t2(k17, this, longExtra));
        em.e3 T63 = T6();
        if (T63.f254287f == null) {
            T63.f254287f = (android.widget.Button) T63.f254282a.findViewById(com.tencent.mm.R.id.f485922ry1);
        }
        T63.f254287f.setOnClickListener(new ix3.u2(k17, this, longExtra));
        em.e3 T64 = T6();
        if (T64.f254286e == null) {
            T64.f254286e = (android.widget.Button) T64.f254282a.findViewById(com.tencent.mm.R.id.rdp);
        }
        T64.f254286e.setOnClickListener(new ix3.v2(k17, this, longExtra));
        em.e3 T65 = T6();
        if (T65.f254285d == null) {
            T65.f254285d = (android.widget.Button) T65.f254282a.findViewById(com.tencent.mm.R.id.t98);
        }
        T65.f254285d.setOnClickListener(new ix3.w2(k17, this));
    }
}
