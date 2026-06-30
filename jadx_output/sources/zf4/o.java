package zf4;

/* loaded from: classes9.dex */
public class o {

    /* renamed from: h, reason: collision with root package name */
    public static final kk.j f472681h = new jt0.j(100);

    /* renamed from: a, reason: collision with root package name */
    public int f472682a;

    /* renamed from: b, reason: collision with root package name */
    public int f472683b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f472684c;

    /* renamed from: d, reason: collision with root package name */
    public int f472685d;

    /* renamed from: e, reason: collision with root package name */
    public int f472686e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472687f;

    /* renamed from: g, reason: collision with root package name */
    public int f472688g;

    public static zf4.o a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        int hashCode = str.hashCode();
        kk.j jVar = f472681h;
        zf4.o oVar = (zf4.o) ((lt0.f) jVar).get(java.lang.Integer.valueOf(hashCode));
        if (oVar != null) {
            return oVar;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse msg failed");
            return null;
        }
        try {
            zf4.o oVar2 = new zf4.o();
            oVar2.f472688g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.appattach.totallen"), 0);
            oVar2.f472687f = (java.lang.String) d17.get(".msg.appmsg.appattach.attachid");
            oVar2.f472682a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindtime"), 0);
            oVar2.f472683b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindid"), 0);
            oVar2.f472684c = (java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindattachid");
            oVar2.f472685d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindattachtotallen"), 0);
            com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindformat"), 0);
            com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$originformat"), 0);
            oVar2.f472686e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$msgsvrid"), 0);
            ((lt0.f) jVar).j(java.lang.Integer.valueOf(hashCode), oVar2);
            return oVar2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse amessage xml failed");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoiceRemindAppMsgExInfo", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
