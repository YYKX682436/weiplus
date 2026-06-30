package io;

/* loaded from: classes5.dex */
public final class l extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f293414d;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f293414d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        mf5.c cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f293414d;
        if (list == null || (cVar = (mf5.c) kz5.n0.a0(list, i17)) == null) {
            return;
        }
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.q0f);
        q31.n nVar = tag instanceof q31.n ? (q31.n) tag : null;
        if (nVar == null) {
            return;
        }
        nVar.b(cVar);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
        io.j jVar = new io.j();
        jVar.f293413c = null;
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View a17 = jVar.a(context);
        a17.setTag(com.tencent.mm.R.id.q0f, jVar);
        android.view.ViewGroup.LayoutParams layoutParams = a17.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams = new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2);
        }
        a17.setLayoutParams(layoutParams);
        return new io.k(a17);
    }
}
