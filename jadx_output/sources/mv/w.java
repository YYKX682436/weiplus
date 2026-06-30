package mv;

/* loaded from: classes11.dex */
public interface w extends i95.m {
    static void ni(mv.w wVar, android.content.Context context, mv.d0 route, mv.a enterScene, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPage");
        }
        if ((i17 & 8) != 0) {
            map = null;
        }
        yn1.h4 h4Var = (yn1.h4) wVar;
        h4Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(route, "route");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        yn1.h4.Ai(h4Var, false, false, 3, null);
        h4Var.hj(context, route, enterScene, map);
    }
}
