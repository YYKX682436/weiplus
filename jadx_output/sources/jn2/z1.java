package jn2;

/* loaded from: classes10.dex */
public final class z1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f300765d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f300766e;

    /* renamed from: f, reason: collision with root package name */
    public final if2.b f300767f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f300768g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f300769h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.q f300770i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f300771m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f300772n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f300773o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f300774p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f300775q;

    public z1(gk2.e liveData, android.content.Context context, if2.b controller) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f300765d = liveData;
        this.f300766e = context;
        this.f300767f = controller;
        this.f300768g = "FinderLiveAnchorSingSongListPanelAdapter";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f300769h = arrayList;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        zl2.q4.f473933a.R("FinderLiveAnchorSingSongListPanelAdapter");
        arrayList.addAll(((mm2.m6) liveData.a(mm2.m6.class)).f329249q.f234085a);
    }

    public final void B(java.lang.String str) {
        java.lang.String str2 = this.f300775q;
        mm2.j6 j6Var = (mm2.j6) ((kotlinx.coroutines.flow.h3) ((mm2.m6) this.f300765d.a(mm2.m6.class)).f329251s).getValue();
        int i17 = 0;
        boolean z17 = true;
        boolean z18 = str2 == null || str2.length() == 0;
        int i18 = -1;
        java.util.ArrayList arrayList = this.f300769h;
        java.lang.String str3 = this.f300768g;
        if (!z18 && !kotlin.jvm.internal.o.b(str2, str)) {
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(((r45.z22) it.next()).f391629f, str2)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 >= 0) {
                com.tencent.mars.xlog.Log.i(str3, "setPreparingUniqueAddId: refresh old preparing cell, pos=" + i19);
                notifyItemChanged(i19, "payload_sing_state");
            }
        }
        if (j6Var instanceof mm2.i6) {
            java.lang.String str4 = ((mm2.i6) j6Var).f329141a.f391629f;
            if (!kotlin.jvm.internal.o.b(str4, str) && !kotlin.jvm.internal.o.b(str4, str2)) {
                java.util.Iterator it6 = arrayList.iterator();
                int i27 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i27 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(((r45.z22) it6.next()).f391629f, str4)) {
                        break;
                    } else {
                        i27++;
                    }
                }
                if (i27 >= 0) {
                    com.tencent.mars.xlog.Log.i(str3, "setPreparingUniqueAddId: refresh singing cell, pos=" + i27);
                    notifyItemChanged(i27, "payload_sing_state");
                }
            }
        }
        this.f300775q = str;
        com.tencent.mars.xlog.Log.i(str3, "setPreparingUniqueAddId: " + str);
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            if (kotlin.jvm.internal.o.b(((r45.z22) it7.next()).f391629f, str)) {
                i18 = i17;
                break;
            }
            i17++;
        }
        if (i18 >= 0) {
            com.tencent.mars.xlog.Log.i(str3, "setPreparingUniqueAddId: refresh new preparing cell, pos=" + i18);
            notifyItemChanged(i18, "payload_sing_state");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f300769h.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((r45.z22) this.f300769h.get(i17)).f391630g;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e8o, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new jn2.s1(this, inflate);
    }

    public final jn2.t1 x(r45.z22 z22Var) {
        if (kotlin.jvm.internal.o.b(this.f300775q, z22Var.f391629f)) {
            return jn2.t1.f300705e;
        }
        mm2.j6 j6Var = (mm2.j6) ((kotlinx.coroutines.flow.h3) ((mm2.m6) this.f300765d.a(mm2.m6.class)).f329251s).getValue();
        if (j6Var instanceof mm2.h6) {
            return kotlin.jvm.internal.o.b(((mm2.h6) j6Var).f329113a.f391629f, z22Var.f391629f) ? jn2.t1.f300705e : jn2.t1.f300704d;
        }
        if ((j6Var instanceof mm2.i6) && kotlin.jvm.internal.o.b(((mm2.i6) j6Var).f329141a.f391629f, z22Var.f391629f)) {
            return jn2.t1.f300706f;
        }
        return jn2.t1.f300704d;
    }

    public final void y(int i17) {
        if (i17 < 0 || i17 >= this.f300769h.size()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f300774p;
        androidx.recyclerview.widget.k3 p07 = recyclerView != null ? recyclerView.p0(i17) : null;
        if (p07 instanceof jn2.s1) {
            jn2.s1 s1Var = (jn2.s1) p07;
            fn2.c cVar = s1Var.f300700i;
            if (cVar != null) {
                cVar.a();
            }
            s1Var.f300700i = null;
            fn2.d dVar = fn2.d.f264242a;
            android.view.View itemView = s1Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            s1Var.f300700i = dVar.a(itemView, s1Var.f300701m.f300766e);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(jn2.s1 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        fn2.c cVar = holder.f300700i;
        if (cVar != null) {
            cVar.a();
        }
        holder.f300700i = null;
        java.lang.Object obj = this.f300769h.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.z22 z22Var = (r45.z22) obj;
        r45.by1 by1Var = z22Var.f391631h;
        r45.ay1 ay1Var = by1Var != null ? by1Var.f371143d : null;
        holder.f300695d.A(ay1Var != null ? ay1Var.f370351e : null, ay1Var != null ? ay1Var.f370353g : null, ay1Var != null ? ay1Var.f370354h : 0, ay1Var != null ? ay1Var.f370355i : null, z22Var.f391628e);
        int i18 = (int) z22Var.f391633m;
        java.lang.String string = this.f300766e.getString(com.tencent.mm.R.string.efc);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = holder.f300695d;
        finderLiveSongInfoView.getClass();
        android.widget.TextView textView = finderLiveSongInfoView.D;
        if (i18 > 0) {
            textView.setText(string + ' ' + i18);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        holder.i(x(z22Var), true);
        com.tencent.mm.ui.widget.button.WeButton weButton = holder.f300696e;
        if (weButton != null) {
            weButton.setOnClickListener(new jn2.u1(holder, this));
        }
        com.tencent.mm.ui.widget.button.WeButton weButton2 = holder.f300697f;
        if (weButton2 != null) {
            weButton2.setOnClickListener(new jn2.v1(holder, this));
        }
        holder.itemView.setOnClickListener(new jn2.w1(holder, this));
        holder.itemView.setOnLongClickListener(new jn2.x1(holder, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        jn2.s1 holder = (jn2.s1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
            return;
        }
        r45.z22 z22Var = (r45.z22) kz5.n0.a0(this.f300769h, i17);
        if (z22Var == null) {
            return;
        }
        java.util.Iterator it = payloads.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(it.next(), "payload_sing_state")) {
                holder.i(x(z22Var), true);
            }
        }
    }
}
