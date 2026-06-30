package qf4;

/* loaded from: classes4.dex */
public final class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.album.StoryAlbumUI f362710d;

    public m(com.tencent.mm.plugin.story.ui.album.StoryAlbumUI storyAlbumUI) {
        this.f362710d = storyAlbumUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        androidx.fragment.app.FragmentActivity activity = this.f362710d.getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }
}
