package rj5;

/* loaded from: classes10.dex */
public abstract class c implements rj5.l {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f396376a;

    /* renamed from: b, reason: collision with root package name */
    public rj5.f f396377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetWrapper f396378c;

    public c(com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetWrapper scrollViewWidgetWrapper) {
        this.f396378c = scrollViewWidgetWrapper;
        this.f396376a = scrollViewWidgetWrapper;
    }

    public final void c(rj5.a state) {
        kotlin.jvm.internal.o.g(state, "state");
        java.util.Iterator it = this.f396378c.f209788d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView) it.next()).c(state);
        }
    }
}
