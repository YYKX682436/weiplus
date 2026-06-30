package jo5;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f300956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jo5.l f300957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jo5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f300957e = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        jo5.j jVar = new jo5.j(this.f300957e, (kotlin.coroutines.Continuation) obj3);
        jVar.f300956d = intValue;
        return jVar.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f300956d;
        jz5.l lVar = (jz5.l) this.f300957e.f300960b.get(new java.lang.Integer(i17));
        android.graphics.SurfaceTexture surfaceTexture = lVar != null ? (android.graphics.SurfaceTexture) lVar.f302834e : null;
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        java.lang.String str = "Surface texture for memberId: " + i17 + " not found!";
        com.tencent.mars.xlog.Log.e("VoIPMPCodecDriver", str);
        throw new java.lang.RuntimeException(str);
    }
}
