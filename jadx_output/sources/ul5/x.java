package ul5;

/* loaded from: classes15.dex */
public final class x extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f428650n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f428651o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f428652p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f428653q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f428654r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f428655s;

    /* renamed from: t, reason: collision with root package name */
    public int f428656t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context, 0);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.g b17 = jz5.h.b(new ul5.v(this));
        this.f428650n = b17;
        jz5.g b18 = jz5.h.b(new ul5.t(this));
        this.f428651o = b18;
        jz5.g b19 = jz5.h.b(new ul5.u(this));
        this.f428652p = b19;
        jz5.g b27 = jz5.h.b(new ul5.w(this));
        this.f428653q = b27;
        jz5.g b28 = jz5.h.b(new ul5.s(this));
        this.f428654r = b28;
        jz5.g b29 = jz5.h.b(new ul5.r(this));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bog, (android.view.ViewGroup) null, false);
        this.f428655s = inflate;
        setContentView(inflate);
        java.lang.Object value = ((jz5.n) b17).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.EditText) value).setText(java.lang.String.valueOf(ul5.y.f428660d));
        java.lang.Object value2 = ((jz5.n) b18).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.EditText) value2).setText(java.lang.String.valueOf(ul5.y.f428661e));
        java.lang.Object value3 = ((jz5.n) b27).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((android.widget.EditText) value3).setText(java.lang.String.valueOf(ul5.y.f428659c));
        java.lang.Object value4 = ((jz5.n) b19).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.widget.EditText) value4).setText(java.lang.String.valueOf(ul5.y.f428658b));
        java.lang.Object value5 = ((jz5.n) b28).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        ((android.widget.EditText) value5).setText(java.lang.String.valueOf(ul5.y.f428657a));
        java.lang.Object value6 = ((jz5.n) b29).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        ((android.widget.Button) value6).setOnClickListener(new ul5.o(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("default");
        arrayList.add("scale");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kk9);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        int i17 = ul5.y.f428662f;
        this.f428656t = i17;
        textView.setText((java.lang.CharSequence) arrayList.get(i17));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f486201kk4);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.Button");
        ((android.widget.Button) findViewById2).setOnClickListener(new ul5.q(this, arrayList, textView));
    }
}
