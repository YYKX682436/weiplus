package ns1;

/* loaded from: classes15.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar f339350d;

    public a(com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar videoLiteControBar) {
        this.f339350d = videoLiteControBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar videoLiteControBar = this.f339350d;
        videoLiteControBar.setVisibility(8);
        videoLiteControBar.H.d();
        return false;
    }
}
