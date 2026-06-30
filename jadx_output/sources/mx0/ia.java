package mx0;

/* loaded from: classes5.dex */
public final class ia extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f332055d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f332056e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f332057f = true;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.ja f332058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mx0.aa f332059h;

    public ia(mx0.ja jaVar, mx0.aa aaVar) {
        this.f332058g = jaVar;
        this.f332059h = aaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kz5.p0 p0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "onScrollStateChanged lastState = " + this.f332055d + ", newState = " + i17);
        this.f332055d = i17;
        mx0.ja jaVar = this.f332058g;
        if (!jaVar.f332088t) {
            this.f332057f = false;
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (i17 == 0) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            android.view.View f17 = this.f332059h.f(linearLayoutManager);
            if (f17 == null) {
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            androidx.recyclerview.widget.k3 q07 = jaVar.f332075d.q0(linearLayoutManager.getPosition(f17), false);
            mx0.ba baVar = q07 instanceof mx0.ba ? (mx0.ba) q07 : null;
            if (baVar == null) {
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            java.util.ArrayList arrayList2 = jaVar.f332081m;
            java.util.Iterator it = arrayList2.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(((vt3.p) it.next()).f440020b, baVar.f331859d)) {
                    break;
                } else {
                    i18++;
                }
            }
            int i19 = i18;
            int size = arrayList2.size();
            int i27 = size - i19;
            mx0.z zVar = jaVar.f332078g;
            if (i27 < 3) {
                java.util.Map map = this.f332056e;
                java.lang.Object obj = ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(size));
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!kotlin.jvm.internal.o.b(obj, bool)) {
                    map.put(java.lang.Integer.valueOf(size), bool);
                    yx0.b8 b8Var = ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar).f69557v;
                    kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.f3(b8Var, null), 3, null);
                }
            }
            java.lang.Integer num = jaVar.f332079h;
            if (num != null && i19 == num.intValue()) {
                this.f332057f = false;
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            boolean z17 = this.f332057f;
            jz5.g gVar = jaVar.f332087s;
            if (!z17 && kotlin.jvm.internal.o.b(baVar.f331859d, "kEmptyTemplateId")) {
                int intValue = ((java.lang.Number) gVar.getValue()).intValue();
                if (intValue <= size) {
                    size = intValue;
                }
                java.util.List<vt3.p> subList = arrayList2.subList(0, size);
                kotlin.jvm.internal.o.f(subList, "subList(...)");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(subList, 10));
                for (vt3.p pVar : subList) {
                    arrayList3.add(new jz5.l(pVar.f440020b, java.lang.Long.valueOf(pVar.f440023e)));
                }
                mx0.ja.a(jaVar);
                com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar;
                shootComposingPluginLayout.getClass();
                if (!shootComposingPluginLayout.I1) {
                    kotlinx.coroutines.l.d(shootComposingPluginLayout.getScope(), null, null, new mx0.k9(false, shootComposingPluginLayout, arrayList3, null), 3, null);
                }
                this.f332057f = false;
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            this.f332057f = false;
            vt3.p pVar2 = (vt3.p) kz5.n0.a0(arrayList2, i19);
            if (pVar2 == null) {
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            jaVar.c(i19);
            int i28 = i19 + 1;
            int intValue2 = ((java.lang.Number) gVar.getValue()).intValue() + i28;
            if (intValue2 <= size) {
                size = intValue2;
            }
            if (i28 < size) {
                java.util.List<vt3.p> subList2 = arrayList2.subList(i28, size);
                kotlin.jvm.internal.o.f(subList2, "subList(...)");
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(subList2, 10));
                for (vt3.p pVar3 : subList2) {
                    arrayList4.add(new jz5.l(pVar3.f440020b, java.lang.Long.valueOf(pVar3.f440023e)));
                }
                p0Var = arrayList4;
            } else {
                p0Var = kz5.p0.f313996d;
            }
            ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar).T0(pVar2, i19, 0L, p0Var);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        e06.k kVar = new e06.k(w17, ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).y());
        if (kotlin.jvm.internal.o.b(this.f332058g.f332082n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE))) {
            int i19 = kVar.f246210e;
            if (w17 <= i19) {
                while (true) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "onTemplateVisibleAt: " + w17);
                    this.f332058g.f332080i.M(w17);
                    if (w17 == i19) {
                        break;
                    } else {
                        w17++;
                    }
                }
            }
        } else {
            java.util.Iterator it = kz5.n0.G0(kVar, this.f332058g.f332082n).iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "onTemplateVisibleAt: " + intValue);
                this.f332058g.f332080i.M(intValue);
            }
            java.util.Iterator it6 = kz5.n0.G0(this.f332058g.f332082n, kVar).iterator();
            while (it6.hasNext()) {
                int intValue2 = ((java.lang.Number) it6.next()).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "onTemplateInvisibleAt: " + intValue2);
                java.lang.String B = this.f332058g.f332080i.B(intValue2);
                if (B != null) {
                    yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                    m7Var.getClass();
                    kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.b6(m7Var, B, null), 3, null);
                }
            }
        }
        this.f332058g.f332082n = kVar;
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
