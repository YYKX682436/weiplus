package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes4.dex */
public final class sd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI f174296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI textStatusNewLabelUI) {
        super(0);
        this.f174296d = textStatusNewLabelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(this.f174296d.getIntent().getStringExtra("KEY_EDIT_VISIBILITY_FEED_ID")));
    }
}
