package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class oe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity f174153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
        super(0);
        this.f174153d = textStatusOtherTopicFriendsActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = this.f174153d;
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = textStatusOtherTopicFriendsActivity.f173670t;
            if (mvvmList != null) {
                ij4.m mVar = ij4.o.f291742i;
                com.tencent.mm.plugin.mvvmlist.MvvmList.w(mvvmList, mVar.a(textStatusOtherTopicFriendsActivity, mVar.b(textStatusOtherTopicFriendsActivity)), false, 2, null);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", th6, "onClickArrow", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
