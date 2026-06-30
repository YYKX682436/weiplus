package z13;

/* loaded from: classes12.dex */
public final class d implements com.tencent.mm.plugin.fts.ui.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z13.f f469395a;

    public d(z13.f fVar) {
        this.f469395a = fVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.s0
    public final void a(com.tencent.mm.plugin.fts.ui.v2 v2Var, boolean z17, boolean z18, java.lang.Boolean bool, boolean z19, boolean z27) {
        com.tencent.mm.plugin.fts.ui.widget.v vVar;
        com.tencent.mm.plugin.fts.ui.widget.v vVar2;
        z13.f fVar = this.f469395a;
        if (z19) {
            z13.f.T6(this.f469395a, bool, z17, false, 4, null);
            kotlin.jvm.internal.o.d(bool);
            if (!bool.booleanValue() || (vVar2 = fVar.f469399e) == null) {
                return;
            }
            vVar2.x();
            return;
        }
        if (z19 || bool.booleanValue()) {
            return;
        }
        if (!fVar.f7() && (vVar = fVar.f469399e) != null) {
            android.content.Context context = vVar.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
            com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = (com.tencent.mm.plugin.fts.ui.FTSMainUI) context;
            android.view.View r17 = fTSMainUI.getController().r(com.tencent.mm.R.id.u8s);
            if (r17 != null && r17.getVisibility() == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(r17, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideControlBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(r17, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideControlBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View r18 = fTSMainUI.getController().r(com.tencent.mm.R.id.u8q);
                if (r18 != null) {
                    r18.requestLayout();
                }
            }
        }
        z13.f.T6(this.f469395a, java.lang.Boolean.FALSE, false, true, 2, null);
    }
}
