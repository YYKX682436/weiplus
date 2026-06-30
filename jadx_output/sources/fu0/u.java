package fu0;

/* loaded from: classes5.dex */
public final class u extends cu0.y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(context, ignoreBackgroundTouchEvent);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
    }

    @Override // cv3.c
    public void b() {
        ((com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout) e()).s();
    }

    @Override // cv3.h
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout c() {
        com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout creationComposingMusicPickerComponentLayout = new com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout(this.f222569d, null);
        creationComposingMusicPickerComponentLayout.setMusicPickerDrawer(this);
        return creationComposingMusicPickerComponentLayout;
    }

    @Override // cv3.h, com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void destroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CreationComposingMusicPickerDrawerImpl", "destroy: full cleanup");
        uu3.u uVar = this.f222571f;
        if (uVar != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            arrayDeque.add(uVar);
            while (!arrayDeque.isEmpty()) {
                android.view.View view = (android.view.View) arrayDeque.removeFirst();
                if (view != null) {
                    if (rVar != null) {
                        ((cy1.a) rVar).Mj(view);
                    }
                    if (view instanceof android.view.ViewGroup) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i17 = 0; i17 < childCount; i17++) {
                            android.view.View childAt = viewGroup.getChildAt(i17);
                            if (childAt != null) {
                                arrayDeque.add(childAt);
                            }
                        }
                    }
                }
            }
        }
        super.destroy();
        try {
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) ((com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout) e()).b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
            androidx.viewpager.widget.ViewPager q17 = h0Var != null ? h0Var.q() : null;
            if (q17 != null) {
                q17.setAdapter(null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CreationComposingMusicPickerDrawerImpl", "destroy: clear adapter failed: " + e17.getMessage());
        }
        uu3.u uVar2 = this.f222571f;
        if (uVar2 != null) {
            android.view.ViewParent parent = uVar2.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(uVar2);
            }
        }
        this.f222571f = null;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void onSelectMusic(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        ((com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout) e()).v(info);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setLocalAudioList(java.util.List audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        ((com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout) e()).setLocalAudioList(audioList);
    }
}
