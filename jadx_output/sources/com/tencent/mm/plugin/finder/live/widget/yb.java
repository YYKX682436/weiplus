package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yb extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public com.tencent.mm.plugin.finder.live.widget.w1 H;
    public yz5.a I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f120430J;
    public android.widget.TextView K;
    public android.view.View L;
    public android.view.View M;
    public android.view.View N;
    public android.widget.TextView P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.H = new com.tencent.mm.plugin.finder.live.widget.w1(com.tencent.mm.plugin.finder.live.widget.d80.f118087e);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e9s;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
    
        if (((mm2.n0) r1.a(mm2.n0.class)).f329276z6 == true) goto L18;
     */
    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.yb.N(android.view.View):void");
    }

    public final void e0(com.tencent.mm.plugin.finder.live.widget.d80 mode) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(mode, "mode");
        this.H.getClass();
        this.H = new com.tencent.mm.plugin.finder.live.widget.w1(mode);
        int ordinal = mode.ordinal();
        android.content.Context context = this.f118183e;
        if (ordinal == 0) {
            string = context.getString(com.tencent.mm.R.string.ooa);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            string = context.getString(com.tencent.mm.R.string.oo_);
        }
        kotlin.jvm.internal.o.d(string);
        android.widget.TextView textView = this.P;
        if (textView == null) {
            kotlin.jvm.internal.o.o("settlementValueTv");
            throw null;
        }
        textView.setText(string);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveSettingPanel", "updateSettlementModeDisplay: mode=" + mode + ", display=" + string);
    }
}
