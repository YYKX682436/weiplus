package cu0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f222337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f222339f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f222340g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f222341h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.ui.widget.dialog.u3 u3Var, cu0.x xVar, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222337d = u3Var;
        this.f222338e = xVar;
        this.f222339f = audioCacheInfo;
        this.f222340g = z17;
        this.f222341h = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cu0.t(this.f222337d, this.f222338e, this.f222339f, this.f222340g, this.f222341h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cu0.t tVar = (cu0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f222337d.dismiss();
        yz5.q qVar = this.f222338e.f222361k;
        if (qVar != null) {
            qVar.invoke(this.f222339f, java.lang.Boolean.valueOf(this.f222340g), java.lang.Boolean.valueOf(this.f222341h));
        }
        return jz5.f0.f302826a;
    }
}
