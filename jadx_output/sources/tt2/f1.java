package tt2;

/* loaded from: classes3.dex */
public final class f1 extends tt2.e1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context, boolean z17, gk2.e liveData) {
        super(context, z17, liveData, 2);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
    }

    @Override // tt2.e1, in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 != 10) {
            return super.z(parent, i17);
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488987dt4, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new tt2.k(inflate);
    }
}
