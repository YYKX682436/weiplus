package z32;

/* loaded from: classes12.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z32.s f469926d;

    public o(z32.s sVar) {
        this.f469926d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z32.s sVar = this.f469926d;
        if (sVar.getActivity() instanceof com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI) {
            androidx.appcompat.app.AppCompatActivity activity = sVar.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI");
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = (com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI) activity;
            ve4.g.a(17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(exdeviceProfileUI.f99304e);
            gm0.j1.n().f273288b.g(new p32.h(arrayList2, exdeviceProfileUI.H));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
