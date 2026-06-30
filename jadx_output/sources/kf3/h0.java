package kf3;

/* loaded from: classes12.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f307354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.k0 f307355e;

    public h0(kf3.k0 k0Var, java.lang.String str) {
        this.f307355e = k0Var;
        this.f307354d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnVoiceClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kf3.k0 k0Var = this.f307355e;
        kf3.i0 i0Var = k0Var.f307382u;
        if (i0Var != null) {
            boolean E = c01.d9.b().E();
            java.lang.String str = "";
            com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI = ((kf3.u0) i0Var).f307450a;
            if (E) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str2 = this.f307354d;
                if (str2 == null) {
                    str2 = "";
                }
                if (massSendHistoryUI.f148530h.c() && str2.equals(massSendHistoryUI.f148528f.f307378q)) {
                    com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.f148525q.a();
                    massSendHistoryUI.f148526d.setKeepScreenOn(false);
                    massSendHistoryUI.f148530h.h(false);
                } else if (massSendHistoryUI.T6(str2)) {
                    str = str2;
                }
            } else {
                db5.t7.k(massSendHistoryUI, null);
            }
            k0Var.f307378q = str;
            k0Var.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnVoiceClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
