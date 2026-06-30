package w82;

/* loaded from: classes12.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443892d;

    public j1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView) {
        this.f443892d = favVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443892d;
        if (favVideoView.f101569g != null) {
            favVideoView.g(favVideoView.f101576q);
        }
    }
}
