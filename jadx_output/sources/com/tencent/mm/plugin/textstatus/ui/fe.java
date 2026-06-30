package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class fe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity f173880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
        super(0);
        this.f173880d = textStatusOtherTopicFriendsActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f173880d.getIntent().getIntExtra("KEY_BTN_STYLE", 0));
    }
}
