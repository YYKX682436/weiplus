package w10;

/* loaded from: classes9.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w10.d f441963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pq.a f441964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w10.d dVar, pq.a aVar) {
        super(3);
        this.f441963d = dVar;
        this.f441964e = aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        android.content.Intent intent = (android.content.Intent) obj3;
        com.tencent.mars.xlog.Log.i("ECS_O.Router.MBApp", "start result, reqCode:" + intValue + ", resultCode:" + intValue2);
        if (intValue == this.f441963d.f441965c && intValue2 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("resultData") : null;
            bw5.i8 i8Var = new bw5.i8();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            i8Var.f28494f = stringExtra;
            i8Var.f28496h[3] = true;
            yz5.p pVar = this.f441964e.f357553c;
            if (pVar != null) {
                pVar.invoke(bw5.j8.EcsOpenEventType_changeSkuFlutterWebPageExit, i8Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
