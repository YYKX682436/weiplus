package mz0;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f333058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.widget.MusicV2State f333060g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f333061h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(boolean z17, mz0.b2 b2Var, com.tencent.mm.mj_template.album_template.widget.MusicV2State musicV2State, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333058e = z17;
        this.f333059f = b2Var;
        this.f333060g = musicV2State;
        this.f333061h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.t0(this.f333058e, this.f333059f, this.f333060g, this.f333061h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f333057d;
        boolean z17 = this.f333058e;
        mz0.b2 b2Var = this.f333059f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "musicDrawer: show=" + z17);
            if (((java.lang.Boolean) ((jz5.n) b2Var.f332893q).getValue()).booleanValue() && z17) {
                az0.d.a(b2Var.n7(), null, 1, null);
                az0.d n76 = b2Var.n7();
                this.f333057d = 1;
                if (((dz0.k0) n76).c(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.mj_template.album_template.widget.MusicV2State musicV2State = this.f333060g;
        if (!musicV2State.f69764h && z17) {
            musicV2State.f69764h = true;
        }
        mz0.s0 s0Var = new mz0.s0(this.f333061h, b2Var);
        ((gv3.d) b2Var.f332899w.getValue()).setShow(z17);
        ((gv3.d) b2Var.f332899w.getValue()).setOnVisibleChangeCallback(s0Var);
        b2Var.H7(z17);
        return jz5.f0.f302826a;
    }
}
