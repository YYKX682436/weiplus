package xj1;

/* loaded from: classes7.dex */
public final class b0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f454780d;

    /* renamed from: e, reason: collision with root package name */
    public final xj1.d0 f454781e;

    public b0(java.util.ArrayList dataList, xj1.d0 d0Var) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f454780d = dataList;
        this.f454781e = d0Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f454780d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) this.f454780d.get(i17);
        return (localUsageInfo.f76361d + localUsageInfo.f76363f).hashCode();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        xj1.h0 holder = (xj1.h0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f454780d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        holder.i((com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) obj);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488049fg, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new xj1.h0(inflate, this.f454781e);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        xj1.h0 holder = (xj1.h0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        boolean isEmpty = payloads.isEmpty();
        java.util.ArrayList arrayList = this.f454780d;
        if (!isEmpty) {
            java.lang.Object obj = payloads.get(0);
            android.os.Bundle bundle = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            if (bundle != null && !bundle.isEmpty()) {
                java.lang.Object obj2 = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                holder.f454800m = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) obj2;
                if (bundle.get("icon") != null) {
                    l01.b bVar = l01.d0.f314761a;
                    com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = holder.f454800m;
                    kotlin.jvm.internal.o.d(localUsageInfo);
                    bVar.b(holder.f454796f, localUsageInfo.f76368n, l01.a.h(), l01.q0.f314787d);
                }
                if (bundle.get("nick_name") != null) {
                    holder.j();
                    return;
                }
                return;
            }
        }
        java.lang.Object obj3 = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj3, "get(...)");
        holder.i((com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) obj3);
    }
}
