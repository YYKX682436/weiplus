package h93;

/* loaded from: classes11.dex */
public final class r extends h93.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f279726g;

    /* renamed from: h, reason: collision with root package name */
    public final int f279727h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f279726g = "MicroMsg.RecommendLabelPanel";
        this.f279727h = 1;
    }

    @Override // h93.c
    public int P6() {
        return this.f279727h;
    }

    @Override // h93.c
    public java.lang.String R6() {
        return this.f279726g;
    }

    @Override // h93.c
    public void S6() {
        java.util.List list;
        super.S6();
        android.view.View V6 = V6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById = V6().findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(com.tencent.mm.R.string.f492379o75);
        O6().e();
        O6().setMaxLineLimit(2);
        java.lang.String str = this.f279694d;
        if (str != null) {
            com.tencent.mm.storage.h4 wi6 = b93.r.wi();
            if (wi6 != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                p75.d dVar = dm.g2.f237032s;
                linkedList.add(dVar.u());
                linkedList.add(dm.g2.f237030q.u());
                p75.i0 h17 = dm.g2.f237027n.h(dm.g2.f237029p);
                p75.y yVar = (p75.y) new p75.z0(dVar.z()).c(dVar.q(0));
                yVar.f(dm.g2.f237031r.i(0));
                h17.f352657d = yVar;
                h17.f352659f = linkedList;
                java.util.List l17 = h17.a().l(wi6.f195002d);
                list = kz5.n0.V(((java.util.ArrayList) l17).isEmpty() ? new java.util.ArrayList() : new java.util.ArrayList(l17));
            } else {
                list = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load labelsByLastUse: ");
            sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
            com.tencent.mars.xlog.Log.i(this.f279726g, sb6.toString());
            if (list == null || list.isEmpty()) {
                list = kz5.p0.f313996d;
            }
            if (true ^ list.isEmpty()) {
                O6().r(Q6().O6(), kz5.n0.K0(list, 5));
                O6().v(this.f279695e, str, "2", 33926);
                android.view.View V62 = V6();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "initRecommendLabels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "initRecommendLabels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // h93.c
    public void T6(java.util.ArrayList selectedList) {
        kotlin.jvm.internal.o.g(selectedList, "selectedList");
        O6().setTagsSelected(selectedList);
    }

    @Override // h93.c
    public void U6(java.lang.String keyword, java.util.List list) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        if (list != null) {
            android.view.View V6 = V6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean z17 = O6().getTagCount() > 0;
        android.view.View V62 = V6();
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public android.view.View V6() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.u8k);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // h93.c
    /* renamed from: W6, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.label.ui.widget.MMLabelPanel O6() {
        android.view.View findViewById = V6().findViewById(com.tencent.mm.R.id.u8i);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.plugin.label.ui.widget.MMLabelPanel) findViewById;
    }
}
