package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ai extends com.tencent.mm.ui.widget.dialog.g2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ei f117767e;

    public ai(com.tencent.mm.plugin.finder.live.widget.ei eiVar) {
        this.f117767e = eiVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f117767e;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void g() {
        com.tencent.mm.plugin.finder.live.widget.ei eiVar = this.f117767e;
        eiVar.postDelayed(new com.tencent.mm.plugin.finder.live.widget.zh(this, eiVar), 500L);
    }
}
