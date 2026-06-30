package y83;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseHelpUI f459998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseHelpUI kidsWatchLoginFirstChooseHelpUI) {
        super(0);
        this.f459998d = kidsWatchLoginFirstChooseHelpUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f459998d.findViewById(com.tencent.mm.R.id.hr_);
        int i17 = com.tencent.mm.R.id.f483556b75;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f483556b75);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.gxl;
            com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = (com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent) x4.b.a(findViewById, com.tencent.mm.R.id.gxl);
            if (kidsWatchHeadComponent != null) {
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                i17 = com.tencent.mm.R.id.f487238o00;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f487238o00);
                if (textView != null) {
                    return new w83.f(relativeLayout, linearLayout, kidsWatchHeadComponent, relativeLayout, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
