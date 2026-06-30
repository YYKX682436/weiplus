package cw1;

/* loaded from: classes12.dex */
public final class t0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f223324d = kz5.p0.f313996d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f223325e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f223326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f223327g;

    public t0(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI) {
        this.f223327g = cleanCacheNewUI;
        java.lang.String[] stringArray = cleanCacheNewUI.getResources().getStringArray(com.tencent.mm.R.array.f477977b6);
        kotlin.jvm.internal.o.f(stringArray, "getStringArray(...)");
        this.f223325e = stringArray;
        this.f223326f = cw1.p0.f223211d;
        setHasStableIds(true);
    }

    public final void B() {
        java.lang.Integer[][] numArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI.f95654x;
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = this.f223327g;
        int i17 = 0;
        int i18 = 0;
        while (i17 < 12) {
            int i19 = i18 + 1;
            long j17 = 0;
            for (java.lang.Integer num : numArr[i17]) {
                j17 += cleanCacheNewUI.f95660h[num.intValue()];
            }
            if (j17 > 0) {
                arrayList.add(new cw1.v0(i18, j17, false, 4, null));
            }
            i17++;
            i18 = i19;
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new cw1.q0());
        }
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI2 = this.f223327g;
        if (cleanCacheNewUI2.f95667r + cleanCacheNewUI2.f95666q > 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            long j18 = this.f223327g.f95667r;
            if (j18 > 0) {
                arrayList2.add(new cw1.v0(-2, j18, false));
            }
            long j19 = this.f223327g.f95666q;
            if (j19 > 0) {
                arrayList2.add(new cw1.v0(-1, j19, false));
            }
            if (arrayList2.size() > 1) {
                kz5.g0.t(arrayList2, new cw1.r0());
            }
            arrayList2.add(0, new cw1.v0(-3, 0L, false, 6, null));
            arrayList2.add(new cw1.v0(-4, 0L, false, 6, null));
            arrayList.addAll(0, arrayList2);
        }
        long j27 = this.f223327g.f95665p;
        if (j27 > 0) {
            arrayList.add(0, new cw1.v0(-5, j27, false));
        }
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.s0(this, arrayList));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f223324d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return ((cw1.v0) this.f223324d.get(i17)).f223359a;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        int i18 = ((cw1.v0) this.f223324d.get(i17)).f223359a;
        if (i18 != -5) {
            return (i18 == -4 || i18 == -3) ? 1 : 0;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String string;
        android.view.View.OnClickListener z0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof cw1.b1) {
            cw1.b1 b1Var = (cw1.b1) holder;
            cw1.v0 gd6 = (cw1.v0) this.f223324d.get(i17);
            kotlin.jvm.internal.o.g(gd6, "gd");
            java.lang.String[] titles = this.f223325e;
            kotlin.jvm.internal.o.g(titles, "titles");
            b1Var.f222803d = gd6;
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = b1Var.f222809m;
            int i18 = gd6.f223359a;
            if (i18 == -2) {
                string = cleanCacheNewUI.getString(com.tencent.mm.R.string.n8i);
            } else if (i18 != -1) {
                string = titles[i18];
            } else {
                string = cleanCacheNewUI.getString(com.tencent.mm.R.string.n8j);
            }
            b1Var.f222805f.setText(string);
            android.view.View view = b1Var.f222807h;
            int i19 = (i18 == -2 || i18 == -1 || i18 == 3) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder", "bind", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$GroupData;[Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder", "bind", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$GroupData;[Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i18 == -2 || i18 == -1) {
                z0Var = new cw1.z0(cleanCacheNewUI, i18);
            } else {
                z0Var = i18 != 3 ? null : new cw1.a1(cleanCacheNewUI, gd6);
            }
            android.view.View view2 = b1Var.f222808i;
            view2.setOnClickListener(z0Var);
            dy1.a.c(view2);
            if (i18 == -2 || i18 == -1) {
                dy1.a.i(view2, "visual_origin_detail");
                java.lang.String str = cleanCacheNewUI.f95664o;
                if (str != null) {
                    dy1.a.j(view2, "cache_remove_sessionid", str);
                    dy1.a.j(view2, "cache_visual_type", java.lang.Integer.valueOf(i18 == -1 ? 1 : 2));
                    dy1.a.l(view2, 8, 32903);
                } else {
                    kotlin.jvm.internal.o.o("cleanSessionID");
                    throw null;
                }
            }
            b1Var.i();
            return;
        }
        if (holder instanceof cw1.c1) {
            cw1.c1 c1Var = (cw1.c1) holder;
            cw1.v0 gd7 = (cw1.v0) this.f223324d.get(i17);
            kotlin.jvm.internal.o.g(gd7, "gd");
            c1Var.f222847d.setVisibility(gd7.f223359a == -4 ? 8 : 0);
            return;
        }
        if (holder instanceof cw1.u0) {
            cw1.u0 u0Var = (cw1.u0) holder;
            cw1.v0 gd8 = (cw1.v0) this.f223324d.get(i17);
            kotlin.jvm.internal.o.g(gd8, "gd");
            u0Var.f223343d.setText(u0Var.f223344e.getString(com.tencent.mm.R.string.n8h, fp.n0.a(gd8.f223360b)));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = this.f223327g;
        if (i17 == 0) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.e2i, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new cw1.b1(cleanCacheNewUI, inflate);
        }
        if (i17 != 1) {
            android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.e2h, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new cw1.u0(cleanCacheNewUI, inflate2);
        }
        android.view.View inflate3 = from.inflate(com.tencent.mm.R.layout.e2j, parent, false);
        kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
        return new cw1.c1(cleanCacheNewUI, inflate3);
    }

    public final void x(int i17, long j17, boolean z17) {
        java.util.List list = this.f223324d;
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else {
                if (((cw1.v0) it.next()).f223359a == i17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (i18 < 0) {
            return;
        }
        ((cw1.v0) list.get(i18)).f223362d = j17;
        ((cw1.v0) list.get(i18)).f223361c = z17;
        notifyItemChanged(i18, "");
        this.f223326f.invoke();
    }

    public final long y() {
        long j17 = 0;
        for (cw1.v0 v0Var : this.f223324d) {
            j17 += v0Var.f223359a >= 0 ? v0Var.f223362d : 0L;
        }
        return j17;
    }

    public final void z(boolean z17) {
        com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems;
        java.util.List<cw1.v0> list = this.f223324d;
        for (cw1.v0 v0Var : list) {
            if (v0Var.f223359a >= -2) {
                v0Var.f223362d = z17 ? v0Var.f223360b : 0L;
                v0Var.f223361c = z17;
            }
        }
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = this.f223327g;
        int length = cleanCacheNewUI.f95670u.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr = cleanCacheNewUI.f95670u;
            if (z17) {
                com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr2 = cleanCacheNewUI.f95671v;
                if (cleanService$SelectedItemsArr2 == null) {
                    kotlin.jvm.internal.o.o("allOriginItems");
                    throw null;
                }
                cleanService$SelectedItems = cleanService$SelectedItemsArr2[i17];
            } else {
                cleanService$SelectedItems = cleanCacheNewUI.f95672w;
            }
            cleanService$SelectedItemsArr[i17] = cleanService$SelectedItems;
        }
        notifyItemRangeChanged(0, list.size(), "");
        this.f223326f.invoke();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
        } else if (holder instanceof cw1.b1) {
            ((cw1.b1) holder).i();
        }
    }
}
