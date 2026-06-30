package df5;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.t f232182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(df5.t tVar) {
        super(1);
        this.f232182d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List<android.view.View> views = (java.util.List) obj;
        kotlin.jvm.internal.o.g(views, "views");
        com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] onShowViews: count=%d", java.lang.Integer.valueOf(views.size()));
        df5.t tVar = this.f232182d;
        tVar.getClass();
        int size = views.size();
        ua5.f fVar = tVar.f232208a;
        if (size == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] fadeInView: type=%s", kotlin.jvm.internal.i0.a(views.get(0).getClass()).g());
            fVar.a((android.view.View) views.get(0));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] scheduleFadeInSequence: count=%d", java.lang.Integer.valueOf(views.size()));
            fVar.getClass();
            if (!views.isEmpty()) {
                long j17 = 0;
                for (android.view.View view : views) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/stream/StreamFadeAnimator", "scheduleFadeInSequence", "(Ljava/util/List;J)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/ui/anim/stream/StreamFadeAnimator", "scheduleFadeInSequence", "(Ljava/util/List;J)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    ua5.e eVar = new ua5.e(fVar, view);
                    fVar.f425986a.postDelayed(eVar, j17);
                    ((java.util.ArrayList) fVar.f425987b).add(eVar);
                    j17 += 500;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
