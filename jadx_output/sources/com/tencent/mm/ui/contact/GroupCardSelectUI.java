package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class GroupCardSelectUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public boolean f206424e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f206425f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f206426g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f206427h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f206428i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f206429m;

    /* renamed from: p, reason: collision with root package name */
    public int f206432p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f206433q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ListView f206434r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.contact.d4 f206435s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f206436t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f206437u;

    /* renamed from: d, reason: collision with root package name */
    public boolean f206423d = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f206430n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f206431o = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bil;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f206434r = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f485183gu0);
        if (this.f206433q) {
            this.f206435s = new com.tencent.mm.ui.contact.jb(this, this.f206436t, this.f206431o, this.f206430n);
            this.f206434r.setBackgroundResource(com.tencent.mm.R.color.f478869jf);
        } else {
            this.f206435s = new com.tencent.mm.ui.contact.d4(this, this.f206436t, this.f206431o, this.f206430n);
        }
        this.f206434r.setAdapter((android.widget.ListAdapter) this.f206435s);
        this.f206434r.setOnItemClickListener(new com.tencent.mm.ui.contact.e4(this));
        this.f206437u = findViewById(com.tencent.mm.R.id.gtu);
        if (this.f206435s.getCount() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GroupCardSelectUI", "show empty view");
            android.view.View view = this.f206437u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(1, false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GroupCardSelectUI", "hide empty view");
            android.view.View view2 = this.f206437u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setBackBtn(new com.tencent.mm.ui.contact.f4(this));
        if (this.f206426g) {
            android.widget.ListView listView = this.f206434r;
            android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.bip, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(com.tencent.mm.R.string.f490826ay4);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lu7);
            if (this.f206435s.getCount() <= 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            listView.addHeaderView(inflate);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        p75.m d17;
        java.util.ArrayList arrayList;
        super.onCreate(bundle);
        this.f206423d = getIntent().getBooleanExtra("group_select_type", true);
        this.f206424e = getIntent().getBooleanExtra("group_select_need_result", false);
        this.f206425f = getIntent().getBooleanExtra("group_select_only_need_self_owner", false);
        this.f206428i = getIntent().getBooleanExtra("group_select_filter_associate_chat_room", false);
        this.f206429m = getIntent().getStringArrayListExtra("group_select_block_chatroom");
        this.f206426g = getIntent().getBooleanExtra("group_select_show_create_new_group", false);
        this.f206433q = getIntent().getBooleanExtra("group_should_show_chatroom_member", false);
        getIntent().getIntExtra("group_select_chatroom_max_num", Integer.MAX_VALUE);
        boolean booleanExtra = getIntent().getBooleanExtra("privacy_from_select_contact_ui", false);
        if (this.f206425f && !this.f206426g) {
            setMMTitle(getString(com.tencent.mm.R.string.f489926fp));
        } else if (booleanExtra) {
            setMMTitle(getString(com.tencent.mm.R.string.jbv));
        } else {
            setMMTitle(getString(com.tencent.mm.R.string.f489925fo));
        }
        boolean booleanExtra2 = getIntent().getBooleanExtra("group_multi_select", false);
        this.f206430n = booleanExtra2;
        if (booleanExtra2) {
            java.lang.String stringExtra = getIntent().getStringExtra("already_select_contact");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                this.f206431o = new java.util.LinkedList();
            } else {
                java.lang.String[] split = stringExtra.split(",");
                int i17 = x51.t1.f452086a;
                if (split == null || split.length == 0) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.String str : split) {
                        arrayList.add(str);
                    }
                }
                this.f206431o = arrayList;
            }
            this.f206432p = getIntent().getIntExtra("max_limit_num", 0);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (getIntent().getBooleanExtra("grou_order_by_conversation_time", false)) {
            java.util.List<java.lang.String> c17 = o13.n.c();
            if (this.f206425f) {
                java.util.HashSet hashSet = new java.util.HashSet(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().P0(c01.v1.q()));
                for (java.lang.String str2 : c17) {
                    java.util.ArrayList arrayList2 = this.f206429m;
                    if (arrayList2 == null || !arrayList2.contains(str2)) {
                        if (hashSet.contains(str2)) {
                            if (!this.f206428i ? true : !c01.e2.E(str2)) {
                                linkedList.add(str2);
                            }
                        }
                    }
                }
            } else {
                for (java.lang.String str3 : c17) {
                    java.util.ArrayList arrayList3 = this.f206429m;
                    if (arrayList3 == null || !arrayList3.contains(str3)) {
                        if (!this.f206428i ? true : !c01.e2.E(str3)) {
                            linkedList.add(str3);
                        }
                    }
                }
            }
        } else {
            boolean a17 = com.tencent.mm.contact.d.f64855g.a();
            p75.d dVar = dm.e2.T1;
            l75.e0 e0Var = com.tencent.mm.contact.s.G2;
            p75.m c18 = new p75.p0(dVar.z(), 1, 0).c(dVar.g(32, 0));
            if (a17) {
                p75.d dVar2 = dm.e2.Y1;
                d17 = dVar2.i(2L).d(dVar2.i(4L));
            } else {
                p75.d dVar3 = dm.e2.P1;
                d17 = dVar3.p("'@chatroom'").d(dVar3.p("'@im.chatroom'"));
            }
            ((p75.y) c18).f(d17);
            p75.n0 n0Var = dm.e2.N1;
            p75.d USERNAME = dm.e2.P1;
            kotlin.jvm.internal.o.f(USERNAME, "USERNAME");
            p75.i0 h17 = n0Var.h(USERNAME);
            h17.f352657d = c18;
            linkedList.addAll(h17.a().l(gm0.j1.u().f273153f));
        }
        if (linkedList.isEmpty()) {
            this.f206436t = new java.util.LinkedList();
        } else {
            this.f206436t = g95.e.f269801a.e(linkedList);
        }
        initView();
        if (this.f206430n) {
            addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490459vn), new com.tencent.mm.ui.contact.g4(this), null, com.tencent.mm.ui.fb.GREEN);
            enableOptionMenu(1, false);
            if (this.f206430n && this.f206427h) {
                enableOptionMenu(1, true);
                updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490459vn));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
