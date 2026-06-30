package com.tencent.mm.ui.chatting.gallery;

@db5.a(19)
/* loaded from: classes9.dex */
public class ImageGalleryGridUI extends com.tencent.mm.ui.MMActivity implements android.widget.AdapterView.OnItemClickListener, android.view.ViewTreeObserver.OnPreDrawListener, android.view.MenuItem.OnMenuItemClickListener, android.view.View.OnClickListener, com.tencent.mm.ui.chatting.gallery.q4, ot0.f3 {
    public static final /* synthetic */ int E = 0;
    public android.view.View A;
    public android.view.View B;
    public android.view.View C;
    public android.view.View D;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f200567d;

    /* renamed from: e, reason: collision with root package name */
    public long f200568e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f200569f;

    /* renamed from: g, reason: collision with root package name */
    public int f200570g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.GridView f200571h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.k2 f200572i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f200573m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f200574n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f200575o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f200576p;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f200584x;

    /* renamed from: z, reason: collision with root package name */
    public android.view.animation.Animation f200586z;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f200577q = new com.tencent.mm.ui.chatting.gallery.m2(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f200578r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GalleryPhotoInfoEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.3
        {
            this.__eventId = 1036677180;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent) {
            android.view.View childAt;
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent2 = galleryPhotoInfoEvent;
            int i17 = galleryPhotoInfoEvent2.f54355g.f6946b;
            com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI = com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.this;
            android.widget.GridView gridView = imageGalleryGridUI.f200571h;
            if (gridView != null) {
                int firstVisiblePosition = gridView.getFirstVisiblePosition();
                int lastVisiblePosition = imageGalleryGridUI.f200571h.getLastVisiblePosition();
                if (i17 >= firstVisiblePosition && i17 <= lastVisiblePosition && (childAt = imageGalleryGridUI.f200571h.getChildAt(i17 - firstVisiblePosition)) != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    int i18 = iArr[0];
                    am.je jeVar = galleryPhotoInfoEvent2.f54356h;
                    jeVar.f7027a = i18;
                    jeVar.f7028b = iArr[1];
                    jeVar.f7029c = childAt.getWidth();
                    jeVar.f7030d = childAt.getHeight();
                }
            }
            return false;
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public boolean f200579s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f200580t = false;

    /* renamed from: u, reason: collision with root package name */
    public long f200581u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f200582v = new com.tencent.mm.ui.chatting.gallery.q2(this);

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f200583w = null;

    /* renamed from: y, reason: collision with root package name */
    public int f200585y = -1;

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return true;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
    }

    public final void T6() {
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        if (!r4Var.f201333a.isEmpty() && r4Var.f201334b) {
            this.A.setEnabled(true);
            this.B.setEnabled(true);
            this.C.setEnabled(true);
            this.D.setEnabled(true);
            return;
        }
        this.A.setEnabled(false);
        this.B.setEnabled(false);
        this.C.setEnabled(false);
        this.D.setEnabled(false);
    }

    public final void U6(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent) {
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6323i = this;
        c4Var.f6327m = 45;
        doFavoriteEvent.e();
        int i17 = doFavoriteEvent.f54091h.f6433a;
        if (i17 == -2 || i17 > 0 || i17 > 0) {
            return;
        }
        a7();
        am.c4 c4Var2 = doFavoriteEvent.f54090g;
        if (14 != c4Var2.f6317c) {
            return;
        }
        r45.sq0 sq0Var = c4Var2.f6316b;
        if (sq0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryGridUI", "want to report record fav, but type count is null");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f385906d), java.lang.Integer.valueOf(c4Var2.f6316b.f385907e), java.lang.Integer.valueOf(c4Var2.f6316b.f385908f), java.lang.Integer.valueOf(c4Var2.f6316b.f385909g), java.lang.Integer.valueOf(c4Var2.f6316b.f385910h), java.lang.Integer.valueOf(c4Var2.f6316b.f385911i), java.lang.Integer.valueOf(c4Var2.f6316b.f385912m), java.lang.Integer.valueOf(c4Var2.f6316b.f385913n), java.lang.Integer.valueOf(c4Var2.f6316b.f385914o), java.lang.Integer.valueOf(c4Var2.f6316b.f385915p), java.lang.Integer.valueOf(c4Var2.f6316b.f385916q), java.lang.Integer.valueOf(c4Var2.f6316b.f385917r), java.lang.Integer.valueOf(c4Var2.f6316b.f385918s), java.lang.Integer.valueOf(c4Var2.f6316b.f385919t), java.lang.Integer.valueOf(c4Var2.f6316b.f385920u));
        }
    }

    public final void V6(com.tencent.mm.storage.f9 f9Var) {
        long j17 = this.f200581u + 30000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f200581u = currentTimeMillis;
        if (j17 < currentTimeMillis) {
            this.f200580t = c01.d9.b().E();
        }
        if (!this.f200580t) {
            db5.t7.k(getContext(), null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(getContext(), "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra("app_msg_id", f9Var.getMsgId());
        intent.putExtra("msg_talker", f9Var.Q0());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterAppMsgShow", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterAppMsgShow", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void W6(android.view.View view, int i17) {
        int i18;
        int i19;
        if (this.f200572i == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryGridUI", "[ImageGalleryUI] enter");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
        intent.putExtra("key_biz_chat_id", this.f200568e);
        intent.putExtra("key_is_biz_chat", this.f200569f);
        intent.putExtra("intent.key.with.footer", true);
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f200572i.getItem(i17);
        if (f9Var == null) {
            return;
        }
        int i27 = getResources().getConfiguration().orientation;
        int[] iArr = new int[2];
        if (view != null) {
            i18 = view.getWidth();
            i19 = view.getHeight();
            view.getLocationInWindow(iArr);
        } else {
            i18 = 0;
            i19 = 0;
        }
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.putExtra("img_gallery_msg_id", f9Var.getMsgId()).putExtra("img_gallery_msg_svr_id", f9Var.I0()).putExtra("img_gallery_talker", f9Var.Q0()).putExtra("img_gallery_chatroom_name", f9Var.Q0()).putExtra("img_gallery_orientation", i27);
        if (view != null) {
            intent.putExtra("img_gallery_width", i18).putExtra("img_gallery_height", i19).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]).putExtra("img_gallery_enter_from_grid", true);
        } else {
            intent.putExtra("img_gallery_back_from_grid", true);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterGallery", "(Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterGallery", "(Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.pm.PackageInfo X6(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L21
            int r1 = r5.length()
            if (r1 != 0) goto La
            goto L21
        La:
            java.lang.Class<lt.i0> r1 = lt.i0.class
            i95.m r1 = i95.n0.c(r1)
            lt.i0 r1 = (lt.i0) r1
            kt.c r1 = (kt.c) r1
            r1.getClass()
            com.tencent.mm.pluginsdk.model.app.m r5 = com.tencent.mm.pluginsdk.model.app.w.h(r5)
            if (r5 != 0) goto L1e
            goto L21
        L1e:
            java.lang.String r5 = r5.field_packageName
            goto L22
        L21:
            r5 = r0
        L22:
            if (r5 != 0) goto L25
            return r0
        L25:
            r1 = 0
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            return r4
        L2f:
            r4 = move-exception
            java.lang.String r5 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "MicroMsg.GalleryGridUI"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r4, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.X6(android.content.Context, java.lang.String):android.content.pm.PackageInfo");
    }

    public java.lang.String Y6(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String s17;
        java.lang.String str = this.f200567d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str == null ? "" : str;
        boolean R4 = com.tencent.mm.storage.z3.R4(str);
        return (R4 && R4 && (s17 = c01.w9.s(f9Var.j())) != null && s17.length() > 0) ? s17 : str2;
    }

    public void Z6(int i17) {
        android.content.Intent intent = getIntent();
        this.f200574n = java.lang.Boolean.valueOf(intent.getIntExtra("kintent_intent_source", 0) == 1);
        this.f200567d = intent.getStringExtra("kintent_talker");
        this.f200570g = intent.getIntExtra("kintent_image_index", 0);
        this.f200569f = intent.getBooleanExtra("key_is_biz_chat", false);
        this.f200568e = getIntent().getLongExtra("key_biz_chat_id", -1L);
        setMMTitle(getString(com.tencent.mm.R.string.f489992hs));
        setBackBtn(new com.tencent.mm.ui.chatting.gallery.n2(this));
        this.f200584x = findViewById(com.tencent.mm.R.id.jqp);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dth);
        this.A = findViewById;
        findViewById.setOnClickListener(this);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.oio);
        this.B = findViewById2;
        findViewById2.setOnClickListener(this);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.m9n);
        this.C = findViewById3;
        findViewById3.setOnClickListener(this);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.crz);
        this.D = findViewById4;
        findViewById4.setOnClickListener(this);
        this.f200575o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482917rq);
        this.f200576p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482883qp);
        if (i17 == 0) {
            android.widget.GridView gridView = (android.widget.GridView) findViewById(com.tencent.mm.R.id.h9h);
            this.f200571h = gridView;
            gridView.setOnItemClickListener(this);
            this.f200571h.setNumColumns(3);
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            if (this.f200569f) {
                f9Var.Y0(this.f200568e);
            }
            com.tencent.mm.ui.chatting.gallery.k2 k2Var = new com.tencent.mm.ui.chatting.gallery.k2(this, f9Var, this.f200568e, this.f200567d);
            this.f200572i = k2Var;
            if (k2Var.getCount() == 0) {
                this.f200576p.setVisibility(0);
                return;
            }
            this.f200576p.setVisibility(8);
            this.f200571h.setAdapter((android.widget.ListAdapter) this.f200572i);
            int firstVisiblePosition = this.f200571h.getFirstVisiblePosition();
            int lastVisiblePosition = this.f200571h.getLastVisiblePosition();
            int i18 = this.f200570g;
            if (i18 < firstVisiblePosition || i18 > lastVisiblePosition) {
                this.f200571h.setSelection(i18);
            }
        } else {
            com.tencent.mm.ui.chatting.gallery.k2 k2Var2 = this.f200572i;
            if (k2Var2 != null) {
                k2Var2.notifyDataSetChanged();
                int firstVisiblePosition2 = this.f200571h.getFirstVisiblePosition();
                int lastVisiblePosition2 = this.f200571h.getLastVisiblePosition();
                int i19 = this.f200570g;
                if (i19 < firstVisiblePosition2 || i19 > lastVisiblePosition2) {
                    this.f200571h.setSelection(i19);
                }
            }
        }
        this.f200571h.setOnScrollListener(new com.tencent.mm.ui.chatting.gallery.p2(this));
    }

    public void a7() {
        com.tencent.mm.ui.chatting.gallery.p4.f201265a.f201334b = false;
        setMMTitle(getString(com.tencent.mm.R.string.f489992hs));
        com.tencent.mm.ui.chatting.gallery.k2 k2Var = this.f200572i;
        if (k2Var == null) {
            return;
        }
        k2Var.notifyDataSetChanged();
        if (this.f200585y >= 0) {
            android.widget.GridView gridView = this.f200571h;
            gridView.setPadding(gridView.getPaddingLeft(), this.f200571h.getPaddingTop(), this.f200571h.getPaddingRight(), this.f200585y);
        }
        android.view.View view = this.f200584x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        removeOptionMenu(0);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.fik), this);
    }

