package ke2;

/* loaded from: classes8.dex */
public final class j0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306959t;

    /* renamed from: u, reason: collision with root package name */
    public final ke2.i0 f306960u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.lang.String nickname, java.lang.String url, int i17, long j17, ke2.i0 i0Var) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(url, "url");
        this.f306959t = "Finder.CgiFinderLiveSetSockPuppetAttr";
        this.f306960u = i0Var;
        r45.c92 c92Var = new r45.c92();
        c92Var.set(2, nickname);
        c92Var.set(3, url);
        c92Var.set(1, db2.t4.f228171a.a(6816));
        c92Var.set(4, java.lang.Integer.valueOf(i17));
        c92Var.set(5, java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = c92Var;
        r45.d92 d92Var = new r45.d92();
        d92Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d92Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = d92Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivesetsockpuppetattr";
        lVar.f70667d = 6816;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init nickname:");
        sb6.append(c92Var.getString(2));
        sb6.append(",url:");
        sb6.append(c92Var.getString(3));
        sb6.append(",live_identity:");
        r45.kv0 kv0Var = (r45.kv0) c92Var.getCustom(1);
        sb6.append(kv0Var != null ? java.lang.Integer.valueOf(kv0Var.getInteger(6)) : null);
        sb6.append(",scene:");
        sb6.append(c92Var.getInteger(4));
        sb6.append(", show_ts:");
        sb6.append(c92Var.getLong(5));
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveSetSockPuppetAttr", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.d92 resp = (r45.d92) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306959t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ke2.i0 i0Var = this.f306960u;
        if (i17 != 0 || i18 != 0) {
            if (i0Var != null) {
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.o8(((com.tencent.mm.plugin.finder.feed.ui.q8) i0Var).f110448a, i18, str));
                return;
            }
            return;
        }
        if (i0Var != null) {
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = ((com.tencent.mm.plugin.finder.feed.ui.q8) i0Var).f110448a;
            com.tencent.mars.xlog.Log.i(finderLiveCreateVisitorModeUI.f109355v, "save alias nickName:" + finderLiveCreateVisitorModeUI.L + ",avatar:" + finderLiveCreateVisitorModeUI.f109354J);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save alias_info?.head_img_url:");
            r45.of1 of1Var = (r45.of1) resp.getCustom(1);
            sb6.append(of1Var != null ? of1Var.getString(1) : null);
            com.tencent.mars.xlog.Log.i(finderLiveCreateVisitorModeUI.f109355v, sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            r45.of1 of1Var2 = (r45.of1) resp.getCustom(1);
            if (of1Var2 == null || (str2 = of1Var2.getString(0)) == null) {
                str2 = finderLiveCreateVisitorModeUI.L;
            }
            intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", str2);
            r45.of1 of1Var3 = (r45.of1) resp.getCustom(1);
            if (of1Var3 == null || (str3 = of1Var3.getString(1)) == null) {
                str3 = finderLiveCreateVisitorModeUI.f109354J;
            }
            intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", str3);
            r45.of1 of1Var4 = (r45.of1) resp.getCustom(1);
            if (of1Var4 == null || (str4 = of1Var4.getString(3)) == null) {
                str4 = finderLiveCreateVisitorModeUI.f109354J;
            }
            intent.putExtra("KEY_ALIAS_VISITOR_USERNAME", str4);
            finderLiveCreateVisitorModeUI.setResult(-1, intent);
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.p8(finderLiveCreateVisitorModeUI));
            finderLiveCreateVisitorModeUI.finish();
        }
    }
}
