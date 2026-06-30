package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment f156366d;

    public f(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment finderMusicPickerLikeFragment) {
        this.f156366d = finderMusicPickerLikeFragment;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f156366d.getString(com.tencent.mm.R.string.nak));
    }
}
