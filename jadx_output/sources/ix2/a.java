package ix2;

/* loaded from: classes15.dex */
public final class a extends lr.z {
    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // lr.z, androidx.recyclerview.widget.f2
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public lr.s0 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.agh, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new lr.b1(inflate, this.f320620g);
        }
        android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.agh, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new lr.b1(inflate2, this.f320620g);
    }
}
