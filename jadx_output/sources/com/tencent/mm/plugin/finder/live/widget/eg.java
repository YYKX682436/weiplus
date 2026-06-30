package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class eg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gg f118249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(com.tencent.mm.plugin.finder.live.widget.gg ggVar, int i17) {
        super(0);
        this.f118249d = ggVar;
        this.f118250e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.gg ggVar = this.f118249d;
        android.content.Context context = ggVar.f118433n.getContext();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWecoinNotEnoughDialog needCoin:");
        int i17 = this.f118250e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("FinderLiveFansJoinWidget", sb6.toString());
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488942aw1, null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
        roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
        android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.g4e);
        android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        if (i17 <= 0) {
            textView2.setVisibility(8);
            textView.setText(context.getString(com.tencent.mm.R.string.dib));
        } else {
            textView.setText(context.getString(com.tencent.mm.R.string.dia));
            textView2.setVisibility(0);
            textView2.setText(java.lang.String.valueOf(i17));
        }
        android.widget.Button button = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
        android.widget.Button button2 = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
        button.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.bg(ggVar, k0Var));
        button2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.cg(k0Var));
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.dg(k0Var, roundedCornerFrameLayout);
        k0Var.e(true);
        k0Var.v();
        return jz5.f0.f302826a;
    }
}
