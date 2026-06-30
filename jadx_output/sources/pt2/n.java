package pt2;

/* loaded from: classes8.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f358254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI f358255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f358256f;

    public n(int i17, com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI finderSearchBaseUI, int i18) {
        this.f358254d = i17;
        this.f358255e = finderSearchBaseUI;
        this.f358256f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f358256f;
        com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI finderSearchBaseUI = this.f358255e;
        int i18 = this.f358254d;
        if (i18 == 0) {
            finderSearchBaseUI.e7().N(i17);
            return;
        }
        ym5.s3 s3Var = new ym5.s3(1);
        s3Var.f463521f = ((com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader) finderSearchBaseUI.c7()).f125677e == 1;
        int i19 = i17 - i18;
        s3Var.f463522g = i19 <= 0;
        s3Var.f463523h = i19;
        finderSearchBaseUI.e7().onPreFinishLoadMoreSmooth(s3Var);
    }
}
