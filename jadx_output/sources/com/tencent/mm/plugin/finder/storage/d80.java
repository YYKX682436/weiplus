package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class d80 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.f80 f126633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(com.tencent.mm.plugin.finder.storage.f80 f80Var) {
        super(2);
        this.f126633d = f80Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        java.lang.String sessionBuffer;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        java.lang.String username = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Context context = this.f126633d.f126753d;
        r45.xk bizInfo = feed.getFeedObject().getBizInfo();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (bizInfo != null) {
            com.tencent.mars.xlog.Log.i("FinderConfigForNewLiveCardStyle", "jumpBizProfile: bizUsername = " + bizInfo.getString(0));
            java.lang.String string = bizInfo.getString(0);
            if (string == null) {
                string = "";
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, feed.getItemId(), null, 0, 5, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
            intent.putExtra("Contact_User", string);
            intent.putExtra("Contact_Scene", 213);
            boolean z17 = true;
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("biz_profile_tab_type", 1);
            java.lang.String sessionBuffer2 = feed.getFeedObject().getFeedObject().getSessionBuffer();
            if (sessionBuffer2 != null && sessionBuffer2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long itemId = feed.getItemId();
                java.lang.String w17 = feed.w();
                com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
                sessionBuffer = o3Var.ek(itemId, w17, e17 != null ? e17.f135380n : 0);
            } else {
                sessionBuffer = feed.getFeedObject().getFeedObject().getSessionBuffer();
            }
            intent.putExtra("Contact_Scene_Note", sessionBuffer);
            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_username", username);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent2, feed.getItemId(), null, 0, 1, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent2);
        }
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zi(4, feed.getItemId(), nyVar.V6(), 1, username);
        }
        return f0Var2;
    }
}
