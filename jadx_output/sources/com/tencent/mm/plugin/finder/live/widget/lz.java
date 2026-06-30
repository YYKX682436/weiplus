package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f118986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f118988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f118989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f118990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118991i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz(kotlin.jvm.internal.h0 h0Var, java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.l lVar, boolean z17, android.content.Context context, java.lang.String str2) {
        super(0);
        this.f118986d = h0Var;
        this.f118987e = str;
        this.f118988f = lVar;
        this.f118989g = z17;
        this.f118990h = context;
        this.f118991i = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean fj6;
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        kotlin.jvm.internal.h0 h0Var = this.f118986d;
        wXAppExtendObject.extInfo = (java.lang.String) h0Var.f310123d;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = (java.lang.String) h0Var.f310123d;
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        java.lang.String str = this.f118987e;
        com.tencent.mm.pluginsdk.model.app.m i17 = com.tencent.mm.pluginsdk.model.app.w.i(str, Integer.MAX_VALUE);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpGame, openId:");
        sb6.append(i17 != null ? i17.field_openId : null);
        sb6.append(", appInfo:");
        sb6.append(i17 == null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f118988f;
        new db2.z1(((mm2.e1) lVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f328985o), ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v, 0).l();
        r45.yq1 yq1Var = ((mm2.c1) lVar.P0(mm2.c1.class)).f328811g6;
        java.lang.Integer valueOf = yq1Var != null ? java.lang.Integer.valueOf(yq1Var.getInteger(5)) : null;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("jumpGame platformId:");
        sb7.append(valueOf);
        sb7.append(", passEmptyOpenId:");
        boolean z17 = this.f118989g;
        sb7.append(z17);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb7.toString());
        if ((valueOf != null && valueOf.intValue() == 1) || z17) {
            java.lang.String str2 = i17.field_packageName;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context context = this.f118990h;
            java.lang.String str4 = this.f118987e;
            com.tencent.mm.plugin.finder.live.widget.jz jzVar = com.tencent.mm.plugin.finder.live.widget.jz.f118791a;
            android.os.Bundle bundle = new android.os.Bundle();
            ((kt.c) i0Var).getClass();
            fj6 = com.tencent.mm.pluginsdk.model.app.w.w(context, str3, wXMediaMessage, str4, "", 2, jzVar, bundle);
        } else {
            fj6 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(this.f118990h, this.f118987e, wXMediaMessage, 2, com.tencent.mm.plugin.finder.live.widget.kz.f118874a, new android.os.Bundle());
        }
        if (!fj6) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveVisitorGameTeamWidget", "launchAppByWeChat failed, request and toast");
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ri(str, this.f118991i, null);
            db5.t7.makeText(this.f118990h, com.tencent.mm.R.string.dgq, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