    public void b7() {
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        setMMTitle(getString(com.tencent.mm.R.string.fjy, java.lang.Integer.valueOf(r4Var.f())));
        r4Var.f201334b = true;
        if (this.f200572i == null) {
            return;
        }
        if (this.f200586z == null) {
            this.f200586z = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477857df);
        }
        com.tencent.mm.ui.chatting.gallery.k2 k2Var = this.f200572i;
        k2Var.f201120v = false;
        k2Var.notifyDataSetChanged();
        android.view.View view = this.f200584x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f200584x.startAnimation(this.f200586z);
        this.A.setEnabled(false);
        this.B.setEnabled(false);
        this.C.setEnabled(false);
        this.D.setEnabled(false);
        this.f200585y = this.f200571h.getPaddingBottom();
        android.widget.GridView gridView = this.f200571h;
        gridView.setPadding(gridView.getPaddingLeft(), this.f200571h.getPaddingTop(), this.f200571h.getPaddingRight(), i65.a.h(getContext(), com.tencent.mm.R.dimen.f479923j2));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11627, 2);
        removeOptionMenu(0);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.fij), this);
    }

    @Override // com.tencent.mm.ui.chatting.gallery.q4
    public void clear() {
        com.tencent.mm.ui.chatting.gallery.k2 k2Var = this.f200572i;
        T6();
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        if (e3Var == ot0.e3.del) {
            this.f200572i.q();
            this.f200572i.notifyDataSetChanged();
        }
        a7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        r4Var.f201335c.clear();
        r4Var.b();
        r4Var.f201334b = false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean fromFullScreenActivity() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bk_;
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
    }

    @Override // com.tencent.mm.ui.chatting.gallery.q4
    public void l0(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        com.tencent.mm.ui.chatting.gallery.k2 k2Var = this.f200572i;
        setMMTitle(getString(com.tencent.mm.R.string.fjy, java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.gallery.p4.f201265a.f())));
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (com.tencent.mm.ui.chatting.gallery.p4.f201265a.f201334b) {
            a7();
            return;
        }
        if (this.f200574n.booleanValue()) {
            super.onBackPressed();
            return;
        }
        int i17 = this.f200570g;
        if (i17 >= 0) {
            W6(null, i17);
        }
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.appcompat.app.AppCompatActivity context;
        int i17;
        androidx.appcompat.app.AppCompatActivity context2;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        if (r4Var.f201333a.isEmpty()) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean R4 = com.tencent.mm.storage.z3.R4(this.f200567d);
        java.util.ArrayList arrayList2 = r4Var.f201333a;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.crz) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11627, 5);
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                copyOnWriteArraySet.add(tg3.l1.a((com.tencent.mm.storage.f9) it.next()));
            }
            db5.e1.A(this, getString(com.tencent.mm.R.string.bav), "", getString(com.tencent.mm.R.string.boo), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.gallery.r2(this, copyOnWriteArraySet), null);
        } else if (view.getId() == com.tencent.mm.R.id.dth) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 18L, 1L, true);
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            if (com.tencent.mm.pluginsdk.model.e2.i(getContext(), doFavoriteEvent, this.f200567d, arrayList2, false, false)) {
                U6(doFavoriteEvent);
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.ui.chatting.e.c(com.tencent.mm.ui.chatting.c.Fav, com.tencent.mm.ui.chatting.d.Samll, (com.tencent.mm.storage.f9) it6.next(), 0);
                }
            } else {
                int size = arrayList2.size();
                am.c4 c4Var = doFavoriteEvent.f54090g;
                if (size > 1) {
                    androidx.appcompat.app.AppCompatActivity context3 = getContext();
                    if (c4Var.f6326l >= 0) {
                        context = getContext();
                        i17 = com.tencent.mm.R.string.caq;
                    } else {
                        context = getContext();
                        i17 = com.tencent.mm.R.string.cap;
                    }
                    java.lang.String string = context.getString(i17);
                    if (c4Var.f6326l >= 0) {
                        context2 = getContext();
                        i18 = com.tencent.mm.R.string.f490939bb1;
                    } else {
                        context2 = getContext();
                        i18 = com.tencent.mm.R.string.hjg;
                    }
                    db5.e1.A(context3, string, "", context2.getString(i18), getContext().getString(com.tencent.mm.R.string.baz), new com.tencent.mm.ui.chatting.gallery.s2(this, doFavoriteEvent, arrayList2), null);
                } else {
                    db5.e1.i(getContext(), c4Var.f6326l, 0);
                }
            }
        } else if (view.getId() == com.tencent.mm.R.id.oio) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 19L, 1L, true);
            com.tencent.mm.ui.chatting.x3.d(this, arrayList2, R4, this.f200567d, this);
            a7();
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11627, 3);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it7.next();
                if (!com.tencent.mm.ui.chatting.gallery.k1.M(f9Var) && !com.tencent.mm.ui.chatting.gallery.k1.F(f9Var)) {
                    if (!(f9Var == null ? false : f9Var.M2())) {
                        arrayList3.add(f9Var);
                    }
                }
            }
            if (arrayList3.size() != arrayList2.size()) {
                db5.e1.n(getContext(), com.tencent.mm.R.string.fjf, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.ui.chatting.gallery.l2(this, arrayList3), null);
            } else {
                com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) arrayList3.get(0);
                if (arrayList2.size() == 1 && f9Var2 != null && f9Var2.k2()) {
                    ot0.q v17 = ot0.q.v(f9Var2.U1());
                    if (v17 != null && ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i))) {
                        V6(f9Var2);
                    }
                } else {
                    com.tencent.mm.ui.chatting.gallery.k1.i(this, arrayList2);
                    a7();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f200579s = true;
        this.f200573m = new com.tencent.mm.sdk.platformtools.n3();
        Z6(0);
        this.f200578r.alive();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f200573m.removeCallbacks(this.f200577q);
        this.f200573m = null;
        n11.a.b().n(0);
        this.f200578r.dead();
        super.onDestroy();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:141|142|143|(7:145|146|(1:181)(1:150)|(5:152|153|(2:155|(2:158|159)(1:157))|162|160)|165|166|167)|183|146|(1:148)|181|(0)|165|166|167) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x048e, code lost:
    
        if (r7 != false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x063f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onItemClick(android.widget.AdapterView r45, android.view.View r46, int r47, long r48) {
        /*
            Method dump skipped, instructions count: 2956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        if (!menuItem.getTitle().equals(getString(com.tencent.mm.R.string.fik))) {
            a7();
            return false;
        }
        com.tencent.mm.ui.chatting.gallery.p4.f201265a.b();
        b7();
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        setIntent(intent);
        super.onNewIntent(intent);
        Z6(1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.ui.chatting.gallery.p4.f201265a.f201335c.remove(this);
        super.onPause();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        throw null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        java.util.ArrayList arrayList = r4Var.f201335c;
        arrayList.remove(this);
        arrayList.add(this);
        if (this.f200579s) {
            if (r4Var.f201334b) {
                b7();
            } else {
                a7();
            }
        }
        this.f200573m.postDelayed(this.f200577q, 300L);
        super.onResume();
        com.tencent.mm.ui.chatting.gallery.k2 k2Var = this.f200572i;
        if (k2Var != null) {
            k2Var.notifyDataSetChanged();
            if (r4Var.f201334b) {
                setMMTitle(getString(com.tencent.mm.R.string.fjy, java.lang.Integer.valueOf(r4Var.f())));
            }
        }
        this.f200579s = false;
        T6();
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}
