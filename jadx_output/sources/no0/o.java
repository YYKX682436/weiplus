package no0;

/* loaded from: classes9.dex */
public final class o extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f338731b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f338732c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f338733d = "";

    @Override // ot0.h
    public ot0.h a() {
        return new no0.o();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        boolean z17 = false;
        if (qVar != null && qVar.f348666i == 60) {
            z17 = true;
        }
        if (!z17 || sb6 == null) {
            return;
        }
        sb6.append("<mmlive>");
        sb6.append("<live_id>");
        sb6.append(ot0.q.g(this.f338731b));
        sb6.append("</live_id>");
        sb6.append("</mmlive>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        boolean z17 = false;
        if (qVar != null && qVar.f348666i == 60) {
            z17 = true;
        }
        if (z17) {
            kotlin.jvm.internal.o.d(map);
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmlive.live_id");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            this.f338731b = str;
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.title");
            if (str2 == null) {
                str2 = "";
            }
            this.f338732c = str2;
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.thumburl");
            this.f338733d = str3 != null ? str3 : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareLiveAppMsgPiece", toString());
        }
    }

    public java.lang.String toString() {
        return "ShareLiveAppMsgPiece(liveId='" + this.f338731b + "', liveName='" + this.f338732c + "', thumbUrl='" + this.f338733d + "')";
    }
}
