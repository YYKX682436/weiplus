package i45;

/* loaded from: classes16.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final i45.k f288420a = new i45.k();

    public static void a(i45.k kVar, long j17, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            num = -1;
        }
        if ((i17 & 4) != 0) {
            str = "";
        }
        if ((i17 & 8) != 0) {
            str2 = "";
        }
        if ((i17 & 16) != 0) {
            str3 = "";
        }
        if ((i17 & 32) != 0) {
            str4 = "";
        }
        if ((i17 & 64) != 0) {
            str5 = "";
        }
        if ((i17 & 128) != 0) {
            str6 = "";
        }
        if ((i17 & 256) != 0) {
            str7 = "";
        }
        if ((i17 & 512) != 0) {
            str8 = "";
        }
        kVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.KBInvokeWechatStruct kBInvokeWechatStruct = new com.tencent.mm.autogen.mmdata.rpt.KBInvokeWechatStruct();
        kBInvokeWechatStruct.f58533d = j17;
        kBInvokeWechatStruct.f58534e = kBInvokeWechatStruct.b("ContentTitle", str, true);
        kBInvokeWechatStruct.f58535f = kBInvokeWechatStruct.b("AppID", str2, true);
        kBInvokeWechatStruct.f58536g = kBInvokeWechatStruct.b("SongID", str3, true);
        kBInvokeWechatStruct.f58537h = kBInvokeWechatStruct.b("EmojiMd5", str4, true);
        kBInvokeWechatStruct.f58538i = kBInvokeWechatStruct.b("EmojiProductID", str5, true);
        kBInvokeWechatStruct.f58539j = kBInvokeWechatStruct.b("SongName", str6, true);
        kBInvokeWechatStruct.f58540k = kBInvokeWechatStruct.b("ToUsername", str7, true);
        kBInvokeWechatStruct.f58541l = num != null ? num.intValue() : 0L;
        kBInvokeWechatStruct.f58542m = kBInvokeWechatStruct.b("imageUrl", str8, true);
        kBInvokeWechatStruct.k();
        f288420a.b(kBInvokeWechatStruct);
    }

    public final void b(jx3.a aVar) {
        java.lang.String n17 = aVar.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxImeReport", "report%s %s", java.lang.Integer.valueOf(aVar.g()), r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
