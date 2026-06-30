package vm2;

/* loaded from: classes10.dex */
public final class j extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final vm2.f f438093e;

    public j(vm2.f callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f438093e = callback;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ec8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vm2.k item = (vm2.k) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.tpr);
        int i19 = item.f438094d;
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.tpv);
            if (findViewById != null) {
                findViewById.setOnClickListener(null);
            }
            if (i19 == 1) {
                viewGroup.setVisibility(0);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new vm2.i(this));
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.tps);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(i19 == 2 ? 0 : 8);
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.tpt);
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(i19 != 3 ? 8 : 0);
        }
    }
}
