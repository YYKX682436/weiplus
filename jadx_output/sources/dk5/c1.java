package dk5;

/* loaded from: classes9.dex */
public class c1 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234538c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f234539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234540e;

    public c1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI, ot0.q qVar, ot0.q qVar2, java.lang.String str, byte[] bArr) {
        this.f234540e = msgRetransmitUI;
        this.f234536a = qVar;
        this.f234537b = qVar2;
        this.f234538c = str;
        this.f234539d = bArr;
    }

    @Override // g35.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        java.lang.String G1 = com.tencent.mm.sdk.platformtools.t8.G1(str3);
        java.lang.String G12 = com.tencent.mm.sdk.platformtools.t8.G1(str4);
        ot0.q qVar = this.f234536a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "summerbig CheckBigFile callback new, errMsg:[%s], md5[%s], aesKey[%s], signature[%s], old aeskey[%s], faesKey[%s], fsignature[%s]", str, str2, G1, G12, com.tencent.mm.sdk.platformtools.t8.G1(qVar.T), com.tencent.mm.sdk.platformtools.t8.G1(str5), com.tencent.mm.sdk.platformtools.t8.G1(str6));
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str4);
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234540e;
        if (K0) {
            db5.e1.s(msgRetransmitUI, msgRetransmitUI.getString(com.tencent.mm.R.string.bkr), "");
            msgRetransmitUI.finish();
        } else {
            java.lang.Object obj = com.tencent.mm.pluginsdk.model.app.k0.K(this.f234537b, qVar.f348646d, qVar.H, this.f234538c, "", this.f234539d, msgRetransmitUI.I, str4, "", com.tencent.mm.plugin.msg.MsgIdTalker.f149479g).second;
            if (obj != null) {
                com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(this.f234538c, (java.lang.Long) obj);
            }
        }
    }
}
