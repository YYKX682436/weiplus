package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class n0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final float f173326e;

    /* renamed from: f, reason: collision with root package name */
    public final float f173327f;

    /* renamed from: g, reason: collision with root package name */
    public final float f173328g;

    /* renamed from: h, reason: collision with root package name */
    public mj4.h f173329h;

    public n0(int i17) {
        new java.util.HashMap();
        new java.util.HashMap();
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        this.f173326e = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        this.f173327f = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        this.f173328g = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.epy;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String a17;
        java.lang.String string;
        nj4.d item = (nj4.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        this.f173329h = ai4.m0.f5173a.E();
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) holder.p(com.tencent.mm.R.id.m97);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) context;
        java.lang.Math.min(mMFragmentActivity.getWindowManager().getDefaultDisplay().getWidth(), mMFragmentActivity.getWindowManager().getDefaultDisplay().getHeight());
        boolean K = bk4.i.a().K();
        float f17 = this.f173326e;
        float f18 = K ? f17 : this.f173328g;
        if (!bk4.i.a().K()) {
            f17 = this.f173327f;
        }
        if (bk4.i.a().K()) {
            android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) f18);
            }
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd((int) f17);
            }
            recyclerView.setLayoutParams(layoutParams2);
        }
        context.getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.d0v);
        if (item.f337934e) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hnv);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.om7);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        imageView2.setVisibility(0);
        boolean y17 = bk4.i.a().y();
        ai4.e eVar = item.f337936d;
        if (y17) {
            java.lang.String c17 = ((mj4.k) ((mj4.h) eVar.f5135b.get(0))).c();
            mj4.h hVar = this.f173329h;
            if (!kotlin.jvm.internal.o.b(c17, hVar != null ? ((mj4.k) hVar).c() : null)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator it = eVar.f5135b.iterator();
                while (it.hasNext()) {
                    java.lang.String h17 = ((mj4.k) ((mj4.h) it.next())).h();
                    if (hashMap.containsKey(h17)) {
                        java.lang.Integer num = (java.lang.Integer) hashMap.get(h17);
                        hashMap.put(h17, java.lang.Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                    } else {
                        hashMap.put(h17, 1);
                    }
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                int i19 = 0;
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    if (((java.lang.Number) entry.getValue()).intValue() >= i19) {
                        i19 = ((java.lang.Number) entry.getValue()).intValue();
                        hashSet.add(entry.getKey());
                    }
                }
                if (hashSet.size() != 1) {
                    java.util.Iterator it6 = eVar.f5135b.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            a17 = mj4.d.a((mj4.h) eVar.f5135b.get(0));
                            break;
                        }
                        mj4.k kVar = (mj4.k) ((mj4.h) it6.next());
                        if (hashSet.contains(kVar.h())) {
                            a17 = kVar.h();
                            break;
                        }
                    }
                } else {
                    java.util.Iterator it7 = hashSet.iterator();
                    kotlin.jvm.internal.o.f(it7, "iterator(...)");
                    a17 = it7.hasNext() ? (java.lang.String) it7.next() : mj4.d.a((mj4.h) eVar.f5135b.get(0));
                }
            } else {
                mj4.h hVar2 = this.f173329h;
                a17 = hVar2 != null ? ((mj4.k) hVar2).h() : null;
            }
            if (a17 == null) {
                a17 = mj4.d.a((mj4.h) eVar.f5135b.get(0));
            }
        } else {
            a17 = mj4.d.a((mj4.h) eVar.f5135b.get(0));
        }
        bk4.f.V(bk4.i.a(), imageView2, a17, bi4.d.OUTLINED, bi4.b.FG_0, (mj4.h) eVar.f5135b.get(0), false, true, 32, null);
        int size = eVar.f5135b.size();
        if (size > 0) {
            pj4.o0 a18 = xe0.j0.a((xe0.j0) eVar.f5135b.get(0), false, 1, null);
            mj4.h hVar3 = this.f173329h;
            java.lang.String c18 = hVar3 != null ? ((mj4.k) hVar3).c() : null;
            int i27 = kotlin.jvm.internal.o.b(mj4.d.b(a18), c18) ? size == 1 ? 4 : 3 : 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.SameOtherTopicItemConvertV2", "initView: type=" + i27 + ", itemSize=" + size + ", topic ClusterId=" + mj4.d.b(a18) + ", selfClusterId=" + c18);
            if (bk4.i.a().K()) {
                long f19 = c01.id.f(((mj4.k) ((mj4.h) eVar.f5135b.get(0))).f327067b.field_CreateTime) / 3600;
                string = f19 < 1 ? context.getResources().getString(com.tencent.mm.R.string.jx8) : context.getResources().getString(com.tencent.mm.R.string.jx6, java.lang.Long.valueOf(f19));
            } else {
                string = bk4.i.a().G() ? context.getResources().getString(com.tencent.mm.R.string.jvq, java.lang.Integer.valueOf(eVar.f5135b.size())) : bk4.i.a().c(a18, size, bk4.i.a().m(a18), i27);
            }
            kotlin.jvm.internal.o.d(string);
            if (string.length() == 0) {
                if (i27 == 1) {
                    string = context.getResources().getString(com.tencent.mm.R.string.jvt, java.lang.Integer.valueOf(eVar.f5135b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar.f5135b.get(0), false, 1, null)));
                    kotlin.jvm.internal.o.d(string);
                } else if (i27 == 3) {
                    string = context.getResources().getString(com.tencent.mm.R.string.jvu, java.lang.Integer.valueOf(eVar.f5135b.size() - 1), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar.f5135b.get(0), false, 1, null)));
                    kotlin.jvm.internal.o.d(string);
                } else if (i27 != 4) {
                    string = context.getResources().getString(com.tencent.mm.R.string.jvs, java.lang.Integer.valueOf(eVar.f5135b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar.f5135b.get(0), false, 1, null)));
                    kotlin.jvm.internal.o.d(string);
                } else {
                    string = context.getResources().getString(com.tencent.mm.R.string.jvr, bk4.i.a().m(xe0.j0.a((xe0.j0) eVar.f5135b.get(0), false, 1, null)));
                    kotlin.jvm.internal.o.d(string);
                }
            }
            textView.setText(string);
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.m0(this, holder, item));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
