package u30;

@j95.b
/* loaded from: classes4.dex */
public final class e extends i95.w implements v30.e {
    public void wi(androidx.recyclerview.widget.RecyclerView recycleView, java.lang.String sessionPageName) {
        java.lang.ref.WeakReference weakReference;
        kotlin.jvm.internal.o.g(recycleView, "recycleView");
        kotlin.jvm.internal.o.g(sessionPageName, "sessionPageName");
        e62.q a17 = e62.q.a();
        a17.getClass();
        if (sessionPageName.isEmpty() && (weakReference = a17.f249808f) != null && weakReference.get() != null) {
            sessionPageName = ((android.app.Activity) a17.f249808f.get()).getClass().getName();
        }
        e62.j b17 = a17.b(sessionPageName);
        if (b17 != null) {
            recycleView.i(b17);
        }
    }
}
