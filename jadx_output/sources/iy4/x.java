package iy4;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296022d;

    /* renamed from: e, reason: collision with root package name */
    public int f296023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f296024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(byte[] bArr, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296024f = bArr;
        this.f296025g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iy4.x(this.f296024f, this.f296025g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iy4.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296023e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "ext_device", null, false, null, 28, null);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("deviceInfoResponse", this.f296024f);
            linkedHashMap.put("loginURL", this.f296025g);
            this.f296022d = l1Var;
            this.f296023e = 1;
            if (l1Var.o("extraDeviceLogin", linkedHashMap, this) == aVar) {
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
            l1Var = (pi0.l1) this.f296022d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.b0.c(new iy4.p()));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        flutterPageStyle.f68118e = 1;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f296022d = null;
        this.f296023e = 2;
        if (pi0.l1.v(l1Var, context, flutterPageStyle, null, null, null, this, 28, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
