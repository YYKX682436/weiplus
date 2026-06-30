package ia2;

/* loaded from: classes2.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f289908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity f289909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f289910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f289911g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity, double d17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289909e = finderFlutterPOIActivity;
        this.f289910f = d17;
        this.f289911g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ia2.c0(this.f289909e, this.f289910f, this.f289911g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ia2.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f289908d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.H1;
            this.f289908d = 1;
            if (kotlinx.coroutines.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i19 = com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.H1;
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = this.f289909e;
        finderFlutterPOIActivity.getClass();
        float a17 = ((float) this.f289910f) + ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 28.0f);
        float j76 = finderFlutterPOIActivity.j7(finderFlutterPOIActivity.getContainerActivity());
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (a17 <= j76) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "submitUpdateDrawerExpandHeightTask: skip small");
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "submitUpdateDrawerExpandHeightTask: newHeight " + a17 + ", curHeight " + j76);
        this.f289911g.invoke();
        gx2.q qVar = finderFlutterPOIActivity.f101776J;
        if (qVar != null) {
            qVar.setExpandHeightAndLayoutIfNeeded(a17);
        }
        return f0Var;
    }
}
