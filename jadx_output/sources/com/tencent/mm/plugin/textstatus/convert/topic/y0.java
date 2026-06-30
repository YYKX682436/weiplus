package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class y0 extends com.tencent.mm.plugin.textstatus.convert.topic.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f173393f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f173394g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final float f173395h = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);

    /* renamed from: i, reason: collision with root package name */
    public final float f173396i = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);

    /* renamed from: m, reason: collision with root package name */
    public final float f173397m;

    /* renamed from: n, reason: collision with root package name */
    public final float f173398n;

    /* renamed from: o, reason: collision with root package name */
    public mj4.h f173399o;

    public y0(int i17) {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        this.f173397m = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        this.f173398n = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
    }

    public static final void o(com.tencent.mm.plugin.textstatus.convert.topic.y0 y0Var, ym3.p pVar, in5.s0 s0Var, nj4.e eVar, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.lang.String str) {
        java.util.List list;
        java.util.ArrayList arrayList;
        y0Var.getClass();
        if (pVar == ym3.p.f463181f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.SquareItemConvert", "handleListLoadStateChanged: UIRefresh size=" + eVar.f337936d.f5135b.size() + ", curItemTopicId=" + str + ", itemHash=" + eVar.hashCode() + ", holderHash=" + s0Var.hashCode());
            if (mvvmList == null || (arrayList = mvvmList.f152065o) == null) {
                list = null;
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mj4.h hVar = ((com.tencent.mm.plugin.textstatus.convert.topic.d) it.next()).f173267g;
                    if (hVar != null) {
                        arrayList2.add(hVar);
                    }
                }
                list = kz5.n0.V0(arrayList2);
            }
            if (list != null) {
                y0Var.q(s0Var, new nj4.e(new ai4.e(str, list)));
            } else {
                y0Var.q(s0Var, eVar);
            }
        }
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.d07;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r26, in5.c r27, int r28, int r29, boolean r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.convert.topic.y0.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // com.tencent.mm.plugin.textstatus.convert.topic.a
    public void n(android.content.Context context, nj4.e item) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
    }

    public void p(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = (com.tencent.mm.plugin.mvvmlist.MvvmList) this.f173393f.get(str);
        java.util.List list = (java.util.List) this.f173394g.get(str);
        if (list != null && this.f173253e > 0) {
            int size = list.size();
            int i17 = this.f173253e;
            if (size >= i17 + 1) {
                if (mvvmList != null) {
                    mvvmList.u((xm3.d) list.get(i17));
                }
                java.util.List subList = list.subList(this.f173253e + 1, list.size());
                if (mvvmList != null) {
                    com.tencent.mm.plugin.mvvmlist.MvvmList.p(mvvmList, subList, false, 2, null);
                }
            }
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((java.util.HashMap) ((com.tencent.mm.plugin.textstatus.ui.mg) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.mg.class)).f174107d).put(str, java.lang.Boolean.FALSE);
    }

    public final void q(in5.s0 s0Var, nj4.e eVar) {
        java.lang.String a17;
        java.lang.String string;
        java.lang.String string2;
        ((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.d0v)).setVisibility(0);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.hnv);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.om7);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        imageView.setVisibility(0);
        if (bk4.i.a().y()) {
            java.lang.String c17 = ((mj4.k) ((mj4.h) eVar.f337936d.f5135b.get(0))).c();
            mj4.h hVar = this.f173399o;
            if (!kotlin.jvm.internal.o.b(c17, hVar != null ? ((mj4.k) hVar).c() : null)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                ai4.e eVar2 = eVar.f337936d;
                java.util.Iterator it = eVar2.f5135b.iterator();
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
                int i17 = 0;
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    if (((java.lang.Number) entry.getValue()).intValue() >= i17) {
                        i17 = ((java.lang.Number) entry.getValue()).intValue();
                        hashSet.add(entry.getKey());
                    }
                }
                if (hashSet.size() != 1) {
                    java.util.Iterator it6 = eVar2.f5135b.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            a17 = mj4.d.a((mj4.h) eVar2.f5135b.get(0));
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
                    a17 = it7.hasNext() ? (java.lang.String) it7.next() : mj4.d.a((mj4.h) eVar2.f5135b.get(0));
                }
            } else {
                mj4.h hVar2 = this.f173399o;
                a17 = hVar2 != null ? ((mj4.k) hVar2).h() : null;
            }
            if (a17 == null) {
                a17 = mj4.d.a((mj4.h) eVar.f337936d.f5135b.get(0));
            }
        } else {
            a17 = mj4.d.a((mj4.h) eVar.f337936d.f5135b.get(0));
        }
        bk4.f.V(bk4.i.a(), imageView, a17, bi4.d.OUTLINED, bi4.b.FG_0, (mj4.h) eVar.f337936d.f5135b.get(0), false, true, 32, null);
        ai4.e eVar3 = eVar.f337936d;
        int size = eVar3.f5135b.size();
        if (size > 0) {
            pj4.o0 a18 = xe0.j0.a((xe0.j0) eVar3.f5135b.get(0), false, 1, null);
            mj4.h hVar3 = this.f173399o;
            java.lang.String c18 = hVar3 != null ? ((mj4.k) hVar3).c() : null;
            int i18 = kotlin.jvm.internal.o.b(mj4.d.b(a18), c18) ? size == 1 ? 4 : 3 : 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.SameOtherTopicItemConvertV2", "initView: type=" + i18 + ", itemSize=" + size + ", topic ClusterId=" + mj4.d.b(a18) + ", selfClusterId=" + c18);
            boolean K = bk4.i.a().K();
            android.content.Context context = s0Var.f293121e;
            if (K) {
                long f17 = c01.id.f(((mj4.k) ((mj4.h) eVar3.f5135b.get(0))).f327067b.field_CreateTime) / 3600;
                string = f17 < 1 ? context.getResources().getString(com.tencent.mm.R.string.jx8) : context.getResources().getString(com.tencent.mm.R.string.jx6, java.lang.Long.valueOf(f17));
            } else {
                string = bk4.i.a().G() ? context.getResources().getString(com.tencent.mm.R.string.jvq, java.lang.Integer.valueOf(eVar3.f5135b.size())) : bk4.i.a().c(a18, size, bk4.i.a().m(a18), i18);
            }
            kotlin.jvm.internal.o.d(string);
            if (string.length() == 0) {
                if (i18 == 1) {
                    string2 = context.getResources().getString(com.tencent.mm.R.string.jvt, java.lang.Integer.valueOf(eVar3.f5135b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar3.f5135b.get(0), false, 1, null)));
                    kotlin.jvm.internal.o.d(string2);
                } else if (i18 == 3) {
                    string2 = context.getResources().getString(com.tencent.mm.R.string.jvu, java.lang.Integer.valueOf(eVar3.f5135b.size() - 1), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar3.f5135b.get(0), false, 1, null)));
                    kotlin.jvm.internal.o.d(string2);
                } else if (i18 != 4) {
                    string2 = context.getResources().getString(com.tencent.mm.R.string.jvs, java.lang.Integer.valueOf(eVar3.f5135b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar3.f5135b.get(0), false, 1, null)));
                    kotlin.jvm.internal.o.d(string2);
                } else {
                    string2 = context.getResources().getString(com.tencent.mm.R.string.jvr, bk4.i.a().m(xe0.j0.a((xe0.j0) eVar3.f5135b.get(0), false, 1, null)));
                    kotlin.jvm.internal.o.d(string2);
                }
                string = string2;
            }
            textView.setText(string);
        }
    }
}
