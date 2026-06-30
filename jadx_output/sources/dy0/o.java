package dy0;

/* loaded from: classes5.dex */
public abstract class o {
    public static final void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        if ((recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager) && i17 >= 0) {
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (i17 < (adapter != null ? adapter.getItemCount() : 0)) {
                try {
                    android.content.Context context = recyclerView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    dy0.m mVar = new dy0.m(context, z17 ? 200 : 0);
                    mVar.f12049a = i17;
                    recyclerView.post(new dy0.n(recyclerView, mVar));
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public static /* synthetic */ void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        a(recyclerView, i17, z17);
    }
}
