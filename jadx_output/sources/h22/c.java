package h22;

/* loaded from: classes15.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f278281d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f278282e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f278283f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f278284g;

    /* renamed from: h, reason: collision with root package name */
    public int f278285h;

    /* renamed from: i, reason: collision with root package name */
    public int f278286i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f278287m;

    /* renamed from: n, reason: collision with root package name */
    public int f278288n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f278289o;

    /* renamed from: p, reason: collision with root package name */
    public final h22.b f278290p;

    public c(android.content.Context context, java.util.LinkedList data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        this.f278281d = context;
        this.f278282e = data;
        this.f278283f = "MicroMsg.EmojiStoreV3BannerAdapter";
        new java.util.ArrayList();
        this.f278285h = 1;
        this.f278288n = 10001;
        this.f278290p = new h22.b(this);
    }

    public final void B(java.util.List newData) {
        kotlin.jvm.internal.o.g(newData, "newData");
        java.util.LinkedList linkedList = this.f278282e;
        int size = linkedList.size();
        int size2 = newData.size();
        com.tencent.mars.xlog.Log.i(this.f278283f, "setBannerData: from:" + size + ", to:" + size2);
        int min = java.lang.Math.min(size, size2);
        int i17 = size2 - size;
        int i18 = size - size2;
        linkedList.clear();
        linkedList.addAll(newData);
        if (i18 > 0) {
            notifyItemRangeRemoved(size2, i18);
        }
        if (i17 > 0) {
            notifyItemRangeInserted(size, i17);
        }
        if (min > 0) {
            notifyItemRangeChanged(0, min);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f278282e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.i(this.f278290p);
        this.f278284g = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r14, int r15) {
        /*
            r13 = this;
            h22.j r14 = (h22.j) r14
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r14, r0)
            java.util.LinkedList r0 = r13.f278282e
            java.lang.Object r0 = r0.get(r15)
            com.tencent.mm.plugin.emoji.model.b r0 = (com.tencent.mm.plugin.emoji.model.b) r0
            if (r0 != 0) goto L1a
            java.lang.String r14 = "BaseEmotionBanner is null."
            java.lang.String r15 = r13.f278283f
            com.tencent.mars.xlog.Log.e(r15, r14)
            goto Lcb
        L1a:
            boolean r1 = r0.f97539c
            java.lang.String r2 = "StripUrl"
            r45.kj0 r3 = r0.f97537a
            if (r1 == 0) goto L2f
            r45.ij0 r1 = r3.f378726d
            java.lang.String r1 = r1.f377094g
            kotlin.jvm.internal.o.f(r1, r2)
            java.lang.String r2 = r3.f378728f
            com.tencent.mm.sdk.platformtools.t8.K0(r2)
            goto L42
        L2f:
            r45.hj0 r1 = r0.f97538b
            r45.ij0 r4 = r1.f376211e
            java.lang.String r4 = r4.f377094g
            kotlin.jvm.internal.o.f(r4, r2)
            r45.zj0 r1 = r1.f376210d
            java.lang.String r1 = r1.f392128d
            java.lang.String r2 = "ProductID"
            kotlin.jvm.internal.o.f(r1, r2)
            r1 = r4
        L42:
            r2 = 0
            if (r3 == 0) goto L48
            java.lang.String r4 = r3.f378727e
            goto L49
        L48:
            r4 = r2
        L49:
            android.widget.TextView r5 = r14.f278307f
            r5.setText(r4)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            com.tencent.mm.plugin.gif.MMAnimateView r5 = r14.f278306e
            r5.setScaleType(r4)
            if (r3 == 0) goto L5d
            r45.ij0 r3 = r3.f378726d
            if (r3 == 0) goto L5d
            r45.jj0 r2 = r3.f377096i
        L5d:
            android.widget.TextView r3 = r14.f278308g
            if (r2 == 0) goto Lab
            java.lang.String r4 = r2.f377847d
            r6 = 0
            if (r4 == 0) goto L6f
            int r4 = r4.length()
            if (r4 != 0) goto L6d
            goto L6f
        L6d:
            r4 = r6
            goto L70
        L6f:
            r4 = 1
        L70:
            if (r4 == 0) goto L73
            goto Lab
        L73:
            r3.setVisibility(r6)
            android.content.Context r4 = r13.f278281d
            r6 = 1082130432(0x40800000, float:4.0)
            int r4 = ym5.x.a(r4, r6)
            float r12 = (float) r4
            java.util.LinkedList r4 = r2.f377848e
            java.lang.String r6 = "TextColorArgb"
            kotlin.jvm.internal.o.f(r4, r6)
            int r4 = r13.x(r4)
            r3.setTextColor(r4)
            java.lang.String r4 = r2.f377847d
            r3.setText(r4)
            java.util.LinkedList r2 = r2.f377850g
            java.lang.String r4 = "BgColorArgb"
            kotlin.jvm.internal.o.f(r2, r4)
            int r8 = r13.x(r2)
            n22.f r6 = n22.f.f334290a
            r7 = r8
            r9 = r12
            r10 = r12
            r11 = r12
            android.graphics.drawable.Drawable r2 = r6.b(r7, r8, r9, r10, r11, r12)
            r3.setBackgroundDrawable(r2)
            goto Lb0
        Lab:
            r2 = 8
            r3.setVisibility(r2)
        Lb0:
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r2 != 0) goto Lc1
            vo0.a r2 = vo0.e.f438468b
            wo0.c r1 = r2.a(r1)
            wo0.b r1 = (wo0.b) r1
            r1.c(r5)
        Lc1:
            h22.a r1 = new h22.a
            r1.<init>(r13, r15, r0)
            android.widget.FrameLayout r14 = r14.f278305d
            r14.setOnClickListener(r1)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h22.c.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup group, int i17) {
        kotlin.jvm.internal.o.g(group, "group");
        android.content.Context context = this.f278281d;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a8b, group, false);
        kotlin.jvm.internal.o.d(inflate);
        return new h22.j(context, inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.V0(this.f278290p);
        this.f278284g = null;
    }

    public final int x(java.util.List list) {
        try {
            java.lang.String str = (java.lang.String) ((!com.tencent.mm.ui.bk.C() || list.size() < 2) ? kz5.n0.X(list) : list.get(1));
            if (!r26.n0.i0(str, '#', false, 2, null)) {
                str = "#" + str;
            }
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public final java.util.List y(java.util.List list, java.util.List list2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.hj0 hj0Var = (r45.hj0) it.next();
                if ((hj0Var != null ? hj0Var.f376211e : null) != null && !com.tencent.mm.sdk.platformtools.t8.K0(hj0Var.f376211e.f377094g)) {
                    linkedList.add(new com.tencent.mm.plugin.emoji.model.b(hj0Var, null, false));
                }
            }
        }
        if (list2 != null) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                r45.kj0 kj0Var = (r45.kj0) it6.next();
                if ((kj0Var != null ? kj0Var.f378726d : null) != null && !com.tencent.mm.sdk.platformtools.t8.K0(kj0Var.f378726d.f377094g)) {
                    linkedList.add(new com.tencent.mm.plugin.emoji.model.b(null, kj0Var, true));
                }
            }
        }
        return linkedList;
    }

    public final void z() {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        int w17;
        int y17;
        if (this.f278287m) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f278284g;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            java.lang.String str = this.f278283f;
            if (layoutManager == null) {
                com.tencent.mars.xlog.Log.i(str, "report 31502 fail, layoutManager is null");
                return;
            }
            if (getItemCount() <= 0) {
                com.tencent.mars.xlog.Log.i(str, "report 31502 fail, itemCount is 0");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (layoutManager instanceof com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager) {
                int m17 = ((com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager) layoutManager).m();
                int i17 = this.f278285h;
                for (int i18 = 0; i18 < i17; i18++) {
                    arrayList.add(java.lang.Integer.valueOf((m17 + i18) % getItemCount()));
                }
            } else if ((layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) && (w17 = (linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w()) <= (y17 = linearLayoutManager.y())) {
                while (true) {
                    arrayList.add(java.lang.Integer.valueOf(w17));
                    if (w17 == y17) {
                        break;
                    } else {
                        w17++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                int intValue = ((java.lang.Number) arrayList.get(i19)).intValue();
                if (intValue < getItemCount() && intValue >= 0) {
                    j22.a.b((com.tencent.mm.plugin.emoji.model.b) this.f278282e.get(intValue), intValue + 1, this.f278286i == 0 ? 1 : 2, "view_exp");
                }
            }
        }
    }
}
