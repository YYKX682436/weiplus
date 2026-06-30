package wa5;

/* loaded from: classes14.dex */
public abstract class k {
    public static final wa5.i a(android.view.View view, java.lang.String transitionName, java.lang.Object obj) {
        java.util.List list;
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(transitionName, "transitionName");
        java.util.Objects.toString(obj);
        view.toString();
        view.setTransitionName(transitionName);
        if (view instanceof ya5.a) {
            android.content.Context context = view.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (list = wa5.d.f444315a.a(activity).f444313e) != null) {
                list.add(new java.lang.ref.WeakReference(view));
            }
        }
        wa5.i iVar = new wa5.i(transitionName, obj);
        view.setTag(com.tencent.mm.R.id.msq, iVar);
        return iVar;
    }
}
