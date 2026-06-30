package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class e9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f200894d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f200895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk4.d f200896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar f200897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f200898h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(pk4.d dVar, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar, com.tencent.mm.ui.chatting.gallery.ja jaVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200896f = dVar;
        this.f200897g = redesignVideoPlayerSeekBar;
        this.f200898h = jaVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.gallery.e9 e9Var = new com.tencent.mm.ui.chatting.gallery.e9(this.f200896f, this.f200897g, this.f200898h, continuation);
        e9Var.f200895e = obj;
        return e9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.e9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f200894d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f200895e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f200895e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (kotlinx.coroutines.z0.h(y0Var)) {
            pk4.d dVar = this.f200896f;
            int currentPosition = dVar.getCurrentPosition() / 1000;
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = this.f200897g;
            if (redesignVideoPlayerSeekBar.getmPosition() != currentPosition) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "progress: " + currentPosition);
                redesignVideoPlayerSeekBar.a(currentPosition);
            }
            long min = java.lang.Math.min(1000 - (dVar.getCurrentPosition() % 1000), 500L);
            if (dVar.getIsOnlineVideo()) {
                com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f200898h;
                fk4.u uVar = jaVar.f201082w;
                if (uVar != null && ((fk4.k) uVar).h()) {
                    j17 = dVar.getDuration();
                } else {
                    fk4.u uVar2 = jaVar.f201082w;
                    j17 = uVar2 != null ? ((fk4.k) uVar2).f263627o : 0L;
                }
                int i18 = (int) (j17 / 1000);
                if (i18 > 0) {
                    redesignVideoPlayerSeekBar.v(i18);
                }
            }
            this.f200895e = y0Var;
            this.f200894d = 1;
            if (kotlinx.coroutines.k1.b(min, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
