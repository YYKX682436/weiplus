package in5;

/* loaded from: classes10.dex */
public final class d1 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293021d;

    public d1(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f293021d = wxRecyclerAdapter;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f293021d;
        if (wxRecyclerAdapter.f213719x) {
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
            com.tencent.mm.sdk.platformtools.Log.c("RecyclerViewAdapterEx", sb6.toString(), new java.lang.Object[0]);
            wxRecyclerAdapter.notifyDataSetChanged();
            wxRecyclerAdapter.f213719x = false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rvnotify-test-onViewDetachedFromWindow, clear scopeSet:");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f293021d;
        sb6.append(wxRecyclerAdapter.f213718w.size());
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", sb6.toString());
        if (wxRecyclerAdapter.f213718w.size() > 0) {
            wxRecyclerAdapter.f213719x = true;
        }
        java.util.Iterator it = wxRecyclerAdapter.f213718w.entrySet().iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.z0.e((kotlinx.coroutines.y0) ((java.util.Map.Entry) it.next()).getKey(), null, 1, null);
        }
        wxRecyclerAdapter.f213718w.clear();
    }
}
