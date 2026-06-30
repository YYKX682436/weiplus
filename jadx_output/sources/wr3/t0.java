package wr3;

/* loaded from: classes11.dex */
public final class t0 extends wr3.i {
    public int A;
    public final jz5.g B;
    public final java.lang.ref.WeakReference C;
    public final com.tencent.mm.sdk.event.IListener D;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f448879m;

    /* renamed from: n, reason: collision with root package name */
    public final int f448880n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f448881o;

    /* renamed from: p, reason: collision with root package name */
    public final long f448882p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f448883q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f448884r;

    /* renamed from: s, reason: collision with root package name */
    public final sr3.g f448885s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f448886t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f448887u;

    /* renamed from: v, reason: collision with root package name */
    public r45.gl f448888v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f448889w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f448890x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f448891y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f448892z;

    public t0(android.content.Context context, int i17, com.tencent.mm.storage.z3 contact, long j17, boolean z17, boolean z18, sr3.g config, java.lang.String bizUsername, final androidx.lifecycle.y lifecycleOwner) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f448879m = context;
        this.f448880n = i17;
        this.f448881o = contact;
        this.f448882p = j17;
        this.f448883q = z17;
        this.f448884r = z18;
        this.f448885s = config;
        this.f448886t = "BizProfileTabFeaturedMsgAdapter";
        this.f448887u = new java.util.ArrayList();
        this.f448889w = 0;
        this.B = jz5.h.b(wr3.r0.f448872d);
        this.C = new java.lang.ref.WeakReference(this);
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(lifecycleOwner) { // from class: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabFeaturedMsgAdapter$tingPlayerListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                wr3.t0 t0Var = this;
                wr3.t0 t0Var2 = (wr3.t0) t0Var.C.get();
                if (t0Var2 == null) {
                    return false;
                }
                int i18 = event.f54512g.f7036b;
                ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) t0Var.B).getValue()).post(new wr3.s0(t0Var2));
                return false;
            }
        };
    }

    @Override // wr3.i
    public android.content.Context B() {
        return this.f448879m;
    }

    @Override // wr3.i
    public long E() {
        return this.f448882p;
    }

    @Override // wr3.i
    public boolean J() {
        return this.f448884r;
    }

    @Override // wr3.i
    public boolean K() {
        return this.f448883q;
    }

    public final void L(r45.s5 s5Var, wr3.n0 n0Var) {
        java.util.LinkedList linkedList;
        r45.p5 p5Var = s5Var.f385514i;
        if ((p5Var != null ? p5Var.f382754e : null) == null || p5Var.f382754e.isEmpty()) {
            com.tencent.mars.xlog.Log.w(this.f448886t, "DetailInfo is null or empty, skip adding message");
            return;
        }
        int size = s5Var.f385514i.f382754e.size();
        r45.o5 o5Var = (r45.o5) s5Var.f385514i.f382754e.get(0);
        int i17 = o5Var.f381923p;
        java.util.ArrayList arrayList = this.f448887u;
        if (i17 == 8) {
            r45.y5 y5Var = s5Var.f385509d;
            if (y5Var != null && y5Var.f390796m == 1) {
                arrayList.add(new jz5.o(wr3.o0.f448860p, n0Var, s5Var));
                return;
            }
        }
        if (size == 1) {
            if (i17 == 5) {
                arrayList.add(new jz5.o(wr3.o0.f448854g, n0Var, s5Var));
                return;
            }
            if (i17 == 8) {
                r45.l5 l5Var = s5Var.f385514i.f382753d;
                if ((l5Var != null ? l5Var.f379142h : 0) == 1) {
                    r45.g6 g6Var = o5Var.K;
                    if (((g6Var == null || (linkedList = g6Var.f374909d) == null) ? 0 : linkedList.size()) >= 3 && !com.tencent.mm.sdk.platformtools.t8.K0(((r45.t5) o5Var.K.f374909d.get(0)).f386148g)) {
                        arrayList.add(new jz5.o(wr3.o0.f448859o, n0Var, s5Var));
                        return;
                    }
                }
            }
            int i18 = o5Var.f381923p;
            if (i18 == 8) {
                arrayList.add(new jz5.o(wr3.o0.f448855h, n0Var, s5Var));
                return;
            }
            if (i18 == 10) {
                arrayList.add(new jz5.o(wr3.o0.f448853f, n0Var, s5Var));
                return;
            } else if (i18 == 19) {
                arrayList.add(new jz5.o(wr3.o0.f448857m, n0Var, s5Var));
                return;
            } else if (i18 == 0 && s5Var.f385514i.f382753d.f379142h == 1) {
                arrayList.add(new jz5.o(wr3.o0.f448858n, n0Var, s5Var));
                return;
            }
        }
        arrayList.add(new jz5.o(wr3.o0.f448856i, n0Var, s5Var));
    }

    public final void M(r45.s5 s5Var, wr3.n0 n0Var) {
        java.lang.String str = this.f448886t;
        if (s5Var == null) {
            com.tencent.mars.xlog.Log.w(str, "addMessageWithStatus msg null");
            return;
        }
        r45.p5 p5Var = s5Var.f385514i;
        boolean z17 = false;
        boolean z18 = p5Var == null || p5Var.f382754e.size() == 0;
        int i17 = s5Var.f385509d.f390791e;
        if (i17 == 1 && s5Var.f385510e == null) {
            z17 = true;
        }
        if (z18 && z17) {
            com.tencent.mars.xlog.Log.e(str, "updateData fail, appMsgTypeLegal = " + z18 + ", oldTextLegal = " + z17);
            return;
        }
        wr3.n0 n0Var2 = wr3.n0.f448842f;
        if (n0Var != n0Var2) {
            L(s5Var, n0Var);
        } else if (i17 == 1) {
            this.f448887u.add(new jz5.o(wr3.o0.f448853f, n0Var2, s5Var));
        } else {
            if (i17 != 49) {
                return;
            }
            L(s5Var, n0Var);
        }
    }

    public final void N(r45.gl v2RespMsgList, java.lang.Integer num, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        int i17;
        java.util.LinkedList<r45.o5> linkedList3;
        java.util.LinkedList linkedList4;
        kotlin.jvm.internal.o.g(v2RespMsgList, "v2RespMsgList");
        r45.gl glVar = new r45.gl();
        glVar.f375323d = new java.util.LinkedList(v2RespMsgList.f375323d);
        glVar.f375326g = v2RespMsgList.f375326g;
        this.f448888v = glVar;
        this.f448889w = num;
        this.f448890x = linkedList;
        this.f448891y = linkedList2;
        java.util.ArrayList arrayList = this.f448887u;
        arrayList.clear();
        java.util.LinkedList linkedList5 = this.f448891y;
        java.lang.String str = this.f448886t;
        if (linkedList5 == null || linkedList5.isEmpty()) {
            com.tencent.mars.xlog.Log.i(str, "no draftMessage");
        } else {
            java.util.LinkedList linkedList6 = this.f448891y;
            kotlin.jvm.internal.o.d(linkedList6);
            java.util.Iterator it = linkedList6.iterator();
            while (it.hasNext()) {
                vr3.h hVar = (vr3.h) it.next();
                r45.s5 s5Var = hVar.f439631a;
                wr3.n0 n0Var = hVar.f439632b;
                if (n0Var == null) {
                    n0Var = wr3.n0.f448842f;
                }
                M(s5Var, n0Var);
            }
        }
        r45.gl glVar2 = this.f448888v;
        if (glVar2 == null) {
            kotlin.jvm.internal.o.o("v2RespMsgList");
            throw null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(glVar2.f375323d)) {
            com.tencent.mars.xlog.Log.i(str, "no v2resp msg");
        } else {
            java.lang.Integer num2 = this.f448889w;
            if ((num2 == null || num2.intValue() < 0 || (linkedList4 = this.f448890x) == null || com.tencent.mm.sdk.platformtools.t8.L0(linkedList4)) ? false : true) {
                java.util.LinkedList linkedList7 = this.f448890x;
                kotlin.jvm.internal.o.d(linkedList7);
                r45.p5 p5Var = ((r45.s5) linkedList7.get(0)).f385514i;
                if (p5Var == null || (linkedList3 = p5Var.f382754e) == null || linkedList3.isEmpty()) {
                    i17 = 0;
                } else {
                    i17 = 0;
                    for (r45.o5 o5Var : linkedList3) {
                        if ((!(o5Var != null && o5Var.f381923p == 8)) && (i17 = i17 + 1) < 0) {
                            kz5.c0.o();
                            throw null;
                        }
                    }
                }
                this.f448817g = i17;
                zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
                java.lang.String d17 = this.f448881o.d1();
                yq1.z zVar = (yq1.z) a0Var;
                zVar.getClass();
                long q17 = zVar.k().q(("Biz_" + gm0.j1.b().j() + "_EnterProfileTime") + '_' + d17, 0L);
                java.lang.Integer num3 = this.f448889w;
                kotlin.jvm.internal.o.d(num3);
                boolean z17 = (((((long) num3.intValue()) * ((long) 1000)) > q17 ? 1 : ((((long) num3.intValue()) * ((long) 1000)) == q17 ? 0 : -1)) > 0) || this.f448816f;
                r45.gl glVar3 = this.f448888v;
                if (glVar3 == null) {
                    kotlin.jvm.internal.o.o("v2RespMsgList");
                    throw null;
                }
                int i18 = ((r45.s5) glVar3.f375323d.get(0)).f385516n;
                yr3.o0[] o0VarArr = yr3.o0.f464965d;
                if (i18 != 0) {
                    r45.gl glVar4 = this.f448888v;
                    if (glVar4 == null) {
                        kotlin.jvm.internal.o.o("v2RespMsgList");
                        throw null;
                    }
                    glVar4.f375323d.remove(0);
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i(str, "add featured expand msg");
                    java.util.LinkedList linkedList8 = this.f448890x;
                    kotlin.jvm.internal.o.d(linkedList8);
                    ((r45.s5) linkedList8.get(0)).f385516n = 2;
                    r45.gl glVar5 = this.f448888v;
                    if (glVar5 == null) {
                        kotlin.jvm.internal.o.o("v2RespMsgList");
                        throw null;
                    }
                    java.util.LinkedList linkedList9 = glVar5.f375323d;
                    java.util.LinkedList linkedList10 = this.f448890x;
                    kotlin.jvm.internal.o.d(linkedList10);
                    linkedList9.add(0, linkedList10.get(0));
                } else {
                    com.tencent.mars.xlog.Log.i(str, "add featured collapse msg");
                    java.util.LinkedList linkedList11 = this.f448890x;
                    kotlin.jvm.internal.o.d(linkedList11);
                    ((r45.s5) linkedList11.get(0)).f385516n = 1;
                    r45.gl glVar6 = this.f448888v;
                    if (glVar6 == null) {
                        kotlin.jvm.internal.o.o("v2RespMsgList");
                        throw null;
                    }
                    java.util.LinkedList linkedList12 = glVar6.f375323d;
                    java.util.LinkedList linkedList13 = this.f448890x;
                    kotlin.jvm.internal.o.d(linkedList13);
                    linkedList12.add(0, linkedList13.get(0));
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "no featured list");
                this.f448817g = 0;
            }
        }
        r45.gl glVar7 = this.f448888v;
        if (glVar7 == null) {
            kotlin.jvm.internal.o.o("v2RespMsgList");
            throw null;
        }
        java.util.Iterator it6 = glVar7.f375323d.iterator();
        while (it6.hasNext()) {
            M((r45.s5) it6.next(), wr3.n0.f448842f);
        }
        r45.gl glVar8 = this.f448888v;
        if (glVar8 == null) {
            kotlin.jvm.internal.o.o("v2RespMsgList");
            throw null;
        }
        java.util.LinkedList Msg = glVar8.f375323d;
        kotlin.jvm.internal.o.f(Msg, "Msg");
        if (!Msg.isEmpty()) {
            r45.gl glVar9 = this.f448888v;
            if (glVar9 == null) {
                kotlin.jvm.internal.o.o("v2RespMsgList");
                throw null;
            }
            r45.ul ulVar = glVar9.f375326g;
            if (ulVar != null && ulVar.f387453e == 0) {
                arrayList.add(new jz5.o(wr3.o0.f448861q, wr3.n0.f448842f, new r45.s5()));
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f448887u.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((wr3.o0) ((jz5.o) this.f448887u.get(i17)).f302841d).f448863d;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        yz5.a aVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f448887u;
        if (i17 == arrayList.size() - 1 && (aVar = this.f448815e) != null) {
            aVar.invoke();
        }
        java.lang.String d17 = this.f448881o.d1();
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String str = d17;
        boolean z17 = holder instanceof wr3.f2;
        yr3.w wVar = yr3.w.f465059a;
        if (z17) {
            wr3.f2 f2Var = (wr3.f2) holder;
            r45.s5 bizMessage = (r45.s5) ((jz5.o) arrayList.get(i17)).f302843f;
            wr3.n0 itemStatus = (wr3.n0) ((jz5.o) arrayList.get(i17)).f302842e;
            boolean z18 = this.f448884r;
            int i18 = this.f448880n;
            kotlin.jvm.internal.o.g(bizMessage, "bizMessage");
            kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
            if (itemStatus == wr3.n0.f448842f || itemStatus == wr3.n0.f448846m) {
                wVar.l(bizMessage, str);
            }
            fq1.e.h(fq1.e.f265507a, f2Var.f448800q, i65.a.b(f2Var.f448792f, 8), false, false, 12, null);
            android.content.Context context = f2Var.f448792f;
            wr3.t0 t0Var = f2Var.f448790d;
            android.view.View view = f2Var.f448795i;
            kotlin.jvm.internal.o.d(view);
            android.view.View view2 = f2Var.f448796m;
            kotlin.jvm.internal.o.d(view2);
            android.view.View view3 = f2Var.f448800q;
            kotlin.jvm.internal.o.d(view3);
            android.widget.TextView textView = f2Var.f448797n;
            kotlin.jvm.internal.o.d(textView);
            android.view.View view4 = f2Var.f448798o;
            kotlin.jvm.internal.o.d(view4);
            wVar.h(context, t0Var, bizMessage, view, view2, view3, textView, view4, new wr3.e2(f2Var, bizMessage, itemStatus, z18, i18));
            return;
        }
        if (holder instanceof yr3.i0) {
            yr3.i0 i0Var = (yr3.i0) holder;
            r45.s5 bizMessage2 = (r45.s5) ((jz5.o) arrayList.get(i17)).f302843f;
            wr3.n0 itemStatus2 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f302842e;
            boolean z19 = this.f448884r;
            int i19 = this.f448880n;
            kotlin.jvm.internal.o.g(bizMessage2, "bizMessage");
            kotlin.jvm.internal.o.g(itemStatus2, "itemStatus");
            if (itemStatus2 == wr3.n0.f448842f || itemStatus2 == wr3.n0.f448846m) {
                wVar.l(bizMessage2, str);
            }
            fq1.e.h(fq1.e.f265507a, i0Var.f464862o, i65.a.b(i0Var.f464856f, 8), false, false, 12, null);
            android.content.Context context2 = i0Var.f464856f;
            wr3.t0 t0Var2 = i0Var.f464854d;
            android.view.View view5 = i0Var.f464857g;
            kotlin.jvm.internal.o.d(view5);
            android.view.View view6 = i0Var.f464858h;
            kotlin.jvm.internal.o.d(view6);
            android.view.View view7 = i0Var.f464862o;
            kotlin.jvm.internal.o.d(view7);
            android.widget.TextView textView2 = i0Var.f464859i;
            kotlin.jvm.internal.o.d(textView2);
            android.view.View view8 = i0Var.f464860m;
            kotlin.jvm.internal.o.d(view8);
            wVar.h(context2, t0Var2, bizMessage2, view5, view6, view7, textView2, view8, new yr3.h0(i0Var, bizMessage2, itemStatus2, z19, i19));
            return;
        }
        if (holder instanceof yr3.k0) {
            yr3.k0 k0Var = (yr3.k0) holder;
            r45.s5 bizMessage3 = (r45.s5) ((jz5.o) arrayList.get(i17)).f302843f;
            wr3.n0 itemStatus3 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f302842e;
            boolean z27 = this.f448884r;
            int i27 = this.f448880n;
            kotlin.jvm.internal.o.g(bizMessage3, "bizMessage");
            kotlin.jvm.internal.o.g(itemStatus3, "itemStatus");
            if (itemStatus3 == wr3.n0.f448842f || itemStatus3 == wr3.n0.f448846m) {
                wVar.l(bizMessage3, str);
            }
            fq1.e.h(fq1.e.f265507a, k0Var.f464905r, i65.a.b(k0Var.f464896f, 8), false, false, 12, null);
            android.content.Context context3 = k0Var.f464896f;
            wr3.t0 t0Var3 = k0Var.f464894d;
            android.view.View view9 = k0Var.f464900m;
            kotlin.jvm.internal.o.d(view9);
            android.view.View view10 = k0Var.f464901n;
            kotlin.jvm.internal.o.d(view10);
            android.view.View view11 = k0Var.f464905r;
            kotlin.jvm.internal.o.d(view11);
            android.widget.TextView textView3 = k0Var.f464902o;
            kotlin.jvm.internal.o.d(textView3);
            android.view.View view12 = k0Var.f464903p;
            kotlin.jvm.internal.o.d(view12);
            wVar.h(context3, t0Var3, bizMessage3, view9, view10, view11, textView3, view12, new yr3.j0(k0Var, bizMessage3, itemStatus3, z27, i27));
            return;
        }
        if (holder instanceof yr3.y) {
            ((yr3.y) holder).i((r45.s5) ((jz5.o) arrayList.get(i17)).f302843f, (wr3.n0) ((jz5.o) arrayList.get(i17)).f302842e, i17, this.f448884r, str, this.f448880n);
            return;
        }
        if (holder instanceof yr3.e0) {
            yr3.e0 e0Var = (yr3.e0) holder;
            r45.s5 bizMessage4 = (r45.s5) ((jz5.o) arrayList.get(i17)).f302843f;
            wr3.n0 itemStatus4 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f302842e;
            kotlin.jvm.internal.o.g(bizMessage4, "bizMessage");
            kotlin.jvm.internal.o.g(itemStatus4, "itemStatus");
            fq1.e.h(fq1.e.f265507a, e0Var.f464791n, i65.a.b(e0Var.f464786f, 8), false, false, 12, null);
            android.content.Context context4 = e0Var.f464786f;
            wr3.t0 t0Var4 = e0Var.f464784d;
            android.view.View view13 = e0Var.f464787g;
            kotlin.jvm.internal.o.d(view13);
            android.view.View view14 = e0Var.f464788h;
            kotlin.jvm.internal.o.d(view14);
            android.view.View view15 = e0Var.f464791n;
            kotlin.jvm.internal.o.d(view15);
            android.widget.TextView textView4 = e0Var.f464789i;
            kotlin.jvm.internal.o.d(textView4);
            android.view.View view16 = e0Var.f464790m;
            kotlin.jvm.internal.o.d(view16);
            wVar.h(context4, t0Var4, bizMessage4, view13, view14, view15, textView4, view16, new yr3.b0(e0Var, bizMessage4, itemStatus4, this.f448884r));
            return;
        }
        if (holder instanceof yr3.g0) {
            ((yr3.g0) holder).i((r45.s5) ((jz5.o) arrayList.get(i17)).f302843f, (wr3.n0) ((jz5.o) arrayList.get(i17)).f302842e, i17, this.f448884r, str, this.f448880n);
            return;
        }
        if (holder instanceof yr3.m0) {
            yr3.m0 m0Var = (yr3.m0) holder;
            r45.s5 bizMessage5 = (r45.s5) ((jz5.o) arrayList.get(i17)).f302843f;
            wr3.n0 itemStatus5 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f302842e;
            boolean z28 = this.f448884r;
            int i28 = this.f448880n;
            kotlin.jvm.internal.o.g(bizMessage5, "bizMessage");
            kotlin.jvm.internal.o.g(itemStatus5, "itemStatus");
            if (itemStatus5 == wr3.n0.f448842f || itemStatus5 == wr3.n0.f448846m) {
                wVar.l(bizMessage5, str);
            }
            fq1.e.h(fq1.e.f265507a, m0Var.f464940o, i65.a.b(m0Var.f464934f, 8), false, false, 12, null);
            android.content.Context context5 = m0Var.f464934f;
            wr3.t0 t0Var5 = m0Var.f464932d;
            android.view.View view17 = m0Var.f464935g;
            kotlin.jvm.internal.o.d(view17);
            android.view.View view18 = m0Var.f464936h;
            kotlin.jvm.internal.o.d(view18);
            android.view.View view19 = m0Var.f464940o;
            kotlin.jvm.internal.o.d(view19);
            android.widget.TextView textView5 = m0Var.f464937i;
            kotlin.jvm.internal.o.d(textView5);
            android.view.View view20 = m0Var.f464938m;
            kotlin.jvm.internal.o.d(view20);
            wVar.h(context5, t0Var5, bizMessage5, view17, view18, view19, textView5, view20, new yr3.l0(m0Var, bizMessage5, itemStatus5, z28, i28));
            return;
        }
        if (holder instanceof yr3.h1) {
            yr3.h1 h1Var = (yr3.h1) holder;
            r45.s5 bizMessage6 = (r45.s5) ((jz5.o) arrayList.get(i17)).f302843f;
            wr3.n0 itemStatus6 = (wr3.n0) ((jz5.o) arrayList.get(i17)).f302842e;
            boolean z29 = this.f448884r;
            int i29 = this.f448880n;
            kotlin.jvm.internal.o.g(bizMessage6, "bizMessage");
            kotlin.jvm.internal.o.g(itemStatus6, "itemStatus");
            wVar.l(bizMessage6, str);
            android.widget.TextView textView6 = h1Var.f464843i;
            android.text.TextPaint paint = textView6 != null ? textView6.getPaint() : null;
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint2 = textView6 != null ? textView6.getPaint() : null;
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
            r45.p5 p5Var = bizMessage6.f385514i;
            r45.o5 o5Var = (p5Var == null || (linkedList2 = p5Var.f382754e) == null) ? null : (r45.o5) kz5.n0.a0(linkedList2, 0);
            r45.p5 p5Var2 = bizMessage6.f385514i;
            r45.o5 o5Var2 = (p5Var2 == null || (linkedList = p5Var2.f382754e) == null) ? null : (r45.o5) kz5.n0.a0(linkedList, 1);
            r45.p5 p5Var3 = bizMessage6.f385514i;
            java.util.LinkedList linkedList3 = p5Var3 != null ? p5Var3.f382754e : null;
            android.widget.TextView textView7 = h1Var.f464844m;
            if (linkedList3 == null || p5Var3.f382754e.size() < 2) {
                textView7.setVisibility(8);
            } else {
                textView7.setVisibility(0);
                textView7.setOnClickListener(new yr3.f1(h1Var));
            }
            yr3.e1 e1Var = h1Var.f464847p;
            boolean z37 = e1Var.f464796a.getVisibility() == 0;
            yr3.e1 e1Var2 = h1Var.f464848q;
            boolean z38 = e1Var2.f464796a.getVisibility() == 0;
            if (z37 && z38) {
                e1Var.f464801f.getViewTreeObserver().addOnGlobalLayoutListener(new yr3.g1(h1Var));
            }
            h1Var.i(bizMessage6, o5Var, z29, i29, i17, h1Var.f464847p);
            h1Var.i(bizMessage6, o5Var2, z29, i29, i17, h1Var.f464848q);
            android.view.View view21 = e1Var.f464796a;
            android.view.ViewGroup.LayoutParams layoutParams = view21.getLayoutParams();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
            boolean z39 = e1Var2.f464796a.getVisibility() == 0;
            if (layoutParams2 != null) {
                if (z39) {
                    layoutParams2.f10907r = com.tencent.mm.R.id.syj;
                } else {
                    layoutParams2.f10908s = -1;
                    layoutParams2.f10907r = -1;
                }
                view21.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        wr3.o0 o0Var = wr3.o0.f448852e;
        if (i17 == 90) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a19, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new yr3.z(inflate);
        }
        wr3.o0 o0Var2 = wr3.o0.f448852e;
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0x, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new wr3.f2(this, inflate2);
        }
        wr3.o0 o0Var3 = wr3.o0.f448852e;
        if (i17 == 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0w, parent, false);
            kotlin.jvm.internal.o.d(inflate3);
            return new yr3.i0(this, inflate3);
        }
        wr3.o0 o0Var4 = wr3.o0.f448852e;
        if (i17 == 1) {
            android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0y, parent, false);
            kotlin.jvm.internal.o.d(inflate4);
            return new yr3.k0(this, inflate4);
        }
        wr3.o0 o0Var5 = wr3.o0.f448852e;
        int i18 = this.f448880n;
        if (i17 == 4) {
            android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0g, parent, false);
            kotlin.jvm.internal.o.d(inflate5);
            return new yr3.y(this, inflate5, i18);
        }
        wr3.o0 o0Var6 = wr3.o0.f448852e;
        if (i17 == 5) {
            android.view.View inflate6 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0t, parent, false);
            kotlin.jvm.internal.o.d(inflate6);
            return new yr3.e0(this, inflate6);
        }
        wr3.o0 o0Var7 = wr3.o0.f448852e;
        if (i17 == 6) {
            android.view.View inflate7 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dno, parent, false);
            kotlin.jvm.internal.o.d(inflate7);
            return new yr3.g0(this, inflate7);
        }
        wr3.o0 o0Var8 = wr3.o0.f448852e;
        if (i17 == 7) {
            android.view.View inflate8 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dpu, parent, false);
            kotlin.jvm.internal.o.d(inflate8);
            return new yr3.m0(this, inflate8);
        }
        wr3.o0 o0Var9 = wr3.o0.f448852e;
        if (i17 == 8) {
            android.view.View inflate9 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e3e, parent, false);
            kotlin.jvm.internal.o.d(inflate9);
            return new yr3.h1(this, inflate9, this.A, this.f448885s.g());
        }
        android.view.View inflate10 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a0g, parent, false);
        kotlin.jvm.internal.o.d(inflate10);
        return new yr3.y(this, inflate10, i18);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 holder) {
        wr3.j jVar;
        java.util.LinkedList linkedList;
        r45.o5 o5Var;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int adapterPosition = holder.getAdapterPosition();
        sr3.a g17 = this.f448885s.g();
        sr3.a aVar = sr3.a.f411829e;
        android.content.Context context = this.f448879m;
        if (g17 == aVar && context != null && (context instanceof com.tencent.mm.plugin.profile.ui.ContactInfoUI) && !this.f448892z) {
            gr3.c.d((com.tencent.mm.plugin.profile.ui.ContactInfoUI) context);
            this.f448892z = true;
        }
        if (adapterPosition >= 0) {
            java.util.ArrayList arrayList = this.f448887u;
            if (adapterPosition >= arrayList.size() || ((jz5.o) arrayList.get(adapterPosition)).f302841d == wr3.o0.f448852e || ((jz5.o) arrayList.get(adapterPosition)).f302841d == wr3.o0.f448856i) {
                return;
            }
            r45.p5 p5Var = ((r45.s5) ((jz5.o) arrayList.get(adapterPosition)).f302843f).f385514i;
            if (((p5Var == null || (linkedList2 = p5Var.f382754e) == null) ? 0 : linkedList2.size()) > 0) {
                int i17 = ((r45.s5) ((jz5.o) arrayList.get(adapterPosition)).f302843f).f385514i.f382753d.f379138d;
                r45.p5 p5Var2 = ((r45.s5) ((jz5.o) arrayList.get(adapterPosition)).f302843f).f385514i;
                java.lang.String str = (p5Var2 == null || (linkedList = p5Var2.f382754e) == null || (o5Var = (r45.o5) linkedList.get(0)) == null) ? null : o5Var.f381917h;
                com.tencent.mm.storage.z3 z3Var = this.f448881o;
                int i18 = !z3Var.n2() ? 1 : 0;
                wr3.j jVar2 = this.f448814d;
                if (((java.util.HashSet) jVar2.f448822a).contains(jVar2.a(i17, 0))) {
                    return;
                }
                if (this.f448884r) {
                    jVar = jVar2;
                    gr3.b bVar = gr3.b.f274847a;
                    bVar.b(java.lang.Long.valueOf(((r45.s5) ((jz5.o) arrayList.get(adapterPosition)).f302843f).f385509d.f390790d), 0L, 101L, bVar.a((wr3.n0) ((jz5.o) arrayList.get(adapterPosition)).f302842e), (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : str, this.f448880n, (r29 & 128) != 0 ? 0 : i18, (r29 & 256) != 0 ? 0 : 0);
                } else {
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    jVar = jVar2;
                    gr3.e.d(d17, 107, this.f448882p, context instanceof android.app.Activity ? ((android.app.Activity) context).getIntent() : null, i18, 0, 0, str, null, null, 0, 0, 3936, null);
                }
                ((java.util.HashSet) jVar.f448822a).add(jVar.a(i17, 0));
            }
        }
    }

    @Override // wr3.i
    public int x() {
        return this.f448880n;
    }

    @Override // wr3.i
    public sr3.g y() {
        return this.f448885s;
    }

    @Override // wr3.i
    public com.tencent.mm.storage.z3 z() {
        return this.f448881o;
    }
}
