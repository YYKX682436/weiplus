package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class ge implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity f173915e;

    public ge(java.lang.String str, com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
        this.f173914d = str;
        this.f173915e = textStatusOtherTopicFriendsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.events.StatusSquareItemScrollEvent statusSquareItemScrollEvent = new com.tencent.mm.autogen.events.StatusSquareItemScrollEvent();
        am.ay ayVar = statusSquareItemScrollEvent.f54870g;
        java.lang.String str = this.f173914d;
        ayVar.f6194a = str;
        if (!(str == null || r26.n0.N(str))) {
            com.tencent.mm.plugin.textstatus.ui.ce ceVar = com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.f173656z;
            android.view.View findViewWithTag = this.f173915e.W6().findViewWithTag("status_avatar_" + str);
            if (findViewWithTag != null) {
                int[] iArr = new int[2];
                findViewWithTag.getLocationInWindow(iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                ayVar.f6195b = i17;
                ayVar.f6196c = i18;
            }
        }
        statusSquareItemScrollEvent.e();
    }
}
