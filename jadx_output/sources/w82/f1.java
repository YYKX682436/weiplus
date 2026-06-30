package w82;

/* loaded from: classes12.dex */
public class f1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443841d;

    public f1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView) {
        this.f443841d = favVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443841d;
        if (!favVideoView.f101583x) {
            return false;
        }
        favVideoView.c();
        return false;
    }
}
