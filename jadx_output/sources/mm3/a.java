package mm3;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.n f329607d;

    public a(mm3.n nVar) {
        this.f329607d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mm3.n nVar = this.f329607d;
        java.util.Set keySet = nVar.f329663q.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        java.lang.String arrays = java.util.Arrays.toString(keySet.toArray(new java.lang.Integer[0]));
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "user clicked cancel button，revert: ".concat(arrays));
        nVar.f329661o = -1;
        if (!nVar.f329663q.isEmpty()) {
            java.util.Set<java.util.Map.Entry> entrySet = nVar.f329663q.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            for (java.util.Map.Entry entry : entrySet) {
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = nVar.f329653d;
                if (mvTracksEditView == null) {
                    kotlin.jvm.internal.o.o("tracksEditView");
                    throw null;
                }
                java.lang.Object key = entry.getKey();
                kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                int intValue = ((java.lang.Number) key).intValue();
                java.lang.Object lower = ((android.util.Range) entry.getValue()).getLower();
                kotlin.jvm.internal.o.f(lower, "getLower(...)");
                long longValue = ((java.lang.Number) lower).longValue();
                java.lang.Object upper = ((android.util.Range) entry.getValue()).getUpper();
                kotlin.jvm.internal.o.f(upper, "getUpper(...)");
                long longValue2 = ((java.lang.Number) upper).longValue();
                int i17 = com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView.F;
                mvTracksEditView.d(intValue, longValue, longValue2, true);
            }
        }
        mm3.n.O6(nVar);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexPreviewTrackUIC$initBgTrackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
