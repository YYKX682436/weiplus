package du0;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f243438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.i0 f243439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlinx.coroutines.q qVar, du0.i0 i0Var) {
        super(1);
        this.f243438d = qVar;
        this.f243439e = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPermissionsGranted: currentLatLng latitude ");
        sb6.append(lVar != null ? (java.lang.Float) lVar.f302833d : null);
        sb6.append(" longitude ");
        sb6.append(lVar != null ? (java.lang.Float) lVar.f302834e : null);
        com.tencent.mars.xlog.Log.i("LocationUIC", sb6.toString());
        kotlinx.coroutines.q qVar = this.f243438d;
        if (lVar == null) {
            ou0.a.a(qVar, null);
        } else {
            this.f243439e.P6(((java.lang.Number) lVar.f302833d).floatValue(), ((java.lang.Number) lVar.f302834e).floatValue(), new du0.s(qVar));
        }
        return jz5.f0.f302826a;
    }
}
