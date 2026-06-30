package ia2;

/* loaded from: classes2.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f289912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity f289913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f289914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f289915g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity, double d17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289913e = finderFlutterPOIActivity;
        this.f289914f = d17;
        this.f289915g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ia2.d0(this.f289913e, this.f289914f, this.f289915g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ia2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        gx2.q qVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f289912d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.H1;
            this.f289912d = 1;
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
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = this.f289913e;
        finderFlutterPOIActivity.getClass();
        float a17 = (float) (ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 86.0f) + this.f289914f);
        double d17 = finderFlutterPOIActivity.f101791z1;
        float a18 = d17 <= 0.0d ? ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 191.0f) : (float) (ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 86.0f) + d17);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (a17 <= a18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "submitUpdateDrawerPeekHeightTask: skip small");
            return f0Var;
        }
        this.f289915g.invoke();
        if (!finderFlutterPOIActivity.D && (qVar = finderFlutterPOIActivity.f101776J) != null) {
            qVar.setPeekHeightAndLayoutIfNeeded(a17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "submitUpdateDrawerPeekHeightTask: " + a17 + ' ' + a18);
        yz5.l lVar = finderFlutterPOIActivity.M;
        if (lVar != null) {
        }
        return f0Var;
    }
}
