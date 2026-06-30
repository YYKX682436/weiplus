package xx0;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f457934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx0.t f457935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f457936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vt3.p f457937g;

    public s(int i17, xx0.t tVar, long j17, vt3.p pVar) {
        this.f457934d = i17;
        this.f457935e = tVar;
        this.f457936f = j17;
        this.f457937g = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ?? r17;
        mx0.ja templateUIPlugin;
        mx0.ja templateUIPlugin2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = true;
        int i17 = this.f457934d + 1;
        int i18 = i17 + 1;
        xx0.t tVar = this.f457935e;
        int size = ((java.util.ArrayList) tVar.f457941g).size();
        if (i18 > size) {
            i18 = size;
        }
        if (i17 < i18) {
            java.util.List<vt3.p> subList = ((java.util.ArrayList) tVar.f457941g).subList(i17, i18);
            r17 = new java.util.ArrayList(kz5.d0.q(subList, 10));
            for (vt3.p pVar : subList) {
                r17.add(new jz5.l(pVar.f440020b, java.lang.Long.valueOf(pVar.f440023e)));
            }
        } else {
            r17 = kz5.p0.f313996d;
        }
        java.util.List list = r17;
        xx0.j jVar = tVar.f457939e;
        if (jVar != null) {
            long j17 = this.f457936f;
            int i19 = this.f457934d;
            mx0.x7 x7Var = (mx0.x7) jVar;
            vt3.p templateItem = this.f457937g;
            kotlin.jvm.internal.o.g(templateItem, "templateItem");
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = x7Var.f332435a;
            templateUIPlugin = shootComposingPluginLayout.getTemplateUIPlugin();
            templateUIPlugin.getClass();
            java.util.ArrayList arrayList2 = templateUIPlugin.f332081m;
            boolean z18 = arrayList2 instanceof java.util.Collection;
            java.lang.String templateId = templateItem.f440020b;
            if (!z18 || !arrayList2.isEmpty()) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((vt3.p) it.next()).f440020b, templateId)) {
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                arrayList2.add(0, templateItem);
                mx0.t9 t9Var = templateUIPlugin.f332080i;
                t9Var.getClass();
                java.util.ArrayList arrayList3 = t9Var.f332358f;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                t9Var.notifyDataSetChanged();
            }
            templateUIPlugin2 = shootComposingPluginLayout.getTemplateUIPlugin();
            templateUIPlugin2.getClass();
            kotlin.jvm.internal.o.g(templateId, "templateId");
            java.util.Iterator it6 = templateUIPlugin2.f332081m.iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i27 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(((vt3.p) it6.next()).f440020b, templateId)) {
                    break;
                } else {
                    i27++;
                }
            }
            templateUIPlugin2.c(i27 >= 0 ? i27 : 0);
            x7Var.f332435a.T0(templateItem, i19, j17, list);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
