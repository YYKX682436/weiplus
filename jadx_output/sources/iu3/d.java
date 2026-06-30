package iu3;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu3.e f294990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(iu3.e eVar) {
        super(0);
        this.f294990d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioPanel create shouldUseMusicPanelV2=");
        iu3.e eVar = this.f294990d;
        sb6.append(eVar.f294993f);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        boolean z17 = eVar.f294993f;
        android.view.ViewGroup viewGroup = eVar.f294991d;
        if (!z17) {
            android.view.ViewStub viewStub = (android.view.ViewStub) viewGroup.findViewById(com.tencent.mm.R.id.pvl);
            viewStub.setLayoutResource(com.tencent.mm.R.layout.ddk);
            android.view.View findViewById = viewStub.inflate().findViewById(com.tencent.mm.R.id.pvm);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView");
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = (com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView) findViewById;
            editorAudioView.setVisibility(8);
            return editorAudioView;
        }
        int i17 = (com.tencent.mm.ui.bl.b(viewGroup.getContext()).y * 3) / 4;
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        e0Var.f310115d = -1.0f;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gv3.b bVar = new gv3.b(context, i17);
        bVar.f222577m = new iu3.c(e0Var, i17, eVar);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat("PARAM_1_FLOAT", i17);
        eVar.f294992e.w(ju3.c0.G1, bundle);
        return bVar;
    }
}
