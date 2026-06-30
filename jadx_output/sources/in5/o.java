package in5;

/* loaded from: classes2.dex */
public abstract class o {
    public static final void a(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            long a17 = hq.d.a();
            jVar.f293072c = a17;
            jVar.f293073d = a17 - jVar.f293071b;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExposeTimeRecordListener", "updateTimeRecord: " + jVar);
        }
    }

    public static final void b(androidx.recyclerview.widget.RecyclerView recyclerView, in5.p pVar, yz5.l canStartExpose) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        kotlin.jvm.internal.o.g(canStartExpose, "canStartExpose");
        ym5.a1.g(recyclerView, new in5.l(pVar, canStartExpose));
        ym5.a1.h(recyclerView, new in5.m(recyclerView));
    }

    public static final void c(android.view.View view, in5.v vVar) {
        kotlin.jvm.internal.o.g(view, "<this>");
        ym5.a1.h(view, vVar != null ? new in5.n(vVar) : null);
    }
}
