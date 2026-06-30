package gl;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272778d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f272779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl.y f272780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioDeviceInfo f272781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gl.y yVar, android.media.AudioDeviceInfo audioDeviceInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272780f = yVar;
        this.f272781g = audioDeviceInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        gl.v vVar = new gl.v(this.f272780f, this.f272781g, continuation);
        vVar.f272779e = obj;
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gl.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        kotlinx.coroutines.y0 y0Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272778d;
        gl.y yVar = this.f272780f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var3 = (kotlinx.coroutines.y0) this.f272779e;
            kotlinx.coroutines.r2 r2Var = yVar.f272792g;
            if (r2Var == null) {
                y0Var = y0Var3;
                yVar.f272792g = kotlinx.coroutines.l.b(y0Var, null, null, new gl.u(yVar, this.f272781g, null), 3, null);
                return jz5.f0.f302826a;
            }
            this.f272779e = y0Var3;
            this.f272778d = 1;
            if (kotlinx.coroutines.v2.d(r2Var, this) == aVar) {
                return aVar;
            }
            y0Var2 = y0Var3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var2 = (kotlinx.coroutines.y0) this.f272779e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        y0Var = y0Var2;
        yVar.f272792g = kotlinx.coroutines.l.b(y0Var, null, null, new gl.u(yVar, this.f272781g, null), 3, null);
        return jz5.f0.f302826a;
    }
}
