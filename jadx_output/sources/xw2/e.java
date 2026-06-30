package xw2;

/* loaded from: classes10.dex */
public final class e implements ym5.m3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.base.MediaPlayBanner f457689d;

    public e(com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner) {
        this.f457689d = mediaPlayBanner;
    }

    @Override // ym5.m3
    public void a(int i17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner = this.f457689d;
        mediaPlayBanner.setFocusPosition(i17);
        ym5.o1 indicator = mediaPlayBanner.getIndicator();
        if (indicator != null) {
            indicator.setCurrentIndex(i17);
        }
        mediaPlayBanner.getPageChangeCallback();
    }
}
