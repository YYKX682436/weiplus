package pe3;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.h f353657d;

    public g(pe3.h hVar) {
        this.f353657d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoDataUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pe3.h hVar = this.f353657d;
        java.lang.String value = ((android.widget.EditText) hVar.getActivity().findViewById(com.tencent.mm.R.id.gdp)).getText().toString();
        hVar.getClass();
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mm.sdk.platformtools.o4.L().putString("MagicBrushSclDemoDataUIC_data", value);
        java.lang.String value2 = ((android.widget.EditText) hVar.getActivity().findViewById(com.tencent.mm.R.id.gdy)).getText().toString();
        hVar.getClass();
        kotlin.jvm.internal.o.g(value2, "value");
        com.tencent.mm.sdk.platformtools.o4.L().putString("MagicBrushSclDemoDataUIC_name", value2);
        db5.t7.h(hVar.getActivity(), "saved");
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoDataUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
