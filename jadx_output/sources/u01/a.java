package u01;

/* loaded from: classes9.dex */
public final class a implements m31.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter f423447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f423448b;

    public a(com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter bizSubscribeMsgSettingPagePresenter, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f423447a = bizSubscribeMsgSettingPagePresenter;
        this.f423448b = mMActivity;
    }

    @Override // m31.d
    public void a(com.tencent.mm.msgsubscription.SubscribeMsgTmpItem item, int i17) {
        bw.j jVar;
        e31.k kVar;
        com.tencent.mm.storage.z3 n17;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter bizSubscribeMsgSettingPagePresenter = this.f423447a;
        bizSubscribeMsgSettingPagePresenter.getClass();
        com.tencent.mm.ui.MMActivity activity = this.f423448b;
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.mmSetOnActivityResultCallback(new u01.b(bizSubscribeMsgSettingPagePresenter, i17));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_data", item);
        boolean z17 = false;
        intent.putExtra("key_status_subscribed", item.f71807m == 1);
        intent.putExtra("key_from_biz", true);
        intent.putExtra("key_biz_username", bizSubscribeMsgSettingPagePresenter.f70861g);
        intent.putExtra("key_template_id", item.f71803f);
        intent.putExtra("key_report_info", bizSubscribeMsgSettingPagePresenter.f70862h);
        if (item.B && (jVar = (bw.j) i95.n0.c(bw.j.class)) != null && (kVar = bizSubscribeMsgSettingPagePresenter.f70857c) != null) {
            zv.o0 o0Var = (zv.o0) jVar;
            if (zv.q.f476079a.g() && ((g31.l) kVar).f268094g && o0Var.Ri(bizSubscribeMsgSettingPagePresenter.f70861g) && (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(bizSubscribeMsgSettingPagePresenter.f70861g, true)) != null) {
                z17 = !c01.e2.P(n17);
            }
        }
        intent.putExtra("key_should_hide_accept", z17);
        j45.l.v(activity, "com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI", intent, 1);
    }

    @Override // m31.d
    public boolean b(com.tencent.mm.msgsubscription.SubscribeMsgTmpItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f423447a.getClass();
        return item.f71807m == 1;
    }
}
