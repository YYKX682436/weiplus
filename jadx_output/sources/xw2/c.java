package xw2;

/* loaded from: classes10.dex */
public final class c implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.base.MediaPlayBanner f457687d;

    public c(com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner) {
        this.f457687d = mediaPlayBanner;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == 1) {
            com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner = this.f457687d;
            androidx.recyclerview.widget.f2 adapter = mediaPlayBanner.getAdapter();
            if ((adapter != null ? adapter.getItemCount() : 0) > 1) {
                int focusPosition = mediaPlayBanner.getFocusPosition() + 1;
                androidx.recyclerview.widget.f2 adapter2 = mediaPlayBanner.getAdapter();
                if (focusPosition < (adapter2 != null ? adapter2.getItemCount() : 0)) {
                    mediaPlayBanner.a(focusPosition, true);
                    com.tencent.mm.plugin.finder.view.base.MediaPlayBanner.b(mediaPlayBanner, 0L, 1, null);
                } else {
                    androidx.recyclerview.widget.f2 adapter3 = mediaPlayBanner.getAdapter();
                    if (focusPosition == (adapter3 != null ? adapter3.getItemCount() : 0)) {
                        androidx.recyclerview.widget.f2 adapter4 = mediaPlayBanner.getAdapter();
                        if (adapter4 instanceof eb5.d) {
                            try {
                                ((eb5.d) adapter4).unregisterAdapterDataObserver(mediaPlayBanner.f131714o);
                            } catch (java.lang.Exception unused) {
                            }
                            eb5.d dVar = (eb5.d) adapter4;
                            int itemCount = dVar.getItemCount();
                            dVar.f250921d.add(itemCount, dVar.f250921d.get(0));
                            dVar.notifyItemInserted(itemCount);
                            mediaPlayBanner.getRecyclerView().setItemAnimator(null);
                            mediaPlayBanner.a(focusPosition, false);
                            java.lang.Object obj = it.obj;
                            java.lang.Long l17 = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
                            mediaPlayBanner.postDelayed(new xw2.b(adapter4, mediaPlayBanner), (l17 != null ? l17.longValue() : 2500L) / 5);
                        }
                    }
                }
            }
        }
        return true;
    }
}
