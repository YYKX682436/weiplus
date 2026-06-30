package sc2;

/* loaded from: classes2.dex */
public final class e3 {
    public e3(kotlin.jvm.internal.i iVar) {
    }

    public static final int a(sc2.e3 e3Var, android.content.Context context) {
        int b17 = e3Var.b(context);
        int i17 = sc2.m3.B[b17];
        if (i17 == -1) {
            i17 = com.tencent.mm.ui.bl.c(context);
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedJumperBubbleObserver", "[getNavigationBarHeight] index:" + b17 + " navigationBarHeight:" + i17 + ", translationY");
        return i17;
    }

    public final int b(android.content.Context context) {
        if (com.tencent.mm.ui.bk.Q() && c(context)) {
            return 2;
        }
        return (!com.tencent.mm.ui.bk.Q() || c(context)) ? 0 : 1;
    }

    public final boolean c(android.content.Context context) {
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return false;
        }
        return com.tencent.mm.ui.bk.N(activity.getTaskId()) || (com.tencent.mm.ui.bk.O(activity.getContentResolver()) && !activity.isInMultiWindowMode());
    }

    public final void d(in5.s0 holder, java.lang.String source) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(source, "source");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((sc2.a8) a17).T6(holder, new sc2.d3(holder, source));
    }
}
