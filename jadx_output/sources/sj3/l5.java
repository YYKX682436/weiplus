package sj3;

/* loaded from: classes14.dex */
public final class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView f408625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408626e;

    public l5(com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView, android.view.View view) {
        this.f408625d = screenCastBigView;
        this.f408626e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "dismiss ori dialog");
        com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView = this.f408625d;
        android.view.View view = screenCastBigView.f150360h;
        android.view.View view2 = this.f408626e;
        if (kotlin.jvm.internal.o.b(view, view2)) {
            screenCastBigView.removeView(view2);
            screenCastBigView.f150360h = null;
            screenCastBigView.f150357e = 0;
        }
    }
}
