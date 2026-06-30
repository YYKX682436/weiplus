package gf2;

/* loaded from: classes.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f271272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f271275g;

    public e(com.tencent.mm.ui.widget.dialog.k0 k0Var, java.lang.String str, com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, yz5.p pVar) {
        this.f271272d = k0Var;
        this.f271273e = str;
        this.f271274f = anchorMilestoneShareView;
        this.f271275g = pVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        yz5.p pVar = this.f271275g;
        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271274f;
        java.lang.String str = this.f271273e;
        if (valueOf != null && valueOf.intValue() == 0) {
            int i18 = com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.f111571t;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            java.lang.String str2 = anchorMilestoneShareView.f111575g;
            if (str2 != null) {
                ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Di(intent, str2, 4);
            }
            android.content.Context context = anchorMilestoneShareView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            j45.l.x((com.tencent.mm.ui.MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, new gf2.h(pVar));
        } else if (valueOf != null && valueOf.intValue() == 1) {
            int i19 = com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.f111571t;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Ksnsupload_type", 0);
            intent2.putExtra("sns_kemdia_path", str);
            java.lang.String str3 = anchorMilestoneShareView.f111575g;
            if (str3 != null) {
                ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Di(intent2, str3, 4);
            }
            android.content.Context context2 = anchorMilestoneShareView.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j45.l.w((com.tencent.mm.ui.MMActivity) context2, ".plugin.sns.ui.SnsUploadUI", intent2, 1017, new gf2.i(pVar));
        } else if (valueOf != null && valueOf.intValue() == 2) {
            int i27 = com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.f111571t;
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = anchorMilestoneShareView.f111573e;
            if (finderContact == null) {
                kotlin.jvm.internal.o.o("contact");
                throw null;
            }
            java.lang.String username = finderContact.getUsername();
            if (username == null) {
                username = "";
            }
            android.content.Context context3 = anchorMilestoneShareView.getContext();
            kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((c61.l7) b6Var).Wk(str, username, (com.tencent.mm.ui.MMActivity) context3);
        }
        this.f271272d.u();
    }
}
