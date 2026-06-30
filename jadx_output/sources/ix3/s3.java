package ix3;

/* loaded from: classes5.dex */
public final class s3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295555d = jz5.h.b(new ix3.r3(this));
    }

    public final em.j3 T6() {
        return (em.j3) ((jz5.n) this.f295555d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emm;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String U1;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("修改消息type");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.p3(this));
        }
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        java.lang.String str2 = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(stringExtra, longExtra);
        l15.c cVar = new l15.c();
        if (k17 != null && (U1 = k17.U1()) != null) {
            str2 = U1;
        }
        cVar.fromXml(str2, true);
        em.j3 T6 = T6();
        if (T6.f254474c == null) {
            T6.f254474c = (android.widget.TextView) T6.f254472a.findViewById(com.tencent.mm.R.id.t2a);
        }
        android.widget.TextView textView = T6.f254474c;
        v05.b k18 = cVar.k();
        if (k18 == null || (str = java.lang.Integer.valueOf(k18.getInteger(k18.f368365d + 6)).toString()) == null) {
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        textView.setText(str);
        em.j3 T62 = T6();
        if (T62.f254475d == null) {
            T62.f254475d = (android.widget.Button) T62.f254472a.findViewById(com.tencent.mm.R.id.uh6);
        }
        T62.f254475d.setOnClickListener(new ix3.q3(k17, this, cVar));
    }
}
