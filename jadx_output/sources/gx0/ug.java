package gx0;

/* loaded from: classes5.dex */
public final class ug implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f277042d;

    public ug(gx0.bh bhVar) {
        this.f277042d = bhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.maas.model.time.MJTime mJTime;
        com.tencent.maas.model.time.MJTime InvalidTime;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC$initTimelineToolbarListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx0.w8 a76 = this.f277042d.a7();
        ex0.a0 a0Var = a76.W6().f276642r;
        if (a0Var != null) {
            com.tencent.maas.moviecomposing.ComposingSession composingSession = a0Var.f257091a;
            if (composingSession.a()) {
                yy0.m7 m7Var = (yy0.m7) a76.R6().O6();
                kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.v3(m7Var, null), 3, null);
                if (composingSession.a()) {
                    com.tencent.maas.moviecomposing.TimelineOpDesc g17 = composingSession.g();
                    if (g17 == null || (mJTime = g17.getPlayheadTime()) == null) {
                        mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
                    }
                    if (g17 == null) {
                        InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
                        kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
                    } else {
                        a0Var.Q(g17, cx0.a.f224494e);
                        a0Var.S();
                        kotlin.jvm.internal.o.d(mJTime);
                        InvalidTime = mJTime;
                    }
                } else {
                    InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
                    kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
                }
                if (InvalidTime.isValid()) {
                    kotlinx.coroutines.l.d(a76.getMainScope(), null, null, new gx0.k5(a76, a0Var, InvalidTime, null), 3, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC$initTimelineToolbarListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
