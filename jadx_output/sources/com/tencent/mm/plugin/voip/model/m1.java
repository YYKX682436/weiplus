package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public int f176744a;

    /* renamed from: b, reason: collision with root package name */
    public long f176745b;

    /* renamed from: c, reason: collision with root package name */
    public int f176746c;

    /* renamed from: d, reason: collision with root package name */
    public int f176747d;

    public boolean a(java.lang.String str) {
        this.f176747d = 0;
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "voipinvitemsg", null);
            if (d17 == null) {
                return false;
            }
            if (d17.get(".voipinvitemsg.roomid") != null) {
                this.f176744a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".voipinvitemsg.roomid"), 0);
            }
            if (d17.get(".voipinvitemsg.key") != null) {
                this.f176745b = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".voipinvitemsg.key"), 0L);
            }
            if (d17.get(".voipinvitemsg.status") != null) {
                this.f176746c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".voipinvitemsg.status"), 0);
            }
            if (d17.get(".voipinvitemsg.invitetype") == null) {
                return true;
            }
            this.f176747d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".voipinvitemsg.invitetype"), 0);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipExtension", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipExtension", "parse voip message error: %s", e17.getMessage());
            return false;
        }
    }
}
