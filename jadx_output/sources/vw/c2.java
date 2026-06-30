package vw;

/* loaded from: classes11.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440603d;

    /* renamed from: e, reason: collision with root package name */
    public int f440604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw5.o f440605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f440606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv.h3 f440607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(dw5.o oVar, android.content.Context context, rv.h3 h3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440605f = oVar;
        this.f440606g = context;
        this.f440607h = h3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw.c2(this.f440605f, this.f440606g, this.f440607h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f440604e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.q Ui = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            byte[] byteArray = this.f440605f.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            linkedHashMap.put("previewInfo", byteArray);
            pi0.l1 l1Var2 = new pi0.l1(Ui, "biz", null, false, null, 28, null);
            this.f440603d = l1Var2;
            this.f440604e = 1;
            if (l1Var2.o("image_previewer", linkedHashMap, this) == aVar) {
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
            l1Var = (pi0.l1) this.f440603d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        lx.x5 x5Var = new lx.x5();
        x5Var.f322009d = new vw.b2(this.f440607h);
        l1Var.a(kz5.c0.i(x5Var, new lx.p5(), new lx.v5(), new lx.i2()));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(1, -1, null, false, false, false, null, 0, false, false, false, null, 4076, null);
        android.content.Context context = this.f440606g;
        this.f440603d = null;
        this.f440604e = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : com.tencent.mm.plugin.brandservice.ui.flutter.BizPortraitFlutterViewActivity.class, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
