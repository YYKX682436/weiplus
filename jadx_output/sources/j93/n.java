package j93;

/* loaded from: classes11.dex */
public final class n extends com.tencent.mm.ui.component.UIComponent implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298441d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f298442e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.FlowLayout f298443f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f298444g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f298445h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f298446i;

    /* renamed from: m, reason: collision with root package name */
    public int f298447m;

    /* renamed from: n, reason: collision with root package name */
    public int f298448n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f298449o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f298450p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f298451q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f298452r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f298453s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f298454t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Set f298455u;

    /* renamed from: v, reason: collision with root package name */
    public long f298456v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f298457w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f298458x;

    static {
        new j93.a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298449o = jz5.h.b(new j93.k(activity));
        this.f298450p = new java.util.ArrayList();
        this.f298451q = new java.util.ArrayList();
        this.f298452r = new java.util.ArrayList();
        this.f298453s = new java.util.ArrayList();
        this.f298455u = new java.util.HashSet();
        this.f298457w = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    public final void O6(java.util.ArrayList arrayList, int i17) {
        this.f298448n = i17;
        if (arrayList != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "deal label result: " + arrayList);
            java.util.ArrayList arrayList2 = this.f298451q;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            this.f298453s.clear();
        }
        U6();
        yz5.a aVar = this.f298444g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P6(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j93.n.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String Q6() {
        return (java.lang.String) ((jz5.n) this.f298449o).getValue();
    }

    public final boolean R6() {
        return this.f298453s.size() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6(java.lang.String r3, boolean r4, com.tencent.mm.ui.base.FlowLayout r5, yz5.a r6) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j93.n.S6(java.lang.String, boolean, com.tencent.mm.ui.base.FlowLayout, yz5.a):void");
    }

    public final void T6() {
        if (this.f298445h) {
            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(this.f298441d);
            c93.b a17 = c93.a.a();
            java.util.ArrayList arrayList = this.f298451q;
            java.lang.String h17 = ((b93.b) a17).h(arrayList);
            if (com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                z07.field_contactLabels = "";
                ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(z07);
            } else {
                z07.field_contactLabels = h17;
                if (com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                    z07.field_encryptUsername = this.f298441d;
                }
                ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(z07);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "saveStrangerLabel: " + arrayList);
        }
    }

    public final void U6() {
        android.widget.TextView textView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showRecommendByChatroom start, chatroom labels: ");
        java.util.ArrayList arrayList = this.f298450p;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", sb6.toString());
        com.tencent.mm.ui.base.FlowLayout flowLayout = this.f298443f;
        if (flowLayout != null) {
            flowLayout.removeAllViews();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!this.f298451q.contains((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        java.util.List<java.lang.String> K0 = kz5.n0.K0(arrayList2, 3);
        if (this.f298443f != null) {
            int i17 = 0;
            for (java.lang.String str : K0) {
                android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e3q, (android.view.ViewGroup) null);
                if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.vk7)) != null) {
                    textView.setText(str);
                    com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    textView.setSingleLine();
                }
                com.tencent.mm.ui.base.FlowLayout flowLayout2 = this.f298443f;
                if (flowLayout2 != null) {
                    if (inflate != null) {
                        inflate.setOnClickListener(new j93.l(this, str, flowLayout2, inflate));
                    }
                    flowLayout2.addView(inflate);
                    i17++;
                }
            }
            if (i17 == 0) {
                com.tencent.mm.ui.base.FlowLayout flowLayout3 = this.f298443f;
                if (flowLayout3 != null) {
                    flowLayout3.setVisibility(8);
                }
                this.f298446i = true;
            } else if (!this.f298458x) {
                this.f298458x = true;
                pm0.v.K(null, new j93.j(i17, this));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "showRecommendByChatroom end, total shown labels: " + i17);
        }
    }

    public final void V6(int i17, android.content.Intent intent, boolean z17, java.util.ArrayList labels) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(labels, "labels");
        intent.putExtra("Contact_ReportSessionId", Q6());
        if (z17) {
            intent.putStringArrayListExtra("label_str_list", labels);
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "[startContactLabelUI]: jumpDirectly: " + labels);
            this.f298454t = true;
            this.f298446i = true;
            com.tencent.mm.ui.base.FlowLayout flowLayout = this.f298443f;
            if (flowLayout != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "hide recommend labels for jumpDirectly");
                flowLayout.setVisibility(8);
            }
        } else {
            java.util.ArrayList arrayList = this.f298451q;
            intent.putStringArrayListExtra("label_str_list", new java.util.ArrayList<>(arrayList));
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "[startContactLabelUI]: " + arrayList);
        }
        intent.putExtra("label_username", this.f298441d);
        if (this.f298441d != null) {
            bh5.c cVar = new bh5.c();
            cVar.d(intent);
            cVar.f20922a.f20924a = getContext();
            cVar.a(com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI.class.getName());
            cVar.h(i17);
        }
        pm0.v.K(null, new j93.m(this));
    }

    public final java.util.List W6(java.util.List list) {
        java.util.List arrayList = list == null ? new java.util.ArrayList() : kz5.n0.S0(list);
        java.util.ArrayList arrayList2 = this.f298452r;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        java.util.ArrayList arrayList3 = this.f298451q;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        java.util.ArrayList arrayList4 = this.f298453s;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList4) {
            if (!arrayList.contains((java.lang.String) obj)) {
                arrayList5.add(obj);
            }
        }
        arrayList4.clear();
        arrayList4.addAll(arrayList5);
        arrayList3.addAll(arrayList4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTv: ");
        sb6.append(this.f298445h ? "stranger" : "contact");
        sb6.append('=');
        sb6.append(arrayList);
        sb6.append(", save=");
        sb6.append(arrayList4);
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", sb6.toString());
        return arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x015c A[LOOP:1: B:36:0x0158->B:38:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e  */
    @Override // o13.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X2(p13.v r20) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j93.n.X2(p13.v):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.lang.String str;
        com.tencent.mm.ui.base.FlowLayout flowLayout = this.f298443f;
        if (!(flowLayout != null && flowLayout.getVisibility() == 0) || this.f298454t || this.f298445h || (str = this.f298441d) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "set in black list: ".concat(str));
        this.f298455u.add(str);
        java.util.Set blackList = this.f298455u;
        kotlin.jvm.internal.o.g(blackList, "blackList");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_Name_ShowOuterRecommendLabels").putStringSet("MMKV_Key_ShowOuterRecommendLabels", blackList);
    }
}
