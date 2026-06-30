package cw1;

/* loaded from: classes12.dex */
public final class a2 implements android.widget.ExpandableListView.OnChildClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f222716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f222717b;

    public a2(cw1.o0 o0Var, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI) {
        this.f222716a = o0Var;
        this.f222717b = cleanCacheUI;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public final boolean onChildClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, int i18, long j17) {
        cw1.o0 o0Var = this.f222716a;
        java.lang.Object obj = o0Var.f223190h.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        boolean[] zArr = o0Var.f223191i[intValue];
        kotlin.jvm.internal.o.d(zArr);
        boolean z17 = true;
        boolean z18 = !zArr[i18];
        zArr[i18] = z18;
        boolean z19 = false;
        if (z18) {
            int length = zArr.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    break;
                }
                if (!zArr[i19]) {
                    z17 = false;
                    break;
                }
                i19++;
            }
            z19 = z17;
        }
        o0Var.f223188f[intValue] = z19;
        o0Var.notifyDataSetChanged();
        return ((java.lang.Boolean) this.f222717b.f95694i.invoke()).booleanValue();
    }
}
