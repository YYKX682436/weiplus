package qm2;

/* loaded from: classes3.dex */
public final class o implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.u f364740d;

    public o(qm2.u uVar) {
        this.f364740d = uVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String headUrl;
        java.lang.String headUrl2;
        r45.f50 f50Var = (r45.f50) obj;
        qm2.u uVar = this.f364740d;
        gk2.e eVar = uVar.f364757i;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        boolean z17 = n0Var != null && n0Var.O6();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "registerCoLiveBarVisibility: isInCoLive=" + z17);
        android.view.View view = uVar.f364755g;
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC$registerCoLiveBarVisibility$1$1", "emit", "(Lcom/tencent/mm/protocal/protobuf/CoLiveInvitationInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC$registerCoLiveBarVisibility$1$1", "emit", "(Lcom/tencent/mm/protocal/protobuf/CoLiveInvitationInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z17 || f50Var == null || uVar.f364756h == null) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars finderLiveColiveAnchorListAvatars = uVar.f364756h;
            if (finderLiveColiveAnchorListAvatars != null) {
                finderLiveColiveAnchorListAvatars.setAvatars(kz5.p0.f313996d);
            }
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = f50Var.f374017h;
            if (finderContact != null && (headUrl2 = finderContact.getHeadUrl()) != null) {
                if (!(!r26.n0.N(headUrl2))) {
                    headUrl2 = null;
                }
                if (headUrl2 != null) {
                    arrayList2.add(headUrl2);
                }
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = f50Var.f374017h;
            java.lang.String username = finderContact2 != null ? finderContact2.getUsername() : null;
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> linkedList = f50Var.f374016g;
            if (linkedList != null) {
                for (com.tencent.mm.protocal.protobuf.FinderContact finderContact3 : linkedList) {
                    java.lang.String username2 = finderContact3.getUsername();
                    if (!(username2 == null || username2.length() == 0) && !kotlin.jvm.internal.o.b(finderContact3.getUsername(), username) && (headUrl = finderContact3.getHeadUrl()) != null) {
                        if (!(!r26.n0.N(headUrl))) {
                            headUrl = null;
                        }
                        if (headUrl != null) {
                            arrayList2.add(headUrl);
                        }
                    }
                }
            }
            com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars finderLiveColiveAnchorListAvatars2 = uVar.f364756h;
            if (finderLiveColiveAnchorListAvatars2 != null) {
                finderLiveColiveAnchorListAvatars2.setAvatars(arrayList2);
            }
        }
        return jz5.f0.f302826a;
    }
}
