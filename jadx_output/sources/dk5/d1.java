package dk5;

/* loaded from: classes9.dex */
public class d1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f234573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f234575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234577h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f234578i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234579m;

    public d1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI, com.tencent.mm.pluginsdk.model.app.d dVar, java.lang.String str, com.tencent.mm.storage.f9 f9Var, ot0.q qVar, java.lang.String str2, byte[] bArr) {
        this.f234579m = msgRetransmitUI;
        this.f234573d = dVar;
        this.f234574e = str;
        this.f234575f = f9Var;
        this.f234576g = qVar;
        this.f234577h = str2;
        this.f234578i = bArr;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2 = this.f234574e;
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f234573d;
        dVar.field_fileFullPath = str2;
        if (i17 == 0 && gVar != null) {
            dVar.field_offset = gVar.field_finishedLength;
            com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
        }
        if (i17 == 0 && hVar != null && hVar.field_retCode == 0) {
            dVar.field_status = 199L;
            dVar.field_offset = dVar.field_totalLen;
            com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
            com.tencent.mm.storage.f9 f9Var = this.f234575f;
            f9Var.r1(3);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(f9Var.getMsgId(), f9Var);
            ot0.q qVar = this.f234576g;
            java.lang.Object obj = com.tencent.mm.pluginsdk.model.app.k0.J(qVar, qVar.f348646d, qVar.H, this.f234577h, this.f234574e, this.f234578i, this.f234579m.I).second;
            if (obj != null) {
                com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(this.f234577h, (java.lang.Long) obj);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
