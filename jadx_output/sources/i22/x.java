package i22;

/* loaded from: classes15.dex */
public final class x extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f288064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.view.View itemView, i22.p0 p0Var) {
        super(itemView, p0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.deq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f288064f = (android.widget.TextView) findViewById;
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        this.f288003e = item;
        i22.l0 l0Var = item instanceof i22.l0 ? (i22.l0) item : null;
        java.lang.String str = l0Var != null ? l0Var.f288000a : null;
        android.widget.TextView textView = this.f288064f;
        textView.setText(str);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
    }
}
