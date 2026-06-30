package gv3;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout f276108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout singleVideoEditMusicPickerComponentLayout) {
        super(1);
        this.f276108d = singleVideoEditMusicPickerComponentLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout.f156329n;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = this.f276108d.d();
        ev3.d w17 = d17 != null ? d17.w() : null;
        if (intValue != 5 && intValue == 6) {
            return new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerSingleVideoEditRecommendFragment(w17);
        }
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment(w17);
    }
}
