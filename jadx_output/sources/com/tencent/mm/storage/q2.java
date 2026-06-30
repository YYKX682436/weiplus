package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f195233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f195235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s1 f195236g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(java.util.Map map, int i17, android.content.Context context, com.tencent.mm.storage.s1 s1Var) {
        super(0);
        this.f195233d = map;
        this.f195234e = i17;
        this.f195235f = context;
        this.f195236g = s1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.os.Bundle bundle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.mmreader.");
        int i17 = this.f195234e;
        sb6.append(com.tencent.mm.storage.s2.g(i17));
        sb6.append(".url");
        java.lang.String sb7 = sb6.toString();
        java.util.Map map = this.f195233d;
        java.lang.String a17 = ot0.g0.a((java.lang.String) map.get(sb7), 0, 10000, (int) (java.lang.System.currentTimeMillis() / 1000));
        java.lang.Object obj = map.get(".msg.appmsg.mmreader.category.item.title");
        java.lang.Object obj2 = map.get(".msg.appmsg.mmreader.category.item.cover");
        java.lang.Object obj3 = map.get(".msg.appmsg.mmreader.category.item.cover_1_1");
        java.lang.Object obj4 = map.get(".msg.appmsg.template_id");
        java.lang.String str2 = (java.lang.String) map.get(".msg.fromusername");
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader." + com.tencent.mm.storage.s2.g(i17) + ".publisher_username");
        if (str2 != null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
            str = n17 != null ? n17.f2() : null;
            if (str == null) {
                str = str2;
            }
        } else {
            str = null;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader." + com.tencent.mm.storage.s2.g(i17) + ".item_show_type"), -1);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", a17);
        intent.putExtra("shortUrl", a17);
        intent.putExtra("webpageTitle", (java.lang.String) obj);
        java.lang.String str4 = (java.lang.String) obj3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            str4 = (java.lang.String) obj2;
        }
        intent.putExtra("thumbUrl", str4);
        intent.putExtra("KTemplateId", (java.lang.String) obj4);
        com.tencent.mm.storage.s1 s1Var = this.f195236g;
        long j17 = s1Var.field_msgId;
        if (j17 >= 0) {
            intent.putExtra("msg_id", j17);
            intent.putExtra("msg_talker", s1Var.field_talker);
        }
        intent.putExtra("KPublisherId", "msg_" + s1Var.field_msgSvrId);
        intent.putExtra("pre_username", s1Var.field_talker);
        intent.putExtra("prePublishId", "msg_" + s1Var.field_msgSvrId);
        intent.putExtra("preChatName", s1Var.field_talker);
        intent.putExtra("geta8key_username", s1Var.field_talker);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            intent.putExtra("srcUsername", str2);
            intent.putExtra("srcDisplayname", str);
            intent.putExtra("mode", 1);
        }
        intent.putExtra("message_id", s1Var.field_msgSvrId);
        intent.putExtra("from_scence", 1);
        intent.putExtra("start_activity_time", java.lang.System.currentTimeMillis());
        intent.putExtra(com.tencent.mm.ui.w2.f211197j, P);
        intent.putExtra("key_enable_fts_quick", true);
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.putExtra("geta8key_scene", 102);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            intent.putExtra("msgUsername", str3);
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(2)) {
            bundle = null;
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(this.f195235f, a17, P, false, 0, 10000, intent)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "jump to TmplWebview");
                return jz5.f0.f302826a;
            }
        } else {
            bundle = null;
        }
        intent.putExtra("rawUrl", a17);
        j45.l.j(this.f195235f, "webview", ".ui.tools.WebViewUI", intent, bundle);
        return jz5.f0.f302826a;
    }
}
