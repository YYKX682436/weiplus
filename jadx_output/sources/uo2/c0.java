package uo2;

/* loaded from: classes2.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView f429605d;

    public c0(com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView) {
        this.f429605d = finderQQMusicFollowHeaderView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        if (itemId == 1001) {
            intent.putExtra("key_finder_post_router", 2);
        } else if (itemId == 1002) {
            intent.putExtra("key_finder_post_router", 3);
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f429605d.f121446h;
        if (finderObject != null) {
            finderObject.getRefObjectId();
        }
    }
}
