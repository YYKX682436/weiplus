package hm3;

/* loaded from: classes4.dex */
public final class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f282230d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282231e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282232f;

    /* renamed from: g, reason: collision with root package name */
    public final s45.c f282233g;

    public c(java.util.LinkedList listenIds, int i17, java.lang.String str, java.lang.String cacheKey) {
        kotlin.jvm.internal.o.g(listenIds, "listenIds");
        kotlin.jvm.internal.o.g(cacheKey, "cacheKey");
        this.f282230d = cacheKey;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5950;
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listengetlyric";
        lVar.f70664a = new s45.c();
        lVar.f70665b = new s45.d();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282232f = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenGetLyricRequest");
        this.f282233g = (s45.c) fVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = listenIds.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            s45.b bVar = new s45.b();
            bVar.f402970h = true;
            bVar.f402966d = str2;
            bVar.f402971i = android.text.TextUtils.isEmpty(str);
            linkedList.add(bVar);
        }
        s45.c cVar = this.f282233g;
        cVar.f402972d = linkedList;
        cVar.f402973e = i17;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append("listen_ids:" + listenIds);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMMListenGetLyric", "request music info:%s, mid:" + str, stringBuffer.substring(0, stringBuffer.length() - 1) + ']');
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f282231e = u0Var;
        return dispatch(sVar, this.f282232f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5950;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMMListenGetLyric", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282231e;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282232f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenGetLyricResponse");
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282231e;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
