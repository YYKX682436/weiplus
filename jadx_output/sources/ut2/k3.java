package ut2;

/* loaded from: classes3.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f430976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f430977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f430978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f430979g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(cm2.m0 m0Var, ut2.s3 s3Var, gk2.e eVar, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        super(1);
        this.f430976d = m0Var;
        this.f430977e = s3Var;
        this.f430978f = eVar;
        this.f430979g = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ce0 page = (r45.ce0) obj;
        kotlin.jvm.internal.o.g(page, "page");
        bw5.x7 x7Var = (bw5.x7) page.getCustom(10);
        st2.c2 c2Var = st2.c2.f412249a;
        ut2.s3 s3Var = this.f430977e;
        gk2.e liveData = this.f430978f;
        if (x7Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingViewHolder", "handle ecs jump to sku buy");
            android.content.Context context = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            cm2.m0 data = this.f430976d;
            kotlin.jvm.internal.o.g(data, "data");
            kotlin.jvm.internal.o.g(liveData, "liveData");
            byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
            pq.a aVar = new pq.a(context);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("openMode", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH);
            jSONObject.put("clickScene", -1);
            jSONObject.put("clickId", s07);
            jSONObject.put("forbidSlidingUpGesture", true);
            jSONObject.put("enableGesture", false);
            jSONObject.put("finderLiveToken", c2Var.b(liveData, data.f43368v, page).f77391e);
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            jSONObject.put("entranceGMsgID", ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.v9.class))).f116906d);
            aVar.f357552b.e(new bw5.g8());
            bw5.g8 d17 = aVar.f357552b.d();
            d17.f27711d = jSONObject.toString();
            d17.f27722r[1] = true;
            aVar.f357554d.f357556a = new cc2.c(new java.lang.ref.WeakReference(context), page, liveData);
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
        } else {
            android.content.Context context2 = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            byte[] s08 = com.tencent.mm.sdk.platformtools.t8.s0();
            kotlin.jvm.internal.o.f(s08, "getUuidRandom(...)");
            l81.b1 d18 = c2Var.d(context2, page, 1177, s08, "", this.f430978f);
            com.tencent.mm.plugin.appbrand.config.l e17 = d18.G.e();
            e17.f77526f = k91.s2.f305761e;
            d18.G = e17.a();
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context3 = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f430979g;
            q4Var.n(context3, liveData, d18, lVar != null ? lVar.Y0() : null);
            androidx.recyclerview.widget.f2 f2Var = s3Var.L;
            tt2.e1 e1Var = f2Var instanceof tt2.e1 ? (tt2.e1) f2Var : null;
            if (e1Var != null) {
                tt2.e1.W(e1Var, ml2.f4.f327437m, this.f430976d, 2, d18, s3Var, null, 32, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
