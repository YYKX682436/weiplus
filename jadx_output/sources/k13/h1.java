package k13;

/* loaded from: classes10.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i13.c f303220e;

    public h1(k13.l1 l1Var, i13.c cVar) {
        this.f303219d = l1Var;
        this.f303220e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        androidx.recyclerview.widget.f2 adapter;
        k13.l1 l1Var = this.f303219d;
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(l1Var.b())) {
            com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "updateMsgItem no permission, return");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMsgItem called, id=");
        i13.c cVar = this.f303220e;
        sb6.append(cVar.f287275d);
        com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", sb6.toString());
        java.util.ArrayList arrayList = l1Var.f303239q;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            str = cVar.f287275d;
            if (!hasNext) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((i13.c) it.next()).f287275d, str)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "updateMsgItem item id=" + str + " doesn't exist, skip update");
            return;
        }
        if (i17 < arrayList.size()) {
            arrayList.set(i17, cVar);
            androidx.recyclerview.widget.RecyclerView recyclerView = l1Var.f303236n;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemChanged(i17);
            }
            cVar.p();
        }
        com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "updateMsgItem item id=" + str + " exists, update it");
    }
}
