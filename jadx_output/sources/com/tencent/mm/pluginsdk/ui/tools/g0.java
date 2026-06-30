package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes9.dex */
public class g0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f191630b;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f191633e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f191634f;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f191638j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f191639k;

    /* renamed from: c, reason: collision with root package name */
    public int f191631c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f191632d = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f191635g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f191636h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f191637i = 0;

    @Override // ot0.h
    public ot0.h a() {
        com.tencent.mm.pluginsdk.ui.tools.g0 g0Var = new com.tencent.mm.pluginsdk.ui.tools.g0();
        g0Var.f191630b = this.f191630b;
        g0Var.f191631c = this.f191631c;
        g0Var.f191639k = this.f191639k;
        g0Var.f191632d = this.f191632d;
        g0Var.f191633e = this.f191633e;
        g0Var.f191634f = this.f191634f;
        g0Var.f191635g = this.f191635g;
        g0Var.f191636h = this.f191636h;
        g0Var.f191637i = this.f191637i;
        g0Var.f191638j = this.f191638j;
        return g0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<gameshare>");
        sb6.append("<liteappext>");
        sb6.append("<liteappbizdata>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191630b));
        sb6.append("</liteappbizdata>");
        sb6.append("<priority>");
        sb6.append(this.f191631c);
        sb6.append("</priority>");
        sb6.append("</liteappext>");
        sb6.append("<appbrandext>");
        sb6.append("<litegameinfo>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191639k));
        sb6.append("</litegameinfo>");
        sb6.append("<priority>");
        sb6.append(this.f191632d);
        sb6.append("</priority>");
        sb6.append("</appbrandext>");
        sb6.append("<gameshareid>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191633e));
        sb6.append("</gameshareid>");
        sb6.append("<sharedata>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191634f));
        sb6.append("</sharedata>");
        sb6.append("<isvideo>");
        sb6.append(this.f191635g);
        sb6.append("</isvideo>");
        sb6.append("<duration>");
        sb6.append(this.f191636h);
        sb6.append("</duration>");
        sb6.append("<isexposed>");
        sb6.append(this.f191637i);
        sb6.append("</isexposed>");
        sb6.append("<readtext>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191638j));
        sb6.append("</readtext>");
        sb6.append("</gameshare>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f191630b = (java.lang.String) map.get(".msg.appmsg.gameshare.liteappext.liteappbizdata");
        this.f191631c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.liteappext.priority"), 0);
        this.f191639k = (java.lang.String) map.get(".msg.appmsg.gameshare.appbrandext.litegameinfo");
        this.f191632d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.appbrandext.priority"), -1);
        this.f191633e = (java.lang.String) map.get(".msg.appmsg.gameshare.gameshareid");
        this.f191634f = (java.lang.String) map.get(".msg.appmsg.gameshare.sharedata");
        this.f191635g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.isvideo"), 0);
        this.f191636h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.duration"), 0);
        this.f191637i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.isexposed"), 0);
        this.f191638j = (java.lang.String) map.get(".msg.appmsg.gameshare.readtext");
    }
}
