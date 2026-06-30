package mx0;

/* loaded from: classes5.dex */
public final class n3 extends cu0.y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(context, ignoreBackgroundTouchEvent);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
    }

    @Override // cv3.c
    public void b() {
        uu3.u uVar = this.f222571f;
        if (uVar != null) {
            uVar.setCancelSettleOnDown(false);
        }
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) e()).r();
    }

    @Override // cv3.h
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout c() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout shootComposingMusicPickerComponentLayout = new com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout(this.f222569d, null);
        shootComposingMusicPickerComponentLayout.setMusicPickerDrawer(this);
        return shootComposingMusicPickerComponentLayout;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setLocalAudioList(java.util.List audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout shootComposingMusicPickerComponentLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) e();
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout.f69537p;
        shootComposingMusicPickerComponentLayout.t(audioList, false, true);
    }
}
