package in5;

/* loaded from: classes10.dex */
public final class p0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.q0 f293112d;

    public p0(in5.q0 q0Var) {
        this.f293112d = q0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        in5.q0 q0Var = this.f293112d;
        if (q0Var.f293117f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rvnotify-test-onViewAttachedToWindow-detachedFromWindow, id:");
            in5.d dVar = in5.d.f293019a;
            try {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getResourceEntryName(view.getId());
                kotlin.jvm.internal.o.d(str);
            } catch (java.lang.Exception unused) {
                str = "";
            }
            sb6.append(str);
            sb6.append(", parent:");
            sb6.append(dVar.a(view));
            sb6.append(", root:");
            sb6.append(dVar.b(view));
            com.tencent.mm.sdk.platformtools.Log.c(q0Var.f293115d, sb6.toString(), new java.lang.Object[0]);
            q0Var.notifyDataSetChanged();
            q0Var.f293117f = false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        in5.q0 q0Var = this.f293112d;
        com.tencent.mars.xlog.Log.i(q0Var.f293115d, "rvnotify-test-onViewDetachedFromWindow, clear scopeSet:" + q0Var.f293116e.size());
        if (q0Var.f293116e.size() > 0) {
            q0Var.f293117f = true;
        }
        java.util.Iterator it = q0Var.f293116e.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.z0.e((kotlinx.coroutines.y0) it.next(), null, 1, null);
        }
        q0Var.f293116e.clear();
    }
}
