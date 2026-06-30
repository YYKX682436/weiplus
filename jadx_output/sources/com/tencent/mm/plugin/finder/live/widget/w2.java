package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w2 implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f120119a;

    public w2(com.tencent.mm.plugin.finder.live.widget.h3 h3Var) {
        this.f120119a = h3Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        com.tencent.mm.plugin.finder.live.widget.h3 h3Var = this.f120119a;
        h3Var.f118522k.dead();
        h3Var.f118516e.clear();
    }
}
