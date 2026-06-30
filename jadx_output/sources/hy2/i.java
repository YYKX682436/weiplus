package hy2;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM f286060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f286061e;

    public i(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM, boolean z17) {
        this.f286060d = finderTeenModeLimitVM;
        this.f286061e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f286060d.f136732f.iterator();
        while (it.hasNext()) {
            hy2.e eVar = (hy2.e) ((iz2.a) it.next());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEnjoyFinderOverLimit ");
            hy2.f fVar = eVar.f286054a;
            sb6.append(fVar.f286055d);
            com.tencent.mars.xlog.Log.i("FinderTeenModeFloatPageUIC", sb6.toString());
            if (!fVar.f286055d) {
                jz2.x0.f302754a.b(fVar.getActivity());
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_is_curfew", this.f286061e);
                intent.putExtra("key_finder_teen_mode_scene", fVar.f286057f);
                intent.setClass(fVar.getActivity(), com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI.class);
                fVar.getActivity().startActivityForResult(intent, 11111);
            }
        }
    }
}
