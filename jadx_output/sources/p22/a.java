package p22;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.aj0 aj0Var = new r45.aj0();
        aj0Var.f370047d = str;
        lVar.f70664a = aj0Var;
        lVar.f70665b = new r45.bj0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmemojitextantispam";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.media.c4.CTRL_INDEX;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiTextAntiSpam", "Check text anti spam " + str);
    }
}
