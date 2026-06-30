package ny2;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny2.h f341429d;

    public f(ny2.h hVar) {
        this.f341429d = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.le2 le2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/uic/FinderLiveAnchorEditVoteUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ny2.h hVar = this.f341429d;
        hVar.f341438n.a();
        ky2.w wVar = hVar.f341434g;
        ky2.r rVar = null;
        if (wVar != null) {
            r45.le2 le2Var2 = new r45.le2();
            java.util.List dataList = wVar.f313585e;
            kotlin.jvm.internal.o.f(dataList, "dataList");
            java.util.Iterator it = dataList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ?? next = it.next();
                if ((((ky2.r) next).f313577c == 0) != false) {
                    rVar = next;
                    break;
                }
            }
            ky2.r rVar2 = rVar;
            if (rVar2 != null) {
                ky2.s sVar = rVar2.f313576b;
                le2Var2.set(3, java.lang.Integer.valueOf(sVar.f313579b * 60));
                le2Var2.set(1, sVar.f313580c);
                le2Var2.set(0, java.lang.Integer.valueOf(!sVar.f313578a ? 1 : 0));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : dataList) {
                if ((((ky2.r) obj).f313577c == 2) != false) {
                    arrayList2.add(obj);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ky2.r rVar3 = (ky2.r) it6.next();
                java.lang.String str = rVar3.f313575a;
                if ((str == null || str.length() == 0) == false) {
                    java.util.LinkedList list = le2Var2.getList(2);
                    r45.m30 m30Var = new r45.m30();
                    m30Var.set(0, rVar3.f313575a);
                    list.add(m30Var);
                }
            }
            le2Var = le2Var2;
        } else {
            le2Var = null;
        }
        pq5.g l17 = new ly2.b(hVar.f341435h, hVar.f341436i, hVar.f341437m, le2Var, 0).l();
        l17.K(new ny2.e(hVar));
        androidx.appcompat.app.AppCompatActivity activity = hVar.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) activity);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/uic/FinderLiveAnchorEditVoteUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
