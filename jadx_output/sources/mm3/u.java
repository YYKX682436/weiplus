package mm3;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.w f329675d;

    public u(mm3.w wVar) {
        this.f329675d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mm3.w wVar = this.f329675d;
        yz5.p pVar = wVar.f329679p;
        java.util.Iterator it = wVar.f329678o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((fm3.b) obj).f264028a, wVar.f329681r)) {
                    break;
                }
            }
        }
        pVar.invoke(obj, java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
