package cw1;

/* loaded from: classes12.dex */
public final class q4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: s, reason: collision with root package name */
    public static final cw1.u3 f223263s = new cw1.u3(null);

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.Map f223264t;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI f223265d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f223266e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f223267f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f223268g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.BitSet f223269h;

    /* renamed from: i, reason: collision with root package name */
    public long f223270i;

    /* renamed from: m, reason: collision with root package name */
    public int f223271m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wcdb.support.CancellationSignal f223272n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f223273o;

    /* renamed from: p, reason: collision with root package name */
    public final cw1.n4 f223274p;

    /* renamed from: q, reason: collision with root package name */
    public final cw1.h4 f223275q;

    /* renamed from: r, reason: collision with root package name */
    public final kn5.e f223276r;

    static {
        int[] iArr = ot1.h.Q;
        cw1.i4 i4Var = new cw1.i4(null, null, iArr, new long[]{0, com.tencent.wcdb.core.Database.DictDefaultMatchValue}, 0, null, 0, false, false, false);
        jz5.l lVar = new jz5.l(i4Var, new cw1.e4(i4Var));
        cw1.i4 i4Var2 = new cw1.i4(null, null, iArr, new long[]{0, com.tencent.wcdb.core.Database.DictDefaultMatchValue}, 0, null, 0, true, false, false);
        f223264t = kz5.c1.k(lVar, new jz5.l(i4Var2, new cw1.e4(i4Var2)));
    }

    public q4(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f223265d = activity;
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f223266e = p0Var;
        this.f223267f = p0Var;
        this.f223268g = kz5.q0.f314001d;
        this.f223269h = new java.util.BitSet();
        this.f223273o = z65.c.a();
        this.f223274p = new cw1.n4();
        cw1.h4 h4Var = new cw1.h4(this);
        this.f223275q = h4Var;
        this.f223276r = kn5.e.E.a(activity, h4Var, new cw1.k4(this));
    }

    public static void E(cw1.q4 q4Var, android.widget.ImageView imageView, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        o11.g a17;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        q4Var.getClass();
        if (kotlin.jvm.internal.o.b(imageView.getTag(), str)) {
            return;
        }
        n11.a b17 = n11.a.b();
        b17.a(null, imageView);
        if (str == null) {
            imageView.setImageDrawable(null);
            return;
        }
        o11.g gVar = cw1.r4.f223297b;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI cleanChattingDetailUI = q4Var.f223265d;
        if (gVar == null) {
            int measuredWidth = cleanChattingDetailUI.f95706n.getMeasuredWidth() / 4;
            o11.f fVar = new o11.f();
            fVar.f342085i = 1;
            fVar.f342080d = false;
            fVar.f342095s = true;
            fVar.f342086j = measuredWidth;
            fVar.f342087k = measuredWidth;
            cw1.r4.f223297b = fVar.a();
        }
        if (z18) {
            o11.f fVar2 = new o11.f();
            fVar2.f342085i = 5;
            fVar2.f342080d = false;
            fVar2.f342095s = true;
            fVar2.f342082f = tv.a.b(str);
            int measuredWidth2 = cleanChattingDetailUI.f95706n.getMeasuredWidth() / 4;
            fVar2.f342086j = measuredWidth2;
            fVar2.f342087k = measuredWidth2;
            a17 = fVar2.a();
        } else {
            a17 = cw1.r4.f223297b;
            if (a17 == null) {
                kotlin.jvm.internal.o.o("imgOpts");
                throw null;
            }
        }
        b17.i(str, imageView, a17, z17 ? q4Var.f223274p : null);
        imageView.setTag(str);
    }

    public static final void x(cw1.q4 q4Var, cw1.b4 b4Var) {
        java.lang.String str;
        bw1.l lVar = (bw1.l) q4Var.f223266e.get(b4Var.f222813d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("[type] ");
        int i17 = lVar.f24810b;
        if (i17 == 1) {
            str = "IMAGE";
        } else if (i17 == 3) {
            str = "VIDEO";
        } else if (i17 == 4) {
            str = "ATTACH";
        } else if (i17 == 5) {
            str = "RECORD";
        } else if (i17 != 6) {
            str = "??? (" + lVar.f24810b + ')';
        } else {
            str = "NOTE";
        }
        sb6.append(str);
        sb6.append("\n[size] ");
        sb6.append(lVar.f24809a);
        sb6.append(" (");
        sb6.append(fp.n0.a(lVar.f24809a));
        sb6.append(")\n[nonLinkSize] ");
        sb6.append(lVar.f24822n);
        sb6.append(" (");
        sb6.append(fp.n0.a(lVar.f24822n));
        sb6.append(")\n[maxLink] ");
        sb6.append(lVar.f24821m);
        sb6.append("\n[files] {\n");
        java.util.Iterator it = ((java.util.ArrayList) lVar.f24823o).iterator();
        while (it.hasNext()) {
            ot1.h hVar = (ot1.h) it.next();
            sb6.append(" * ");
            sb6.append(hVar);
            sb6.append('\n');
        }
        sb6.append("}\n");
        java.util.List list = lVar.f24825q;
        if (list != null) {
            sb6.append("[uuids] {\n");
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                bw1.m mVar = (bw1.m) it6.next();
                sb6.append(" * ");
                sb6.append(mVar.f24826d);
                sb6.append(" x ");
                sb6.append(mVar.f24827e);
                sb6.append('\n');
            }
            sb6.append("}\n");
        }
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI cleanChattingDetailUI = q4Var.f223265d;
        android.widget.TextView textView = new android.widget.TextView(cleanChattingDetailUI);
        textView.setText(sb6);
        textView.setGravity(8388627);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(cleanChattingDetailUI.getColor(com.tencent.mm.R.color.FG_0));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = cleanChattingDetailUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479924j3);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(cleanChattingDetailUI, null, textView, null);
    }

    public final jz5.l B(int i17) {
        return new jz5.l(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) this.f223267f.get(i17)).f302833d).intValue() - i17), java.lang.Integer.valueOf(i17 < this.f223267f.size() + (-1) ? (((java.lang.Number) ((jz5.l) this.f223267f.get(i17 + 1)).f302833d).intValue() - i17) - 1 : this.f223266e.size()));
    }

    public final void I(java.lang.String str, int[] iArr, int[] iArr2, long[] timeRange, int i17, java.lang.Boolean bool, int i18, boolean z17, boolean z18, boolean z19, cw1.c4 c4Var, com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems) {
        kotlin.jvm.internal.o.g(timeRange, "timeRange");
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f223272n;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = new com.tencent.wcdb.support.CancellationSignal();
        this.f223272n = cancellationSignal2;
        ((ku5.t0) ku5.t0.f312615d).b(new cw1.p4(str, iArr, iArr2, timeRange, i17, bool, i18, z17, z18, z19, cancellationSignal2, c4Var, cleanService$SelectedItems, this), "CleanChattingDetailNewAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f223266e.size() + this.f223267f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.util.List list = this.f223267f;
        return kz5.c0.e(list, 0, list.size(), new cw1.l4(java.lang.Integer.valueOf(i17))) >= 0 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String e17;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f223267f;
        int e18 = kz5.c0.e(list, 0, list.size(), new cw1.m4(java.lang.Integer.valueOf(i17)));
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI cleanChattingDetailUI = this.f223265d;
        if (e18 >= 0) {
            cw1.w3 w3Var = (cw1.w3) holder;
            w3Var.f223456d = e18;
            int intValue = ((java.lang.Number) ((jz5.l) this.f223267f.get(e18)).f302834e).intValue();
            java.lang.String string = cleanChattingDetailUI.getString(com.tencent.mm.R.string.f492149fe4);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format("%04d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(intValue >> 8)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            java.lang.String t17 = r26.i0.t(string, "yyyy", format, false);
            java.lang.String format2 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(intValue & 255)}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            w3Var.f223457e.setText(r26.i0.t(t17, "MM", format2, false));
            w3Var.f223458f.setChecked(z(e18));
            return;
        }
        cw1.b4 b4Var = (cw1.b4) holder;
        int i18 = (-e18) - 1;
        int i19 = i17 - i18;
        b4Var.f222813d = i19;
        b4Var.f222814e = i18 - 1;
        bw1.l lVar = (bw1.l) this.f223266e.get(i19);
        boolean z17 = this.f223269h.get(i19);
        android.widget.CheckBox checkBox = b4Var.f222820n;
        if (z17) {
            checkBox.setChecked(true);
            android.view.View view = b4Var.f222819m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            checkBox.setChecked(false);
            android.view.View view2 = b4Var.f222819m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        b4Var.f222816g.setText(fp.n0.a(lVar.f24809a));
        android.widget.TextView textView = b4Var.f222818i;
        textView.setText("");
        android.widget.TextView textView2 = b4Var.f222817h;
        textView2.setText("");
        int i27 = lVar.f24810b;
        if (i27 == 1) {
            E(this, b4Var.f222815f, lVar.f24811c, true, false, 4, null);
            return;
        }
        if (i27 == 3) {
            int i28 = lVar.f24819k;
            if (i28 > 0) {
                textView2.setText(com.tencent.mm.sdk.platformtools.t8.u(i28));
            }
            E(this, b4Var.f222815f, lVar.f24811c, false, lVar.f24816h == 486539313, 2, null);
            return;
        }
        com.tencent.mm.ui.MMImageView mMImageView = b4Var.f222815f;
        if (i27 != 4) {
            if (i27 == 5 || i27 == 6) {
                textView.setText(i27 == 5 ? com.tencent.mm.R.string.f490905b84 : com.tencent.mm.R.string.f490904b83);
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                if (com.tencent.mm.storage.z3.R4(lVar.f24813e)) {
                    java.lang.String str = lVar.f24813e;
                    ((sg3.a) v0Var).getClass();
                    e17 = c01.a2.f(str, str);
                } else {
                    java.lang.String str2 = lVar.f24813e;
                    ((sg3.a) v0Var).getClass();
                    e17 = c01.a2.e(str2);
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                float textSize = textView2.getTextSize();
                ((ke0.e) xVar).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(cleanChattingDetailUI, e17, textSize));
                E(this, b4Var.f222815f, null, false, false, 6, null);
                mMImageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(cleanChattingDetailUI.getColor(com.tencent.mm.R.color.f478832g7)));
                return;
            }
            return;
        }
        textView.setText(com.tencent.mm.R.string.f490903b82);
        java.lang.String str3 = lVar.f24812d;
        if (str3 != null) {
            java.lang.String str4 = lVar.f24817i;
            if (str4 == null) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str3);
                java.lang.String str5 = a17.f213279f;
                if (str5 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
                    if (!str5.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                java.lang.String str6 = a17.f213279f;
                int lastIndexOf = str6.lastIndexOf("/");
                str4 = lastIndexOf < 0 ? str6 : str6.substring(lastIndexOf + 1);
            }
            textView2.setText(str4);
            java.lang.String n17 = com.tencent.mm.vfs.w6.n(lVar.f24812d);
            kotlin.jvm.internal.o.f(n17, "getFileExt(...)");
            java.lang.String lowerCase = n17.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            java.lang.Integer num = (java.lang.Integer) cw1.r4.f223296a.get(lowerCase);
            int intValue2 = num != null ? num.intValue() : com.tencent.mm.R.color.f478833ii;
            E(this, b4Var.f222815f, null, false, false, 6, null);
            mMImageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(cleanChattingDetailUI.getColor(intValue2)));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 0) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.alj, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new cw1.b4(this, inflate);
        }
        android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.f488620yr, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new cw1.w3(this, inflate2);
    }

    public final java.util.List y() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = this.f223266e.size();
        int i17 = -1;
        while (true) {
            i17 = this.f223269h.nextSetBit(i17 + 1);
            if (i17 < 0 || i17 >= size) {
                break;
            }
            arrayList.add((bw1.l) this.f223266e.get(i17));
        }
        return arrayList;
    }

    public final boolean z(int i17) {
        jz5.l B = B(i17);
        return this.f223269h.nextClearBit(((java.lang.Number) B.f302833d).intValue()) >= ((java.lang.Number) B.f302834e).intValue();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 h17, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(h17, "h");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(h17, i17);
            return;
        }
        if (h17 instanceof cw1.b4) {
            cw1.b4 b4Var = (cw1.b4) h17;
            boolean z17 = this.f223269h.get(b4Var.f222813d);
            android.widget.CheckBox checkBox = b4Var.f222820n;
            if (z17) {
                checkBox.setChecked(true);
                android.view.View view = b4Var.f222819m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            checkBox.setChecked(false);
            android.view.View view2 = b4Var.f222819m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (h17 instanceof cw1.w3) {
            cw1.w3 w3Var = (cw1.w3) h17;
            w3Var.f223458f.setChecked(z(w3Var.f223456d));
        }
    }
}
