package g41;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f268704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g41.f f268705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, g41.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268704d = z17;
        this.f268705e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g41.c(this.f268704d, this.f268705e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g41.c cVar = (g41.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f268704d;
        g41.f fVar = this.f268705e;
        if (z17) {
            java.lang.Object value = ((jz5.n) fVar.f268710b).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            com.tencent.mm.open_voice_control.debug.A2AVolumeBarView a2AVolumeBarView = (com.tencent.mm.open_voice_control.debug.A2AVolumeBarView) value;
            if (!a2AVolumeBarView.f72266o) {
                a2AVolumeBarView.f72266o = true;
                int i17 = a2AVolumeBarView.f72265n;
                for (int i18 = 0; i18 < i17; i18++) {
                    a2AVolumeBarView.f72268q[i18] = (float) ((java.lang.Math.random() * 0.8d) + 0.2d);
                }
                a2AVolumeBarView.invalidate();
            }
        } else {
            java.lang.Object value2 = ((jz5.n) fVar.f268710b).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((com.tencent.mm.open_voice_control.debug.A2AVolumeBarView) value2).f72266o = false;
        }
        return jz5.f0.f302826a;
    }
}
