package mx2;

/* loaded from: classes2.dex */
public final class f implements ym5.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332485a;

    public f(com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner) {
        this.f332485a = finderImageBanner;
    }

    public void a(int i17) {
        int i18 = com.tencent.mm.plugin.finder.view.image.FinderImageBanner.F;
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = this.f332485a;
        boolean z17 = i17 != finderImageBanner.getFocusPosition();
        finderImageBanner.getMediaView().h1(i17, false);
        if (z17) {
            return;
        }
        finderImageBanner.a(i17, true, false);
    }
}
