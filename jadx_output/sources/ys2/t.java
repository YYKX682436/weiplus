package ys2;

/* loaded from: classes3.dex */
public final class t extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.x f465192d;

    public t(ys2.x xVar) {
        this.f465192d = xVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return x().size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ys2.s holder = (ys2.s) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.w94 fragment = (r45.w94) x().get(i17);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        int integer = fragment.getInteger(0);
        no0.l lVar = no0.m.f338730a;
        holder.f465188f.setText(integer >= 3600 ? no0.l.a(lVar, integer, ":", true, false, false, 24, null) : no0.l.a(lVar, integer, ":", false, false, false, 24, null));
        holder.f465190h.setText(fragment.getString(1));
        holder.f465189g.setOnClickListener(new ys2.p(holder.f465191i.f465192d, fragment));
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(fragment.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f));
        a17.f447873d = new ys2.r(holder);
        a17.f();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.d_i, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new ys2.s(this, inflate);
    }

    public final java.util.List x() {
        java.util.LinkedList list;
        ys2.x xVar = this.f465192d;
        r45.i72 i72Var = (r45.i72) ((mm2.e1) xVar.business(mm2.e1.class)).f328988r.getCustom(44);
        if (i72Var == null || (list = i72Var.getList(7)) == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((r45.w94) obj).getInteger(0) <= ((ct2.j) xVar.business(ct2.j.class)).S6()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
