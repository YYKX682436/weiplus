package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class q8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        super(0);
        this.f174225d = textStatusEditActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tencent.mm.emoji.view.EmojiStatusView) this.f174225d.findViewById(com.tencent.mm.R.id.det);
    }
}
