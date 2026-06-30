package ws3;

/* loaded from: classes9.dex */
public class g implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView f449176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws3.j f449177e;

    public g(ws3.j jVar, com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView instantAutoCompleteTextView) {
        this.f449177e = jVar;
        this.f449176d = instantAutoCompleteTextView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        ws3.j jVar = this.f449177e;
        jVar.f449182b = jVar.f449184d.getItem(i17);
        if (jVar.f449182b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CommonHintViewConfig", "onItemClick record.record " + jVar.f449182b.f439875a + ", record.name " + jVar.f449182b.f439876b);
            jVar.f449185e = true;
            jVar.b(jVar.f449182b);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.CommonHintViewConfig", "record is null");
        }
        this.f449176d.dismissDropDown();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
