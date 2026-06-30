package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

/* loaded from: classes5.dex */
public final class c implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment f156409d;

    public c(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment musicPickerLikeBgmFragment) {
        this.f156409d = musicPickerLikeBgmFragment;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        return this.f156409d.H0(adapter, view, i17, holder);
    }
}
