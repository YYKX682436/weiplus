package lx;

/* loaded from: classes11.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f321847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f321849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f321850g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321851h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f321852i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, int i17, boolean z17, yz5.l lVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321848e = flutterBizPlugin;
        this.f321849f = i17;
        this.f321850g = z17;
        this.f321851h = lVar;
        this.f321852i = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lx.l3(this.f321848e, this.f321849f, this.f321850g, this.f321851h, this.f321852i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.l3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f321847d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin = this.f321848e;
            if (flutterBizPlugin.f65268v) {
                ((ku5.t0) ku5.t0.f312615d).B(new lx.d3(this.f321851h));
                return f0Var;
            }
            flutterBizPlugin.f65268v = true;
            com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
            b0Var.h().B("live_bar_list_last_refresh_time", java.lang.System.currentTimeMillis());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            lx.k3 k3Var = new lx.k3(this.f321848e, currentTimeMillis);
            ((ku5.t0) ku5.t0.f312615d).B(new lx.f3(this.f321848e, currentTimeMillis));
            int i18 = this.f321849f;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f321852i);
            this.f321847d = 1;
            obj = b0Var.d(i18, linkedList, k3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.qk qkVar = (r45.qk) obj;
        if (qkVar != null) {
            int i19 = this.f321849f;
            com.tencent.mm.pluginsdk.model.b0 b0Var2 = com.tencent.mm.pluginsdk.model.b0.f189197a;
            b0Var2.A(i19, qkVar.f384066g);
            b0Var2.z(i19, qkVar.f384067h);
            if (i19 == 2) {
                b0Var2.B(qkVar);
            }
        } else {
            qkVar = null;
        }
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin2 = this.f321848e;
        java.lang.String str = flutterBizPlugin2.f65253d;
        flutterBizPlugin2.f65268v = false;
        java.util.LinkedList linkedList2 = qkVar != null ? qkVar.f384063d : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doGetBizFinderLives cgi response size=");
        sb6.append(linkedList2 != null ? linkedList2.size() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            arrayList = new java.util.ArrayList();
        } else {
            java.util.List k17 = com.tencent.mm.pluginsdk.model.b0.f189197a.k(linkedList2, this.f321850g);
            com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin3 = this.f321848e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(k17, 10));
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                arrayList2.add(flutterBizPlugin3.a((r45.lk) it.next()));
            }
            com.tencent.mars.xlog.Log.i(this.f321848e.f65253d, "doGetBizFinderLives getValidBizFinderLiveInfo size=" + arrayList2.size());
            arrayList = arrayList2;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new lx.h3(this.f321848e, this.f321849f, arrayList, this.f321851h));
        return f0Var;
    }
}
