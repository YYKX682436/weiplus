package z12;

/* loaded from: classes4.dex */
public class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469333d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469334e;

    /* renamed from: f, reason: collision with root package name */
    public final int f469335f;

    /* renamed from: g, reason: collision with root package name */
    public final int f469336g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f469337h;

    /* renamed from: i, reason: collision with root package name */
    public final int f469338i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f469339m;

    /* renamed from: n, reason: collision with root package name */
    public final int f469340n;

    public n(int i17, int i18, int i19, java.lang.String str, int i27, byte[] bArr) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.be3();
        lVar.f70665b = new r45.ce3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmgetdesigneremojilist";
        lVar.f70667d = gd1.h.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469333d = lVar.a();
        this.f469335f = i17;
        this.f469336g = i18;
        this.f469338i = i19;
        this.f469339m = str;
        this.f469337h = bArr;
        this.f469340n = i27;
    }

    public r45.ce3 H() {
        com.tencent.mm.modelbase.o oVar = this.f469333d;
        if (oVar == null) {
            return null;
        }
        return (r45.ce3) oVar.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469334e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469333d;
        r45.be3 be3Var = (r45.be3) oVar.f70710a.f70684a;
        byte[] bArr = this.f469337h;
        if (bArr != null) {
            be3Var.f370689f = x51.j1.a(bArr);
        } else {
            be3Var.f370689f = new r45.cu5();
        }
        r45.cu5 cu5Var = be3Var.f370689f;
        if (cu5Var != null) {
            cu5Var.toString();
        }
        be3Var.f370688e = this.f469336g;
        be3Var.f370687d = this.f469335f;
        be3Var.f370690g = this.f469338i;
        be3Var.f370691h = this.f469339m;
        be3Var.f370692i = this.f469340n;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return gd1.h.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        int i27;
        z85.r rVar;
        if (((i18 == 0 && i19 == 0) || (i18 == 4 && (i19 == 2 || i19 == 3))) && (((bArr2 = this.f469337h) == null || bArr2.length <= 0) && this.f469335f != 3 && (i27 = this.f469336g) != 0)) {
            com.tencent.mm.storage.n5 Ai = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai();
            synchronized (Ai.f195163a) {
                rVar = Ai.f195172j;
            }
            java.lang.String str2 = i27 + "";
            r45.ce3 H = H();
            rVar.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || H == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerEmojiListResponseByUIN failed. designerID or response is null.");
            } else {
                try {
                    z85.q qVar = new z85.q();
                    qVar.field_designerIDAndType = str2 + 2;
                    qVar.field_content = H.toByteArray();
                    if (rVar.f470819d.m("EmotionDesignerInfo", "designerIDAndType", qVar.convertTo()) > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN success. designerID:%s", str2);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN failed. designerID:%s", str2);
                    }
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
        }
        r45.cu5 cu5Var = ((r45.ce3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f371497e;
        if (cu5Var != null) {
            this.f469337h = x51.j1.d(cu5Var);
        }
        this.f469334e.onSceneEnd(i18, i19, str, this);
    }
}
