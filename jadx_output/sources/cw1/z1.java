package cw1;

/* loaded from: classes12.dex */
public final class z1 implements android.widget.ExpandableListView.OnGroupClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f223531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f223532b;

    public z1(cw1.o0 o0Var, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI) {
        this.f223531a = o0Var;
        this.f223532b = cleanCacheUI;
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public final boolean onGroupClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        cw1.o0 o0Var = this.f223531a;
        java.util.ArrayList arrayList = o0Var.f223190h;
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            int i18 = i17 - 1;
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI = o0Var.f223186d;
            com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView = cleanCacheUI.f95689d;
            kotlin.jvm.internal.o.d(animatedExpandableListView);
            if (animatedExpandableListView.isGroupExpanded(i18)) {
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView2 = cleanCacheUI.f95689d;
                kotlin.jvm.internal.o.d(animatedExpandableListView2);
                animatedExpandableListView2.c(i18);
            } else {
                java.lang.Object obj2 = arrayList.get(i18);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                int intValue2 = ((java.lang.Number) obj2).intValue();
                if (o0Var.f223192j[intValue2] != null) {
                    com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView3 = cleanCacheUI.f95689d;
                    kotlin.jvm.internal.o.d(animatedExpandableListView3);
                    animatedExpandableListView3.d(i18);
                } else {
                    o0Var.f223189g[intValue2] = true;
                }
            }
            o0Var.notifyDataSetChanged();
        } else {
            boolean[] zArr = o0Var.f223188f;
            boolean z17 = !zArr[intValue];
            zArr[intValue] = z17;
            boolean[] zArr2 = o0Var.f223191i[intValue];
            if (zArr2 != null) {
                kz5.v.v(zArr2, z17, 0, 0, 6, null);
            }
            o0Var.notifyDataSetChanged();
        }
        return ((java.lang.Boolean) this.f223532b.f95694i.invoke()).booleanValue();
    }
}
