package r61;

/* loaded from: classes8.dex */
public class t1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392955d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f392956e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f392957f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f392958g = (java.lang.String) gm0.j1.u().c().l(6, null);

    /* renamed from: i, reason: collision with root package name */
    public int f392960i = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f392959h = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f392961m = 1;

    public t1(java.util.List list, java.util.List list2) {
        this.f392956e = list;
        this.f392957f = list2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392955d = u0Var;
        java.util.List list = this.f392957f;
        java.util.List list2 = this.f392956e;
        if ((list2 == null || list2.size() == 0) && (list == null || list.size() == 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadMContact", "listMobile or listEmile is null or zero");
            return -1;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fu6();
        lVar.f70665b = new r45.gu6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/uploadmcontact";
        lVar.f70667d = 133;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.fu6 fu6Var = (r45.fu6) a17.f70710a.f70684a;
        fu6Var.f374607f = this.f392958g;
        fu6Var.f374605d = c01.z1.r();
        fu6Var.f374606e = this.f392961m;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = 200;
        while (i17 > 0) {
            if (list2 != null && this.f392959h < list2.size()) {
                if (list2.get(this.f392959h) != null) {
                    r45.en4 en4Var = new r45.en4();
                    en4Var.f373615d = (java.lang.String) list2.get(this.f392959h);
                    linkedList.add(en4Var);
                }
                this.f392959h++;
                i17--;
            }
            if (list != null && this.f392960i < list.size()) {
                if (list.get(this.f392960i) != null) {
                    r45.ie4 ie4Var = new r45.ie4();
                    ie4Var.f376969d = (java.lang.String) list.get(this.f392960i);
                    linkedList2.add(ie4Var);
                }
                this.f392960i++;
                i17--;
            }
            if (list == null || this.f392960i >= list.size()) {
                if (list2 == null || this.f392959h >= list2.size()) {
                    break;
                }
            }
        }
        fu6Var.f374609h = linkedList;
        fu6Var.f374608g = linkedList.size();
        fu6Var.f374611m = linkedList2;
        fu6Var.f374610i = linkedList2.size();
        if (list != null) {
            list.size();
        }
        if (list2 != null) {
            list2.size();
        }
        fu6Var.f374611m.size();
        fu6Var.f374609h.size();
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 133;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.util.List list;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadMContact", "onSceneEnd: errType = " + i18 + " errCode = " + i19 + " errMsg = " + str);
        updateDispatchId(i17);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadMContact", "onGYNetEnd  errType:" + i18 + " errCode:" + i19);
            this.f392955d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.fu6 fu6Var = (r45.fu6) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        java.util.LinkedList linkedList = fu6Var.f374611m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadMContact", "the req emai list is empty");
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.ie4) it.next()).f376969d);
            }
        }
        r61.q0.l(arrayList);
        java.util.LinkedList linkedList2 = fu6Var.f374609h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (linkedList2 == null || linkedList2.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadMContact", "the req mobile list is empty");
        } else {
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                arrayList2.add(kk.k.g(o25.b.a(((r45.en4) it6.next()).f373615d).getBytes()));
            }
        }
        r61.q0.l(arrayList2);
        java.util.List list2 = this.f392957f;
        if ((list2 == null || this.f392960i >= list2.size()) && ((list = this.f392956e) == null || this.f392959h >= list.size())) {
            this.f392955d.onSceneEnd(i18, i19, str, this);
        } else if (doScene(dispatcher(), this.f392955d) < 0) {
            this.f392955d.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        r45.fu6 fu6Var = (r45.fu6) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        int size = fu6Var.f374611m.size() + fu6Var.f374609h.size();
        com.tencent.mm.modelbase.o1 o1Var = com.tencent.mm.modelbase.o1.EFailed;
        if (size == 0 || size > 200) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadMContact", "security checked failed : exceed max send count");
            return o1Var;
        }
        java.lang.String str = fu6Var.f374607f;
        if (str == null || str.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadMContact", "security checked failed : moblie null");
            return o1Var;
        }
        java.lang.String str2 = fu6Var.f374605d;
        if (str2 != null && str2.length() > 0) {
            return com.tencent.mm.modelbase.o1.EOk;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadMContact", "security checked failed : username null");
        return o1Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
