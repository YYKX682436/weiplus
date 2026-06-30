package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class m9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f174099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(com.tencent.mm.api.IEmojiInfo iEmojiInfo, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        super(0);
        this.f174099d = iEmojiInfo;
        this.f174100e = textStatusEditActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f174099d;
        java.util.Objects.toString(iEmojiInfo);
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174100e;
        pj4.h2 n76 = textStatusEditActivity.n7();
        if (n76 != null) {
            n76.f355093p1++;
        }
        textStatusEditActivity.s7(iEmojiInfo);
        return jz5.f0.f302826a;
    }
}
