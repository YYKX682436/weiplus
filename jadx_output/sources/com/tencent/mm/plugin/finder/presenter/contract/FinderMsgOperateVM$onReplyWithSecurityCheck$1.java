package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderMsgOperateVM$onReplyWithSecurityCheck$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f122987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM f122988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.o3 f122989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgOperateVM$onReplyWithSecurityCheck$1(java.util.List list, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM, so2.o3 o3Var) {
        super(0);
        this.f122987d = list;
        this.f122988e = finderMsgOperateVM;
        this.f122989f = o3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.gb4 gb4Var;
        java.lang.Object obj;
        java.lang.String O6 = ((ey2.w) ((xy2.f) pf5.u.f353936a.e(zy2.b6.class).c(xy2.f.class))).O6();
        boolean z17 = false;
        if (O6.length() > 0) {
            java.util.List list = this.f122987d;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.gb4) obj).getString(2), O6)) {
                        break;
                    }
                }
                gb4Var = (r45.gb4) obj;
            } else {
                gb4Var = null;
            }
            if (gb4Var != null) {
                z17 = true;
            }
        }
        final so2.o3 o3Var = this.f122989f;
        final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM = this.f122988e;
        if (z17) {
            com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = finderMsgOperateVM.f122971c;
            if (finderCommentFooter != null) {
                finderCommentFooter.setFrozen(true);
            }
            vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
            android.content.Context context = finderMsgOperateVM.f122969a;
            java.lang.String a17 = com.tencent.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
            if (a17 == null) {
                a17 = "";
            }
            ((vh0.f3) n1Var).bj(context, "wxid_wi_1d142z0zdj03", 5, a17, new vh0.i1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReplyWithSecurityCheck$1.1
                @Override // vh0.i1
                public void onResult(java.lang.Object obj2) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj2;
                    com.tencent.mars.xlog.Log.i("CommentFooterVm", "onReply privacy result " + bool);
                    final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM2 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.this;
                    com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = finderMsgOperateVM2.f122971c;
                    if (finderCommentFooter2 != null) {
                        finderCommentFooter2.setFrozen(false);
                    }
                    kotlin.jvm.internal.o.d(bool);
                    if (!bool.booleanValue()) {
                        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter3 = finderMsgOperateVM2.f122971c;
                        if (finderCommentFooter3 != null) {
                            finderCommentFooter3.D(true);
                            return;
                        }
                        return;
                    }
                    com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter4 = finderMsgOperateVM2.f122971c;
                    if (finderCommentFooter4 != null) {
                        final so2.o3 o3Var2 = o3Var;
                        finderCommentFooter4.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.onReplyWithSecurityCheck.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM3 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.this;
                                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.b(finderMsgOperateVM3, finderMsgOperateVM3.f122970b, o3Var2.f410411d);
                                finderMsgOperateVM3.d(null);
                            }
                        }, 300L);
                    }
                }
            });
        } else {
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.b(finderMsgOperateVM, finderMsgOperateVM.f122970b, o3Var.f410411d);
            finderMsgOperateVM.d(null);
        }
        return jz5.f0.f302826a;
    }
}
