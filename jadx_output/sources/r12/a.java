package r12;

/* loaded from: classes11.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q11.b a(java.lang.String r25, com.tencent.mm.network.m r26) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r12.a.a(java.lang.String, com.tencent.mm.network.m):q11.b");
    }

    public static com.tencent.mm.network.i2 b(java.lang.String str, com.tencent.mm.network.m mVar) {
        java.lang.String str2;
        com.tencent.mm.network.j2 e17 = com.tencent.mm.network.n.e(str, null);
        e17.f72053s = tj.g.CTRL_INDEX;
        e17.f72054t = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1195L, 96L, 1L, false);
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.a()) {
            str2 = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/?version=%d&nettype=%d&signal=%d", java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.getNetTypeForStat(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.v0.f193027a.c()));
        } else {
            str2 = "";
        }
        e17.f72043i = "GET";
        e17.h("referer", str2);
        e17.f72039e = 15000;
        e17.f72040f = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
        return e17;
    }
}
