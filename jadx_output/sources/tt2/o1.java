package tt2;

/* loaded from: classes3.dex */
public final class o1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final ut2.u3 f421976d;

    public o1(ut2.u3 labelHolder) {
        kotlin.jvm.internal.o.g(labelHolder, "labelHolder");
        this.f421976d = labelHolder;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f421976d.f431116f.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r25, int r26) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.o1.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488983dt0, (android.view.ViewGroup) null, false);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(i65.a.b(parent.getContext(), 8));
        inflate.setLayoutParams(marginLayoutParams);
        return new tt2.n1(this, inflate);
    }
}
