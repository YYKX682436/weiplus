package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class ze extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity f174491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
        super(0);
        this.f174491d = textStatusOtherTopicFriendsActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f174491d.getIntent().getLongExtra("KEY_RED_DOT_TYPE", 0L));
    }
}
