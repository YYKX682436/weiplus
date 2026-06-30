package qp1;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f365737a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f365738b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f365739c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f365740d;

    public r(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f365739c = new java.util.ArrayList();
        this.f365737a = context;
    }

    public final void a(int i17, boolean z17) {
        com.tencent.mm.plugin.ball.view.CircleAnimateView circleAnimateView = (com.tencent.mm.plugin.ball.view.CircleAnimateView) kz5.n0.a0(this.f365739c, i17);
        if (circleAnimateView == null) {
            return;
        }
        circleAnimateView.setVisibility(z17 ? 0 : 8);
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.ball.view.CircleAnimateView circleAnimateView = (com.tencent.mm.plugin.ball.view.CircleAnimateView) kz5.n0.a0(this.f365739c, i17);
        java.util.List list = this.f365740d;
        if (list == null || !qp1.w.a(list)) {
            return;
        }
        java.util.List list2 = this.f365740d;
        kotlin.jvm.internal.o.d(list2);
        if (list2.size() > i17) {
            java.util.List list3 = this.f365740d;
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = list3 != null ? (com.tencent.mm.plugin.ball.model.BallInfo) kz5.n0.a0(list3, i17) : null;
            if (ballInfo == null) {
                return;
            }
            int p17 = qp1.w.p(ballInfo);
            if (-1 != p17) {
                m95.a aVar = new m95.a();
                if (!com.tencent.mm.sdk.platformtools.y1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, p17)) {
                    android.content.Context context = this.f365737a;
                    if (aVar.g(context.getResources(), p17)) {
                        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(p17);
                        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
                        if (circleAnimateView != null) {
                            circleAnimateView.setImageDrawable(drawable);
                        }
                    }
                }
                if (circleAnimateView != null) {
                    circleAnimateView.setImageResource(p17);
                }
                android.graphics.drawable.Drawable drawable2 = circleAnimateView != null ? circleAnimateView.getDrawable() : null;
                if (drawable2 instanceof android.graphics.drawable.AnimationDrawable) {
                    ((android.graphics.drawable.AnimationDrawable) drawable2).start();
                }
            } else {
                android.graphics.drawable.Drawable drawable3 = ballInfo.f93061v;
                if (drawable3 != null) {
                    if (circleAnimateView != null) {
                        circleAnimateView.setImageDrawable(drawable3);
                    }
                    if (drawable3 instanceof android.graphics.drawable.AnimationDrawable) {
                        ((android.graphics.drawable.AnimationDrawable) drawable3).start();
                    }
                }
            }
            long j17 = ballInfo.A;
            if (j17 >= 0) {
                if (circleAnimateView != null) {
                    circleAnimateView.setProgress(j17);
                }
            } else if (circleAnimateView != null) {
                circleAnimateView.setProgress(-2147483648L);
            }
        }
    }
}
