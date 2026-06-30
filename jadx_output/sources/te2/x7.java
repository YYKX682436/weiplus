package te2;

/* loaded from: classes3.dex */
public final class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418531d;

    public x7(te2.p8 p8Var) {
        this.f418531d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.s52 s52Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$onSceneEnd$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.sc scVar = te2.sc.f418412a;
        te2.p8 p8Var = this.f418531d;
        int i17 = p8Var.f418329x0;
        java.util.List list = te2.sc.f418414c;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        java.util.Iterator it = arrayList2.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else {
                if (((r45.s52) it.next()).getInteger(0) == i17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (i18 < 0) {
            s52Var = (r45.s52) kz5.n0.Z(list);
        } else {
            int i19 = i18 + 1;
            s52Var = i19 >= arrayList2.size() ? (r45.s52) kz5.n0.Z(list) : (r45.s52) arrayList2.get(i19);
        }
        if (s52Var != null) {
            p8Var.v7(s52Var);
            p8Var.u7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$onSceneEnd$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
