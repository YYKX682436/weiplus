package iy4;

/* loaded from: classes11.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296028d;

    /* renamed from: e, reason: collision with root package name */
    public int f296029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug3.k f296030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f296031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296032h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ug3.k kVar, android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296030f = kVar;
        this.f296031g = context;
        this.f296032h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iy4.y(this.f296030f, this.f296031g, this.f296032h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iy4.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296029e;
        try {
        } catch (java.lang.Exception e17) {
            ot5.g.a("MicroMsg.ExtDeviceService", "open unlock page failed for uuid: " + this.f296032h + ", error: " + e17.getMessage());
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "ext_device", null, false, null, 28, null);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            byte[] byteArray = this.f296030f.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            linkedHashMap.put("deviceInfo", byteArray);
            this.f296028d = l1Var;
            this.f296029e = 1;
            if (l1Var.o("unlockDevice", linkedHashMap, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            l1Var = (pi0.l1) this.f296028d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.b0.c(new iy4.p()));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        flutterPageStyle.f68118e = 1;
        android.content.Context context = this.f296031g;
        kotlin.jvm.internal.o.f(context, "$context");
        this.f296028d = null;
        this.f296029e = 2;
        if (pi0.l1.v(l1Var, context, flutterPageStyle, null, null, null, this, 28, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
