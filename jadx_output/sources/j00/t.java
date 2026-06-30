package j00;

/* loaded from: classes11.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296889d;

    /* renamed from: e, reason: collision with root package name */
    public int f296890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f296892g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296891f = str;
        this.f296892g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j00.t(this.f296891f, this.f296892g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296890e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f296891f;
            if (str == null || str.length() == 0) {
                com.tencent.mars.xlog.Log.w("Ecs.EcsGiftFlutterMgr", "openEcsGiftLotteryPage paramsJson is null");
                return f0Var;
            }
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) b00.p0.f16747a.e(new org.json.JSONObject(str));
            java.lang.Object obj2 = linkedHashMap.get("activity_info_base64");
            if (obj2 == null) {
                obj2 = "";
            }
            java.lang.String obj3 = obj2.toString();
            java.lang.Object obj4 = linkedHashMap.get("ecsOpenEventId");
            java.util.Map l17 = kz5.c1.l(new jz5.l("activity_info", n51.d.a(obj3, 0)), new jz5.l("ecsOpenEventId", obj4 != null ? obj4 : ""));
            pi0.l1 l1Var2 = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "ecs", null, false, null, 28, null);
            l1Var2.f354649h = true;
            this.f296889d = l1Var2;
            this.f296890e = 1;
            if (l1Var2.o("ecs_gift_mpactivity", l17, this) == aVar) {
                return aVar;
            }
            l1Var = l1Var2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                j00.y yVar = j00.y.f296946a;
                return f0Var;
            }
            l1Var = (pi0.l1) this.f296889d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.c0.i(new j00.d0(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null)));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        flutterPageStyle.f68125o = false;
        flutterPageStyle.f68117d = 1;
        flutterPageStyle.f68118e = -1;
        android.content.Context context = this.f296892g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        this.f296889d = null;
        this.f296890e = 2;
        if (l1Var.s(context, flutterPageStyle, com.tencent.mm.feature.ecs.ui.EcsGiftFlutterUI.class, null, this) == aVar) {
            return aVar;
        }
        j00.y yVar2 = j00.y.f296946a;
        return f0Var;
    }
}
