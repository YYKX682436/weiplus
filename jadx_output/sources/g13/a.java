package g13;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i13.c f267570d;

    public a(i13.c cVar) {
        this.f267570d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/convert/BaseMsgCardConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i13.c cVar = this.f267570d;
        cVar.i();
        java.util.ArrayList arrayList2 = k13.l1.I.a().f303239q;
        java.util.Iterator it = arrayList2.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((i13.c) it.next()).f287275d, cVar.f287275d)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 != 0 || arrayList2.size() <= 1) {
            k13.l1.I.a().l(cVar.f287275d);
        } else {
            k13.l1.I.a().p(i17 + 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/convert/BaseMsgCardConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
