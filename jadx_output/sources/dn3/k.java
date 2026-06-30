package dn3;

/* loaded from: classes14.dex */
public class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Vector f242023p = new java.util.Vector();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f242024d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f242025e;

    /* renamed from: f, reason: collision with root package name */
    public final int f242026f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f242027g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f242028h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f242029i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f242030m;

    /* renamed from: n, reason: collision with root package name */
    public int f242031n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f242032o;

    public k(int i17, int i18, float f17, float f18, int i19, int i27, java.lang.String str, java.lang.String str2, r45.cu5 cu5Var, java.lang.String str3, int i28, boolean z17, boolean z18, boolean z19) {
        this.f242026f = 0;
        this.f242027g = "";
        this.f242028h = "";
        this.f242029i = "";
        this.f242027g = str3;
        if (i17 != 0 && i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetLbsLifeList", "OpCode Error :" + i17);
        }
        this.f242026f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sh3();
        lVar.f70665b = new r45.th3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getlbslifelist";
        lVar.f70667d = 603;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f242025e = a17;
        r45.sh3 sh3Var = (r45.sh3) a17.f70710a.f70684a;
        r45.d64 d64Var = new r45.d64();
        d64Var.f372178h = str2;
        d64Var.f372179i = i27;
        d64Var.f372175e = f18;
        d64Var.f372174d = f17;
        d64Var.f372177g = str;
        d64Var.f372176f = i19;
        sh3Var.f385717g = d64Var;
        sh3Var.f385718h = str3;
        sh3Var.f385715e = i18;
        sh3Var.f385719i = i28;
        if (cu5Var == null) {
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(new byte[0]);
            sh3Var.f385716f = cu5Var2;
        } else {
            sh3Var.f385716f = cu5Var;
        }
        sh3Var.f385714d = i17;
        sh3Var.f385720m = z18 ? 1 : 0;
        sh3Var.f385723p = z19 ? 1 : 0;
        this.f242032o = z17;
        int i29 = sh3Var.f385716f.f371839d;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f242024d = u0Var;
        return dispatch(sVar, this.f242025e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 603;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.th3 th3Var = (r45.th3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f242029i = th3Var.f386432n;
        this.f242031n = th3Var.f386433o;
        boolean z17 = i19 == 0 || i19 == 101;
        if (i18 != 0 && !z17) {
            this.f242024d.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.lang.String str2 = th3Var.f386431m;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        this.f242028h = str2;
        this.f242030m = new java.util.ArrayList();
        java.util.LinkedList linkedList = th3Var.f386429h;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.f242030m.add(new dn3.i(th3Var.f386432n, (r45.c64) it.next()));
        }
        if (th3Var.f386428g > 0) {
            r45.c64 c64Var = (r45.c64) linkedList.get(0);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(" Bid " + c64Var.f371310d);
            stringBuffer.append(" title " + c64Var.f371311e);
            stringBuffer.append(" link " + c64Var.f371318o);
            stringBuffer.append(" price " + c64Var.f371312f);
            stringBuffer.append(" rate " + c64Var.f371317n);
            stringBuffer.append(" type " + c64Var.f371319p);
            stringBuffer.append(" desc : ");
            java.util.Iterator it6 = c64Var.f371316m.iterator();
            while (it6.hasNext()) {
                stringBuffer.append(((r45.du5) it6.next()).f372756d + "-");
            }
        }
        this.f242024d.onSceneEnd(i18, i19, str, this);
    }

    public k(int i17, int i18, r45.d64 d64Var) {
        this.f242026f = 0;
        this.f242027g = "";
        this.f242028h = "";
        this.f242029i = "";
        if (i17 != 0 && i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetLbsLifeList", "OpCode Error :" + i17);
        }
        this.f242026f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sh3();
        lVar.f70665b = new r45.th3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getlbslifelist";
        lVar.f70667d = 603;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f242025e = a17;
        r45.sh3 sh3Var = (r45.sh3) a17.f70710a.f70684a;
        sh3Var.f385717g = d64Var;
        sh3Var.f385718h = "";
        sh3Var.f385715e = i18;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        sh3Var.f385716f = cu5Var;
        sh3Var.f385714d = i17;
    }
}
