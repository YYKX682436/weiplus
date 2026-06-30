package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class c80 extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public com.tencent.mm.view.recyclerview.WxRecyclerView H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public r45.vw4 f117975J;
    public r45.h32 K;
    public int L;
    public yz5.l M;
    public final jz5.g N;
    public boolean P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(android.content.Context context) {
        super(context, false, null, 0.4f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.I = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.x70(context));
        this.f117975J = r45.vw4.Auto;
        this.L = 1;
        this.N = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.b80(context, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.do6;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getString(com.tencent.mm.R.string.f491716mm3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.r6q);
        this.H = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter((com.tencent.mm.plugin.finder.live.widget.a80) ((jz5.n) this.N).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.H;
        android.content.Context context = this.f118183e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        }
        a0(context.getDrawable(com.tencent.mm.R.drawable.clh));
        d0();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        r45.h32 h32Var = this.K;
        if (h32Var != null) {
            if (this.L == 2 || this.P) {
                int integer = h32Var.getInteger(18);
                int i17 = this.f117975J.f388624d;
                if (integer != i17) {
                    h32Var.set(18, java.lang.Integer.valueOf(i17));
                }
            }
            yz5.l lVar = this.M;
            if (lVar != null) {
                lVar.invoke(h32Var);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        this.P = true;
        super.U();
    }

    public final void e0(r45.h32 noticeInfo, int i17, yz5.l onChooseTypeListener) {
        kotlin.jvm.internal.o.g(noticeInfo, "noticeInfo");
        kotlin.jvm.internal.o.g(onChooseTypeListener, "onChooseTypeListener");
        this.P = false;
        this.K = noticeInfo;
        r45.vw4 a17 = r45.vw4.a(noticeInfo.getInteger(18));
        if (a17 == null) {
            a17 = r45.vw4.Auto;
        }
        this.f117975J = a17;
        this.M = onChooseTypeListener;
        this.L = i17;
        ((com.tencent.mm.plugin.finder.live.widget.a80) ((jz5.n) this.N).getValue()).notifyDataSetChanged();
        com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View u() {
        int i17 = this.L;
        android.content.Context context = this.f118183e;
        if (i17 == 1) {
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(textView.getContext().getString(com.tencent.mm.R.string.f491728m93));
            textView.setTextSize(15.0f);
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
            return textView;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 24), i65.a.b(weImageView.getContext(), 24)));
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_close);
        return weImageView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        if (this.L != 1) {
            return null;
        }
        android.widget.TextView textView = new android.widget.TextView(this.f118183e);
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.f491729m94));
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        textView.setBackgroundDrawable(textView.getContext().getDrawable(com.tencent.mm.R.drawable.f481060jo));
        textView.setMinWidth((int) textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        textView.setMinHeight((int) textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7));
        textView.setGravity(17);
        return textView;
    }
}
