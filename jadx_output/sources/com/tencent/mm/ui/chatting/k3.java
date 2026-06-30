package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class k3 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f201882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f201883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201885i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201887n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f201888o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201889p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f201890q;

    public k3(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var, java.lang.String str6, int i19) {
        this.f201880d = str;
        this.f201881e = str2;
        this.f201882f = i17;
        this.f201883g = i18;
        this.f201884h = str3;
        this.f201885i = str4;
        this.f201886m = str5;
        this.f201887n = f9Var;
        this.f201888o = v2Var;
        this.f201889p = str6;
        this.f201890q = i19;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (hVar != null) {
            boolean z18 = hVar.field_exist_whencheck;
            java.lang.String str2 = this.f201889p;
            com.tencent.mm.storage.f9 f9Var = this.f201887n;
            java.lang.String str3 = this.f201884h;
            if (z18) {
                java.lang.String str4 = this.f201880d;
                hVar.field_fileId = str4;
                java.lang.String str5 = this.f201881e;
                hVar.field_aesKey = str5;
                int i18 = this.f201882f;
                hVar.field_thumbimgLength = i18;
                int i19 = this.f201883g;
                hVar.field_fileLength = i19;
                hVar.field_toUser = str3;
                hVar.field_filemd5 = this.f201885i;
                hVar.field_mp4identifymd5 = this.f201886m;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingEditModeLogic", "support second!! sceneResult: %s", hVar);
                kk.l lVar = t21.w2.f415056c;
                java.lang.String a17 = t21.c3.a(str3);
                com.tencent.mm.vfs.w6.c(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false), ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, a17, true));
                java.lang.String str6 = ((("<msg><videomsg aeskey=\"" + str5 + "\" cdnthumbaeskey=\"" + str5 + "\" cdnvideourl=\"" + str4 + "\" ") + "cdnthumburl=\"" + str4 + "\" ") + "length=\"" + i19 + "\" ") + "cdnthumblength=\"" + i18 + "\"/></msg>";
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingEditModeLogic", "cdn callback new build cdnInfo:%s", str6);
                r15.d dVar = new r15.d();
                t21.v2 v2Var = this.f201888o;
                dVar.fromXml(v2Var.g());
                int count = dVar.getCount();
                y15.d dVar2 = new y15.d();
                dVar2.fromXml(str6);
                r15.b j17 = dVar2.j();
                if (j17 == null) {
                    j17 = new r15.b();
                }
                r15.d j18 = j17.j();
                if (j18 == null) {
                    j18 = new r15.d();
                }
                j18.k(str2);
                j18.j(count);
                j18.l(1);
                j17.o(j18);
                dVar2.o(j17);
                t21.d3.r(a17, this.f201890q, this.f201884h, dVar2.toXml(), 43, tg3.l1.a(f9Var), v2Var.Q, v2Var.R, this.f201883g);
                m11.m1 i27 = m11.m1.i();
                i27.f442141p = a17;
                i27.f322752q = 0;
                i27.f322753r = hVar;
                i27.f322754s = new com.tencent.mm.ui.chatting.j3(this, a17);
                i27.f442134i = 4;
                i27.a().a();
            } else {
                com.tencent.mm.ui.chatting.n3.c(str3, f9Var, str2);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
