package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f112551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, android.view.ViewGroup viewGroup, dk2.zf zfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112549e = mgVar;
        this.f112550f = viewGroup;
        this.f112551g = zfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.fg(this.f112549e, this.f112550f, this.f112551g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.fg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112548d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f112548d = 1;
            if (kotlinx.coroutines.k1.b(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112549e;
        mgVar.f113512y = null;
        this.f112550f.removeAllViews();
        dk2.zf zfVar = this.f112551g;
        if (zfVar.z() == 2) {
            ((mm2.x4) mgVar.P0(mm2.x4.class)).f329528f.add(zfVar);
        }
        return jz5.f0.f302826a;
    }
}
