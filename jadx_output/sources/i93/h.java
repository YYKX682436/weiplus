package i93;

/* loaded from: classes11.dex */
public class h implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI f289750d;

    public h(com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI labelSearchUI) {
        this.f289750d = labelSearchUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.LabelSearchUI", "onSearchChange: %s", str);
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI activity = this.f289750d;
        if (isEmpty) {
            activity.f143386d.setVisibility(4);
        } else {
            activity.f143386d.setVisibility(0);
        }
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.profile.RepairerConfigLabelSearchByContact()) == 1) {
            kotlin.jvm.internal.o.g(activity, "activity");
            i93.d dVar = (i93.d) pf5.z.f353948a.a(activity).a(i93.d.class);
            dVar.getClass();
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(dVar.f289725e);
            p13.c cVar = dVar.f289725e;
            if (cVar != null) {
                cVar.n();
            }
            p13.u uVar = new p13.u();
            uVar.f351140b = 100;
            uVar.f351141c = str;
            uVar.f351145g = o13.d.f342226l;
            uVar.f351151m = dVar;
            uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) dVar.f289724d).getValue();
            dVar.f289725e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSLabelSearchUIC", "SearchLabelByContact searchLabel: %s", str);
        } else {
            i93.e eVar = activity.f143394o;
            android.util.SparseArray sparseArray = eVar.f289743w;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = str == null ? "" : str;
            eVar.f289738r = str2;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                eVar.z(eVar.f289736p);
            } else {
                eVar.z(b93.r.wi().K1(str));
            }
        }
        if (activity.f143389g == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (arrayList = activity.f143394o.f289727d) != null && arrayList.size() != 0) {
                android.view.View view = activity.f143396q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$3", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$3", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            activity.f143393n.setText(activity.getResources().getString(com.tencent.mm.R.string.f490493wm));
            activity.f143392m = false;
            android.view.View view2 = activity.f143396q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$3", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$3", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f289750d.f143397r;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
