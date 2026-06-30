package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes12.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.p0 f144854d;

    public n0(com.tencent.mm.plugin.location.ui.impl.p0 p0Var) {
        this.f144854d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        za3.b1 b1Var = this.f144854d.Z;
        android.content.Context context = b1Var.f470892a;
        android.content.res.Resources resources = b1Var.f470894c;
        db5.e1.A(context, resources.getString(com.tencent.mm.R.string.ggz), "", resources.getString(com.tencent.mm.R.string.f490388tl), resources.getString(com.tencent.mm.R.string.f490347sg), new za3.x0(b1Var), new za3.y0(b1Var));
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
