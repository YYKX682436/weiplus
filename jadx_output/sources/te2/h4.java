package te2;

/* loaded from: classes3.dex */
public final class h4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f418056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418057e;

    public h4(te2.p8 p8Var, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f418057e = p8Var;
        this.f418056d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        te2.sc scVar = te2.sc.f418412a;
        return ((java.util.ArrayList) te2.sc.f418414c).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        te2.f4 holder = (te2.f4) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        te2.sc scVar = te2.sc.f418412a;
        java.util.List list = te2.sc.f418414c;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        r45.s52 s52Var = arrayList.size() <= i17 ? (r45.s52) kz5.n0.Z(list) : (r45.s52) arrayList.get(i17);
        if (s52Var == null) {
            s52Var = new r45.s52();
        }
        android.widget.ImageView imageView = holder.f417998e;
        int integer = s52Var.getInteger(1);
        te2.p8 p8Var = this.f418057e;
        if (integer == 1) {
            ya2.b2 b2Var = p8Var.f418335z1;
            if (b2Var != null) {
                if (!(b2Var.D0().length() > 0)) {
                    b2Var = null;
                }
                if (b2Var != null) {
                    i95.m c17 = i95.n0.c(vd2.i5.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    vd2.i5.l7((vd2.i5) c17, b2Var.getAvatarUrl(), imageView, null, 4, null);
                }
            }
        } else {
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(s52Var.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
        }
        holder.f417998e.setOnClickListener(new te2.g4(p8Var, s52Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f418056d).inflate(com.tencent.mm.R.layout.eay, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new te2.f4(this, inflate);
    }
}
