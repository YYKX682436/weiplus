package i22;

/* loaded from: classes15.dex */
public final class c0 extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f287950f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f287951g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.view.View itemView) {
        super(itemView, null);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.mzc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f287950f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.mzb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f287951g = (android.widget.TextView) findViewById2;
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.i(item, payloads);
        i22.y0 y0Var = item instanceof i22.y0 ? (i22.y0) item : null;
        android.widget.TextView textView = this.f287950f;
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        textView.setText(y0Var != null ? y0Var.f288068a : null);
        java.lang.String str = y0Var != null ? y0Var.f288069b : null;
        android.widget.TextView textView2 = this.f287951g;
        textView2.setText(str);
        if (kotlin.jvm.internal.o.b(y0Var != null ? y0Var.f288069b : null, "")) {
            textView2.setVisibility(8);
        }
    }
}
