package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class MediaHistoryGalleryUI extends com.tencent.mm.ui.MMActivity implements zb5.g, android.view.View.OnClickListener {
    public android.view.View A;
    public android.view.View B;
    public android.view.View C;

    /* renamed from: d, reason: collision with root package name */
    public zb5.f f200743d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.adapter.a0 f200744e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f200745f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f200746g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f200747h;

    /* renamed from: i, reason: collision with root package name */
    public long f200748i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f200749m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f200750n;

    /* renamed from: q, reason: collision with root package name */
    public boolean f200753q;

    /* renamed from: r, reason: collision with root package name */
    public int f200754r;

    /* renamed from: t, reason: collision with root package name */
    public nc5.o f200756t;

    /* renamed from: u, reason: collision with root package name */
    public int f200757u;

    /* renamed from: x, reason: collision with root package name */
    public int f200760x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f200761y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f200762z;

    /* renamed from: o, reason: collision with root package name */
    public boolean f200751o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f200752p = -1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f200755s = true;

    /* renamed from: v, reason: collision with root package name */
    public long f200758v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f200759w = 0;

    public final void T6(int i17) {
        ((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).getClass();
        if (!com.tencent.mm.ui.chatting.gallery.p4.f201265a.f201334b || i17 <= 0) {
            this.f200761y.setEnabled(false);
            this.f200762z.setEnabled(false);
            this.A.setEnabled(false);
            this.B.setEnabled(false);
            return;
        }
        this.f200761y.setEnabled(true);
        this.f200762z.setEnabled(true);
        this.A.setEnabled(true);
        this.B.setEnabled(true);
    }

    public void U6(int i17) {
        X6();
        W6(false, "");
        if (i17 == 0) {
            i17 = com.tencent.mm.R.string.fjw;
        }
        if (this.f200753q) {
            db5.e1.o(this, i17, com.tencent.mm.R.string.f490573yv, true, null);
        }
        this.f200753q = false;
    }

    public void V6() {
        this.f200753q = false;
        W6(false, "");
        X6();
        int indexOf = lp0.b.m().indexOf("/MicroMsg/");
        dp.a.makeText(this, getString(com.tencent.mm.R.string.b5f, indexOf >= 0 ? lp0.b.m().substring(indexOf) : lp0.b.m()), 1).show();
    }

    public final void W6(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (str == null) {
                str = getString(com.tencent.mm.R.string.ggc);
            }
            this.f200750n = com.tencent.mm.ui.widget.dialog.u3.f(this, str, true, 0, null);
        } else {
            android.app.ProgressDialog progressDialog = this.f200750n;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f200750n.dismiss();
            this.f200750n = null;
        }
    }

    public void X6() {
        com.tencent.mm.ui.chatting.presenter.n3 n3Var = (com.tencent.mm.ui.chatting.presenter.n3) this.f200743d;
        n3Var.f202361i.f198395r = false;
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        r4Var.b();
        r4Var.f201334b = false;
        n3Var.f202361i.notifyDataSetChanged();
        setMMTitle(((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).f202358f.getString(com.tencent.mm.R.string.f489993ht));
        android.view.View view = this.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.C.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477855dd));
        removeOptionMenu(0);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.fik), new com.tencent.mm.ui.chatting.gallery.ab(this));
    }

    public void Y6() {
        com.tencent.mm.ui.chatting.presenter.n3 n3Var = (com.tencent.mm.ui.chatting.presenter.n3) this.f200743d;
        n3Var.f202361i.f198395r = true;
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        r4Var.f201334b = true;
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) n3Var.d(n3Var.f202358f);
        int w17 = gridLayoutManager.w();
        n3Var.f202361i.notifyItemRangeChanged(w17, (gridLayoutManager.y() - w17) + 1, 0);
        ((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).getClass();
        setMMTitle(getString(com.tencent.mm.R.string.fjy, java.lang.Integer.valueOf(r4Var.f())));
        android.view.View view = this.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.C.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477857df));
        ((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).getClass();
        T6(r4Var.f());
        removeOptionMenu(0);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.fij), new com.tencent.mm.ui.chatting.gallery.za(this));
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(3);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bxc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        this.C = findViewById(com.tencent.mm.R.id.jqp);
        this.f200762z = findViewById(com.tencent.mm.R.id.oio);
        this.B = findViewById(com.tencent.mm.R.id.crz);
        this.A = findViewById(com.tencent.mm.R.id.m9n);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dth);
        this.f200761y = findViewById;
        findViewById.setTag(1);
        this.f200762z.setTag(0);
        this.A.setTag(3);
        this.B.setTag(2);
        this.f200761y.setOnClickListener(this);
        this.f200762z.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.f200746g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482917rq);
        this.f200749m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mf6);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.h0u);
        this.f200745f = recyclerView;
        recyclerView.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478620cf));
        findViewById(com.tencent.mm.R.id.ch8).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478620cf));
        this.f200745f.setLayoutManager(((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).d(this));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f200745f;
        com.tencent.mm.ui.chatting.presenter.n3 n3Var = (com.tencent.mm.ui.chatting.presenter.n3) this.f200743d;
        n3Var.getClass();
        recyclerView2.N(new com.tencent.mm.ui.chatting.presenter.f3(n3Var, this));
        zb5.f fVar = this.f200743d;
        java.lang.String str = this.f200747h;
        long j17 = this.f200748i;
        com.tencent.mm.ui.chatting.presenter.n3 n3Var2 = (com.tencent.mm.ui.chatting.presenter.n3) fVar;
        n3Var2.f202359g = str;
        n3Var2.f202360h = j17;
        java.util.ArrayList arrayList = n3Var2.f202357e;
        if (j17 == -1) {
            n3Var2.f202361i = new com.tencent.mm.ui.chatting.adapter.a0(n3Var2.f202358f, arrayList, 4, str);
        } else {
            n3Var2.f202361i = new com.tencent.mm.ui.chatting.adapter.a0(n3Var2.f202358f, arrayList, 4, str, j17);
        }
        com.tencent.mm.ui.chatting.adapter.a0 a0Var = n3Var2.f202361i;
        a0Var.f198393p = new com.tencent.mm.ui.chatting.presenter.g3(n3Var2);
        this.f200744e = a0Var;
        this.f200745f.setAdapter(a0Var);
        this.f200745f.setHasFixedSize(true);
        this.f200745f.setOnScrollListener(new com.tencent.mm.ui.chatting.gallery.va(this));
        if (this.f200756t == null) {
            this.f200756t = new nc5.o(this, this.f200747h, this.f200757u);
        }
        this.f200745f.i(new com.tencent.mm.ui.chatting.gallery.xa(this));
        setMMTitle(((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).f202358f.getString(com.tencent.mm.R.string.f489993ht));
        setBackBtn(new com.tencent.mm.ui.chatting.gallery.ya(this));
    }

    @Override // com.tencent.mm.ui.chatting.view.b
    public void l2(com.tencent.mm.ui.chatting.presenter.z zVar) {
        this.f200743d = (zb5.f) zVar;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        nc5.o oVar = this.f200756t;
        if (oVar != null) {
            oVar.b();
        }
        super.onBackPressed();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryUI", "[onBackPressed] ");
        if (this.f200753q) {
            ((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).k();
        } else {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zb5.f fVar = this.f200743d;
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.ui.chatting.presenter.n3 n3Var = (com.tencent.mm.ui.chatting.presenter.n3) fVar;
        n3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[handleSelectedItem] type:%s", java.lang.Integer.valueOf(intValue));
        java.util.ArrayList arrayList2 = com.tencent.mm.ui.chatting.gallery.p4.f201265a.f201333a;
        android.content.Context context = n3Var.f202358f;
        if (intValue == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 19L, 1L, true);
            com.tencent.mm.ui.chatting.x3.d(context, arrayList2, com.tencent.mm.storage.z3.R4(n3Var.f202359g), n3Var.f202359g, new com.tencent.mm.ui.chatting.presenter.b3(n3Var));
            ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) n3Var.f202356d).X6();
        } else if (intValue == 1) {
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 18L, 1L, true);
                    com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                    if (com.tencent.mm.pluginsdk.model.e2.i(n3Var.f202358f, doFavoriteEvent, n3Var.f202359g, arrayList2, false, false)) {
                        n3Var.c(doFavoriteEvent);
                        java.util.Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            com.tencent.mm.ui.chatting.e.c(com.tencent.mm.ui.chatting.c.Fav, com.tencent.mm.ui.chatting.d.Samll, (com.tencent.mm.storage.f9) it6.next(), 0);
                        }
                    } else {
                        int size = arrayList2.size();
                        am.c4 c4Var = doFavoriteEvent.f54090g;
                        if (size > 1) {
                            db5.e1.A(context, context.getString(c4Var.f6326l >= 0 ? com.tencent.mm.R.string.caq : com.tencent.mm.R.string.cap), "", context.getString(c4Var.f6326l >= 0 ? com.tencent.mm.R.string.f490939bb1 : com.tencent.mm.R.string.hjg), context.getString(com.tencent.mm.R.string.baz), new com.tencent.mm.ui.chatting.presenter.y2(n3Var, doFavoriteEvent, arrayList2), null);
                        } else {
                            db5.e1.i(context, c4Var.f6326l, 0);
                        }
                    }
                    ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) n3Var.f202356d).X6();
                } else if (!com.tencent.mm.ui.chatting.la.c((com.tencent.mm.storage.f9) it.next())) {
                    db5.t7.makeText(context, com.tencent.mm.R.string.cal, 0).show();
                    break;
                }
            }
        } else if (intValue == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11627, 5);
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                copyOnWriteArraySet.add(tg3.l1.a((com.tencent.mm.storage.f9) it7.next()));
            }
            db5.e1.A(context, context.getString(com.tencent.mm.R.string.bav), "", context.getString(com.tencent.mm.R.string.boo), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.presenter.a3(n3Var, copyOnWriteArraySet, arrayList2), null);
        } else if (intValue == 3) {
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, new com.tencent.mm.ui.chatting.presenter.m3(n3Var, arrayList2), new com.tencent.mm.ui.chatting.presenter.m2(n3Var));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        this.f200751o = true;
        android.content.Intent intent = getIntent();
        intent.getIntExtra("kintent_intent_source", 0);
        this.f200747h = intent.getStringExtra("kintent_talker");
        this.f200752p = intent.getIntExtra("kintent_image_index", -1);
        intent.getBooleanExtra("key_is_biz_chat", false);
        this.f200748i = getIntent().getLongExtra("key_biz_chat_id", -1L);
        this.f200757u = intent.getIntExtra("key_gallery_enter_scene", -1);
        com.tencent.mm.ui.chatting.presenter.n3 n3Var = getIntent().getIntExtra("key_media_type", -1) != 1 ? new com.tencent.mm.ui.chatting.presenter.n3(this) : new com.tencent.mm.ui.chatting.presenter.n3(this);
        n3Var.f202356d = this;
        this.f200743d = n3Var;
        n3Var.f202363n.alive();
        java.util.ArrayList arrayList = com.tencent.mm.ui.chatting.gallery.p4.f201265a.f201335c;
        arrayList.remove(n3Var);
        arrayList.add(n3Var);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478861j7));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478861j7));
        initView();
        ((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).j(true, this.f200752p);
        o25.n1.c(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MediaHistoryGalleryUI);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).onDetach();
        nc5.o oVar = this.f200756t;
        if (oVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "destroy, " + oVar.f336216d + ", " + oVar.f336215c + ", " + oVar.f336221i);
            kotlinx.coroutines.r2 r2Var = oVar.f336223k;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.z0.e(oVar.f336222j, null, 1, null);
            if (oVar.f336216d && !oVar.a() && oVar.f336224l) {
                ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Zi();
            }
            ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(6);
            this.f200756t = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        kj.m mVar;
        super.onPause();
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollEnable(), this.f200754r);
        this.f200754r = 0;
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f232817n) != null) {
            this.f200758v = java.lang.Math.max(0L, ((int) mVar.f308243e) - this.f200758v);
        }
        this.f200759w = com.tencent.mm.sdk.platformtools.t8.i1() > this.f200759w ? com.tencent.mm.sdk.platformtools.t8.i1() - this.f200759w : 1L;
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().reportFPS(703, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollAction(), 1, this.f200758v, this.f200759w);
        this.f200758v = 0L;
        this.f200759w = 0L;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        kj.m mVar;
        this.f200759w = com.tencent.mm.sdk.platformtools.t8.i1();
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f232817n) != null) {
            this.f200758v = (int) mVar.f308243e;
        }
        super.onResume();
        com.tencent.mm.ui.chatting.presenter.n3 n3Var = (com.tencent.mm.ui.chatting.presenter.n3) this.f200743d;
        if (n3Var.f202364o) {
            com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
            if (r4Var.f201334b) {
                zb5.g gVar = n3Var.f202356d;
                int f17 = r4Var.f();
                com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = (com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar;
                mediaHistoryGalleryUI.setMMTitle(mediaHistoryGalleryUI.getString(com.tencent.mm.R.string.fjy, java.lang.Integer.valueOf(f17)));
                mediaHistoryGalleryUI.T6(f17);
                n3Var.f202361i.notifyDataSetChanged();
            }
        }
        if (this.f200751o) {
            ((com.tencent.mm.ui.chatting.presenter.n3) this.f200743d).getClass();
            if (com.tencent.mm.ui.chatting.gallery.p4.f201265a.f201334b) {
                Y6();
            } else {
                X6();
            }
        }
        nc5.o oVar = this.f200756t;
        if (oVar != null && !this.f200751o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "onActivityResumeToUpdateSug");
            if (((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ri() && oVar.f336216d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "onActivityResultToUpdateSug");
                ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).wi(oVar.f336214b);
                nc5.u uVar = oVar.f336219g;
                if (uVar != null) {
                    uVar.a(new nc5.g(oVar), null);
                }
            }
        }
        this.f200751o = false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(la5.f1.class);
    }
}
