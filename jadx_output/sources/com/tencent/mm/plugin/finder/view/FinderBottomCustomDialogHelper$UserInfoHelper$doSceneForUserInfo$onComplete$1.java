package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$onComplete$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$onComplete$1(com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper userInfoHelper) {
        super(0);
        this.this$0 = userInfoHelper;
    }

    @Override // yz5.a
    public final java.lang.Boolean invoke() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        wu5.c cVar;
        u3Var = this.this$0.loadingDialog;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        cVar = this.this$0.dialogRunnable;
        if (cVar != null) {
            return java.lang.Boolean.valueOf(cVar.cancel(false));
        }
        return null;
    }
}
