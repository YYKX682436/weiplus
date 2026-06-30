package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljz5/f0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderBottomCustomDialogHelper$Companion$showUserInfoConfirmDialogOnLiveRedPacket$1$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ java.lang.String $cancel;
    final /* synthetic */ android.content.Context $context;
    final /* synthetic */ android.content.DialogInterface.OnClickListener $lcancel;
    final /* synthetic */ android.content.DialogInterface.OnClickListener $lok;
    final /* synthetic */ java.lang.String $ok;
    final /* synthetic */ java.lang.String $title;
    final /* synthetic */ android.view.View $userInfoContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBottomCustomDialogHelper$Companion$showUserInfoConfirmDialogOnLiveRedPacket$1$1(android.content.Context context, java.lang.String str, android.view.View view, java.lang.String str2, java.lang.String str3, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        super(1);
        this.$context = context;
        this.$title = str;
        this.$userInfoContainer = view;
        this.$ok = str2;
        this.$cancel = str3;
        this.$lok = onClickListener;
        this.$lcancel = onClickListener2;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke(((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f302826a;
    }

    public final void invoke(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion companion = com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.INSTANCE;
            com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showUserInfoConfirmDialogOnLiveRedPacket$1$1.AnonymousClass1 anonymousClass1 = new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showUserInfoConfirmDialogOnLiveRedPacket$1$1.1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                }
            };
            android.content.Context context = this.$context;
            java.lang.String str = this.$title;
            android.view.View userInfoContainer = this.$userInfoContainer;
            kotlin.jvm.internal.o.f(userInfoContainer, "$userInfoContainer");
            com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.Companion.showConfirmDialog$default(companion, context, null, 0, str, userInfoContainer, this.$ok, this.$cancel, 1, this.$lok, this.$lcancel, anonymousClass1, false, 2054, null);
            return;
        }
        android.content.Context context2 = this.$context;
        db5.t7.i(context2, context2.getString(com.tencent.mm.R.string.f493234je1), com.tencent.mm.R.raw.icons_filled_error);
    }
}
