package yo4;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f464233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yo4.p pVar) {
        super(0);
        this.f464233d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioPanel create shouldUseMusicPanelV2=");
        yo4.p pVar = this.f464233d;
        sb6.append(pVar.f464279g);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        boolean z17 = pVar.f464279g;
        android.view.ViewGroup viewGroup = pVar.f464278f;
        if (z17) {
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            return new mv3.a(context, 0, 2, null);
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) viewGroup.findViewById(com.tencent.mm.R.id.pvl);
        viewStub.setLayoutResource(com.tencent.mm.R.layout.ddk);
        android.view.View findViewById = viewStub.inflate().findViewById(com.tencent.mm.R.id.pvm);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = (com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView) findViewById;
        editorAudioView.setVisibility(8);
        return editorAudioView;
    }
}
