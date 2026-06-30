package pr0;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f357803d;

    /* renamed from: e, reason: collision with root package name */
    public int f357804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f357805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pr0.d f357806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z17, pr0.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357805f = z17;
        this.f357806g = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.a(this.f357805f, this.f357806g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long elapsedRealtime;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357804e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preOpenCamera:");
            boolean z17 = this.f357805f;
            sb6.append(z17);
            sb6.append(' ');
            pr0.d dVar = this.f357806g;
            sb6.append(dVar.f357834e);
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            sr0.i iVar = dVar.f357834e;
            if (iVar != null) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                this.f357803d = elapsedRealtime;
                this.f357804e = 1;
                if (iVar.n(valueOf, this) == aVar) {
                    return aVar;
                }
                j17 = elapsedRealtime;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preOpenCamera cost:");
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb7.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", sb7.toString());
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j17 = this.f357803d;
        kotlin.ResultKt.throwOnFailure(obj);
        elapsedRealtime = j17;
        java.lang.StringBuilder sb72 = new java.lang.StringBuilder("preOpenCamera cost:");
        boolean z192 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb72.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", sb72.toString());
        return jz5.f0.f302826a;
    }
}
