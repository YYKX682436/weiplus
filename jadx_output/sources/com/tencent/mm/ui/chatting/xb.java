package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class xb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f206237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.zb f206238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.ui.chatting.zb zbVar) {
        super(0);
        this.f206237d = appCompatActivity;
        this.f206238e = zbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        com.tencent.mm.ui.ga controller;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f206237d;
        com.tencent.mm.ui.chatting.ChattingUI chattingUI = appCompatActivity instanceof com.tencent.mm.ui.chatting.ChattingUI ? (com.tencent.mm.ui.chatting.ChattingUI) appCompatActivity : null;
        if (chattingUI != null && (chattingUIFragment = chattingUI.f198254h) != null && (controller = chattingUIFragment.getController()) != null) {
            controller.r0(this.f206238e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479784f5), true);
        }
        return null;
    }
}
