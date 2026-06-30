package zy0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy0.e f477311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zy0.e eVar) {
        super(0);
        this.f477311d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zy0.e eVar = this.f477311d;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout templateClipMusicPickerComponentLayout = (com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.TemplateClipMusicPickerComponentLayout) eVar.f477312a.invoke();
        templateClipMusicPickerComponentLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoRegisterComponentLayout", "setupConfig: ");
        templateClipMusicPickerComponentLayout.setupLyricsGroup(false);
        templateClipMusicPickerComponentLayout.p(true, false);
        templateClipMusicPickerComponentLayout.setBehaviorCallback(new zy0.c(eVar));
        return templateClipMusicPickerComponentLayout;
    }
}
