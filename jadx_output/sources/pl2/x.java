package pl2;

/* loaded from: classes3.dex */
public final class x extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f356681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f356682e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f356683f;

    /* renamed from: g, reason: collision with root package name */
    public pl2.s f356684g;

    /* renamed from: h, reason: collision with root package name */
    public vd2.v2 f356685h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f356686i;

    /* renamed from: m, reason: collision with root package name */
    public pl2.w f356687m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f356681d = "Finder.FinderLiveSideBarUIC";
        this.f356686i = new java.util.LinkedList();
        this.f356687m = new pl2.w(this, 0);
    }

    public final void O6(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f356681d, "notifySliderBarExtranceExpose:" + z17 + ", currExpose:" + this.f356682e);
        if (z17 == this.f356682e) {
            return;
        }
        this.f356682e = z17;
        com.tencent.mm.autogen.events.FinderLiveSliderBarEntranceExposeEvent finderLiveSliderBarEntranceExposeEvent = new com.tencent.mm.autogen.events.FinderLiveSliderBarEntranceExposeEvent();
        finderLiveSliderBarEntranceExposeEvent.f54292g.f8275a = z17;
        finderLiveSliderBarEntranceExposeEvent.e();
    }

    public final void P6(boolean z17) {
        android.view.Window window;
        android.view.View decorView;
        com.tencent.mars.xlog.Log.i(this.f356681d, "set inSideBarStatus:" + z17);
        this.f356683f = z17;
        ae2.in inVar = ae2.in.f3688a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).getValue()).r()).intValue() == 1)) {
            android.app.Activity context = getContext();
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = null;
            if (!(context instanceof android.app.Activity)) {
                context = null;
            }
            if (context != null && (window = context.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                swipeBackLayout = (com.tencent.mm.ui.widget.SwipeBackLayout) decorView.findViewById(com.tencent.mm.R.id.nsv);
            }
            if (swipeBackLayout != null) {
                swipeBackLayout.setEnableGesture(!z17);
            }
        }
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = (com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class);
        boolean z18 = this.f356683f;
        wa2.n0 n0Var = finderLiveExitAnimateOpUIC.f116990p;
        if (n0Var == null) {
            return;
        }
        n0Var.setDisabled(z18);
    }
}
