package cv3;

/* loaded from: classes5.dex */
public abstract class h extends cv3.c {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f222575h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f222576i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f222577m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f222578n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f222579o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, int i17) {
        super(context, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f222575h = "MicroMsg.MusicPickerDrawer[" + hashCode() + ']';
        this.f222578n = jz5.h.b(new cv3.g(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void back() {
        com.tencent.mars.xlog.Log.i(this.f222575h, "back: ");
        uu3.u uVar = this.f222571f;
        if (uVar != null) {
            com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(uVar, false, 1, null);
        }
    }

    public abstract com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout c();

    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout) ((jz5.n) this.f222578n).getValue();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void destroy() {
        com.tencent.mars.xlog.Log.i(this.f222575h, "destroy");
        d().h();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a getCallback() {
        return this.f222579o;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public boolean getMuteOrigin() {
        if (((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) d().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class)) == null) {
            return false;
        }
        int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k0.f156284a;
        return !r0.s(2);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public boolean getWithMusic() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) d().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var == null) {
            return false;
        }
        int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k0.f156284a;
        return e0Var.s(1);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void reset() {
        com.tencent.mars.xlog.Log.i(this.f222575h, "reset: ");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setCallback(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar) {
        this.f222579o = aVar;
        d().setBehaviorCallback(aVar);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setMuteOrigin(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setOnVisibleChangeCallback(yz5.l lVar) {
        this.f222576i = lVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setWithMusic(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void toggleLyrics(boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) d().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var != null) {
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.B(e0Var, z17, false, false, 2, null);
            if (!z17 || e0Var.s(1)) {
                return;
            }
            e0Var.y();
        }
    }
}
