package ir2;

/* loaded from: classes2.dex */
public final class j1 implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f294161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f294162b;

    public j1(ir2.p1 p1Var, int i17) {
        this.f294161a = p1Var;
        this.f294162b = i17;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "handleState: onItemRangeChanged position:" + i17 + " count:" + i18 + " payload:" + obj);
        ym5.m1 m1Var = this.f294161a.f294206a.f294098n;
        if (m1Var != null) {
            m1Var.onItemRangeChanged(i17, i18, obj);
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "handleState: onItemRangeInserted position:" + i17 + " count:" + i18);
        ym5.m1 m1Var = this.f294161a.f294206a.f294098n;
        if (m1Var != null) {
            m1Var.onItemRangeInserted(i17, i18);
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "handleState: onItemRangeRemoved position:" + i17 + " count:" + i18);
        ym5.m1 m1Var = this.f294161a.f294206a.f294098n;
        if (m1Var != null) {
            m1Var.onItemRangeRemoved(i17, i18);
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleState: onItemRangeMoved fromPosition:");
        sb6.append(i17);
        sb6.append(" toPosition:");
        sb6.append(i18);
        sb6.append(" count：");
        int i19 = this.f294162b;
        sb6.append(i19);
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", sb6.toString());
        ym5.m1 m1Var = this.f294161a.f294206a.f294098n;
        if (m1Var != null) {
            m1Var.onItemRangeMoved(i17, i18, i19);
        }
    }
}
