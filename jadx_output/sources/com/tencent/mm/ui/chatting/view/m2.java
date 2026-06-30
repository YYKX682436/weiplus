package com.tencent.mm.ui.chatting.view;

/* loaded from: classes8.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f203005a;

    /* renamed from: b, reason: collision with root package name */
    public final db5.g3 f203006b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f203007c;

    public m2(android.content.Context context, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f203005a = aVar;
        this.f203007c = jz5.h.b(com.tencent.mm.ui.chatting.view.l2.f202989d);
        java.lang.String string = context.getString(com.tencent.mm.R.string.nlu);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new com.tencent.mm.ui.chatting.view.j2(g3Var, this));
        g3Var.D(new com.tencent.mm.ui.chatting.view.k2(g3Var));
        g3Var.F(context.getString(com.tencent.mm.R.string.f490568yq));
        g3Var.G(context.getString(com.tencent.mm.R.string.omq));
        android.widget.TextView textView = g3Var.M;
        textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.abw));
        textView.setText(string);
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setTextSize(0, textView.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
        this.f203006b = g3Var;
    }
}
