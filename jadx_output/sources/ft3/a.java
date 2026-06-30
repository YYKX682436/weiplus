package ft3;

/* loaded from: classes12.dex */
public final class a extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f266542d;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f266542d;
        int size = list != null ? list.size() : 0;
        if (4 > size) {
            return size;
        }
        return 4;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0168  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r16, int r17) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft3.a.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new ft3.b(new em.q0(android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.duw, parent, false)));
    }
}
