package pp4;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout f357512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.h1 f357513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f357514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, com.tencent.mm.plugin.vlog.model.h1 h1Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357512d = timelineEditorBaseVideoPluginLayout;
        this.f357513e = h1Var;
        this.f357514f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pp4.c(this.f357512d, this.f357513e, this.f357514f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pp4.c cVar = (pp4.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout = this.f357512d;
        bp4.e4 e4Var = (bp4.e4) timelineEditorBaseVideoPluginLayout.j(bp4.e4.class);
        if (e4Var != null) {
            bp4.b0.o(e4Var, this.f357513e, 0L, false, 6, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineProfile", "VLogThumbViewPlugin:" + (java.lang.System.currentTimeMillis() - this.f357514f));
        timelineEditorBaseVideoPluginLayout.setSingleTrackPlayRange(true);
        bp4.e4 e4Var2 = (bp4.e4) timelineEditorBaseVideoPluginLayout.j(bp4.e4.class);
        if (e4Var2 != null && (vLogThumbView = e4Var2.f23160h) != null) {
            vLogThumbView.f176140n = true;
        }
        return jz5.f0.f302826a;
    }
}
