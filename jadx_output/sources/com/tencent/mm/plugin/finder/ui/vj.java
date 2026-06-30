package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class vj implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129962a;

    public vj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f129962a = finderShareFeedRelUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String string;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129962a;
        android.content.Intent intent = finderShareFeedRelUI.getIntent();
        java.lang.String valueOf = java.lang.String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
        if (u46.l.e(valueOf)) {
            valueOf = r30.m.f368946a;
        }
        long longExtra = finderShareFeedRelUI.getIntent().getLongExtra("feed_object_id", 0L);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        com.tencent.mm.plugin.finder.ui.qm qmVar = finderShareFeedRelUI.D;
        if (qmVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        long j17 = qmVar.C;
        if (qmVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        java.lang.String str2 = qmVar.D;
        androidx.appcompat.app.AppCompatActivity context = finderShareFeedRelUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.e6 hk6 = com.tencent.mm.plugin.finder.report.o3.hk(o3Var, j17, str2, nyVar != null ? nyVar.f135380n : 0, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f125012a : null;
        jz5.l[] lVarArr = new jz5.l[9];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String str3 = "";
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c18 = b52.b.c();
        if (c18 == null) {
            c18 = "";
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", c18);
        lVarArr[3] = new jz5.l("extra_info", valueOf);
        androidx.appcompat.app.AppCompatActivity context2 = finderShareFeedRelUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        lVarArr[4] = new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n));
        android.content.Intent intent2 = finderShareFeedRelUI.getIntent();
        lVarArr[5] = new jz5.l("enter_source_info", java.lang.String.valueOf(intent2 != null ? intent2.getStringExtra("key_enter_source_info") : null));
        lVarArr[6] = new jz5.l("pagein_feedid", pm0.v.u(longExtra));
        java.lang.String stringExtra = finderShareFeedRelUI.getIntent().getStringExtra("key_firstFeedSessionBuffer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        lVarArr[7] = new jz5.l("session_buffer", stringExtra);
        if (fl2Var != null && (string = fl2Var.getString(5)) != null) {
            str3 = r26.i0.t(string, ",", ";", false);
        }
        lVarArr[8] = new jz5.l("client_udf_kv", str3);
        return kz5.c1.k(lVarArr);
    }
}
