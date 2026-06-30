package jm3;

/* loaded from: classes10.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c3 f300338d;

    public n0(com.tencent.mm.plugin.mv.ui.uic.c3 c3Var) {
        this.f300338d = c3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$flexTV$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.uic.c3 c3Var = this.f300338d;
        java.lang.Integer num = (java.lang.Integer) c3Var.O6().getValue();
        if (num == null || num.intValue() != 1) {
            c3Var.O6().postValue(1);
            fm3.g0 g0Var = fm3.g0.f264070a;
            fm3.g0.f264071b.D = 1L;
            com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = g0Var.c();
            c17.f59482k = 12L;
            c17.k();
            c17.o();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$flexTV$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
