package qi2;

/* loaded from: classes10.dex */
public final class v extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f363629h;

    /* renamed from: i, reason: collision with root package name */
    public final zh2.c f363630i;

    /* renamed from: m, reason: collision with root package name */
    public final si2.b f363631m;

    /* renamed from: n, reason: collision with root package name */
    public fg2.e0 f363632n;

    /* renamed from: o, reason: collision with root package name */
    public int f363633o;

    /* renamed from: p, reason: collision with root package name */
    public int f363634p;

    /* renamed from: q, reason: collision with root package name */
    public ce2.i f363635q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f363636r;

    /* renamed from: s, reason: collision with root package name */
    public int f363637s;

    /* renamed from: t, reason: collision with root package name */
    public int f363638t;

    /* renamed from: u, reason: collision with root package name */
    public r45.wz1 f363639u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f363640v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f363641w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f363642x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gk2.e liveData, zh2.c pluginAbility, android.content.Context context, si2.b callback) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f363629h = liveData;
        this.f363630i = pluginAbility;
        this.f363631m = callback;
        this.f363633o = 1;
        this.f363636r = new java.util.LinkedList();
        this.f363640v = jz5.h.b(new qi2.t(context, this));
        this.f363641w = jz5.h.b(new qi2.r(context, this));
        this.f363642x = jz5.h.b(new qi2.p(context, this));
        this.f118384g.c(context.getResources().getDrawable(com.tencent.mm.R.drawable.a0m));
    }

    public final void A() {
        this.f363633o = 2;
        fg2.e0 e0Var = this.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var.f262012s.setVisibility(8);
        fg2.e0 e0Var2 = this.f363632n;
        if (e0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var2.f262005l.setVisibility(8);
        fg2.e0 e0Var3 = this.f363632n;
        if (e0Var3 != null) {
            e0Var3.f262013t.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void B() {
        this.f363634p = 0;
        fg2.e0 e0Var = this.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var.f262010q.setVisibility(0);
        fg2.e0 e0Var2 = this.f363632n;
        if (e0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var2.f262006m.setVisibility(8);
        fg2.e0 e0Var3 = this.f363632n;
        if (e0Var3 != null) {
            e0Var3.f262009p.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void C() {
        this.f363634p = 1;
        fg2.e0 e0Var = this.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var.f262010q.setVisibility(8);
        fg2.e0 e0Var2 = this.f363632n;
        if (e0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var2.f262006m.setVisibility(0);
        fg2.e0 e0Var3 = this.f363632n;
        if (e0Var3 != null) {
            e0Var3.f262009p.setVisibility(this.f363635q != null ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void D() {
        boolean z17;
        gk2.e eVar = this.f363629h;
        int o76 = ((mm2.o4) eVar.a(mm2.o4.class)).o7();
        int q76 = ((mm2.o4) eVar.a(mm2.o4.class)).q7();
        boolean z18 = ((mm2.c1) eVar.a(mm2.c1.class)).K;
        fg2.e0 e0Var = this.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var.f262003j.setVisibility(8);
        fg2.e0 e0Var2 = this.f363632n;
        if (e0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.view.View view = e0Var2.f262011r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "checkPkFullLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "checkPkFullLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z18 && o76 <= 1 && q76 == 0) {
            if (((mm2.c1) eVar.a(mm2.c1.class)).M) {
                km2.q l76 = ((mm2.o4) eVar.a(mm2.o4.class)).l7();
                if (l76 != null && pm0.v.z((int) l76.D, 1)) {
                    z17 = true;
                    com.tencent.mars.xlog.Log.i("FinderLiveAFinderLiveAnchorNewPkWayPanelWidgetnchorNewPkWa", "isEnableShowPkFullLayout: " + z17 + ' ');
                    if (z17 || this.f363633o != 1) {
                    }
                    fg2.e0 e0Var3 = this.f363632n;
                    if (e0Var3 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    e0Var3.f262003j.setVisibility(0);
                    fg2.e0 e0Var4 = this.f363632n;
                    if (e0Var4 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    android.view.View view2 = e0Var4.f262011r;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "checkPkFullLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "checkPkFullLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
            }
            z17 = false;
            com.tencent.mars.xlog.Log.i("FinderLiveAFinderLiveAnchorNewPkWayPanelWidgetnchorNewPkWa", "isEnableShowPkFullLayout: " + z17 + ' ');
            if (z17) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            r6 = this;
            gk2.e r0 = r6.f363629h
            java.lang.Class<mm2.y2> r1 = mm2.y2.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm2.y2 r0 = (mm2.y2) r0
            dk2.m r0 = r0.f329568u
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L48
            int r4 = r6.f363633o
            int r5 = r0.f233738a
            if (r5 != r4) goto L48
            int r4 = r6.f363634p
            int r5 = r0.f233739b
            if (r5 != r4) goto L48
            ce2.i r4 = r6.f363635q
            if (r4 == 0) goto L24
            java.lang.String r4 = r4.field_rewardProductId
            goto L25
        L24:
            r4 = r3
        L25:
            if (r4 != 0) goto L29
            java.lang.String r4 = ""
        L29:
            java.lang.String r5 = r0.f233740c
            boolean r4 = kotlin.jvm.internal.o.b(r5, r4)
            if (r4 == 0) goto L48
            int r4 = r6.f363637s
            int r5 = r0.f233741d
            if (r5 != r4) goto L48
            int r4 = r6.G()
            int r5 = r0.f233742e
            if (r5 != r4) goto L48
            int r0 = r0.f233744g
            int r4 = r6.f363638t
            if (r0 == r4) goto L46
            goto L48
        L46:
            r0 = r1
            goto L49
        L48:
            r0 = r2
        L49:
            android.view.View r4 = r6.f118383f
            if (r0 != 0) goto L6c
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L54
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
        L54:
            if (r3 == 0) goto L8a
            r3.setEnabled(r1)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099680(0x7f060020, float:1.781172E38)
            int r0 = r0.getColor(r1)
            r3.setTextColor(r0)
            goto L8a
        L6c:
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L73
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
        L73:
            if (r3 == 0) goto L8a
            r3.setEnabled(r2)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131102743(0x7f060c17, float:1.7817933E38)
            int r0 = r0.getColor(r1)
            r3.setTextColor(r0)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.v.E():void");
    }

    public final java.util.LinkedList F() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.Object obj;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.r22 r22Var = new r45.r22();
        java.util.LinkedList list = r22Var.getList(0);
        r45.wk6 wk6Var = new r45.wk6();
        km2.q a76 = ((mm2.o4) this.f363629h.a(mm2.o4.class)).a7();
        if (a76 != null) {
            wk6Var.set(1, a76.f309170a);
            wk6Var.set(0, a76.f309172c);
            wk6Var.set(2, 1);
        }
        list.add(wk6Var);
        java.util.List list2 = ((mm2.o4) this.f363629h.a(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list2, "<get-audienceLinkMicUserList>(...)");
        synchronized (list2) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (!kotlin.jvm.internal.o.b(((km2.q) obj2).f309189t, java.lang.Boolean.TRUE)) {
                    arrayList.add(obj2);
                }
            }
        }
        int i17 = 2;
        while (true) {
            java.lang.Object obj3 = null;
            if (i17 >= 6) {
                break;
            }
            synchronized (arrayList) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((km2.q) next).f309192w == i17) {
                        obj3 = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj3;
            if (qVar != null) {
                java.util.LinkedList list3 = r22Var.getList(0);
                r45.wk6 wk6Var2 = new r45.wk6();
                wk6Var2.set(1, qVar.f309170a);
                wk6Var2.set(0, qVar.f309172c);
                wk6Var2.set(2, java.lang.Integer.valueOf(qVar.f309192w));
                list3.add(wk6Var2);
            } else {
                java.util.LinkedList list4 = r22Var.getList(0);
                r45.wk6 wk6Var3 = new r45.wk6();
                wk6Var3.set(2, java.lang.Integer.valueOf(i17));
                list4.add(wk6Var3);
            }
            i17++;
        }
        linkedList.add(r22Var);
        r45.r22 r22Var2 = new r45.r22();
        java.util.LinkedList list5 = r22Var2.getList(0);
        r45.wk6 wk6Var4 = new r45.wk6();
        km2.q l76 = ((mm2.o4) this.f363629h.a(mm2.o4.class)).l7();
        if (l76 != null) {
            wk6Var4.set(1, l76.f309170a);
            wk6Var4.set(0, l76.f309172c);
            wk6Var4.set(2, 1);
        }
        list5.add(wk6Var4);
        java.util.List list6 = ((mm2.o4) this.f363629h.a(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list6, "<get-audienceLinkMicUserList>(...)");
        synchronized (list6) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj4 : list6) {
                if (kotlin.jvm.internal.o.b(((km2.q) obj4).f309189t, java.lang.Boolean.TRUE)) {
                    arrayList2.add(obj4);
                }
            }
        }
        int i18 = 2;
        while (i18 < 6) {
            synchronized (arrayList2) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    if (((km2.q) obj).f309192w == i18) {
                        break;
                    }
                }
            }
            km2.q qVar2 = (km2.q) obj;
            if (qVar2 != null) {
                java.util.LinkedList list7 = r22Var2.getList(0);
                r45.wk6 wk6Var5 = new r45.wk6();
                wk6Var5.set(1, qVar2.f309170a);
                wk6Var5.set(0, qVar2.f309172c);
                wk6Var5.set(2, java.lang.Integer.valueOf(qVar2.f309192w));
                list7.add(wk6Var5);
            } else {
                java.util.LinkedList list8 = r22Var2.getList(0);
                r45.wk6 wk6Var6 = new r45.wk6();
                wk6Var6.set(2, java.lang.Integer.valueOf(i18));
                list8.add(wk6Var6);
            }
            i18++;
        }
        linkedList.add(r22Var2);
        return linkedList;
    }

    public final int G() {
        if (this.f363633o != 2) {
            return 0;
        }
        fg2.e0 e0Var = this.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (e0Var.f262005l.getVisibility() != 0) {
            return 0;
        }
        fg2.e0 e0Var2 = this.f363632n;
        if (e0Var2 != null) {
            return e0Var2.f261995b.getVisibility() == 0 ? 3 : 0;
        }
        kotlin.jvm.internal.o.o("uiBinding");
        throw null;
    }

    public final void H(ce2.i iVar) {
        this.f363635q = iVar;
        com.tencent.mars.xlog.Log.i("FinderLiveAFinderLiveAnchorNewPkWayPanelWidgetnchorNewPkWa", "notifyGiftSelect giftId: " + iVar.field_rewardProductId + " selectGiftInfo: " + this.f363635q);
        ce2.i iVar2 = this.f363635q;
        if (iVar2 != null) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(iVar2.field_thumbnailFileUrl, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            fg2.e0 e0Var = this.f363632n;
            if (e0Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.widget.ImageView selectGiftIcon = e0Var.f262008o;
            kotlin.jvm.internal.o.f(selectGiftIcon, "selectGiftIcon");
            a17.c(selectGiftIcon);
        }
    }

    public final void I(r45.wz1 wz1Var, boolean z17) {
        jz5.f0 f0Var;
        int integer;
        r45.jm1 jm1Var;
        r45.jm1 jm1Var2;
        java.util.LinkedList list;
        w();
        this.f363639u = wz1Var;
        r45.kl4 kl4Var = wz1Var != null ? (r45.kl4) wz1Var.getCustom(10) : null;
        fg2.e0 e0Var = this.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        java.lang.String string = kl4Var != null ? kl4Var.getString(3) : null;
        boolean z18 = string == null || string.length() == 0;
        android.content.Context context = this.f118381d;
        e0Var.f262015v.setText(!z18 ? kl4Var != null ? kl4Var.getString(3) : null : context.getResources().getString(com.tencent.mm.R.string.f491673dw2));
        fg2.e0 e0Var2 = this.f363632n;
        if (e0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        java.lang.String string2 = kl4Var != null ? kl4Var.getString(4) : null;
        e0Var2.f262017x.setText(!(string2 == null || string2.length() == 0) ? kl4Var != null ? kl4Var.getString(4) : null : context.getResources().getString(com.tencent.mm.R.string.f491675dw5));
        fg2.e0 e0Var3 = this.f363632n;
        if (e0Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        java.lang.String string3 = kl4Var != null ? kl4Var.getString(9) : null;
        e0Var3.f261996c.setText(!(string3 == null || string3.length() == 0) ? kl4Var != null ? kl4Var.getString(9) : null : context.getResources().getString(com.tencent.mm.R.string.m8s));
        fg2.e0 e0Var4 = this.f363632n;
        if (e0Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        java.lang.String string4 = kl4Var != null ? kl4Var.getString(5) : null;
        e0Var4.f262000g.setText(!(string4 == null || string4.length() == 0) ? kl4Var != null ? kl4Var.getString(5) : null : context.getResources().getString(com.tencent.mm.R.string.ljh));
        fg2.e0 e0Var5 = this.f363632n;
        if (e0Var5 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        java.lang.String string5 = kl4Var != null ? kl4Var.getString(6) : null;
        e0Var5.f261998e.setText(!(string5 == null || string5.length() == 0) ? kl4Var != null ? kl4Var.getString(6) : null : context.getResources().getString(com.tencent.mm.R.string.ljf));
        if (wz1Var != null && (jm1Var2 = (r45.jm1) wz1Var.getCustom(14)) != null && (list = jm1Var2.getList(0)) != null) {
            java.util.LinkedList linkedList = this.f363636r;
            linkedList.clear();
            linkedList.addAll(list);
        }
        gk2.e eVar = this.f363629h;
        if (z17) {
            dk2.u4 u4Var = ((mm2.o4) eVar.a(mm2.o4.class)).Z;
            if (u4Var != null) {
                this.f363638t = u4Var.f234168o;
                int i17 = u4Var.f234160g;
                if (i17 == 1) {
                    z();
                } else if (i17 == 2) {
                    if (u4Var.f234166m == 3) {
                        y();
                    } else {
                        A();
                    }
                }
                int i18 = u4Var.f234161h;
                if (i18 == 0) {
                    B();
                } else if (i18 == 1) {
                    ce2.i e17 = dk2.u7.f234181a.e(u4Var.f234162i);
                    if (e17 != null) {
                        H(e17);
                    }
                    C();
                }
                this.f363637s = u4Var.f234167n;
                fg2.e0 e0Var6 = this.f363632n;
                if (e0Var6 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var6.f262002i.setText(context.getResources().getString(com.tencent.mm.R.string.lzf, java.lang.Integer.valueOf(this.f363637s / 60)));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                this.f363638t = 0;
                z();
                B();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((mm2.y2) eVar.a(mm2.y2.class)).f329567t);
                if (!(valueOf.intValue() > 0)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    integer = valueOf.intValue();
                } else {
                    r45.wz1 wz1Var2 = this.f363639u;
                    integer = (wz1Var2 == null || (jm1Var = (r45.jm1) wz1Var2.getCustom(14)) == null) ? 0 : jm1Var.getInteger(1);
                }
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(integer);
                if (!(valueOf2.intValue() > 0)) {
                    valueOf2 = null;
                }
                this.f363637s = valueOf2 != null ? valueOf2.intValue() : 300;
                fg2.e0 e0Var7 = this.f363632n;
                if (e0Var7 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var7.f262002i.setText(context.getResources().getString(com.tencent.mm.R.string.lzf, java.lang.Integer.valueOf(this.f363637s / 60)));
            }
        }
        fg2.e0 e0Var8 = this.f363632n;
        if (e0Var8 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var8.f262002i.setText(context.getResources().getString(com.tencent.mm.R.string.lzf, java.lang.Integer.valueOf(this.f363637s / 60)));
        J();
        E();
        int o76 = ((mm2.o4) eVar.a(mm2.o4.class)).o7();
        int q76 = ((mm2.o4) eVar.a(mm2.o4.class)).q7();
        if (((mm2.c1) eVar.a(mm2.c1.class)).K) {
            if (o76 <= 1 && q76 == 0) {
                fg2.e0 e0Var9 = this.f363632n;
                if (e0Var9 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var9.f262014u.setVisibility(0);
                fg2.e0 e0Var10 = this.f363632n;
                if (e0Var10 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var10.f261995b.setVisibility(0);
                fg2.e0 e0Var11 = this.f363632n;
                if (e0Var11 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var11.f262016w.setVisibility(8);
            } else if (o76 > 1 || q76 <= 0) {
                fg2.e0 e0Var12 = this.f363632n;
                if (e0Var12 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var12.f261995b.setVisibility(8);
                fg2.e0 e0Var13 = this.f363632n;
                if (e0Var13 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var13.f262014u.setVisibility(0);
                fg2.e0 e0Var14 = this.f363632n;
                if (e0Var14 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var14.f262016w.setVisibility(0);
            } else {
                fg2.e0 e0Var15 = this.f363632n;
                if (e0Var15 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var15.f261995b.setVisibility(0);
                fg2.e0 e0Var16 = this.f363632n;
                if (e0Var16 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var16.f262014u.setVisibility(8);
                fg2.e0 e0Var17 = this.f363632n;
                if (e0Var17 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                e0Var17.f262016w.setVisibility(8);
                y();
            }
        } else if (o76 <= 1) {
            fg2.e0 e0Var18 = this.f363632n;
            if (e0Var18 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var18.f262014u.setVisibility(0);
            fg2.e0 e0Var19 = this.f363632n;
            if (e0Var19 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var19.f261995b.setVisibility(8);
            fg2.e0 e0Var20 = this.f363632n;
            if (e0Var20 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var20.f262016w.setVisibility(8);
            z();
        } else {
            fg2.e0 e0Var21 = this.f363632n;
            if (e0Var21 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var21.f261995b.setVisibility(8);
            fg2.e0 e0Var22 = this.f363632n;
            if (e0Var22 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var22.f262014u.setVisibility(0);
            fg2.e0 e0Var23 = this.f363632n;
            if (e0Var23 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var23.f262016w.setVisibility(0);
        }
        dk2.u4 u4Var2 = ((mm2.o4) eVar.a(mm2.o4.class)).Z;
        if (u4Var2 != null && u4Var2.f234166m == 3) {
            fg2.e0 e0Var24 = this.f363632n;
            if (e0Var24 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var24.f262014u.setVisibility(8);
            fg2.e0 e0Var25 = this.f363632n;
            if (e0Var25 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var25.f262016w.setVisibility(8);
            fg2.e0 e0Var26 = this.f363632n;
            if (e0Var26 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var26.f261995b.setVisibility(0);
        }
        D();
    }

    public final void J() {
        int i17 = this.f363638t;
        android.content.Context context = this.f118381d;
        if (i17 == 1) {
            fg2.e0 e0Var = this.f363632n;
            if (e0Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            e0Var.f262004k.setText(context.getResources().getString(com.tencent.mm.R.string.exv));
            return;
        }
        fg2.e0 e0Var2 = this.f363632n;
        if (e0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var2.f262004k.setText(context.getResources().getString(com.tencent.mm.R.string.eru));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return g();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        android.widget.TextView f17 = f();
        f17.setEnabled(true);
        f17.setTextColor(f17.getContext().getColor(com.tencent.mm.R.color.aaz));
        f17.setText(f17.getContext().getResources().getString(com.tencent.mm.R.string.d6t));
        return f17;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488925do1;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.dvn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.e0 e0Var = this.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = e0Var.f262014u.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            z();
            D();
        } else {
            fg2.e0 e0Var2 = this.f363632n;
            if (e0Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = e0Var2.f262016w.getId();
            boolean z17 = false;
            if (valueOf != null && valueOf.intValue() == id7) {
                if (((mm2.o4) this.f363631m.a().P0(mm2.o4.class)).f329324s.size() <= 1) {
                    android.content.Context context = this.f118381d;
                    db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.ljb), 0).show();
                } else {
                    z17 = true;
                }
                if (z17) {
                    A();
                } else {
                    z();
                }
            } else {
                fg2.e0 e0Var3 = this.f363632n;
                if (e0Var3 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                int id8 = e0Var3.f261995b.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    y();
                    D();
                } else {
                    fg2.e0 e0Var4 = this.f363632n;
                    if (e0Var4 == null) {
                        kotlin.jvm.internal.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = e0Var4.f261999f.getId();
                    if (valueOf != null && valueOf.intValue() == id9) {
                        B();
                    } else {
                        fg2.e0 e0Var5 = this.f363632n;
                        if (e0Var5 == null) {
                            kotlin.jvm.internal.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = e0Var5.f261997d.getId();
                        jz5.g gVar = this.f363641w;
                        if (valueOf == null || valueOf.intValue() != id10) {
                            fg2.e0 e0Var6 = this.f363632n;
                            if (e0Var6 == null) {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = e0Var6.f262009p.getId();
                            if (valueOf != null && valueOf.intValue() == id11) {
                                a();
                                qi2.w0 w0Var = (qi2.w0) ((jz5.n) gVar).getValue();
                                com.tencent.mm.plugin.finder.live.util.y.m(w0Var.f363647h.a(), kotlinx.coroutines.q1.f310570c, null, new qi2.v0(w0Var, 0, null), 2, null);
                                w0Var.w();
                            } else {
                                fg2.e0 e0Var7 = this.f363632n;
                                if (e0Var7 == null) {
                                    kotlin.jvm.internal.o.o("uiBinding");
                                    throw null;
                                }
                                int id12 = e0Var7.f262001h.getId();
                                if (valueOf != null && valueOf.intValue() == id12) {
                                    ((qi2.m0) ((jz5.n) this.f363642x).getValue()).y(this.f363636r, this.f363637s);
                                    a();
                                } else {
                                    fg2.e0 e0Var8 = this.f363632n;
                                    if (e0Var8 == null) {
                                        kotlin.jvm.internal.o.o("uiBinding");
                                        throw null;
                                    }
                                    int id13 = e0Var8.f262003j.getId();
                                    if (valueOf != null && valueOf.intValue() == id13) {
                                        a();
                                        ((ni2.x) ((jz5.n) this.f363640v).getValue()).g0(this.f363638t);
                                    }
                                }
                            }
                        } else if (this.f363635q == null) {
                            a();
                            qi2.w0 w0Var2 = (qi2.w0) ((jz5.n) gVar).getValue();
                            com.tencent.mm.plugin.finder.live.util.y.m(w0Var2.f363647h.a(), kotlinx.coroutines.q1.f310570c, null, new qi2.v0(w0Var2, 0, null), 2, null);
                            w0Var2.w();
                        } else {
                            C();
                        }
                    }
                }
            }
        }
        E();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.r5u;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.r5u);
        if (constraintLayout != null) {
            i17 = com.tencent.mm.R.id.r5v;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.r5v);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.r5w;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.r5w);
                if (textView2 != null) {
                    i17 = com.tencent.mm.R.id.lly;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.lly);
                    if (weImageView != null) {
                        i17 = com.tencent.mm.R.id.q6g;
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.q6g);
                        if (constraintLayout2 != null) {
                            i17 = com.tencent.mm.R.id.q6h;
                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q6h);
                            if (textView3 != null) {
                                i17 = com.tencent.mm.R.id.q6i;
                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q6i);
                                if (textView4 != null) {
                                    i17 = com.tencent.mm.R.id.f485164q72;
                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f485164q72);
                                    if (weImageView2 != null) {
                                        i17 = com.tencent.mm.R.id.q7e;
                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.q7e);
                                        if (constraintLayout3 != null) {
                                            i17 = com.tencent.mm.R.id.q7f;
                                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q7f);
                                            if (textView5 != null) {
                                                i17 = com.tencent.mm.R.id.q7g;
                                                android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q7g);
                                                if (textView6 != null) {
                                                    i17 = com.tencent.mm.R.id.rri;
                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.rri);
                                                    if (weImageView3 != null) {
                                                        i17 = com.tencent.mm.R.id.qv8;
                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.qv8);
                                                        if (constraintLayout4 != null) {
                                                            i17 = com.tencent.mm.R.id.qv9;
                                                            android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.qv9);
                                                            if (textView7 != null) {
                                                                i17 = com.tencent.mm.R.id.qv_;
                                                                android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.qv_);
                                                                if (textView8 != null) {
                                                                    i17 = com.tencent.mm.R.id.s8w;
                                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.s8w);
                                                                    if (constraintLayout5 != null) {
                                                                        i17 = com.tencent.mm.R.id.s_a;
                                                                        android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.s_a);
                                                                        if (textView9 != null) {
                                                                            i17 = com.tencent.mm.R.id.s_b;
                                                                            android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.s_b);
                                                                            if (textView10 != null) {
                                                                                i17 = com.tencent.mm.R.id.q9q;
                                                                                com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.q9q);
                                                                                if (roundCornerLinearLayout != null) {
                                                                                    i17 = com.tencent.mm.R.id.q9r;
                                                                                    android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q9r);
                                                                                    if (textView11 != null) {
                                                                                        i17 = com.tencent.mm.R.id.r8n;
                                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.r8n);
                                                                                        if (weImageView4 != null) {
                                                                                            i17 = com.tencent.mm.R.id.q_r;
                                                                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_r);
                                                                                            if (weImageView5 != null) {
                                                                                                i17 = com.tencent.mm.R.id.q_s;
                                                                                                android.view.View a17 = x4.b.a(rootView, com.tencent.mm.R.id.q_s);
                                                                                                if (a17 != null) {
                                                                                                    i17 = com.tencent.mm.R.id.q_t;
                                                                                                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_t);
                                                                                                    if (imageView != null) {
                                                                                                        i17 = com.tencent.mm.R.id.q_u;
                                                                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout6 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.q_u);
                                                                                                        if (constraintLayout6 != null) {
                                                                                                            i17 = com.tencent.mm.R.id.q_v;
                                                                                                            android.widget.TextView textView12 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.q_v);
                                                                                                            if (textView12 != null) {
                                                                                                                i17 = com.tencent.mm.R.id.q_w;
                                                                                                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_w);
                                                                                                                if (weImageView6 != null) {
                                                                                                                    i17 = com.tencent.mm.R.id.sag;
                                                                                                                    android.view.View a18 = x4.b.a(rootView, com.tencent.mm.R.id.sag);
                                                                                                                    if (a18 != null) {
                                                                                                                        i17 = com.tencent.mm.R.id.q_y;
                                                                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_y);
                                                                                                                        if (weImageView7 != null) {
                                                                                                                            i17 = com.tencent.mm.R.id.q_z;
                                                                                                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView8 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.q_z);
                                                                                                                            if (weImageView8 != null) {
                                                                                                                                i17 = com.tencent.mm.R.id.mz6;
                                                                                                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout7 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.mz6);
                                                                                                                                if (constraintLayout7 != null) {
                                                                                                                                    i17 = com.tencent.mm.R.id.mz7;
                                                                                                                                    android.widget.TextView textView13 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.mz7);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i17 = com.tencent.mm.R.id.mz8;
                                                                                                                                        android.widget.TextView textView14 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.mz8);
                                                                                                                                        if (textView14 != null) {
                                                                                                                                            i17 = com.tencent.mm.R.id.f487237nz5;
                                                                                                                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout8 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(rootView, com.tencent.mm.R.id.f487237nz5);
                                                                                                                                            if (constraintLayout8 != null) {
                                                                                                                                                i17 = com.tencent.mm.R.id.nz6;
                                                                                                                                                android.widget.TextView textView15 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.nz6);
                                                                                                                                                if (textView15 != null) {
                                                                                                                                                    i17 = com.tencent.mm.R.id.nz7;
                                                                                                                                                    android.widget.TextView textView16 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.nz7);
                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                        i17 = com.tencent.mm.R.id.qcb;
                                                                                                                                                        com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout2 = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.qcb);
                                                                                                                                                        if (roundCornerLinearLayout2 != null) {
                                                                                                                                                            i17 = com.tencent.mm.R.id.qcc;
                                                                                                                                                            android.widget.TextView textView17 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.qcc);
                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                this.f363632n = new fg2.e0((androidx.core.widget.NestedScrollView) rootView, constraintLayout, textView, textView2, weImageView, constraintLayout2, textView3, textView4, weImageView2, constraintLayout3, textView5, textView6, weImageView3, constraintLayout4, textView7, textView8, constraintLayout5, textView9, textView10, roundCornerLinearLayout, textView11, weImageView4, weImageView5, a17, imageView, constraintLayout6, textView12, weImageView6, a18, weImageView7, weImageView8, constraintLayout7, textView13, textView14, constraintLayout8, textView15, textView16, roundCornerLinearLayout2, textView17);
                                                                                                                                                                constraintLayout7.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var = this.f363632n;
                                                                                                                                                                if (e0Var == null) {
                                                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var.f262016w.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var2 = this.f363632n;
                                                                                                                                                                if (e0Var2 == null) {
                                                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var2.f261995b.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var3 = this.f363632n;
                                                                                                                                                                if (e0Var3 == null) {
                                                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var3.f261997d.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var4 = this.f363632n;
                                                                                                                                                                if (e0Var4 == null) {
                                                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var4.f261999f.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var5 = this.f363632n;
                                                                                                                                                                if (e0Var5 == null) {
                                                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var5.f262009p.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var6 = this.f363632n;
                                                                                                                                                                if (e0Var6 == null) {
                                                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var6.f262001h.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var7 = this.f363632n;
                                                                                                                                                                if (e0Var7 == null) {
                                                                                                                                                                    kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var7.f262003j.setOnClickListener(this);
                                                                                                                                                                z();
                                                                                                                                                                B();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void u() {
        a();
        this.f363631m.onCancel();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        java.util.LinkedList linkedList;
        dk2.u4 u4Var = ((mm2.o4) this.f363629h.a(mm2.o4.class)).Z;
        if (u4Var != null && u4Var.h()) {
            android.content.Context context = this.f118381d;
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.m8t), 0).show();
            a();
            return;
        }
        if (((mm2.o4) this.f363629h.a(mm2.o4.class)).l7() == null) {
            android.content.Context context2 = this.f118381d;
            db5.t7.makeText(context2, context2.getResources().getString(com.tencent.mm.R.string.m8u), 0).show();
            a();
            return;
        }
        int i17 = this.f363633o;
        if (i17 != 1) {
            linkedList = i17 != 2 ? new java.util.LinkedList() : G() == 3 ? F() : new java.util.LinkedList();
        } else {
            linkedList = new java.util.LinkedList();
            r45.r22 r22Var = new r45.r22();
            java.util.LinkedList list = r22Var.getList(0);
            r45.wk6 wk6Var = new r45.wk6();
            km2.q a76 = ((mm2.o4) this.f363629h.a(mm2.o4.class)).a7();
            if (a76 != null) {
                wk6Var.set(1, a76.f309170a);
                wk6Var.set(0, a76.f309172c);
                wk6Var.set(2, java.lang.Integer.valueOf(a76.f309192w));
            }
            list.add(wk6Var);
            linkedList.add(r22Var);
            java.util.List<km2.q> list2 = ((mm2.o4) this.f363629h.a(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list2, "<get-anchorPkMicUserList>(...)");
            synchronized (list2) {
                for (km2.q qVar : list2) {
                    r45.r22 r22Var2 = new r45.r22();
                    java.util.LinkedList list3 = r22Var2.getList(0);
                    r45.wk6 wk6Var2 = new r45.wk6();
                    wk6Var2.set(1, qVar.f309170a);
                    wk6Var2.set(0, qVar.f309172c);
                    wk6Var2.set(2, java.lang.Integer.valueOf(qVar.f309192w));
                    list3.add(wk6Var2);
                    linkedList.add(r22Var2);
                }
            }
        }
        java.util.LinkedList linkedList2 = linkedList;
        if (G() != 0 && this.f363633o != 1) {
            this.f363638t = 0;
        }
        si2.b bVar = this.f363631m;
        int i18 = this.f363633o;
        int i19 = this.f363634p;
        int G = G();
        int i27 = this.f363637s;
        ce2.i iVar = this.f363635q;
        java.lang.String str = iVar != null ? iVar.field_rewardProductId : null;
        if (str == null) {
            str = "";
        }
        bVar.b(new dk2.m(i18, i19, str, i27, G, linkedList2, this.f363638t), new qi2.u(this));
    }

    public final void y() {
        this.f363633o = 2;
        fg2.e0 e0Var = this.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var.f262005l.setVisibility(0);
        fg2.e0 e0Var2 = this.f363632n;
        if (e0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var2.f262013t.setVisibility(8);
        fg2.e0 e0Var3 = this.f363632n;
        if (e0Var3 != null) {
            e0Var3.f262012s.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public final void z() {
        this.f363633o = 1;
        fg2.e0 e0Var = this.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var.f262012s.setVisibility(0);
        fg2.e0 e0Var2 = this.f363632n;
        if (e0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var2.f262013t.setVisibility(8);
        fg2.e0 e0Var3 = this.f363632n;
        if (e0Var3 != null) {
            e0Var3.f262005l.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }
}
