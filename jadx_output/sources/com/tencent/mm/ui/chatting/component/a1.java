package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.l.class)
/* loaded from: classes9.dex */
public final class a1 extends com.tencent.mm.ui.chatting.component.a implements sb5.l {
    public int A;
    public int B;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f198583e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f198584f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f198585g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f198586h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f198587i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f198588m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f198589n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f198590o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f198591p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f198592q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f198593r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f198594s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f198595t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f198596u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f198597v;

    /* renamed from: y, reason: collision with root package name */
    public int f198600y;

    /* renamed from: w, reason: collision with root package name */
    public boolean f198598w = true;

    /* renamed from: x, reason: collision with root package name */
    public long f198599x = -1;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f198601z = new java.util.HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0116, code lost:
    
        if (r6 < (r8 != null ? r8.getCreateTime() : Long.MIN_VALUE)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.a1.A0():void");
    }

    public final void B0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (t0()) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            if (w17 == -1 || y17 == -1) {
                return;
            }
            int m17 = w17 - this.f198580d.m();
            int m18 = (y17 - this.f198580d.m()) - ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) this.f198580d.f460718m).C0().getFooterViewsCount();
            p0(m17);
            q0(m18);
            com.tencent.mm.storage.f9 f9Var = this.f198594s;
            if (kotlin.jvm.internal.o.b(null, f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null)) {
                com.tencent.mm.storage.f9 f9Var2 = this.f198596u;
                java.lang.Long valueOf = f9Var2 != null ? java.lang.Long.valueOf(f9Var2.getMsgId()) : null;
                com.tencent.mm.storage.f9 f9Var3 = this.f198595t;
                if (kotlin.jvm.internal.o.b(valueOf, f9Var3 != null ? java.lang.Long.valueOf(f9Var3.getMsgId()) : null)) {
                    return;
                }
            }
            this.f198596u = this.f198595t;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r13 < (r10 != null ? r10.getCreateTime() : 0)) goto L35;
     */
    @Override // yn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(long r19, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.a1.U(long, java.lang.String):void");
    }

    @Override // yn.d
    public void V(long j17, java.lang.String str) {
        this.f198591p = true;
        this.A = 0;
        this.B = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatItemQuickSelectComponent", "onEnterEditMode");
        o0();
        s0();
        sb5.z0 z0Var = (sb5.z0) this.f198580d.f460708c.a(sb5.z0.class);
        com.tencent.mm.ui.chatting.component.x0 x0Var = new com.tencent.mm.ui.chatting.component.x0(this);
        com.tencent.mm.ui.chatting.component.pe peVar = (com.tencent.mm.ui.chatting.component.pe) z0Var;
        peVar.f199692p.b(com.tencent.mm.R.string.f490347sg);
        android.widget.TextView textView = peVar.f199692p.f208972e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        com.tencent.mm.ui.j jVar = peVar.f199692p;
        jVar.f208988u = false;
        jVar.c(x0Var);
        u0("onEnterEditMode");
    }

    @Override // yn.d
    public void W() {
        r0("onEnterSearch");
    }

    @Override // yn.d
    public void X() {
        this.f198591p = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatItemQuickSelectComponent", "onExitEditMode");
        u0("state");
        this.f198592q = null;
        this.f198593r = null;
        this.f198594s = null;
        this.f198595t = null;
        this.f198596u = null;
        r0("onExitEditMode");
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).C();
        com.tencent.mm.ui.chatting.component.pe peVar = (com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class));
        peVar.x0(peVar.D);
        com.tencent.mm.ui.j jVar = peVar.f199692p;
        jVar.f208988u = true;
        android.widget.TextView textView = jVar.f208972e;
        if (textView != null && jVar.f208986s > 0) {
            textView.setVisibility(0);
            textView.setText(java.lang.Integer.toString(jVar.f208986s));
        }
        peVar.f199692p.a(0);
        android.view.View view = this.f198590o;
        if (view != null) {
            this.f198580d.p().removeFooterView(view);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatItemQuickSelectComponent", "remove list_footer_fake_view");
            this.f198590o = null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        java.lang.Boolean booleanExtra = this.f198580d.f460717l.getBooleanExtra("key_record_msg_select", false);
        kotlin.jvm.internal.o.f(booleanExtra, "getBooleanExtra(...)");
        this.f198597v = booleanExtra.booleanValue();
        this.f198599x = this.f198580d.f460717l.getLongExtra("key_record_select_min_msg_id", -1L);
        this.f198600y = this.f198580d.f460717l.getIntExtra("key_record_select_msg_num", 0);
        if (this.f198597v) {
            s0();
        }
        java.util.ArrayList<java.lang.String> stringArrayList = this.f198580d.f460717l.getStringArrayList("key_record_selected_msg_list");
        if (stringArrayList != null) {
            java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                this.f198601z.add(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.V(it.next(), 0L)));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lastSelectMinMsgId=");
        sb6.append(this.f198599x);
        sb6.append(", lastSelectMsgNum=");
        sb6.append(this.f198600y);
        sb6.append(", lastSelectedMsgList=");
        sb6.append(stringArrayList != null ? java.lang.Integer.valueOf(stringArrayList.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatItemQuickSelectComponent", sb6.toString());
        r0("chatting init");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed A[SYNTHETIC] */
    @Override // yn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.a1.e0():void");
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (t0()) {
            B0(view instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) view : null);
            if (i27 > 0) {
                if (m0()) {
                    x0();
                    return;
                } else if (n0()) {
                    A0();
                    return;
                } else {
                    r0("onScrollToUp");
                    return;
                }
            }
            if (i27 < 0) {
                if (n0()) {
                    A0();
                } else if (m0()) {
                    x0();
                } else {
                    r0("onScrollToDown");
                }
            }
        }
    }

    public final boolean m0() {
        com.tencent.mm.storage.f9 f9Var = this.f198595t;
        if (f9Var == null || this.f198593r == null) {
            return false;
        }
        long createTime = f9Var != null ? f9Var.getCreateTime() : Long.MIN_VALUE;
        com.tencent.mm.storage.f9 f9Var2 = this.f198593r;
        return createTime > (f9Var2 != null ? f9Var2.getCreateTime() : com.tencent.wcdb.core.Database.DictDefaultMatchValue);
    }

    public final boolean n0() {
        com.tencent.mm.storage.f9 f9Var;
        if (this.f198592q == null || (f9Var = this.f198594s) == null) {
            return false;
        }
        long createTime = f9Var != null ? f9Var.getCreateTime() : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        com.tencent.mm.storage.f9 f9Var2 = this.f198592q;
        return createTime < (f9Var2 != null ? f9Var2.getCreateTime() : Long.MIN_VALUE);
    }

    public void o0() {
        if (this.f198590o == null) {
            android.view.View inflate = this.f198580d.g().getLayoutInflater().inflate(com.tencent.mm.R.layout.f488574xo, (android.view.ViewGroup) null);
            this.f198590o = inflate;
            if (inflate != null) {
                this.f198580d.p().addFooterView(inflate);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatItemQuickSelectComponent", "add new list_footer_fake_view");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long p0(int r8) {
        /*
            r7 = this;
            yb5.d r0 = r7.f198580d
            com.tencent.mm.ui.chatting.manager.c r0 = r0.f460708c
            java.lang.Class<sb5.z> r1 = sb5.z.class
            yn.e r0 = r0.a(r1)
            sb5.z r0 = (sb5.z) r0
            com.tencent.mm.ui.chatting.adapter.k r0 = (com.tencent.mm.ui.chatting.adapter.k) r0
            com.tencent.mm.storage.f9 r1 = r0.getItem(r8)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            boolean r0 = r0.F0(r1)
            r3 = 1
            if (r0 == 0) goto Lbe
            yb5.d r0 = r7.f198580d
            com.tencent.mm.pluginsdk.ui.tools.v3 r0 = r0.p()
            boolean r4 = r0 instanceof androidx.recyclerview.widget.RecyclerView
            if (r4 == 0) goto L2a
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L32
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            goto L33
        L32:
            r0 = r2
        L33:
            boolean r4 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L3a
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            goto L3b
        L3a:
            r0 = r2
        L3b:
            r4 = 2
            if (r0 != 0) goto L3f
            goto L79
        L3f:
            yb5.d r5 = r7.f198580d
            int r5 = r5.m()
            int r5 = r5 + r8
            android.view.View r0 = r0.findViewByPosition(r5)
            if (r0 == 0) goto L54
            r5 = 2131300156(0x7f090f3c, float:1.8218334E38)
            android.view.View r0 = r0.findViewById(r5)
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 != 0) goto L58
            goto L79
        L58:
            int r5 = r0.getVisibility()
            r6 = 8
            if (r5 != r6) goto L7b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "visibility of checkBox item="
            r0.<init>(r5)
            r0.append(r8)
            java.lang.String r5 = " is GONE!"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "MicroMsg.ChatItemQuickSelectComponent"
            com.tencent.mars.xlog.Log.w(r5, r0)
        L79:
            r0 = r2
            goto L8b
        L7b:
            int[] r5 = new int[r4]
            r0.getLocationOnScreen(r5)
            r5 = r5[r3]
            int r0 = r0.getHeight()
            int r5 = r5 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L8b:
            android.view.View r5 = r7.f198583e
            if (r5 == 0) goto La0
            int[] r4 = new int[r4]
            r5.getLocationOnScreen(r4)
            r4 = r4[r3]
            int r5 = r5.getHeight()
            int r4 = r4 + r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto La1
        La0:
            r4 = r2
        La1:
            r5 = 0
            if (r0 == 0) goto Lb1
            if (r4 == 0) goto Lb1
            int r0 = r0.intValue()
            int r4 = r4.intValue()
            if (r0 <= r4) goto Lb1
            r5 = r3
        Lb1:
            if (r5 == 0) goto Lbe
            r7.f198594s = r1
            long r0 = r1.getMsgId()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            return r8
        Lbe:
            r7.f198594s = r2
            int r8 = r8 + r3
            java.lang.Long r8 = r7.p0(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.a1.p0(int):java.lang.Long");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long q0(int r8) {
        /*
            r7 = this;
            yb5.d r0 = r7.f198580d
            com.tencent.mm.ui.chatting.manager.c r0 = r0.f460708c
            java.lang.Class<sb5.z> r1 = sb5.z.class
            yn.e r0 = r0.a(r1)
            sb5.z r0 = (sb5.z) r0
            com.tencent.mm.ui.chatting.adapter.k r0 = (com.tencent.mm.ui.chatting.adapter.k) r0
            com.tencent.mm.storage.f9 r1 = r0.getItem(r8)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            boolean r0 = r0.F0(r1)
            r3 = 1
            if (r0 == 0) goto Lb4
            yb5.d r0 = r7.f198580d
            com.tencent.mm.pluginsdk.ui.tools.v3 r0 = r0.p()
            boolean r4 = r0 instanceof androidx.recyclerview.widget.RecyclerView
            if (r4 == 0) goto L2a
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L32
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            goto L33
        L32:
            r0 = r2
        L33:
            boolean r4 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L3a
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            goto L3b
        L3a:
            r0 = r2
        L3b:
            r4 = 2
            if (r0 != 0) goto L3f
            goto L79
        L3f:
            yb5.d r5 = r7.f198580d
            int r5 = r5.m()
            int r5 = r5 + r8
            android.view.View r0 = r0.findViewByPosition(r5)
            if (r0 == 0) goto L54
            r5 = 2131300156(0x7f090f3c, float:1.8218334E38)
            android.view.View r0 = r0.findViewById(r5)
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 != 0) goto L58
            goto L79
        L58:
            int r5 = r0.getVisibility()
            r6 = 8
            if (r5 != r6) goto L7b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "visibility of checkBox item="
            r0.<init>(r5)
            r0.append(r8)
            java.lang.String r5 = " is GONE!"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "MicroMsg.ChatItemQuickSelectComponent"
            com.tencent.mars.xlog.Log.w(r5, r0)
        L79:
            r0 = r2
            goto L86
        L7b:
            int[] r5 = new int[r4]
            r0.getLocationOnScreen(r5)
            r0 = r5[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L86:
            android.view.View r5 = r7.f198586h
            if (r5 == 0) goto L96
            int[] r4 = new int[r4]
            r5.getLocationOnScreen(r4)
            r4 = r4[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L97
        L96:
            r4 = r2
        L97:
            r5 = 0
            if (r0 == 0) goto La7
            if (r4 == 0) goto La7
            int r0 = r0.intValue()
            int r4 = r4.intValue()
            if (r0 >= r4) goto La7
            r5 = r3
        La7:
            if (r5 == 0) goto Lb4
            r7.f198595t = r1
            long r0 = r1.getMsgId()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            return r8
        Lb4:
            r7.f198595t = r2
            int r8 = r8 - r3
            java.lang.Long r8 = r7.q0(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.a1.q0(int):java.lang.Long");
    }

    public final void r0(java.lang.String str) {
        android.view.View view = this.f198583e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChatItemQuickSelectComponent", "hideAllQuickSelectView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/ChatItemQuickSelectComponent", "hideAllQuickSelectView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f198586h;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChatItemQuickSelectComponent", "hideAllQuickSelectView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/ChatItemQuickSelectComponent", "hideAllQuickSelectView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void s0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatItemQuickSelectComponent", "initViews: chattingQuickSelectRootUp=" + this.f198583e + ", chattingQuickSelectRootDown=" + this.f198586h);
        if (this.f198583e == null || this.f198586h == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) this.f198580d.c(com.tencent.mm.R.id.srf);
            this.f198583e = viewStub != null ? viewStub.inflate() : null;
            android.view.View c17 = this.f198580d.c(com.tencent.mm.R.id.srb);
            if (c17 instanceof android.widget.LinearLayout) {
            }
            android.view.View c18 = this.f198580d.c(com.tencent.mm.R.id.srh);
            this.f198584f = c18 instanceof android.widget.TextView ? (android.widget.TextView) c18 : null;
            android.view.View c19 = this.f198580d.c(com.tencent.mm.R.id.srd);
            this.f198585g = c19 instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) c19 : null;
            android.view.ViewStub viewStub2 = (android.view.ViewStub) this.f198580d.c(com.tencent.mm.R.id.sre);
            this.f198586h = viewStub2 != null ? viewStub2.inflate() : null;
            android.view.View c27 = this.f198580d.c(com.tencent.mm.R.id.sra);
            this.f198587i = c27 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) c27 : null;
            android.view.View c28 = this.f198580d.c(com.tencent.mm.R.id.srg);
            this.f198588m = c28 instanceof android.widget.TextView ? (android.widget.TextView) c28 : null;
            android.view.View c29 = this.f198580d.c(com.tencent.mm.R.id.src);
            this.f198589n = c29 instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) c29 : null;
            android.widget.TextView textView = this.f198584f;
            if (textView != null) {
                com.tencent.mm.ui.fk.b(textView);
            }
            android.widget.TextView textView2 = this.f198588m;
            if (textView2 != null) {
                com.tencent.mm.ui.fk.b(textView2);
            }
        }
    }

    public final boolean t0() {
        return this.f198591p || this.f198597v;
    }

    public final void u0(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(": ");
        sb6.append("mFirstSelectMsg: " + y0(this.f198592q) + " mLastSelectMsg: " + y0(this.f198593r) + " mTopCanSelectMsg: " + y0(this.f198594s) + " mBottomCanSelectMsg: " + y0(this.f198595t) + " mLastTopCanSelectMsg: " + y0(null) + " mLastBottomCanSelectMsg: " + y0(this.f198596u));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatItemQuickSelectComponent", sb6.toString());
    }

    public final void v0(boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.f198588m;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.n7z);
            }
            android.widget.TextView textView2 = this.f198588m;
            if (textView2 != null) {
                textView2.setTextColor(this.f198580d.g().getColor(com.tencent.mm.R.color.f478524a5));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f198589n;
            if (weImageView != null) {
                weImageView.setIconColor(this.f198580d.g().getColor(com.tencent.mm.R.color.f478524a5));
            }
            android.view.View view = this.f198586h;
            if (view != null) {
                view.setOnClickListener(new com.tencent.mm.ui.chatting.component.y0(this));
            }
            android.widget.LinearLayout linearLayout = this.f198587i;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.czn);
                return;
            }
            return;
        }
        android.widget.TextView textView3 = this.f198588m;
        if (textView3 != null) {
            textView3.setText(this.f198580d.g().getString(com.tencent.mm.R.string.n7y, 100));
        }
        android.widget.TextView textView4 = this.f198588m;
        if (textView4 != null) {
            textView4.setTextColor(this.f198580d.g().getColor(com.tencent.mm.R.color.f478520a84));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f198589n;
        if (weImageView2 != null) {
            weImageView2.setIconColor(this.f198580d.g().getColor(com.tencent.mm.R.color.f478520a84));
        }
        android.view.View view2 = this.f198586h;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        android.widget.LinearLayout linearLayout2 = this.f198587i;
        if (linearLayout2 != null) {
            linearLayout2.setBackgroundResource(com.tencent.mm.R.drawable.czo);
        }
    }

    public final void w0(boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.f198584f;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.n7z);
            }
            android.widget.TextView textView2 = this.f198584f;
            if (textView2 != null) {
                textView2.setTextColor(this.f198580d.g().getColor(com.tencent.mm.R.color.f478524a5));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f198585g;
            if (weImageView != null) {
                weImageView.setIconColor(this.f198580d.g().getColor(com.tencent.mm.R.color.f478524a5));
            }
            android.view.View view = this.f198583e;
            if (view != null) {
                view.setOnClickListener(new com.tencent.mm.ui.chatting.component.z0(this));
            }
            android.view.View view2 = this.f198583e;
            if (view2 != null) {
                view2.setBackgroundResource(com.tencent.mm.R.drawable.czn);
                return;
            }
            return;
        }
        android.widget.TextView textView3 = this.f198584f;
        if (textView3 != null) {
            textView3.setText(this.f198580d.g().getString(com.tencent.mm.R.string.n7y, 100));
        }
        android.widget.TextView textView4 = this.f198584f;
        if (textView4 != null) {
            textView4.setTextColor(this.f198580d.g().getColor(com.tencent.mm.R.color.f478520a84));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f198585g;
        if (weImageView2 != null) {
            weImageView2.setIconColor(this.f198580d.g().getColor(com.tencent.mm.R.color.f478520a84));
        }
        android.view.View view3 = this.f198583e;
        if (view3 != null) {
            view3.setOnClickListener(null);
        }
        android.view.View view4 = this.f198583e;
        if (view4 != null) {
            view4.setBackgroundResource(com.tencent.mm.R.drawable.czo);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0116, code lost:
    
        if (r6 <= (r8 != null ? r8.getCreateTime() : Long.MIN_VALUE)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.a1.x0():void");
    }

    public final java.lang.String y0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
        }
        return "{id=" + f9Var.getMsgId() + ", ct=" + f9Var.getCreateTime() + '}';
    }
}
