package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class h9 implements com.tencent.mm.feature.emoji.api.r5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pj4.a0 f173955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f173957c;

    public h9(pj4.a0 a0Var, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity, kotlin.jvm.internal.h0 h0Var) {
        this.f173955a = a0Var;
        this.f173956b = textStatusEditActivity;
        this.f173957c = h0Var;
    }

    public final void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "initEmojiInfo:  emojiUploadCheck errType:" + i17 + " gifMd5:" + str);
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f173956b;
        if (i17 != 0) {
            textStatusEditActivity.runOnUiThread(new com.tencent.mm.plugin.textstatus.ui.g9(textStatusEditActivity));
            return;
        }
        java.lang.String str2 = this.f173955a.f354957d;
        if (str2 != null) {
            if (str == null || r26.n0.N(str)) {
                str = str2;
            } else {
                kotlin.jvm.internal.o.d(str);
            }
            ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                emojiInfo.field_md5 = str;
            }
            this.f173957c.f310123d = emojiInfo;
            textStatusEditActivity.runOnUiThread(new com.tencent.mm.plugin.textstatus.ui.f9(textStatusEditActivity, emojiInfo));
        }
    }
}
