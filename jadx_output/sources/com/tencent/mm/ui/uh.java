package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class uh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xh f211092e;

    public uh(com.tencent.mm.ui.xh xhVar, int i17) {
        this.f211092e = xhVar;
        this.f211091d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ServiceNotifySettingsUI$DefaultAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = (java.lang.String) view.getTag();
        if (android.text.TextUtils.isEmpty(str)) {
            yj0.a.h(this, "com/tencent/mm/ui/ServiceNotifySettingsUI$DefaultAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Context context = view.getContext();
        int i17 = this.f211091d;
        db5.e1.l(context, i17 == 1 ? com.tencent.mm.R.string.f492654hd2 : com.tencent.mm.R.string.f492657hd5, 0, i17 == 1 ? com.tencent.mm.R.string.f492655hd3 : com.tencent.mm.R.string.f490507x1, com.tencent.mm.R.string.aq7, false, new com.tencent.mm.ui.sh(this, str), new com.tencent.mm.ui.th(this), com.tencent.mm.R.color.f479206su);
        yj0.a.h(this, "com/tencent/mm/ui/ServiceNotifySettingsUI$DefaultAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
