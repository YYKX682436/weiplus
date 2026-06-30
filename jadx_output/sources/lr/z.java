package lr;

/* loaded from: classes15.dex */
public class z extends androidx.recyclerview.widget.f2 implements lr.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f320617d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f320618e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f320619f;

    /* renamed from: g, reason: collision with root package name */
    public lr.k0 f320620g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320621h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320622i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320623m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320624n;

    public z(ir.h hVar) {
        this.f320617d = hVar;
        this.f320618e = "MicroMsg.EmojiPanelItemAdapter";
        this.f320619f = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: B */
    public lr.s0 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.util.SparseArray sparseArray = ir.c0.f293820a;
        ir.b0 b0Var = (ir.b0) ir.c0.f293820a.get(i17);
        if (b0Var != null) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bmg, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new to4.c(inflate, ((to4.d) b0Var).f420990a);
        }
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        ir.h hVar = this.f320617d;
        switch (i17) {
            case 1:
                android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.f488734a73, parent, false);
                kotlin.jvm.internal.o.d(inflate2);
                return new lr.b1(inflate2, this.f320620g);
            case 2:
                android.view.View inflate3 = from.inflate(com.tencent.mm.R.layout.f488736a75, parent, false);
                kotlin.jvm.internal.o.d(inflate3);
                return new lr.j1(inflate3, this.f320620g, hVar);
            case 3:
                android.view.View inflate4 = from.inflate(com.tencent.mm.R.layout.co8, parent, false);
                kotlin.jvm.internal.o.d(inflate4);
                return new lr.d0(inflate4, this.f320620g);
            case 4:
                android.view.View inflate5 = from.inflate(com.tencent.mm.R.layout.f488731a70, parent, false);
                kotlin.jvm.internal.o.d(inflate5);
                return new lr.e0(inflate5, this.f320620g);
            case 5:
                android.view.View inflate6 = from.inflate(com.tencent.mm.R.layout.co9, parent, false);
                kotlin.jvm.internal.o.d(inflate6);
                return new lr.s0(inflate6, this.f320620g);
            case 6:
                android.view.View inflate7 = from.inflate(com.tencent.mm.R.layout.a6z, parent, false);
                kotlin.jvm.internal.o.d(inflate7);
                return new lr.d(inflate7, this.f320620g);
            case 7:
                android.view.View inflate8 = from.inflate(com.tencent.mm.R.layout.a6x, parent, false);
                kotlin.jvm.internal.o.d(inflate8);
                return new lr.b(inflate8, this.f320620g);
            case 8:
                android.view.View inflate9 = from.inflate(com.tencent.mm.R.layout.f488733a72, parent, false);
                kotlin.jvm.internal.o.d(inflate9);
                return new lr.g(inflate9, this.f320620g);
            case 9:
                android.view.View inflate10 = from.inflate(com.tencent.mm.R.layout.f488735a74, parent, false);
                kotlin.jvm.internal.o.d(inflate10);
                return new lr.j0(inflate10, this.f320620g);
            case 10:
                return new ir.y(parent, this.f320620g, hVar);
            default:
                android.view.View inflate11 = from.inflate(com.tencent.mm.R.layout.a6y, parent, false);
                kotlin.jvm.internal.o.d(inflate11);
                return new lr.c0(inflate11, this.f320620g);
        }
    }

    public void E(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        java.util.ArrayList<ir.u0> arrayList = this.f320619f;
        arrayList.clear();
        arrayList.addAll(items);
        if (this.f320622i) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (ir.u0 u0Var : arrayList) {
                if (u0Var instanceof ir.a1) {
                    ir.a1 a1Var = (ir.a1) u0Var;
                    if (a1Var.f293815c) {
                        sb6.append(a1Var.f293814b.f274663a + ", ");
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(this.f320618e, "smiley_log recent smiley " + ((java.lang.Object) sb6));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f320619f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        ir.u0 y17 = y(i17);
        if (y17 != null) {
            return y17.f293907a;
        }
        return 0;
    }

    public final void x(int i17, ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f320619f.add(i17, item);
    }

    public ir.u0 y(int i17) {
        return (ir.u0) kz5.n0.a0(this.f320619f, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(lr.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f320619f;
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        ir.u0 u0Var = (ir.u0) obj;
        if (this.f320621h && (u0Var instanceof ir.g)) {
            java.lang.String str = this.f320618e;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = ((ir.g) u0Var).f293836b;
            if (iEmojiInfo != null && kotlin.jvm.internal.o.b("9bd1281af3a31710a45b84d736363691", iEmojiInfo.getMd5())) {
                com.tencent.mars.xlog.Log.i(str, "position hasJSB " + i17);
                this.f320624n = true;
            }
            if (iEmojiInfo != null && kotlin.jvm.internal.o.b("08f223fa83f1ca34e143d1e580252c7c", iEmojiInfo.getMd5())) {
                com.tencent.mars.xlog.Log.i(str, "position hasDice " + i17);
                this.f320623m = true;
            }
            if (i17 > 0 && i17 == arrayList.size() - 1 && (!this.f320623m || !this.f320624n)) {
                com.tencent.mars.xlog.Log.i(str, "no find game from board " + this.f320623m + ", " + this.f320624n);
            }
        }
        holder.i(u0Var);
    }

    public /* synthetic */ z(ir.h hVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : hVar);
    }
}
