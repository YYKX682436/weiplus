package sm4;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409943d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f409944e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.xn6 f409945f;

    public h(r45.un6 un6Var, int i17, int i18, r45.xn6 xn6Var, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryRelevantVideo", "Create NetSceneTopStoryVideo %s %s %s", un6Var.f387512r, un6Var.f387507m, java.lang.Long.valueOf(j17));
        this.f409945f = xn6Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1943;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/mmwebrecommend";
        lVar.f70664a = new r45.r97();
        lVar.f70665b = new r45.s97();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409944e = a17;
        r45.r97 r97Var = (r45.r97) a17.f70710a.f70684a;
        r97Var.f384663d = un6Var.f387513s;
        r97Var.f384664e = com.tencent.mm.plugin.websearch.l2.a(1);
        r97Var.f384666g = un6Var.f387508n;
        r97Var.f384667h = su4.r2.i();
        r97Var.f384668i = un6Var.f387506i;
        r97Var.f384669m = un6Var.f387507m;
        java.util.LinkedList linkedList = r97Var.f384672p;
        linkedList.addAll(un6Var.f387511q);
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.x50 x50Var = (r45.x50) it.next();
            if (x50Var.f389788d.equals("relevant_vid")) {
                x50Var.f389790f = xn6Var.f390259h;
                break;
            }
        }
        r45.x50 x50Var2 = new r45.x50();
        x50Var2.f389788d = "relevant_vid";
        x50Var2.f389790f = xn6Var.f390259h;
        linkedList.add(x50Var2);
        r97Var.f384675s = (int) un6Var.f387505h;
        r97Var.f384679w = i17;
        r97Var.f384680x = i18;
        r45.x50 x50Var3 = new r45.x50();
        x50Var3.f389788d = "client_system_version";
        x50Var3.f389789e = android.os.Build.VERSION.SDK_INT;
        linkedList.add(x50Var3);
        r45.x50 x50Var4 = new r45.x50();
        x50Var4.f389788d = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE;
        x50Var4.f389790f = com.tencent.mm.plugin.websearch.l2.b();
        linkedList.add(x50Var4);
        r45.x50 x50Var5 = new r45.x50();
        x50Var5.f389788d = "client_request_time";
        x50Var5.f389790f = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        linkedList.add(x50Var5);
        r45.x50 x50Var6 = new r45.x50();
        x50Var6.f389788d = "relevant_play_time";
        x50Var6.f389790f = java.lang.String.valueOf(j17);
        x50Var6.f389789e = j17;
        linkedList.add(x50Var6);
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            r45.x50 x50Var7 = (r45.x50) it6.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryRelevantVideo", "key: %s unit_value %s text_value %s", x50Var7.f389788d, java.lang.Long.valueOf(x50Var7.f389789e), x50Var7.f389790f);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f409943d = u0Var;
        return dispatch(sVar, this.f409944e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1943;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryRelevantVideo", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f409943d.onSceneEnd(i18, i19, str, this);
    }
}
