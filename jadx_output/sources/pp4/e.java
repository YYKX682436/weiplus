package pp4;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lp4.u f357523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f357524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f357525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f357526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f357527i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout f357528m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lp4.u uVar, int i17, long j17, long j18, boolean z17, com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357523e = uVar;
        this.f357524f = i17;
        this.f357525g = j17;
        this.f357526h = j18;
        this.f357527i = z17;
        this.f357528m = timelineEditorBaseVideoPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pp4.e(this.f357523e, this.f357524f, this.f357525g, this.f357526h, this.f357527i, this.f357528m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pp4.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357522d;
        lp4.u uVar = this.f357523e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = this.f357524f;
            long j17 = this.f357525g;
            long j18 = this.f357526h;
            this.f357522d = 1;
            uVar.getClass();
            if (kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new lp4.r(i18, uVar, j17, j18, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        rm5.v z17 = uVar.z();
        if (z17 != null) {
            rm5.j jVar = (rm5.j) z17.f397584l.get(this.f357524f);
            long j19 = this.f357527i ? jVar.f397502d : jVar.f397503e;
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout = this.f357528m;
            lp4.l0 l0Var = (lp4.l0) timelineEditorBaseVideoPluginLayout.j(lp4.l0.class);
            if (l0Var != null) {
                l0Var.f320377m = z17;
                l0Var.f320373f.q(z17, false, true, j19);
            }
            lp4.p pVar = (lp4.p) timelineEditorBaseVideoPluginLayout.j(lp4.p.class);
            if (pVar != null) {
                pVar.A().b(null, j19);
            }
        }
        return jz5.f0.f302826a;
    }
}
