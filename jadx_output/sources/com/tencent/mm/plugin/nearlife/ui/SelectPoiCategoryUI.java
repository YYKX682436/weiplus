package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes5.dex */
public class SelectPoiCategoryUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f152291m = com.tencent.mm.storage.v3.f196273a + "poi_categories";

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI.EventListener f152292d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f152293e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ArrayAdapter f152294f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f152295g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f152296h = new com.tencent.mm.plugin.nearlife.ui.a0(this);

    /* renamed from: i, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f152297i = new com.tencent.mm.plugin.nearlife.ui.b0(this);

    /* loaded from: classes5.dex */
    public class EventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PoiCategoriesUpdateEvent> {

        /* renamed from: d, reason: collision with root package name */
        public com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI f152298d;

        public EventListener(com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI selectPoiCategoryUI, int i17) {
            super(com.tencent.mm.app.a0.f53288d, i17);
            this.__eventId = -459979365;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.PoiCategoriesUpdateEvent poiCategoriesUpdateEvent) {
            com.tencent.mm.autogen.events.PoiCategoriesUpdateEvent poiCategoriesUpdateEvent2 = poiCategoriesUpdateEvent;
            if (poiCategoriesUpdateEvent2 instanceof com.tencent.mm.autogen.events.PoiCategoriesUpdateEvent) {
                com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI selectPoiCategoryUI = this.f152298d;
                byte[] bArr = poiCategoriesUpdateEvent2.f54618g.f7252a;
                selectPoiCategoryUI.getClass();
                java.lang.String str = com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI.f152291m;
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                    if (m18.a()) {
                        m18.f213266a.r(m18.f213267b);
                    }
                }
                try {
                    java.lang.String concat = str.concat("/lastest_poi_categories.dat");
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(concat);
                    if (!r6Var.m()) {
                        r6Var.k();
                    }
                    com.tencent.mm.vfs.w6.S(concat, bArr, 0, bArr.length);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SelectPoiCategoryUI", "write file failed: " + e17.getMessage());
                }
                java.lang.String[] split = new java.lang.String(bArr).split("\n");
                ((java.util.ArrayList) selectPoiCategoryUI.f152295g).clear();
                for (java.lang.String str3 : split) {
                    ((java.util.ArrayList) selectPoiCategoryUI.f152295g).add(str3.trim());
                }
                selectPoiCategoryUI.T6();
            }
            return false;
        }
    }

    public final void T6() {
        this.f152294f.clear();
        for (int i17 = 0; i17 < this.f152295g.size(); i17++) {
            this.f152294f.add((java.lang.String) this.f152295g.get(i17));
        }
        this.f152294f.notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U6(java.io.InputStream r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.util.List r0 = r5.f152295g
            r0.clear()
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            java.lang.String r3 = "UTF-8"
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
        L16:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            if (r0 == 0) goto L22
            java.util.List r2 = r5.f152295g     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r2.add(r0)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            goto L16
        L22:
            r1.close()     // Catch: java.lang.Exception -> L29
            r6.close()     // Catch: java.lang.Exception -> L29
            goto L46
        L29:
            r6 = move-exception
            r6.getMessage()
            goto L46
        L2e:
            r0 = move-exception
            goto L48
        L30:
            r0 = move-exception
            goto L3b
        L32:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L48
        L37:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L3b:
            r0.getMessage()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.lang.Exception -> L29
        L43:
            r6.close()     // Catch: java.lang.Exception -> L29
        L46:
            r6 = 1
            return r6
        L48:
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Exception -> L51
        L4d:
            r6.close()     // Catch: java.lang.Exception -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.getMessage()
        L55:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI.U6(java.io.InputStream):boolean");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cjz;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.h9v);
        setBackBtn(this.f152297i);
        this.f152294f = new android.widget.ArrayAdapter(this, com.tencent.mm.R.layout.c9z);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.bdf);
        this.f152293e = listView;
        listView.setAdapter((android.widget.ListAdapter) this.f152294f);
        this.f152293e.setOnItemClickListener(this.f152296h);
        java.lang.String str = f152291m + "/lastest_poi_categories.dat";
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                try {
                    z17 = U6(com.tencent.mm.vfs.w6.D(a17, b3Var.m(a17, m17)));
                } catch (java.io.FileNotFoundException e17) {
                    e17.getMessage();
                }
            }
        }
        if (!z17) {
            try {
                U6(getAssets().open("default_poi_categories.dat"));
            } catch (java.io.IOException e18) {
                e18.getMessage();
            }
        }
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f152295g = new java.util.ArrayList();
        initView();
        com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI.EventListener eventListener = new com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI.EventListener(this, 0);
        this.f152292d = eventListener;
        eventListener.alive();
        this.f152292d.f152298d = this;
        c01.d9.e().g(new f21.g0(17));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f152292d.dead();
    }
}
