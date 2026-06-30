package qs1;

/* loaded from: classes8.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public db5.g4 f366212d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f366213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qs1.m f366214f;

    public c(qs1.m mVar) {
        this.f366214f = mVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        db5.g4 g4Var = this.f366212d;
        if (g4Var != null) {
            return g4Var.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r19, int r20) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs1.c.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f366214f.f366228a).inflate(com.tencent.mm.R.layout.dzd, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new qs1.e(inflate);
    }
}
