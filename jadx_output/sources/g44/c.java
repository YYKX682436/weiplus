package g44;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f268811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f268812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268813f;

    public c(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context, java.lang.String str) {
        this.f268811d = k0Var;
        this.f268812e = context;
        this.f268813f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper$showBottomSheet$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdAddBrandHalfScreenHelper$showBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f268811d;
        if (k0Var.i()) {
            k0Var.u();
        }
        u94.f.f(this.f268812e, this.f268813f);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdAddBrandHalfScreenHelper$showBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper$showBottomSheet$2");
    }
}
