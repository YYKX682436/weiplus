package k13;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.g f303197d;

    public c(k13.g gVar) {
        this.f303197d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.f2 adapter;
        k13.g gVar = this.f303197d;
        if (gVar.f303212f) {
            gVar.f303212f = false;
            android.view.View view = gVar.f303211e;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            try {
                ((android.view.WindowManager) ((jz5.n) gVar.f303215i).getValue()).removeView(gVar.f303211e);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("ForceNotify.BaseWindow", "detach from window failed");
            }
            k13.l1 l1Var = (k13.l1) gVar;
            l1Var.h().removeCallbacksAndMessages(null);
            l1Var.s();
            java.util.ArrayList arrayList2 = l1Var.f303239q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
            arrayList2.clear();
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ((i13.c) it.next()).o();
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = l1Var.f303236n;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            l1Var.f303236n = null;
            gVar.f303211e = null;
        }
    }
}
