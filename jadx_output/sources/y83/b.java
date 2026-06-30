package y83;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchEntranceUI f459980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchEntranceUI kidsWatchEntranceUI) {
        super(0);
        this.f459980d = kidsWatchEntranceUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f459980d.findViewById(com.tencent.mm.R.id.hr8);
        int i17 = com.tencent.mm.R.id.gxl;
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = (com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent) x4.b.a(findViewById, com.tencent.mm.R.id.gxl);
        if (kidsWatchHeadComponent != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.l69);
            if (progressBar != null) {
                return new w83.d(relativeLayout, kidsWatchHeadComponent, relativeLayout, progressBar);
            }
            i17 = com.tencent.mm.R.id.l69;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
