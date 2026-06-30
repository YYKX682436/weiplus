package wu3;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu3.h f449724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f449725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wu3.h hVar, android.content.Context context) {
        super(0);
        this.f449724d = hVar;
        this.f449725e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wu3.h hVar = this.f449724d;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) hVar.findViewById(com.tencent.mm.R.id.b6_);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.b6a);
        android.content.Context context = this.f449725e;
        textView.setText(i65.a.r(context, com.tencent.mm.R.string.k6l));
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.b69);
        textView2.setText(i65.a.r(context, com.tencent.mm.R.string.k6i));
        textView2.setOnClickListener(new wu3.c(hVar));
        return linearLayout;
    }
}
