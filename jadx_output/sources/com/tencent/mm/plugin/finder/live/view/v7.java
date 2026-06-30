package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class v7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f116741d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f116742e;

    /* renamed from: f, reason: collision with root package name */
    public int f116743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f116744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView f116745h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(android.content.Context context, com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView finderLiveNewFansClubAnnouncementView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116744g = context;
        this.f116745h = finderLiveNewFansClubAnnouncementView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.v7(this.f116744g, this.f116745h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.view.v7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.eq1 eq1Var;
        android.content.Context context;
        com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView finderLiveNewFansClubAnnouncementView;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f116743f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm2.n2 n2Var = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
            if (n2Var != null && (eq1Var = n2Var.f329279g) != null) {
                context = this.f116744g;
                dk2.q4 q4Var = dk2.q4.f233938a;
                this.f116741d = context;
                com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView finderLiveNewFansClubAnnouncementView2 = this.f116745h;
                this.f116742e = finderLiveNewFansClubAnnouncementView2;
                this.f116743f = 1;
                java.lang.Object k17 = q4Var.k(context, eq1Var, null, true, this);
                if (k17 == aVar) {
                    return aVar;
                }
                finderLiveNewFansClubAnnouncementView = finderLiveNewFansClubAnnouncementView2;
                obj = k17;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        finderLiveNewFansClubAnnouncementView = (com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView) this.f116742e;
        context = (android.content.Context) this.f116741d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Boolean) ((jz5.l) obj).f302833d).booleanValue()) {
            android.view.View view = finderLiveNewFansClubAnnouncementView.f116057e;
            if (view == null) {
                kotlin.jvm.internal.o.o("announcementContentContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView$initView$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView$initView$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f491520dd5));
        } else {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = finderLiveNewFansClubAnnouncementView.f116058f;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("showAnnouncementSwitch");
                throw null;
            }
            mMSwitchBtn.setCheck(true);
            db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.f491518dd3));
        }
        return jz5.f0.f302826a;
    }
}
