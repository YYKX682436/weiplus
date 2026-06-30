package ym5;

/* loaded from: classes10.dex */
public final class u2 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MediaBanner f463548d;

    public u2(com.tencent.mm.view.MediaBanner mediaBanner) {
        this.f463548d = mediaBanner;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == 1) {
            com.tencent.mm.view.MediaBanner mediaBanner = this.f463548d;
            androidx.recyclerview.widget.f2 adapter = mediaBanner.getAdapter();
            if ((adapter != null ? adapter.getItemCount() : 0) > 1) {
                int focusPosition = mediaBanner.getFocusPosition() + 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaBanner", "[handleMsg] targetPosition:" + focusPosition);
                androidx.recyclerview.widget.f2 adapter2 = mediaBanner.getAdapter();
                if (focusPosition < (adapter2 != null ? adapter2.getItemCount() : 0)) {
                    mediaBanner.a(focusPosition, true);
                    mediaBanner.b();
                } else {
                    androidx.recyclerview.widget.f2 adapter3 = mediaBanner.getAdapter();
                    if (focusPosition == (adapter3 != null ? adapter3.getItemCount() : 0)) {
                        androidx.recyclerview.widget.f2 adapter4 = mediaBanner.getAdapter();
                        if (adapter4 instanceof eb5.d) {
                            try {
                                adapter4.unregisterAdapterDataObserver(mediaBanner.getDataObserver());
                            } catch (java.lang.Exception unused) {
                            }
                            eb5.d dVar = (eb5.d) adapter4;
                            int itemCount = dVar.getItemCount();
                            dVar.f250921d.add(itemCount, dVar.f250921d.get(0));
                            dVar.notifyItemInserted(itemCount);
                            mediaBanner.getPagerView().setItemAnimator(null);
                            mediaBanner.a(focusPosition, false);
                            mediaBanner.postDelayed(new ym5.t2(adapter4, mediaBanner), 500L);
                        }
                    }
                }
            }
        }
        return true;
    }
}
