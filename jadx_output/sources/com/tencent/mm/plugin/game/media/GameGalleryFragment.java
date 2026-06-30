package com.tencent.mm.plugin.game.media;

/* loaded from: classes8.dex */
public class GameGalleryFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f140043d;

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameGalleryFragment", "onCreateView");
        android.view.View view = this.f140043d;
        return view != null ? view : layoutInflater.inflate(0, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameGalleryFragment", "onViewCreated");
    }
}
