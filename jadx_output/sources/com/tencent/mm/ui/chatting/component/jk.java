package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.u1.class)
/* loaded from: classes9.dex */
public class jk extends com.tencent.mm.ui.chatting.component.a implements sb5.u1 {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f199294e;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f199300n;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f199302p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f199303q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f199304r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.n7 f199305s;

    /* renamed from: f, reason: collision with root package name */
    public boolean f199295f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f199296g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f199297h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f199298i = false;

    /* renamed from: m, reason: collision with root package name */
    public long f199299m = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f199301o = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f199306t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f199307u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f199308v = false;

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f199308v = true;
        com.tencent.mm.ui.chatting.n7 n7Var = this.f199305s;
        if (n7Var != null) {
            n7Var.c();
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).T && this.f199306t) {
            p0();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f199295f = this.f198580d.f460717l.getBooleanExtra("show_search_chat_content_result", false).booleanValue();
        this.f199300n = this.f198580d.f460717l.getStringArrayList("highlight_keyword_list");
        this.f199299m = this.f198580d.f460717l.getLongExtra("msg_local_id", -1L);
        this.f199296g = this.f198580d.f460717l.getBooleanExtra("from_global_search", false).booleanValue();
        this.f199297h = this.f198580d.f460717l.getBooleanExtra("from_date_search", false).booleanValue();
        this.f198580d.f460717l.getBooleanExtra("img_gallery_enter_from_chatting_ui", false).booleanValue();
        this.f199298i = this.f198580d.f460717l.getBooleanExtra("from_service_notify_content_search", false).booleanValue();
    }

    public boolean m0(long j17) {
        java.util.ArrayList arrayList;
        return this.f199299m == j17 && this.f199296g && (arrayList = this.f199300n) != null && arrayList.size() > 0;
    }

    public void n0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SearchComponent", "search result count %d, in edit mode %B, can report %B", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f199306t), java.lang.Boolean.valueOf(this.f199307u));
        if (this.f199306t) {
            if (this.f199307u && i17 >= 0) {
                this.f199307u = false;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10811, 2);
            }
            if (i17 > 0) {
                this.f199303q.setVisibility(0);
                this.f198580d.R(8);
                this.f199302p.setVisibility(8);
                android.view.View view = this.f199304r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 0) {
                this.f199303q.setVisibility(8);
                this.f198580d.R(8);
                this.f199302p.setVisibility(0);
                android.view.View view2 = this.f199304r;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            this.f199303q.setVisibility(8);
            this.f198580d.R(0);
            this.f199302p.setVisibility(8);
            android.view.View view3 = this.f199304r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void o0() {
        this.f199306t = true;
        this.f198580d.R(8);
        android.view.View view = this.f199294e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.chatting.n7 n7Var = this.f199305s;
            if (n7Var != null) {
                n7Var.f202011o = this.f198580d.x();
            }
        } else {
            com.tencent.mm.ui.chatting.component.z4.j(this.f198580d.f460717l, com.tencent.mm.R.id.mdk);
            android.view.View c17 = this.f198580d.c(com.tencent.mm.R.id.mds);
            this.f199294e = c17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f199304r = this.f198580d.c(com.tencent.mm.R.id.mdi);
            this.f198580d.p().setFocusable(false);
            this.f198580d.p().setFocusableInTouchMode(false);
            this.f199304r.setOnClickListener(new com.tencent.mm.ui.chatting.component.gk(this));
            android.view.View view2 = this.f199304r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f199302p = (android.widget.TextView) this.f198580d.c(com.tencent.mm.R.id.dfr);
            com.tencent.mm.ui.chatting.n7 n7Var2 = new com.tencent.mm.ui.chatting.n7(this.f198580d.g(), new com.tencent.mm.storage.f9(), this.f198580d.x(), this.f198580d.t(), this.f198580d.C() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198754s);
            this.f199305s = n7Var2;
            n7Var2.f202015s = new com.tencent.mm.ui.chatting.component.hk(this);
            android.widget.ListView listView = (android.widget.ListView) this.f198580d.c(com.tencent.mm.R.id.mdj);
            this.f199303q = listView;
            listView.setVisibility(0);
            this.f199303q.setAdapter((android.widget.ListAdapter) this.f199305s);
            this.f199303q.setOnItemClickListener(new com.tencent.mm.ui.chatting.component.ik(this));
            this.f199303q.setOnTouchListener(new com.tencent.mm.ui.chatting.component.ek(this));
        }
        n0(-1);
    }

    public void p0() {
        this.f199306t = false;
        this.f199307u = true;
        android.widget.TextView textView = this.f199302p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view = this.f199304r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/SearchComponent", "exitEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/SearchComponent", "exitEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ListView listView = this.f199303q;
        if (listView != null) {
            listView.setVisibility(8);
        }
        this.f198580d.R(0);
        this.f198580d.y();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (this.f199306t) {
            p0();
            ((com.tencent.mm.ui.chatting.component.b5) ((sb5.d0) this.f198580d.f460708c.a(sb5.d0.class))).q0();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        if (this.f199299m >= 0 && !this.f199308v) {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.chatting.component.fk(this), 2000L);
        }
        if (this.f199295f || this.f199296g || this.f199297h || this.f199298i) {
            long longExtra = this.f198580d.f460717l.getLongExtra("msg_local_id", -1L);
            java.lang.String stringExtra = this.f198580d.f460717l.getStringExtra("Chat_User");
            int intExtra = this.f198580d.f460717l.getIntExtra("SELECTION_TOP_OFFSET", 0);
            sb5.y yVar = new sb5.y();
            yVar.f405597b = true;
            yVar.f405600e = intExtra;
            ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).T0(stringExtra, longExtra, hd5.n.ACTION_POSITION, yVar);
        }
    }
}
