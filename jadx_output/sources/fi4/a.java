package fi4;

/* loaded from: classes9.dex */
public final class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f263055d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f263056e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f263057f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f263058g;

    /* renamed from: h, reason: collision with root package name */
    public final pj4.g f263059h;

    /* renamed from: i, reason: collision with root package name */
    public pj4.i f263060i;

    public a(java.util.List sessionsToNames, boolean z17) {
        kotlin.jvm.internal.o.g(sessionsToNames, "sessionsToNames");
        this.f263055d = sessionsToNames;
        this.f263056e = z17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5829;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getv6stranger";
        lVar.f70664a = new pj4.g();
        lVar.f70665b = new pj4.i();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f263058g = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.GetV6StrangerReq");
        this.f263059h = (pj4.g) fVar;
        java.util.Iterator it = sessionsToNames.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) ((jz5.l) it.next()).f302834e;
            if (str != null) {
                java.util.LinkedList linkedList = this.f263059h.f355045d;
                pj4.h hVar = new pj4.h();
                hVar.f355077d = str;
                linkedList.add(hVar);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneGetV6Stranger", "req sessionsToNames:" + this.f263055d + " canTalk:" + this.f263056e);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f263057f = callback;
        return dispatch(dispatcher, this.f263058g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5829;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneGetV6Stranger", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f263058g.f70711b.f70700a;
            pj4.i iVar = fVar instanceof pj4.i ? (pj4.i) fVar : null;
            this.f263060i = iVar;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = (iVar == null || (linkedList2 = iVar.f355109d) == null) ? null : java.lang.Integer.valueOf(linkedList2.size());
            pj4.i iVar2 = this.f263060i;
            if (iVar2 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = iVar2.f355109d.iterator();
                int i27 = 0;
                while (it.hasNext()) {
                    pj4.j jVar = (pj4.j) it.next();
                    sb6.append(i27 + ':' + jVar.f355125d + ' ' + jVar.f355126e);
                    i27++;
                }
                str2 = sb6.toString();
                kotlin.jvm.internal.o.f(str2, "toString(...)");
            } else {
                str2 = null;
            }
            objArr[1] = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneGetV6Stranger", "rsp size %s ret %s", objArr);
            pj4.i iVar3 = this.f263060i;
            if (iVar3 != null && (linkedList = iVar3.f355109d) != null) {
                int i28 = 0;
                for (java.lang.Object obj : linkedList) {
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    pj4.j jVar2 = (pj4.j) obj;
                    if (jVar2.f355125d == 0) {
                        jz5.l lVar = (jz5.l) this.f263055d.get(i28);
                        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai((java.lang.String) lVar.f302833d);
                        if (Ai == null) {
                            Ai = new mj4.w();
                            Ai.field_sessionId = (java.lang.String) lVar.f302833d;
                        }
                        Ai.field_nickname = jVar2.f355128g;
                        Ai.field_sex = jVar2.f355129h;
                        Ai.field_province = jVar2.f355130i;
                        Ai.field_city = jVar2.f355131m;
                        Ai.field_signature = jVar2.f355132n;
                        Ai.field_bigHeadImgUrl = jVar2.f355133o;
                        Ai.field_smallHeadImgUrl = jVar2.f355134p;
                        Ai.field_textStatusExtInfo = jVar2.f355135q;
                        Ai.field_country = jVar2.f355136r;
                        Ai.field_userName = jVar2.f355127f;
                        Ai.field_textStatusId = jVar2.f355137s;
                        Ai.field_block = jVar2.f355138t ? 1 : 0;
                        if (this.f263056e) {
                            Ai.field_canTalk = 1;
                        }
                        if (Ai.systemRowid == -1) {
                            ni4.x.f337776d.n().insert(Ai);
                        } else {
                            ni4.x.f337776d.n().update(Ai, new java.lang.String[0]);
                        }
                    }
                    i28 = i29;
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f263057f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
