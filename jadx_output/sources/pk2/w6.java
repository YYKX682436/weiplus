package pk2;

/* loaded from: classes3.dex */
public final class w6 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public db5.g4 f356329d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f356330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.c7 f356331f;

    public w6(pk2.c7 c7Var) {
        this.f356331f = c7Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        db5.g4 g4Var = this.f356329d;
        if (g4Var != null) {
            return g4Var.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r22, int r23) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.w6.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f356331f.f355618a).inflate(com.tencent.mm.R.layout.aor, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new pk2.x6(inflate);
    }
}
