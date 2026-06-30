package dk5;

/* loaded from: classes12.dex */
public class n1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public boolean f234743d = false;

    /* renamed from: e, reason: collision with root package name */
    public dn.h f234744e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f234745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234746g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234747h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234748i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234749m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f234750n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f234751o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f234752p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234753q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234754r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234755s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234756t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234757u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f234758v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f234759w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234760x;

    public n1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18, int i19, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i27, t21.v2 v2Var) {
        this.f234760x = msgRetransmitUI;
        this.f234746g = str;
        this.f234747h = str2;
        this.f234748i = str3;
        this.f234749m = str4;
        this.f234750n = i17;
        this.f234751o = i18;
        this.f234752p = i19;
        this.f234753q = str5;
        this.f234754r = str6;
        this.f234755s = str7;
        this.f234756t = str8;
        this.f234757u = str9;
        this.f234758v = i27;
        this.f234759w = v2Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        dn.h hVar2;
        dn.h hVar3;
        if (hVar == null) {
            return 0;
        }
        boolean z18 = hVar.field_exist_whencheck;
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234760x;
        if (!z18) {
            if (!this.f234743d) {
                int i18 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
                msgRetransmitUI.T6();
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "not support second!! dealDownloadVideo");
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "origin video not support second!! dealDownloadVideo, go ahead normal video");
            if (this.f234744e == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f234745f)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgRetransmitUI", "temp result is null, some thing wrong in process");
            } else {
                m11.m1 i19 = m11.m1.i();
                i19.f442141p = this.f234745f;
                i19.f322752q = 0;
                i19.f322753r = this.f234744e;
                i19.f322754s = new dk5.m1(this);
                i19.f442134i = 4;
                i19.a().a();
            }
            msgRetransmitUI.finish();
            return 0;
        }
        boolean z19 = this.f234743d;
        java.lang.String str3 = this.f234747h;
        java.lang.String str4 = this.f234746g;
        hVar.field_fileId = z19 ? str4 : str3;
        java.lang.String str5 = this.f234748i;
        java.lang.String str6 = this.f234749m;
        hVar.field_aesKey = z19 ? str5 : str6;
        int i27 = this.f234750n;
        hVar.field_thumbimgLength = i27;
        int i28 = this.f234751o;
        int i29 = this.f234752p;
        hVar.field_fileLength = z19 ? i28 : i29;
        java.lang.String str7 = this.f234753q;
        hVar.field_toUser = str7;
        java.lang.String str8 = this.f234754r;
        hVar.field_filemd5 = z19 ? str8 : this.f234755s;
        hVar.field_mp4identifymd5 = this.f234756t;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "support second!! sceneResult: %s", hVar);
        if (this.f234743d) {
            str2 = this.f234745f + ya.b.ORIGIN;
        } else {
            kk.l lVar = t21.w2.f415056c;
            str2 = t21.c3.a(str7);
            this.f234745f = str2;
        }
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str2, true);
        java.lang.String tj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, msgRetransmitUI.f210954g, false);
        if (!this.f234743d) {
            com.tencent.mm.vfs.w6.c(tj7, tj6);
        }
        java.lang.String str9 = ((((((("<msg><videomsg aeskey=\"" + str6 + "\" cdnthumbaeskey=\"" + str6 + "\" cdnvideourl=\"" + str3 + "\" ") + "cdnthumburl=\"" + str3 + "\" ") + "length=\"" + i29 + "\" ") + "cdnrawvideourl=\"" + str4 + "\" ") + "cdnrawvideoaeskey=\"" + str5 + "\" ") + "originsourcemd5=\"" + this.f234757u + "\" ") + "rawlength=\"" + i28 + "\" ") + "cdnthumblength=\"" + i27 + "\"/></msg>";
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "cdn callback new build cdnInfo:%s", str9);
        boolean z27 = this.f234743d;
        t21.v2 v2Var = this.f234759w;
        if (z27) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String str10 = this.f234745f;
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(str10);
            if (h17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgRetransmitUI", "compress video info is null, pls check process");
                msgRetransmitUI.finish();
                return 0;
            }
            h17.o(str2);
            t21.d3.p(str2, null, this.f234758v, this.f234753q, null, 0, "", 43, null, "", null, null, null, true, h17.f415016n, null, "");
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().C(h17);
        } else {
            t21.d3.r(str2, this.f234758v, this.f234753q, str9, 43, new com.tencent.mm.plugin.msg.MsgIdTalker(v2Var.f415016n, v2Var.f415020r), v2Var.Q, v2Var.R, this.f234752p);
        }
        if (!t21.d3.s() || com.tencent.mm.sdk.platformtools.t8.K0(str4) || this.f234743d) {
            hVar2 = null;
            hVar3 = hVar;
        } else {
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_MsgRetransmitUI_3";
            mVar.f241787f = this;
            mVar.field_mediaId = com.tencent.mm.modelcdntran.i2.b("checkExist", java.lang.System.currentTimeMillis(), str7, "" + msgRetransmitUI.f210953f);
            mVar.field_fileId = str4;
            mVar.field_aesKey = str5;
            mVar.field_filemd5 = str8;
            mVar.field_fileType = 4;
            mVar.field_talker = str7;
            mVar.field_priority = 2;
            mVar.field_svr_signature = "";
            mVar.field_onlycheckexist = true;
            mVar.field_trysafecdn = true;
            v2Var.g();
            boolean Bi = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
            this.f234743d = Bi;
            hVar2 = null;
            hVar3 = hVar;
            this.f234744e = hVar3;
            if (Bi) {
                return 0;
            }
        }
        m11.m1 i37 = m11.m1.i();
        i37.f442141p = this.f234745f;
        boolean z28 = this.f234743d;
        if (z28) {
            hVar2 = hVar3;
        }
        i37.f322755t = hVar2;
        i37.f322752q = 0;
        if (z28) {
            hVar3 = this.f234744e;
        }
        i37.f322753r = hVar3;
        i37.f322754s = new dk5.l1(this);
        i37.f442134i = 4;
        i37.a().a();
        msgRetransmitUI.finish();
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
