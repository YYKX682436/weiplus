package t14;

/* loaded from: classes11.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity activity, java.lang.String viewId, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        j75.f stateCenter = activity.getStateCenter();
        if (stateCenter != null) {
            stateCenter.B3(new t14.z(viewId, str, i17));
        }
    }
}
