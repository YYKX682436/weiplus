package w82;

/* loaded from: classes12.dex */
public class e1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443838d;

    public e1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView) {
        this.f443838d = favVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443838d;
        favVideoView.f101581v = favVideoView.getPalyPosition();
        favVideoView.f101574o.a(java.lang.Math.max(0, favVideoView.f101581v / 1000));
        return true;
    }
}
