package sp2;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.p f411082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(sp2.p pVar) {
        super(0);
        this.f411082d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sp2.p pVar = this.f411082d;
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(pVar.f411169a);
        android.content.Context context = pVar.f411169a;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e9f, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        pVar.f411175g = inflate;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odb);
        android.view.View view = pVar.f411175g;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c_3);
        android.view.View view2 = pVar.f411175g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.b5j);
        textView.setText(context.getString(com.tencent.mm.R.string.opr));
        textView2.setText(context.getString(com.tencent.mm.R.string.opp));
        textView3.setText(context.getString(com.tencent.mm.R.string.opo));
        textView2.setOnClickListener(new sp2.n(pVar));
        textView3.setOnClickListener(new sp2.o(pVar));
        android.view.View view3 = pVar.f411175g;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        e3Var.f131975y.addView(view3, 0);
        e3Var.f131968r = new sp2.l(pVar);
        return e3Var;
    }
}
