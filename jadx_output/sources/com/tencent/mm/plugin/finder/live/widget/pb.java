package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class pb extends com.tencent.mm.plugin.finder.live.widget.e0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e9p;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveNeedInviteeTipPanel", "initContentView");
        a0(this.f118183e.getDrawable(com.tencent.mm.R.drawable.clh));
        Y(com.tencent.mm.R.color.ah8);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f483771su2);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        rootView.findViewById(com.tencent.mm.R.id.f483769su0).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ob(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return false;
    }
}
