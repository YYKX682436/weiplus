package yr3;

/* loaded from: classes11.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.l5 f464720d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f464721e;

    /* renamed from: f, reason: collision with root package name */
    public final wr3.i f464722f;

    /* renamed from: g, reason: collision with root package name */
    public final int f464723g;

    /* renamed from: h, reason: collision with root package name */
    public final wr3.n0 f464724h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f464725i;

    /* renamed from: m, reason: collision with root package name */
    public final int f464726m;

    public b(r45.l5 baseInfo, java.util.ArrayList dataList, wr3.i outAdapter, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(outAdapter, "outAdapter");
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        this.f464720d = baseInfo;
        this.f464721e = dataList;
        this.f464722f = outAdapter;
        this.f464723g = i17;
        this.f464724h = itemStatus;
        this.f464725i = z17;
        this.f464726m = i18;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f464721e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((yr3.c) this.f464721e.get(i17)).f464733a.f464891d;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = holder instanceof yr3.a;
        java.util.ArrayList arrayList = this.f464721e;
        if (z17) {
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            ((yr3.a) holder).i((yr3.c) obj, i17, this.f464724h, this.f464725i, this.f464726m);
        } else if ((holder instanceof yr3.e) && ((yr3.c) arrayList.get(i17)).f464735c != null) {
            yr3.e eVar = (yr3.e) holder;
            r45.s5 s5Var = ((yr3.c) arrayList.get(i17)).f464735c;
            kotlin.jvm.internal.o.d(s5Var);
            wr3.n0 itemStatus = this.f464724h;
            kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
            java.lang.String string = eVar.f464782e.getResources().getString(com.tencent.mm.R.string.am6);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(s5Var.f385514i.f382754e.size() - 3)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            ((android.widget.TextView) eVar.itemView.findViewById(com.tencent.mm.R.id.dy_)).setText(format);
            eVar.itemView.setOnClickListener(new yr3.d(s5Var, eVar));
        }
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.dyu);
        if (arrayList.size() == 1) {
            if (findViewById != null) {
                findViewById.setPadding(x(16), x(4), x(16), x(20));
            }
        } else if (i17 == 0) {
            if (findViewById != null) {
                findViewById.setPadding(x(16), x(4), x(16), x(16));
            }
        } else {
            if (i17 != arrayList.size() - 1 || findViewById == null) {
                return;
            }
            findViewById.setPadding(x(16), x(16), x(16), x(20));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        yr3.j1 j1Var = yr3.j1.f464879e;
        r45.l5 l5Var = this.f464720d;
        wr3.i iVar = this.f464722f;
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0m, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new yr3.u0(inflate, iVar, l5Var);
        }
        yr3.j1 j1Var2 = yr3.j1.f464879e;
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0l, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new yr3.t0(inflate2, iVar, l5Var);
        }
        yr3.j1 j1Var3 = yr3.j1.f464879e;
        if (i17 == 7) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0i, parent, false);
            kotlin.jvm.internal.o.d(inflate3);
            return new yr3.s0(inflate3, iVar, l5Var);
        }
        yr3.j1 j1Var4 = yr3.j1.f464879e;
        if (i17 == 3) {
            android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0n, parent, false);
            kotlin.jvm.internal.o.d(inflate4);
            return new yr3.k1(inflate4, iVar, l5Var);
        }
        yr3.j1 j1Var5 = yr3.j1.f464879e;
        if (i17 == 5) {
            android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0p, parent, false);
            kotlin.jvm.internal.o.d(inflate5);
            return new yr3.o1(inflate5, iVar, l5Var);
        }
        yr3.j1 j1Var6 = yr3.j1.f464879e;
        if (i17 == 4) {
            android.view.View inflate6 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0q, parent, false);
            kotlin.jvm.internal.o.d(inflate6);
            return new yr3.p1(inflate6, iVar, l5Var);
        }
        yr3.j1 j1Var7 = yr3.j1.f464879e;
        if (i17 == 6) {
            android.view.View inflate7 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0r, parent, false);
            kotlin.jvm.internal.o.d(inflate7);
            return new yr3.s1(inflate7, iVar, l5Var);
        }
        yr3.j1 j1Var8 = yr3.j1.f464879e;
        if (i17 == 8) {
            android.view.View inflate8 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0o, parent, false);
            kotlin.jvm.internal.o.d(inflate8);
            return new yr3.n1(inflate8, iVar, l5Var);
        }
        yr3.j1 j1Var9 = yr3.j1.f464879e;
        if (i17 == 9) {
            android.view.View inflate9 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dnn, parent, false);
            kotlin.jvm.internal.o.d(inflate9);
            return new yr3.i1(inflate9, iVar, l5Var);
        }
        yr3.j1 j1Var10 = yr3.j1.f464879e;
        if (i17 == 99) {
            android.view.View inflate10 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0h, parent, false);
            kotlin.jvm.internal.o.d(inflate10);
            return new yr3.e(inflate10, iVar, this.f464723g);
        }
        yr3.j1 j1Var11 = yr3.j1.f464879e;
        if (i17 == 10) {
            android.view.View inflate11 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dpt, parent, false);
            kotlin.jvm.internal.o.d(inflate11);
            return new yr3.t1(inflate11, iVar, l5Var);
        }
        android.view.View inflate12 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0n, parent, false);
        kotlin.jvm.internal.o.d(inflate12);
        return new yr3.k1(inflate12, iVar, l5Var);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 holder) {
        r45.s5 s5Var;
        java.util.LinkedList linkedList;
        r45.o5 o5Var;
        java.util.LinkedList linkedList2;
        r45.o5 o5Var2;
        java.util.LinkedList linkedList3;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int adapterPosition = holder.getAdapterPosition();
        if (adapterPosition >= 0) {
            java.util.ArrayList arrayList = this.f464721e;
            if (adapterPosition < arrayList.size() && (s5Var = ((yr3.c) arrayList.get(adapterPosition)).f464735c) != null) {
                r45.p5 p5Var = s5Var.f385514i;
                if (((p5Var == null || (linkedList3 = p5Var.f382754e) == null) ? 0 : linkedList3.size()) > 0) {
                    wr3.i iVar = this.f464722f;
                    wr3.j jVar = iVar.f448814d;
                    if (((java.util.HashSet) jVar.f448822a).contains(jVar.a(s5Var.f385514i.f382753d.f379138d, java.lang.Integer.valueOf(adapterPosition)))) {
                        return;
                    }
                    r45.p5 p5Var2 = s5Var.f385514i;
                    java.lang.Long l17 = null;
                    android.content.Intent intent = null;
                    l17 = null;
                    l17 = null;
                    java.lang.String str = (p5Var2 == null || (linkedList2 = p5Var2.f382754e) == null || (o5Var2 = (r45.o5) linkedList2.get(0)) == null) ? null : o5Var2.f381917h;
                    if (this.f464725i) {
                        gr3.b bVar = gr3.b.f274847a;
                        java.lang.Long valueOf = java.lang.Long.valueOf(s5Var.f385509d.f390790d);
                        r45.p5 p5Var3 = s5Var.f385514i;
                        if (p5Var3 != null && (linkedList = p5Var3.f382754e) != null && (o5Var = (r45.o5) linkedList.get(0)) != null) {
                            l17 = java.lang.Long.valueOf(o5Var.f381916g);
                        }
                        bVar.b(valueOf, l17, 101L, bVar.a(this.f464724h), (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : str, this.f464726m, (r29 & 128) != 0 ? 0 : !iVar.z().n2() ? 1 : 0, (r29 & 256) != 0 ? 0 : 0);
                    } else {
                        java.lang.String d17 = iVar.z().d1();
                        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                        long E = iVar.E();
                        if (iVar.B() instanceof android.app.Activity) {
                            android.content.Context B = iVar.B();
                            kotlin.jvm.internal.o.e(B, "null cannot be cast to non-null type android.app.Activity");
                            intent = ((android.app.Activity) B).getIntent();
                        }
                        gr3.e.d(d17, 107, E, intent, !iVar.z().n2() ? 1 : 0, 0, 0, str, null, null, 0, 0, 3936, null);
                    }
                    int i17 = s5Var.f385514i.f382753d.f379138d;
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(adapterPosition);
                    wr3.j jVar2 = iVar.f448814d;
                    ((java.util.HashSet) jVar2.f448822a).add(jVar2.a(i17, valueOf2));
                }
            }
        }
    }

    public final int x(int i17) {
        return i65.a.b(this.f464722f.B(), i17);
    }
}
