package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f131741h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f131742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f118384g.f444836c.b().setGravity(80);
        this.f118384g.f444836c.b().setWindowAnimations(com.tencent.mm.R.style.f494074dp);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dme;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f483758bz2);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.view.b(this));
        this.f131742i = findViewById;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return false;
    }
}
