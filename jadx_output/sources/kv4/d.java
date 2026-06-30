package kv4;

/* loaded from: classes.dex */
public final class d extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f312691d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f312692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.View v17) {
        super(v17);
        kotlin.jvm.internal.o.g(v17, "v");
        this.f312691d = v17;
        android.view.View findViewById = v17.findViewById(com.tencent.mm.R.id.u2t);
        kotlin.jvm.internal.o.d(findViewById);
        ((android.widget.TextView) findViewById).setText(com.tencent.mm.R.string.o4i);
        java.util.List i17 = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.id.f485079tz3), java.lang.Integer.valueOf(com.tencent.mm.R.id.f485078tz2));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i17, 10));
        java.util.Iterator it = i17.iterator();
        while (it.hasNext()) {
            android.view.View findViewById2 = v17.findViewById(((java.lang.Number) it.next()).intValue());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/websearch/teach/base/box/FTSGlobalTeachHotSearchTitleViewHolder", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/websearch/teach/base/box/FTSGlobalTeachHotSearchTitleViewHolder", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            arrayList.add(jz5.f0.f302826a);
        }
        this.f312692e = jz5.h.b(new kv4.c(v17));
    }
}
