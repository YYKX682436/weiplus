package pp4;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout f357510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rm5.v f357511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, rm5.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357510d = timelineEditorBaseVideoPluginLayout;
        this.f357511e = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pp4.b(this.f357510d, this.f357511e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pp4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        lp4.l0 l0Var = (lp4.l0) this.f357510d.j(lp4.l0.class);
        if (l0Var == null) {
            return null;
        }
        lp4.l0.C(l0Var, this.f357511e, false, false, 0L, 14, null);
        return jz5.f0.f302826a;
    }
}
