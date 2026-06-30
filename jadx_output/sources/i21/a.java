package i21;

/* loaded from: classes10.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f287871d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f287872e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f287873f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f287874g;

    /* renamed from: h, reason: collision with root package name */
    public final int f287875h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f287876i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f287877m;

    public a(java.lang.String str, java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f287873f = linkedList2;
        this.f287874g = false;
        this.f287875h = 0;
        this.f287876i = str;
        this.f287877m = gm0.j1.b().h() + "" + java.lang.System.currentTimeMillis();
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        this.f287875h = linkedList2.size();
        this.f287874g = this.f287875h == 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f287871d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadCardImg", "start upload cgi");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rt6();
        lVar.f70665b = new r45.st6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/uploadcardimg";
        lVar.f70667d = 575;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f287872e = a17;
        r45.rt6 rt6Var = (r45.rt6) a17.f70710a.f70684a;
        rt6Var.set(6, this.f287876i);
        rt6Var.set(2, 0);
        rt6Var.set(3, 0);
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        rt6Var.set(5, cu5Var);
        rt6Var.set(4, 0);
        rt6Var.set(1, this.f287877m);
        rt6Var.set(7, java.lang.Integer.valueOf(this.f287875h));
        rt6Var.set(8, this.f287873f);
        return dispatch(sVar, this.f287872e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 575;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadCardImg", "upload card img error");
            this.f287871d.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f287876i, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            r45.o80 o80Var = new r45.o80();
            java.util.LinkedList linkedList = this.f287873f;
            if (linkedList != null && linkedList.size() > 0) {
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.fu fuVar = (r45.fu) it.next();
                    r45.c5 c5Var = new r45.c5();
                    c5Var.f371292d = fuVar.getString(0);
                    c5Var.f371293e = fuVar.getString(1);
                    linkedList2.add(c5Var);
                }
                if (o80Var.f382018d == null) {
                    o80Var.f382018d = new java.util.LinkedList();
                }
                o80Var.f382018d.addAll(linkedList2);
                n17.O2(o80Var);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
            } else if (this.f287874g) {
                n17.O2(null);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
            }
        }
        this.f287871d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 100;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
