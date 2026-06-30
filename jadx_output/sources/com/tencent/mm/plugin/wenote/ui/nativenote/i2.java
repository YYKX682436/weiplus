package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.j2 f188216d;

    public i2(com.tencent.mm.plugin.wenote.ui.nativenote.j2 j2Var) {
        this.f188216d = j2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("WNNoteBanner", "click WNNoteBanner");
        iz4.r a17 = mz4.b0.c().a();
        if (a17 != null) {
            cz4.f.w0(a17, false);
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mars.xlog.Log.i("WNNoteBanner", "keepTopItem is null");
            this.f188216d.k(8);
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
