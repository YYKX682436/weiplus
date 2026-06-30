package uc4;

/* loaded from: classes4.dex */
public final class v0 implements com.tencent.mm.pluginsdk.ui.span.c1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f426458a = "";

    @Override // com.tencent.mm.pluginsdk.ui.span.c1
    public void a(android.view.View view, java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        if (obj instanceof java.lang.String) {
            str = (java.lang.String) obj;
        } else {
            if (!(obj instanceof ca4.h)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
                return;
            }
            ca4.h hVar = (ca4.h) obj;
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(hVar.f39936c);
            if (k17 != null) {
                snsInfo = k17;
            }
            str = hVar.f39935b;
            kotlin.jvm.internal.o.d(str);
        }
        this.f426458a = str;
        snsInfo.setUserName(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeJump", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
        android.content.Context context = view.getContext();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(this.f426458a);
        intent.putExtra("Contact_User", this.f426458a);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 101);
        if (q17 != null && q17.k2()) {
            intent.putExtra("Contact_Scene", 37);
        }
        yc4.b0 b0Var = yc4.b0.f460839a;
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        b0Var.f(intent, snsInfo, context2);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, context);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f426458a, 6L);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f426458a, 6L);
        java.lang.String str2 = kotlin.jvm.internal.o.b(this.f426458a, c01.z1.r()) ? "BrowseMyAlbumTime" : "BrowseOtherAlbumTime";
        zy1.f fVar = (zy1.f) ((dy1.s) i95.n0.c(dy1.s.class));
        fVar.Ni(12076, str2);
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        kotlin.jvm.internal.o.f(t07, "longToString(...)");
        fVar.Di(12076, "NickNameFeedIdCount", t07);
        fVar.Di(12076, "ClickAlbumCount", this.f426458a);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f426458a, 11L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeJump", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
    }
}
