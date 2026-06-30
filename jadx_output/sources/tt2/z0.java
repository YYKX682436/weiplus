package tt2;

/* loaded from: classes3.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f422024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f422025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f422026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f422027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(tt2.e1 e1Var, so2.j5 j5Var, bw5.x7 x7Var, byte[] bArr) {
        super(2);
        this.f422024d = e1Var;
        this.f422025e = j5Var;
        this.f422026f = x7Var;
        this.f422027g = bArr;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ce0 ce0Var;
        ((java.lang.Boolean) obj).booleanValue();
        zl2.r4 r4Var = zl2.r4.f473950a;
        tt2.e1 e1Var = this.f422024d;
        r4Var.h3(e1Var.f421880h, false);
        cc2.d dVar = cc2.d.f40478a;
        cm2.m0 data = (cm2.m0) this.f422025e;
        java.lang.String clickId = this.f422027g.toString();
        kotlin.jvm.internal.o.g(data, "data");
        bw5.x7 ecsJumpInfo = this.f422026f;
        kotlin.jvm.internal.o.g(ecsJumpInfo, "ecsJumpInfo");
        android.content.Context context = e1Var.f421880h;
        kotlin.jvm.internal.o.g(context, "context");
        gk2.e liveData = e1Var.f421882m;
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(clickId, "clickId");
        pq.a aVar = new pq.a(context);
        java.lang.String a17 = dVar.a(liveData, "live_list_buy", clickId);
        aVar.f357552b.e(new bw5.g8());
        aVar.f357552b.d().c(a17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[performEcsJumpToBuyProduct] appId:");
        r45.ce0 ce0Var2 = data.F;
        sb6.append(ce0Var2 != null ? ce0Var2.getString(0) : null);
        sb6.append(",purchase appId:");
        r45.ce0 ce0Var3 = data.E;
        sb6.append(ce0Var3 != null ? ce0Var3.getString(0) : null);
        sb6.append(", clickId:");
        sb6.append(clickId);
        sb6.append(" sceneNote:");
        sb6.append(a17);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("EcsShoppingJumpHelper", sb6.toString());
        r45.bd5 bd5Var = (r45.bd5) data.f43368v.getCustom(70);
        if (bd5Var == null || (ce0Var = (r45.ce0) bd5Var.getCustom(2)) == null) {
            ce0Var = data.E;
        }
        r45.ce0 ce0Var4 = ce0Var;
        if (ce0Var4 == null) {
            com.tencent.mars.xlog.Log.e("EcsShoppingJumpHelper", "performEcsJumpToBuyProduct: page is null");
        } else {
            java.lang.String string = ce0Var4.getString(0);
            if (string != null) {
                java.util.HashMap hashMap = ((mm2.f6) liveData.a(mm2.f6.class)).Q;
                java.lang.String string2 = ce0Var4.getString(2);
                hashMap.put(string, string2 == null ? "" : string2);
                java.util.HashMap hashMap2 = ((mm2.f6) liveData.a(mm2.f6.class)).R;
                java.lang.String string3 = ce0Var4.getString(3);
                if (string3 == null) {
                    string3 = "";
                }
                hashMap2.put(string, string3);
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.getClass();
            kotlin.jvm.internal.o.g(a17, "<set-?>");
            y4Var.f328306n = a17;
            boolean z17 = ce0Var4.getInteger(7) == 2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("openMode", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH);
            java.lang.String str = data.f43367J;
            if (str == null) {
                str = "";
            }
            jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, str);
            jSONObject.put("productId", data.f43369w);
            jSONObject.put("clickScene", 2);
            jSONObject.put("clickId", clickId);
            jSONObject.put("hasClientDragBar", ce0Var4.getInteger(6) == 1);
            jSONObject.put("enableGesture", z17);
            jSONObject.put("liveScene", "list");
            jSONObject.put("finderLiveToken", st2.c2.f412249a.b(liveData, data.f43368v, ce0Var4).f77391e);
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            jSONObject.put("entranceGMsgID", ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.v9.class))).f116906d);
            aVar.f357554d.f357556a = new cc2.a(new java.lang.ref.WeakReference(context), data, ce0Var4, liveData, clickId);
            com.tencent.mars.xlog.Log.i("EcsShoppingJumpHelper", "[getPayloadForProductItemClick] appId:" + ce0Var4.getString(0) + ", path:" + ce0Var4.getString(1) + ",  clickId:" + clickId + '!');
            bw5.g8 d17 = aVar.f357552b.d();
            d17.f27711d = jSONObject.toString();
            d17.f27722r[1] = true;
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, ecsJumpInfo, null, 4, null);
        }
        yz5.l lVar = e1Var.f421895z;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(data.f43369w));
        }
        return jz5.f0.f302826a;
    }
}
