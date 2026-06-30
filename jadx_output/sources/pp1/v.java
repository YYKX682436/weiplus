package pp1;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357442d;

    public v(pp1.z zVar) {
        this.f357442d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f357442d;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar.f357448f;
        if (contentFloatBallView != null && contentFloatBallView.A) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = zVar.f357446d;
            if (contentFloatBallRecyclerView != null) {
                int size = zVar.f357451i.size() - 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(size));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(contentFloatBallRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2$onFloatBallInfoChanged$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                contentFloatBallRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(contentFloatBallRecyclerView, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2$onFloatBallInfoChanged$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        } else {
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView2 = zVar.f357446d;
            if (contentFloatBallRecyclerView2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(contentFloatBallRecyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2$onFloatBallInfoChanged$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                contentFloatBallRecyclerView2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(contentFloatBallRecyclerView2, "com/tencent/mm/plugin/ball/ui/floatball/FloatBallRecyclerViewHelperV2$onFloatBallInfoChanged$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        pp1.z.c(zVar);
    }
}
