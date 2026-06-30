package vw;

/* loaded from: classes11.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440650d;

    /* renamed from: e, reason: collision with root package name */
    public int f440651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b2 f440652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f440653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.wechat.mm.biz.b2 b2Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440652f = b2Var;
        this.f440653g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw.g2(this.f440652f, this.f440653g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f440651e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.q Ui = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            byte[] byteArray = this.f440652f.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            linkedHashMap.put("launchInfo", byteArray);
            pi0.l1 l1Var2 = new pi0.l1(Ui, "biz", null, false, null, 28, null);
            this.f440650d = l1Var2;
            this.f440651e = 1;
            if (l1Var2.o("publish_page", linkedHashMap, this) == aVar) {
                return aVar;
            }
            l1Var = l1Var2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            l1Var = (pi0.l1) this.f440650d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.c0.i(new com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin(), new lx.w5(), new lx.m5(), new lx.i2(), new lx.r1(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null)));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f440653g;
        this.f440650d = null;
        this.f440651e = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : com.tencent.mm.plugin.brandservice.ui.flutter.BizPortraitFlutterViewActivity.class, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
