package uw;

/* loaded from: classes.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw.y f431514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(uw.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431514d = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uw.v(this.f431514d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        uw.v vVar = (uw.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        i11.h e17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            if (((u60.g) i95.n0.c(u60.g.class)) != null && (e17 = i11.h.e()) != null) {
                e17.m(this.f431514d.f431526e);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("FlutterBSGetPoiHelper", "stop locationGeo failed: " + e18.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
