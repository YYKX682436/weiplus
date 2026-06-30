package fu0;

/* loaded from: classes5.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.m implements yz5.l {
    public s(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout.class, "createCreationFragmentByType", "createCreationFragmentByType(I)Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout creationComposingMusicPickerComponentLayout = (com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout) this.receiver;
        int i17 = com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout.f69170r;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = creationComposingMusicPickerComponentLayout.d();
        return intValue == 7 ? new com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingEditRecommendFragment(d17 != null ? d17.w() : null, true, new fu0.r(creationComposingMusicPickerComponentLayout)) : creationComposingMusicPickerComponentLayout.c(intValue);
    }
}
