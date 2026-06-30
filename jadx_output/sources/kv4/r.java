package kv4;

/* loaded from: classes12.dex */
public final class r implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f312722a;

    /* renamed from: b, reason: collision with root package name */
    public final mv4.e f312723b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f312724c;

    /* renamed from: d, reason: collision with root package name */
    public final kv4.m f312725d;

    /* renamed from: e, reason: collision with root package name */
    public final jv4.m f312726e;

    public r(int i17, mv4.e boxData, java.util.List data, kv4.m delegate) {
        kotlin.jvm.internal.o.g(boxData, "boxData");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f312722a = i17;
        this.f312723b = boxData;
        this.f312724c = data;
        this.f312725d = delegate;
        this.f312726e = jv4.m.f302247m;
    }

    @Override // jv4.n
    public void c(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kv4.o oVar = holder instanceof kv4.o ? (kv4.o) holder : null;
        if (oVar == null) {
            return;
        }
        com.tencent.mm.ui.kk.f(oVar.f312718d, this.f312722a > 0 ? com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 8) : com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 2));
        qv4.m mVar = (qv4.m) oVar;
        java.util.Iterator it = ((java.util.List) ((jz5.n) mVar.f366997e).getValue()).iterator();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            mv4.e eVar = this.f312723b;
            java.util.List list = this.f312724c;
            if (!hasNext) {
                for (java.lang.Object obj : (java.util.List) ((jz5.n) mVar.f366998f).getValue()) {
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    android.view.View view = (android.view.View) obj;
                    if (i17 >= list.size() || !((rv4.h) eVar).f400483l) {
                        view.setBackground(null);
                    } else {
                        view.setBackground(b3.l.getDrawable(view.getContext(), com.tencent.mm.R.drawable.d9e));
                    }
                    i17 = i19;
                }
                return;
            }
            java.lang.Object next = it.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view2 = (android.view.View) next;
            if (i18 < list.size()) {
                mv4.f fVar = (mv4.f) list.get(i18);
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483931ci2);
                if (textView != null) {
                    textView.setText(((rv4.k) fVar).f400508f);
                }
                jv4.i iVar = ((qv4.r0) this.f312725d).f367010d;
                if (iVar != null ? ((jv4.e) ((jv4.p) iVar).f302262e).f302235a.o() : false) {
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.f484376e25);
                    weImageView.setVisibility(8);
                    int a17 = (int) (ym5.x.a(view2.getContext(), 14.0f) * i65.a.q(view2.getContext()));
                    android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
                    layoutParams.width = a17;
                    layoutParams.height = a17;
                    weImageView.setLayoutParams(layoutParams);
                    java.lang.String str = ((rv4.k) fVar).f400516n;
                    if (str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode == -827570853) {
                            if (str.equals("picture_regular")) {
                                weImageView.setImageResource(com.tencent.mm.R.raw.picture_regular);
                                weImageView.setVisibility(0);
                            }
                            weImageView.setVisibility(8);
                        } else if (hashCode != 104502475) {
                            if (hashCode == 153041747 && str.equals("subscriptions_regular")) {
                                weImageView.setImageResource(com.tencent.mm.R.raw.subscriptions_regular);
                                weImageView.setVisibility(0);
                            }
                            weImageView.setVisibility(8);
                        } else {
                            if (str.equals("folder_regular")) {
                                weImageView.setImageResource(com.tencent.mm.R.raw.folder_regular);
                                weImageView.setVisibility(0);
                            }
                            weImageView.setVisibility(8);
                        }
                    }
                }
                android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.f484036cs5);
                if (findViewById != null) {
                    int i28 = ((rv4.h) eVar).f400483l ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i28));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.h5n);
                if (weImageView2 != null) {
                    pv4.b.d(weImageView2, 16.0f);
                }
                if (weImageView2 != null) {
                    pv4.b.c(weImageView2, 16.0f);
                }
                float f17 = view2.getResources().getDisplayMetrics().density;
                if (((rv4.h) eVar).f400483l) {
                    int i29 = (int) (4 * f17);
                    int i37 = (int) (2 * f17);
                    view2.setPadding(i29, i37, i29, i37);
                } else {
                    int i38 = (int) (2 * f17);
                    view2.setPadding(0, i38, i38, i38);
                }
                view2.setOnClickListener(new kv4.p(fVar, this));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i18 = i27;
        }
    }

    @Override // jv4.n
    public jv4.m getType() {
        return this.f312726e;
    }

    @Override // nv4.g
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        mv4.e eVar = this.f312723b;
        sb6.append(((rv4.h) eVar).f400483l);
        sb6.append('-');
        sb6.append(kz5.n0.g0(this.f312724c, null, null, null, 0, null, kv4.q.f312721d, 31, null));
        sb6.append('-');
        sb6.append(((rv4.h) eVar).f400485n);
        return sb6.toString();
    }

    @Override // nv4.g
    public void w() {
        java.util.Iterator it = this.f312724c.iterator();
        while (it.hasNext()) {
            ((rv4.k) ((mv4.f) it.next())).w();
        }
    }
}
