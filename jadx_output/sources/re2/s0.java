package re2;

/* loaded from: classes15.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationErrorUI f394483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394484e;

    public s0(com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationErrorUI finderLiveCoLiveInvitationErrorUI, int i17) {
        this.f394483d = finderLiveCoLiveInvitationErrorUI;
        this.f394484e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationErrorUI$bindActionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationErrorUI finderLiveCoLiveInvitationErrorUI = this.f394483d;
        int i17 = this.f394484e;
        int i18 = com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationErrorUI.f111544n;
        if (i17 == -200460) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationErrorUI", "onActionButtonClicked: enter create-and-live flow, spamJumpUrl=" + finderLiveCoLiveInvitationErrorUI.f111551m);
            int i19 = finderLiveCoLiveInvitationErrorUI.f111550i;
            java.lang.String str = finderLiveCoLiveInvitationErrorUI.f111551m;
            re2.f0.f394407a = i19;
            re2.f0.f394408b = str;
            com.tencent.mars.xlog.Log.i("Finder.CoLiveCreateAccountFlow", "start: userFlag=" + i19 + ", spamJumpUrl=" + str);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_router_to_profile", false);
            intent.putExtra("key_create_scene", 3);
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).rj(finderLiveCoLiveInvitationErrorUI, intent, 32272);
        } else if (i17 != -200008) {
            finderLiveCoLiveInvitationErrorUI.getClass();
            com.tencent.mars.xlog.Log.w("Finder.CoLiveInvitationErrorUI", "onActionButtonClicked: unhandled errorCode=" + i17);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationErrorUI", "onActionButtonClicked: enter realname-only flow, spamJumpUrl=" + finderLiveCoLiveInvitationErrorUI.f111551m);
            java.lang.String str2 = finderLiveCoLiveInvitationErrorUI.f111551m;
            re2.w0 w0Var = new re2.w0(finderLiveCoLiveInvitationErrorUI);
            com.tencent.mars.xlog.Log.i("Finder.CoLiveCreateAccountFlow", "startRealnameOnly: spamJumpUrl=" + str2);
            if (str2 == null || str2.length() == 0) {
                w0Var.invoke();
            } else {
                re2.f0.f394407a = 0;
                re2.f0.f394408b = str2;
                android.content.Intent intent2 = new android.content.Intent(finderLiveCoLiveInvitationErrorUI, (java.lang.Class<?>) com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.class);
                intent2.putExtra("LIVE_HELP_TYPE", 1);
                intent2.putExtra("FACE_VERIFY_URL", str2);
                intent2.putExtra("SKIP_INTERMEDIATE_PAGE", true);
                intent2.putExtra("PRECHECK_TYPE", 5);
                com.tencent.mars.xlog.Log.i("Finder.CoLiveCreateAccountFlow", "launchFaceVerify: verifyUrl=" + str2);
                finderLiveCoLiveInvitationErrorUI.startActivityForResult(intent2, 32274);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationErrorUI$bindActionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
