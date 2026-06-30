package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbq/z1;", "cgi", "Lcom/tencent/mm/protocal/protobuf/FinderUserPageResponse;", "resp", "Ljz5/f0;", "invoke", "(Lbq/z1;Lcom/tencent/mm/protocal/protobuf/FinderUserPageResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$2 extends kotlin.jvm.internal.q implements yz5.p {
    final /* synthetic */ yz5.a $onComplete;
    final /* synthetic */ java.lang.String $username;
    final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$2(yz5.a aVar, java.lang.String str, com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper userInfoHelper) {
        super(2);
        this.$onComplete = aVar;
        this.$username = str;
        this.this$0 = userInfoHelper;
    }

    @Override // yz5.p
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        invoke((bq.z1) obj, (com.tencent.mm.protocal.protobuf.FinderUserPageResponse) obj2);
        return jz5.f0.f302826a;
    }

    public final void invoke(bq.z1 cgi, com.tencent.mm.protocal.protobuf.FinderUserPageResponse resp) {
        kotlin.jvm.internal.o.g(cgi, "cgi");
        kotlin.jvm.internal.o.g(resp, "resp");
        this.$onComplete.invoke();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username=");
        sb6.append(this.$username);
        sb6.append(", scene username=");
        com.tencent.mm.protocal.protobuf.FinderContact J2 = cgi.J();
        sb6.append(J2 != null ? J2.getUsername() : null);
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper.TAG, sb6.toString());
        com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper.Companion companion = com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper.INSTANCE;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) companion.getUserExtInfoCache().get(this.$username);
        if (l2Var == null) {
            l2Var = new com.tencent.mm.plugin.finder.profile.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        l2Var.f123913b = cgi.E;
        l2Var.f123914c = cgi.F;
        l2Var.f123912a = cgi.D;
        l2Var.f123915d = new java.util.LinkedList(cgi.C);
        com.tencent.mm.protobuf.f fVar = cgi.f70646f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        l2Var.f123917f = ((com.tencent.mm.protocal.protobuf.FinderUserPageResponse) fVar).getWxaShopInfo();
        com.tencent.mm.protobuf.f fVar2 = cgi.f70646f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> jump_info = ((com.tencent.mm.protocal.protobuf.FinderUserPageResponse) fVar2).getJump_info();
        kotlin.jvm.internal.o.f(jump_info, "getJump_info(...)");
        l2Var.f123924m = jump_info;
        companion.getUserExtInfoCache().put(this.$username, l2Var);
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        final com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper userInfoHelper = this.this$0;
        n3Var.postUI(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$2.1
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.UserInfoHelper.this.loadInternal();
            }
        });
    }
}
