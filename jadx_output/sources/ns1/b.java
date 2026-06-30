package ns1;

/* loaded from: classes15.dex */
public class b implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar f339351d;

    public b(com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar videoLiteControBar) {
        this.f339351d = videoLiteControBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar.U;
        return this.f339351d.x();
    }
}
