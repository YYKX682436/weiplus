package iu1;

/* loaded from: classes9.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294843d;

    public c(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294843d = cardHomePageNewUI;
    }

    public final void B(java.lang.String merchantId, r45.wt mchInfo) {
        kotlin.jvm.internal.o.g(merchantId, "merchantId");
        kotlin.jvm.internal.o.g(mchInfo, "mchInfo");
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294843d;
        java.util.Iterator it = cardHomePageNewUI.f95192u.iterator();
        while (it.hasNext()) {
            iu1.a aVar = (iu1.a) it.next();
            r45.wt wtVar = aVar.f294831a;
            if (kotlin.jvm.internal.o.b(wtVar != null ? wtVar.f389427d : null, merchantId)) {
                aVar.f294831a = mchInfo;
                int y17 = y(merchantId);
                if (y17 >= 0) {
                    com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = cardHomePageNewUI.f95183i;
                    if (loadMoreRecyclerView == null) {
                        kotlin.jvm.internal.o.o("mRecyclerView");
                        throw null;
                    }
                    androidx.recyclerview.widget.f2 adapter = loadMoreRecyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemChanged(y17, java.lang.Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        java.util.Iterator it6 = cardHomePageNewUI.f95193v.iterator();
        while (it6.hasNext()) {
            iu1.a aVar2 = (iu1.a) it6.next();
            r45.wt wtVar2 = aVar2.f294831a;
            if (kotlin.jvm.internal.o.b(wtVar2 != null ? wtVar2.f389427d : null, merchantId)) {
                aVar2.f294831a = mchInfo;
                int y18 = y(merchantId);
                if (y18 >= 0) {
                    com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = cardHomePageNewUI.f95183i;
                    if (loadMoreRecyclerView2 == null) {
                        kotlin.jvm.internal.o.o("mRecyclerView");
                        throw null;
                    }
                    androidx.recyclerview.widget.f2 adapter2 = loadMoreRecyclerView2.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemChanged(y18, java.lang.Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294843d;
        java.util.ArrayList arrayList = cardHomePageNewUI.f95192u;
        int size = arrayList != null ? arrayList.size() : 0;
        java.util.ArrayList arrayList2 = cardHomePageNewUI.f95193v;
        int size2 = arrayList2 != null ? arrayList2.size() : 0;
        int i17 = cardHomePageNewUI.f95195x != null ? 1 : 0;
        cardHomePageNewUI.getClass();
        int i18 = cardHomePageNewUI.f95196y != null ? 1 : 0;
        java.util.ArrayList arrayList3 = cardHomePageNewUI.f95191t;
        return size + size2 + i17 + 0 + i18 + (arrayList3 != null ? arrayList3.size() : 0) + (cardHomePageNewUI.f95194w == null ? 0 : 1);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        iu1.a x17 = x(i17);
        if (x17 != null) {
            return x17.f294832b;
        }
        return 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        iu1.m holder = (iu1.m) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        iu1.a x17 = x(i17);
        if (x17 != null) {
            int i18 = iu1.m.f294901z;
            holder.y(x17, i17, false);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(parent, "parent");
        switch (i17) {
            case 0:
                i18 = com.tencent.mm.R.layout.f488313pv;
                break;
            case 1:
                i18 = com.tencent.mm.R.layout.f488315px;
                break;
            case 2:
            case 3:
                i18 = com.tencent.mm.R.layout.f488307pp;
                break;
            case 4:
            case 6:
                i18 = com.tencent.mm.R.layout.f488316py;
                break;
            case 5:
                i18 = com.tencent.mm.R.layout.f488308pq;
                break;
            case 7:
                i18 = com.tencent.mm.R.layout.f488312pu;
                break;
            default:
                i18 = 0;
                break;
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(i18, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new iu1.m(this.f294843d, inflate, i17);
    }

    public final iu1.a x(int i17) {
        int i18;
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294843d;
        java.util.ArrayList arrayList = cardHomePageNewUI.f95192u;
        if (arrayList != null) {
            arrayList.size();
        }
        java.util.ArrayList arrayList2 = cardHomePageNewUI.f95192u;
        if (arrayList2 != null) {
            arrayList2.size();
        }
        iu1.a aVar = cardHomePageNewUI.f95195x;
        java.util.ArrayList arrayList3 = cardHomePageNewUI.f95191t;
        if (arrayList3 != null) {
            int i19 = i17 + 0;
            if (i19 < arrayList3.size()) {
                return (iu1.a) arrayList3.get(i19);
            }
            i18 = arrayList3.size();
        } else {
            i18 = 0;
        }
        iu1.a aVar2 = cardHomePageNewUI.f95196y;
        if (aVar2 != null) {
            if (i17 == i18) {
                return aVar2;
            }
            i18++;
        }
        iu1.a aVar3 = cardHomePageNewUI.f95194w;
        if (aVar3 != null && i17 == i18) {
            return aVar3;
        }
        java.util.ArrayList arrayList4 = cardHomePageNewUI.f95192u;
        if (arrayList4 != null) {
            int i27 = i17 - i18;
            if (i27 < arrayList4.size()) {
                return (iu1.a) arrayList4.get(i27);
            }
            i18 = arrayList4.size() - 1;
        }
        iu1.a aVar4 = cardHomePageNewUI.f95195x;
        if (aVar4 != null && i17 == (i18 = i18 + 1)) {
            return aVar4;
        }
        java.util.ArrayList arrayList5 = cardHomePageNewUI.f95193v;
        if (arrayList5 == null || i17 <= i18 || i17 > arrayList5.size() + i18) {
            return null;
        }
        return (iu1.a) arrayList5.get((i17 - i18) - 1);
    }

    public final int y(java.lang.String merchantId) {
        kotlin.jvm.internal.o.g(merchantId, "merchantId");
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294843d;
        int i17 = 0;
        int i18 = cardHomePageNewUI.f95191t != null ? 1 : 0;
        if (cardHomePageNewUI.f95196y != null) {
            i18++;
        }
        java.util.Iterator it = cardHomePageNewUI.f95192u.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                int size = (i18 + cardHomePageNewUI.f95192u.size()) - 1;
                if (cardHomePageNewUI.f95195x != null) {
                    size++;
                }
                java.util.Iterator it6 = cardHomePageNewUI.f95193v.iterator();
                while (it6.hasNext()) {
                    int i27 = i17 + 1;
                    r45.wt wtVar = ((iu1.a) it6.next()).f294831a;
                    if (kotlin.jvm.internal.o.b(wtVar != null ? wtVar.f389427d : null, merchantId)) {
                        return size + i17 + 1;
                    }
                    i17 = i27;
                }
                return -1;
            }
            int i28 = i19 + 1;
            r45.wt wtVar2 = ((iu1.a) it.next()).f294831a;
            if (kotlin.jvm.internal.o.b(wtVar2 != null ? wtVar2.f389427d : null, merchantId)) {
                return i18 + i19;
            }
            i19 = i28;
        }
    }

    public final void z(java.lang.String merchantId) {
        kotlin.jvm.internal.o.g(merchantId, "merchantId");
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294843d;
        java.util.Iterator it = cardHomePageNewUI.f95192u.iterator();
        while (it.hasNext()) {
            iu1.a aVar = (iu1.a) it.next();
            r45.wt wtVar = aVar.f294831a;
            if (kotlin.jvm.internal.o.b(wtVar != null ? wtVar.f389427d : null, merchantId)) {
                cardHomePageNewUI.f95192u.remove(aVar);
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = cardHomePageNewUI.f95183i;
                if (loadMoreRecyclerView == null) {
                    kotlin.jvm.internal.o.o("mRecyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter = loadMoreRecyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
        java.util.Iterator it6 = cardHomePageNewUI.f95193v.iterator();
        while (it6.hasNext()) {
            iu1.a aVar2 = (iu1.a) it6.next();
            r45.wt wtVar2 = aVar2.f294831a;
            if (kotlin.jvm.internal.o.b(wtVar2 != null ? wtVar2.f389427d : null, merchantId)) {
                cardHomePageNewUI.f95193v.remove(aVar2);
                if (cardHomePageNewUI.f95193v.size() == 0) {
                    cardHomePageNewUI.f95195x = null;
                    com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = cardHomePageNewUI.f95183i;
                    if (loadMoreRecyclerView2 == null) {
                        kotlin.jvm.internal.o.o("mRecyclerView");
                        throw null;
                    }
                    androidx.recyclerview.widget.f2 adapter2 = loadMoreRecyclerView2.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        iu1.m holder = (iu1.m) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if ((!payloads.isEmpty()) && kotlin.jvm.internal.o.b(payloads.get(0), java.lang.Boolean.TRUE)) {
            iu1.a x17 = x(i17);
            if (x17 != null) {
                holder.y(x17, i17, false);
                return;
            }
            return;
        }
        super.onBindViewHolder(holder, i17, payloads);
    }
}
