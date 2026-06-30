package dk5;

/* loaded from: classes9.dex */
public final class s6 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f234884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f234885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f234886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f234887g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f234888h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f234889i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234890m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ dk5.f6 f234891n;

    public s6(java.util.LinkedList linkedList, com.tencent.mm.pluginsdk.model.app.m mVar, boolean z17, boolean z18, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, int i17, java.lang.String str, dk5.f6 f6Var) {
        this.f234884d = linkedList;
        this.f234885e = mVar;
        this.f234886f = z17;
        this.f234887g = z18;
        this.f234888h = wXMediaMessage;
        this.f234889i = i17;
        this.f234890m = str;
        this.f234891n = f6Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendSecretAppMsg getShareInfo callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaAppGetShareInfoResponse");
        r45.hc7 hc7Var = (r45.hc7) fVar;
        boolean z17 = this.f234887g;
        dk5.y6 y6Var = dk5.y6.f235010a;
        int i19 = 2;
        boolean z18 = this.f234886f;
        com.tencent.mm.pluginsdk.model.app.m mVar = this.f234885e;
        java.util.LinkedList linkedList2 = this.f234884d;
        if (i17 == 0 && i18 == 0 && (linkedList = hc7Var.f376057d) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendSecretAppMsg getShareInfo size = %d, toUserList size = %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList2.size()));
            int size = linkedList2.size();
            int i27 = 0;
            while (i27 < size) {
                r45.vc7 vc7Var = i27 < linkedList.size() ? (r45.vc7) linkedList.get(i27) : new r45.vc7();
                ot0.q qVar = new ot0.q();
                java.lang.String field_appId = mVar.field_appId;
                kotlin.jvm.internal.o.f(field_appId, "field_appId");
                if (!z18 && z17) {
                    field_appId = "";
                }
                qVar.f348646d = field_appId;
                qVar.H = mVar.field_appName;
                qVar.f348706s = i19;
                dk5.y6.a(y6Var, qVar, vc7Var);
                com.tencent.mm.pluginsdk.model.app.k0.G(qVar, this.f234888h, (java.lang.String) linkedList2.get(i27), null, this.f234889i, dk5.y6.i(y6Var, this.f234886f, this.f234890m, null, this.f234891n, 4, null));
                i27++;
                mVar = mVar;
                linkedList2 = linkedList2;
                i19 = 2;
                linkedList = linkedList;
            }
        } else {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                java.lang.String field_appId2 = mVar.field_appId;
                kotlin.jvm.internal.o.f(field_appId2, "field_appId");
                if (!z18 && z17) {
                    field_appId2 = "";
                }
                ot0.q qVar2 = new ot0.q();
                qVar2.f348646d = field_appId2;
                qVar2.H = mVar.field_appName;
                qVar2.f348706s = 2;
                dk5.y6.a(y6Var, qVar2, null);
                com.tencent.mm.pluginsdk.model.app.k0.G(qVar2, this.f234888h, str2, null, this.f234889i, dk5.y6.i(y6Var, this.f234886f, this.f234890m, null, this.f234891n, 4, null));
            }
        }
        return 0;
    }
}
