package i22;

/* loaded from: classes15.dex */
public class s extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288014d;

    /* renamed from: e, reason: collision with root package name */
    public final i22.w f288015e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f288016f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f288017g;

    /* renamed from: h, reason: collision with root package name */
    public i22.p0 f288018h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f288019i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f288020m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f288021n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f288022o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.p f288023p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f288024q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.f0 f288025r;

    public s(android.content.Context context, i22.w singleProductAlbumItemSizeResolver) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(singleProductAlbumItemSizeResolver, "singleProductAlbumItemSizeResolver");
        this.f288014d = context;
        this.f288015e = singleProductAlbumItemSizeResolver;
        this.f288016f = "MicroMsg.EmojiStoreV3HomeMainAdapter";
        this.f288017g = new java.util.ArrayList();
        this.f288019i = new java.util.HashMap();
        this.f288020m = new java.util.LinkedHashSet();
        this.f288021n = new java.util.ArrayList();
    }

    public final void B(boolean z17) {
        java.lang.Object obj = z17 ? i22.i.f287981a : i22.j.f287985a;
        java.util.Iterator it = this.f288020m.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (((i22.n0) this.f288017g.get(intValue)).getType() == 5) {
                notifyItemChanged(intValue, obj);
            }
        }
    }

    public final void E(i22.p event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String a17 = event.a();
        java.lang.Integer num = (java.lang.Integer) this.f288019i.get(a17);
        java.lang.String str = this.f288016f;
        if (num != null) {
            int intValue = num.intValue();
            java.util.ArrayList arrayList = this.f288017g;
            if (intValue < arrayList.size()) {
                java.lang.Object obj = arrayList.get(num.intValue());
                i22.m0 m0Var = obj instanceof i22.m0 ? (i22.m0) obj : null;
                j12.i iVar = m0Var != null ? m0Var.f288004a : null;
                if (event instanceof i22.o) {
                    z(iVar, a17, ((i22.o) event).f288009b);
                    if (iVar != null && iVar.f297171f == -1) {
                        com.tencent.mars.xlog.Log.i(str, "force refresh emotionItem status, productId:" + a17);
                        boolean y17 = c01.z1.y();
                        com.tencent.mm.plugin.emoji.model.f0 f0Var = this.f288025r;
                        iVar.b(y17, f0Var != null ? ((com.tencent.mm.plugin.emoji.model.q) f0Var).b(a17) : null, com.tencent.mm.plugin.emoji.model.q.f97591c.a(a17));
                    }
                } else if (event instanceof i22.n) {
                    int i17 = ((i22.n) event).f288007b;
                    if (i17 >= 0 && i17 < 100) {
                        z(iVar, a17, 6);
                        if (iVar != null) {
                            iVar.f297170e = i17;
                        }
                    }
                    if (i17 >= 100) {
                        z(iVar, a17, 7);
                    }
                }
                notifyItemChanged(num.intValue(), event);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(str, "updateListItemProgress failed, cache pos error, productId:" + a17);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f288017g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        i22.n0 n0Var = (i22.n0) kz5.n0.a0(this.f288017g, i17);
        if (n0Var != null) {
            return n0Var.getType();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.i(new i22.r(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        r45.zj0 zj0Var;
        i22.m holder = (i22.m) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f288017g.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        i22.n0 n0Var = (i22.n0) obj;
        holder.i(n0Var, new java.util.ArrayList());
        int type = n0Var.getType();
        if (type == 1) {
            j12.i iVar = ((i22.m0) n0Var).f288004a;
            java.lang.String str = (iVar == null || (zj0Var = iVar.f297167b) == null) ? null : zj0Var.f392128d;
            if (str == null) {
                return;
            }
            this.f288019i.put(str, java.lang.Integer.valueOf(i17));
            return;
        }
        java.util.List list = this.f288021n;
        if (type == 2) {
            ((java.util.ArrayList) list).add(new i22.q(i17, 0, ((i22.l0) n0Var).f288001b + 10000, 2, null));
            return;
        }
        if (type == 5) {
            this.f288020m.add(java.lang.Integer.valueOf(i17));
        } else {
            if (type != 6) {
                return;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (!arrayList.isEmpty()) {
                ((i22.q) kz5.n0.i0(arrayList)).f288011b = i17;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.a8k, parent, false);
            android.content.Context context = this.f288014d;
            kotlin.jvm.internal.o.d(inflate);
            return new i22.v(context, inflate, null, false, false, this.f288018h, 28, null);
        }
        if (i17 == 2) {
            android.view.View inflate2 = b17.inflate(com.tencent.mm.R.layout.a8j, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new i22.x(inflate2, this.f288018h);
        }
        android.content.Context context2 = this.f288014d;
        if (i17 == 3) {
            android.view.View inflate3 = b17.inflate(com.tencent.mm.R.layout.a8n, parent, false);
            kotlin.jvm.internal.o.d(inflate3);
            return new i22.j0(context2, inflate3, this.f288018h, this.f288015e);
        }
        if (i17 != 6) {
            android.view.View inflate4 = b17.inflate(com.tencent.mm.R.layout.a8a, parent, false);
            kotlin.jvm.internal.o.d(inflate4);
            return new i22.g(context2, inflate4, this.f288018h);
        }
        android.view.View inflate5 = b17.inflate(com.tencent.mm.R.layout.a8i, parent, false);
        kotlin.jvm.internal.o.d(inflate5);
        return new i22.y(context2, inflate5, this.f288018h);
    }

    public final i22.q x(int i17) {
        java.util.List list = this.f288021n;
        if (((java.util.ArrayList) list).isEmpty()) {
            return null;
        }
        boolean z17 = false;
        int i18 = 0;
        i22.q qVar = null;
        while (true) {
            if (i18 >= ((java.util.ArrayList) list).size()) {
                break;
            }
            int i19 = i18 + 1;
            i22.q qVar2 = (i22.q) ((java.util.ArrayList) list).get(i18);
            if (i17 > qVar2.f288010a && i17 < qVar2.f288011b) {
                z17 = true;
                qVar = qVar2;
                break;
            }
            qVar = qVar2;
            i18 = i19;
        }
        if (z17) {
            return qVar;
        }
        return null;
    }

    public final void y(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        yz5.p pVar;
        r45.zj0 zj0Var;
        if (layoutManager == null) {
            com.tencent.mars.xlog.Log.i(this.f288016f, "reportExposeData failed, recyclerview layoutManager null");
            return;
        }
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            if (y17 - w17 <= 0) {
                return;
            }
            e06.k kVar = new e06.k(w17, y17);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            int i17 = kVar.f246210e;
            if (w17 <= i17) {
                int i18 = 0;
                while (true) {
                    java.lang.Object obj = this.f288017g.get(w17);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    i22.n0 n0Var = (i22.n0) obj;
                    if (n0Var instanceof i22.m0) {
                        java.util.List list = this.f288021n;
                        if (!list.isEmpty()) {
                            i22.q qVar = (i22.q) ((java.util.ArrayList) list).get(i18);
                            int i19 = i18;
                            while (true) {
                                if (i19 < ((java.util.ArrayList) list).size()) {
                                    if (w17 > qVar.f288010a && w17 < qVar.f288011b) {
                                        i18 = i19;
                                        break;
                                    }
                                    i19++;
                                    if (i19 >= ((java.util.ArrayList) list).size()) {
                                        break;
                                    } else {
                                        qVar = (i22.q) ((java.util.ArrayList) list).get(i19);
                                    }
                                } else {
                                    break;
                                }
                            }
                            int i27 = qVar.f288012c;
                            if (!linkedHashMap.containsKey(java.lang.Integer.valueOf(i27))) {
                                linkedHashMap.put(java.lang.Integer.valueOf(i27), new java.util.LinkedList());
                            }
                            java.util.List list2 = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(i27));
                            if (list2 != null) {
                                int i28 = w17 - qVar.f288010a;
                                j12.i iVar = ((i22.m0) n0Var).f288004a;
                                java.lang.String str = (iVar == null || (zj0Var = iVar.f297167b) == null) ? null : zj0Var.f392130f;
                                if (str == null) {
                                    str = "";
                                }
                                list2.add(new j22.j(i28, str, iVar != null ? iVar.f297167b : null, iVar != null ? iVar.f297176k : null));
                            }
                        }
                    }
                    if (n0Var instanceof i22.a1) {
                        i22.a1 a1Var = (i22.a1) n0Var;
                        r45.kj0 kj0Var = a1Var.f287926b;
                        int i29 = kj0Var != null ? kj0Var.f378729g : 0;
                        if (!linkedHashMap2.containsKey(java.lang.Integer.valueOf(i29))) {
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(i29);
                            long j17 = i29;
                            r45.kj0 kj0Var2 = a1Var.f287926b;
                            java.lang.String str2 = kj0Var2 != null ? kj0Var2.f378727e : null;
                            linkedHashMap2.put(valueOf, new j22.l(j17, str2 == null ? "" : str2, 0, 0, null, null, 60, null));
                        }
                        int i37 = a1Var.f287927c;
                        j22.l lVar = (j22.l) linkedHashMap2.get(java.lang.Integer.valueOf(i29));
                        if (lVar != null) {
                            if (1 <= i37) {
                                int i38 = 1;
                                while (true) {
                                    java.lang.StringBuilder sb6 = lVar.f297265c;
                                    java.lang.StringBuilder sb7 = lVar.f297266d;
                                    if (i38 != 1) {
                                        sb7.append("#");
                                        sb6.append("#");
                                    }
                                    sb7.append(i38);
                                    r45.ri0 ri0Var = ((i22.c1) a1Var.f287925a.get(i38 - 1)).f287952a;
                                    sb6.append(ri0Var != null ? ri0Var.f384886d : null);
                                    if (i38 == i37) {
                                        break;
                                    } else {
                                        i38++;
                                    }
                                }
                            }
                            yz5.l lVar2 = this.f288024q;
                            if (lVar2 != null) {
                                lVar2.invoke(lVar);
                            }
                        }
                    }
                    if ((n0Var instanceof i22.a) && (pVar = this.f288023p) != null) {
                        pVar.invoke(java.lang.Integer.valueOf(w17), n0Var);
                    }
                    if (w17 == i17) {
                        break;
                    } else {
                        w17++;
                    }
                }
            }
            yz5.l lVar3 = this.f288022o;
            if (lVar3 != null) {
                lVar3.invoke(new j22.k(linkedHashMap));
            }
        }
    }

    public final void z(j12.i iVar, java.lang.String str, int i17) {
        com.tencent.mm.storage.f5 f5Var;
        if (iVar == null || str == null || kotlin.jvm.internal.o.b(str, "")) {
            return;
        }
        iVar.c(i17);
        com.tencent.mm.plugin.emoji.model.f0 f0Var = this.f288025r;
        if (f0Var == null || (f5Var = (com.tencent.mm.storage.f5) ((com.tencent.mm.plugin.emoji.model.q) f0Var).f97596b.get(str)) == null) {
            return;
        }
        f5Var.a(i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        i22.m holder = (i22.m) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (!payloads.isEmpty()) {
            java.lang.Object obj = this.f288017g.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            holder.i((i22.n0) obj, payloads);
            return;
        }
        super.onBindViewHolder(holder, i17, payloads);
    }
}
