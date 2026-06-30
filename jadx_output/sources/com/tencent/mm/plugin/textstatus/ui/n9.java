package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class n9 implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174124a;

    public n9(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174124a = textStatusEditActivity;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
        pj4.h2 n76 = this.f174124a.n7();
        if (n76 != null) {
            n76.f355106y1++;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        ym5.a1.f(new com.tencent.mm.plugin.textstatus.ui.m9(iEmojiInfo, this.f174124a));
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
    }
}
