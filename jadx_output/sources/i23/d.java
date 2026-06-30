package i23;

/* loaded from: classes12.dex */
public final class d implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i23.e f288078d;

    public d(i23.e eVar) {
        this.f288078d = eVar;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        b23.a state = (b23.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        b23.f fVar = (b23.f) state.a(b23.f.class);
        if (fVar != null) {
            i23.e eVar = this.f288078d;
            boolean isTeenMode = eVar.f288079d.f302235a.isTeenMode();
            boolean z17 = fVar.f17391b;
            if (!isTeenMode) {
                qv4.j jVar = eVar.f288079d;
                nv4.e eVar2 = jVar.f302236b;
                if (eVar2 != null) {
                    eVar2.f340723f = z17;
                    if (z17) {
                        eVar2.f340721d.post(new nv4.d(eVar2));
                    }
                }
                android.view.ViewGroup viewGroup = jVar.f302237c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(z17 ? 0 : 8);
                }
            }
            android.view.View view = eVar.f288080e;
            if (view != null) {
                int i17 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/teach/FTSGlobalTeachUIC", "updateSettingVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/teach/FTSGlobalTeachUIC", "updateSettingVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (fVar.f17392c != b23.e.f17389e) {
                androidx.appcompat.app.AppCompatActivity activity = eVar.getActivity();
                com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = activity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) activity : null;
                if (fTSMainUI == null) {
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEducationVisible: visible: ");
                sb6.append(z17 ? "true" : "false");
                sb6.append(", isQueryEmpty: ");
                sb6.append(fTSMainUI.T ? "true" : "false");
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", sb6.toString());
                fTSMainUI.r7(z17);
            }
        }
    }
}
