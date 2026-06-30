package h41;

/* loaded from: classes11.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.a1 f278903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f278904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(h41.a1 a1Var, long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278903d = a1Var;
        this.f278904e = j17;
        this.f278905f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.z0(this.f278903d, this.f278904e, this.f278905f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h41.z0 z0Var = (h41.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context != null) {
            java.lang.String str = this.f278905f;
            if (str == null) {
                str = "";
            }
            db5.t7.h(context, str);
        }
        com.tencent.wechat.aff.ovc.p pVar = this.f278903d.f278758a;
        if (pVar != null) {
            pVar.Z(this.f278904e);
        }
        return jz5.f0.f302826a;
    }
}
