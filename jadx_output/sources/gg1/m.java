package gg1;

/* loaded from: classes7.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.w f271603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f271604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg1.p f271605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f271606g;

    public m(gg1.w wVar, int i17, gg1.p pVar, int i18) {
        this.f271603d = wVar;
        this.f271604e = i17;
        this.f271605f = pVar;
        this.f271606g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$RecycleViewAdapter$bindDeviceViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gg1.w wVar = this.f271603d;
        if (wVar.f271649v != null) {
            boolean z17 = !wVar.f271635e.f271592e.isEmpty();
            int i17 = this.f271606g;
            gg1.p pVar = this.f271605f;
            int i18 = this.f271604e;
            if (!z17 || i18 > wVar.f271635e.f271592e.size()) {
                yz5.p pVar2 = wVar.f271649v;
                kotlin.jvm.internal.o.d(pVar2);
                pVar2.invoke(pVar.x(i18).f271568a, java.lang.Integer.valueOf(i17));
            } else {
                yz5.p pVar3 = wVar.f271649v;
                kotlin.jvm.internal.o.d(pVar3);
                pVar3.invoke(pVar.x(i18).f271568a, java.lang.Integer.valueOf(i17));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$RecycleViewAdapter$bindDeviceViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
