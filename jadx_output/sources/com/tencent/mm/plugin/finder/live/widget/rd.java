package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rd extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f119631h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f119632i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(android.content.Context context, yz5.a onConfirm) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onConfirm, "onConfirm");
        this.f119631h = onConfirm;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.e_4;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.hrn);
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.qd(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        yz5.a aVar = this.f119632i;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
