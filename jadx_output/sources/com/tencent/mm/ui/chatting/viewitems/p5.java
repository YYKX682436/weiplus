package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class p5 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f205230b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f205231c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f205232d;

    /* renamed from: e, reason: collision with root package name */
    public int f205233e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f205234f;

    @Override // ot0.h
    public ot0.h a() {
        return new com.tencent.mm.ui.chatting.viewitems.p5();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (qVar.f348666i == 671088689) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgDownloader", "values: %s", map.toString());
            this.f205230b = com.tencent.mm.sdk.platformtools.t8.P(f(map, "state"), 0);
            this.f205231c = f(map, "appid");
            this.f205232d = f(map, "appname");
            this.f205233e = com.tencent.mm.sdk.platformtools.t8.P(f(map, "appsize"), 0);
            this.f205234f = f(map, "iconurl");
        }
    }

    public final java.lang.String f(java.util.Map map, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.downloaderapp." + str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }
}
