package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

/* loaded from: classes5.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment f156367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv3.h f156368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f156369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f156370g;

    public g(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerLikeFragment finderMusicPickerLikeFragment, rv3.h hVar, int i17, android.view.View view) {
        this.f156367d = finderMusicPickerLikeFragment;
        this.f156368e = hVar;
        this.f156369f = i17;
        this.f156370g = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            this.f156367d.L0(this.f156368e, this.f156369f, this.f156370g);
        }
    }
}
