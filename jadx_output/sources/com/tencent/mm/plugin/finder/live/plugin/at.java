package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class at extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f111939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        super(1);
        this.f111939d = etVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSendCustomEmoji from suggestEmoticonBubble, emoji = ");
        sb6.append(iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", sb6.toString());
        if (iEmojiInfo != null) {
            com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f111939d;
            jz5.l t17 = com.tencent.mm.plugin.finder.live.plugin.et.t1(etVar);
            if (((java.lang.Boolean) t17.f302833d).booleanValue()) {
                com.tencent.mm.plugin.finder.live.plugin.et.A1(etVar, iEmojiInfo, com.tencent.mm.plugin.finder.live.plugin.uq.f114612f);
            } else {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(etVar.R);
                e4Var.f211776c = (java.lang.CharSequence) t17.f302834e;
                e4Var.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
