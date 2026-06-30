package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wq extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f120227J;
    public android.widget.TextView K;
    public android.view.View L;
    public android.widget.TextView M;
    public android.view.View N;
    public android.view.View P;
    public android.widget.TextView Q;
    public android.view.View R;
    public final jz5.g S;
    public r45.h32 T;
    public final java.lang.String U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(android.content.Context context) {
        super(context, false, null, 0.5f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.S = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.sq(context));
        this.U = "FinderLivePostNoticeInfoPanel";
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.f488945do5;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getString(com.tencent.mm.R.string.m8x);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.R = rootView.findViewById(com.tencent.mm.R.id.umk);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f484742fe0);
        this.H = textView;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        this.I = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.feo);
        this.f120227J = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.fdt);
        this.K = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.r6r);
        this.L = rootView.findViewById(com.tencent.mm.R.id.r6m);
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.r6k);
        this.M = textView2;
        if (textView2 != null) {
            com.tencent.mm.ui.fk.a(textView2);
        }
        d0();
        a0(this.f118183e.getDrawable(com.tencent.mm.R.drawable.clh));
        this.N = rootView.findViewById(com.tencent.mm.R.id.r6l);
        this.P = rootView.findViewById(com.tencent.mm.R.id.ulf);
        this.Q = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.ulb);
    }

    public final void e0() {
        android.widget.TextView textView = this.K;
        if (textView == null) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        r45.h32 h32Var = this.T;
        if (h32Var != null) {
            textView.setText(r4Var.e1(r45.vw4.a(h32Var.getInteger(18))));
        } else {
            kotlin.jvm.internal.o.o("noticeInfo");
            throw null;
        }
    }
}
