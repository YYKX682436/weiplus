package vy2;

/* loaded from: classes2.dex */
public final class e extends zx2.h {

    /* renamed from: w, reason: collision with root package name */
    public int f441461w;

    /* renamed from: x, reason: collision with root package name */
    public final zx2.y f441462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f441462x = new vy2.d();
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new vy2.c(this);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void k7() {
        com.tencent.mars.xlog.Log.i("Finder.FinderMsgNotifyUIC", "unsetRedDot");
        java.lang.String[] strArr = vy2.a.f441454m;
        int i17 = 0;
        int i18 = 0;
        while (i17 < 2) {
            java.lang.String str = strArr[i17];
            int i19 = i18 + 1;
            zx2.i b76 = b7(i18);
            if (b76 instanceof gy2.b) {
                ((gy2.b) b76).r("", false);
            }
            i17++;
            i18 = i19;
        }
    }

    @Override // zx2.h, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.w2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        int N6 = ((ey2.w2) a17).N6("Finder.FinderMsgNotifyUIC_findTabIndex", 3, r17);
        com.tencent.mars.xlog.Log.i("Finder.FinderMsgNotifyUIC", "[findTabIndex] index=" + N6);
        this.f441461w = N6;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(this, N6, false, 2, null);
    }
}
