package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ys implements com.tencent.mm.pluginsdk.ui.chat.f8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f115229a;

    public ys(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f115229a = etVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.f8
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f115229a;
        etVar.B1 = true;
        com.tencent.mm.api.SmileyPanel smileyPanel = etVar.P;
        android.content.Context context = etVar.R;
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        smileyPanel.q(context, 6502, new com.tencent.mm.plugin.finder.live.plugin.xs(etVar));
    }
}
