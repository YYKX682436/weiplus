package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public abstract class RecordMsgBaseUI extends com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI {

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.h0 f155267n;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f155271r;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ListView f155266m = null;

    /* renamed from: o, reason: collision with root package name */
    public long f155268o = -1;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155269p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f155270q = "";

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f155272s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FavUIPhotoInfoEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.record.ui.RecordMsgBaseUI.1
        {
            this.__eventId = -1051078375;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.FavUIPhotoInfoEvent favUIPhotoInfoEvent) {
            com.tencent.mm.autogen.events.FavUIPhotoInfoEvent favUIPhotoInfoEvent2 = favUIPhotoInfoEvent;
            com.tencent.mm.plugin.record.ui.RecordMsgBaseUI recordMsgBaseUI = com.tencent.mm.plugin.record.ui.RecordMsgBaseUI.this;
            int firstVisiblePosition = recordMsgBaseUI.f155266m.getFirstVisiblePosition();
            int lastVisiblePosition = recordMsgBaseUI.f155266m.getLastVisiblePosition();
            int max = java.lang.Math.max(firstVisiblePosition, 0);
            int max2 = java.lang.Math.max(lastVisiblePosition, 0);
            if (max < 0 || max2 >= recordMsgBaseUI.f155266m.getAdapter().getCount()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgBaseUI", "invalid position %d-%d, cnt:%d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(recordMsgBaseUI.f155266m.getAdapter().getCount()));
                return false;
            }
            while (max <= max2) {
                r45.gp0 gp0Var = (r45.gp0) recordMsgBaseUI.f155266m.getAdapter().getItem(max);
                if (gp0Var != null && com.tencent.mm.sdk.platformtools.t8.D0(gp0Var.T, favUIPhotoInfoEvent2.f54241g.f8368a)) {
                    android.view.View childAt = recordMsgBaseUI.f155266m.getChildAt(max);
                    if (childAt == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgBaseUI", "[getPhotoInfo] getChildAt(%d)", java.lang.Integer.valueOf(max));
                    } else {
                        android.view.View findViewById = childAt.findViewById(com.tencent.mm.R.id.lp8);
                        if (findViewById != null) {
                            int[] iArr = new int[2];
                            findViewById.getLocationInWindow(iArr);
                            int i17 = iArr[0];
                            am.y9 y9Var = favUIPhotoInfoEvent2.f54242h;
                            y9Var.f8444a = i17;
                            y9Var.f8445b = iArr[1];
                            y9Var.f8446c = findViewById.getWidth();
                            y9Var.f8447d = findViewById.getHeight();
                        }
                    }
                }
                max++;
            }
            return true;
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f155273t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f155274u = null;

    public final java.lang.String Z6(java.lang.String str) {
        try {
            return (java.lang.String) android.text.format.DateFormat.format(getContext().getString(com.tencent.mm.R.string.fcl), new java.text.SimpleDateFormat("yyyy-MM-dd").parse(str).getTime());
        } catch (java.text.ParseException unused) {
            return str;
        }
    }

    public abstract com.tencent.mm.plugin.record.ui.h0 a7();

    public abstract java.lang.String b7();

    public abstract java.lang.String c7();

    public abstract java.lang.String d7();

    public void e7() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        this.f155267n = a7();
        this.f155268o = getIntent().getLongExtra("message_id", -1L);
        this.f155269p = getIntent().getStringExtra("record_app_id");
        this.f155270q = getIntent().getStringExtra("message_talker");
        this.f155266m = (android.widget.ListView) findViewById(com.tencent.mm.R.id.lpg);
        g7();
        java.lang.String c76 = c7();
        java.lang.String b76 = b7();
        if (com.tencent.mm.sdk.platformtools.t8.K0(c76) || com.tencent.mm.sdk.platformtools.t8.K0(b76)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgBaseUI", "subtitle time error!");
        } else {
            java.lang.String str4 = c76.split(" ")[0];
            java.lang.String str5 = b76.split(" ")[0];
            if (!c76.split("-")[0].equals(b76.split("-")[0])) {
                this.f155267n.f155403i = true;
            } else if (str4.equals(str5)) {
                this.f155267n.f155404m = false;
            } else {
                this.f155267n.f155404m = true;
            }
        }
        com.tencent.mm.pluginsdk.model.app.m mVar = null;
        if (this.f155273t == null) {
            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cd6, null);
            this.f155273t = inflate;
            this.f155266m.addHeaderView(inflate, null, false);
        }
        android.widget.TextView textView = (android.widget.TextView) this.f155273t.findViewById(com.tencent.mm.R.id.odd);
        java.lang.String c77 = c7();
        java.lang.String b77 = b7();
        if (com.tencent.mm.sdk.platformtools.t8.K0(c77) || com.tencent.mm.sdk.platformtools.t8.K0(b77)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgBaseUI", "subtitle time error!");
        } else {
            java.lang.String Z6 = Z6(c77.split(" ")[0]);
            java.lang.String Z62 = Z6(b77.split(" ")[0]);
            if (!Z6.equals(Z62)) {
                Z6 = Z6 + " " + getString(com.tencent.mm.R.string.jyc) + " " + Z62;
            }
            textView.setText(Z6);
        }
        if (this.f155274u == null) {
            android.view.View inflate2 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489387cd5, null);
            this.f155274u = inflate2;
            this.f155266m.addFooterView(inflate2, null, false);
        }
        android.view.View view = this.f155274u;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f155269p)) {
            ot0.q v17 = ot0.q.v(pt0.f0.Li(this.f155270q, this.f155268o).U1());
            if (v17 != null) {
                this.f155269p = v17.f348646d;
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str6 = this.f155269p;
                int i17 = v17.G;
                ((kt.c) i0Var).getClass();
                mVar = com.tencent.mm.pluginsdk.model.app.w.i(str6, i17);
                str = (mVar == null || (str3 = mVar.field_appName) == null || str3.trim().length() <= 0) ? v17.H : mVar.field_appName;
            } else {
                str = null;
            }
        } else {
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str7 = this.f155269p;
            ((kt.c) i0Var2).getClass();
            mVar = com.tencent.mm.pluginsdk.model.app.w.h(str7);
            str = (mVar == null || (str2 = mVar.field_appName) == null || str2.trim().length() <= 0) ? "" : mVar.field_appName;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f155269p) && mVar != null) {
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.kjr);
            this.f155271r = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI", "showSourceLayoutIfNeed", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI", "showSourceLayoutIfNeed", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a49);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a4_);
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int textSize = (int) (textView2.getTextSize() * 1.5d);
            layoutParams.height = textSize;
            layoutParams.width = textSize;
            imageView.setLayoutParams(layoutParams);
            textView2.setText(getResources().getString(com.tencent.mm.R.string.hfo, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(getContext(), mVar, str)));
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(this.f155269p, 1, i65.a.g(getContext()));
            if (Di == null || Di.isRecycled()) {
                android.content.res.Resources resources = getResources();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bku));
                arrayList2.add(resources);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI", "initWatermarkIcon", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI", "initWatermarkIcon", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(decodeResource);
                int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479930ja);
                bitmapDrawable.setBounds(0, 0, dimension, dimension);
                imageView.setImageDrawable(bitmapDrawable);
            } else {
                android.graphics.drawable.BitmapDrawable bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(Di);
                int dimension2 = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479930ja);
                bitmapDrawable2.setBounds(0, 0, dimension2, dimension2);
                imageView.setImageDrawable(bitmapDrawable2);
            }
        }
        this.f155266m.setAdapter((android.widget.ListAdapter) this.f155267n);
        com.tencent.mm.plugin.record.ui.h0 h0Var = this.f155267n;
        h0Var.f155406o = this.f155266m;
        int i18 = this.f100600g.f343476a;
        android.util.SparseArray sparseArray = h0Var.f155402h;
        sparseArray.put(0, new com.tencent.mm.plugin.record.ui.viewWrappers.y(h0Var.f155400f));
        com.tencent.mm.plugin.record.ui.viewWrappers.m mVar2 = new com.tencent.mm.plugin.record.ui.viewWrappers.m(h0Var.f155409r, h0Var.f155406o);
        mVar2.f155543g = h0Var.f155398d;
        sparseArray.put(1, h0Var.j(mVar2));
        sparseArray.put(2, new com.tencent.mm.plugin.record.ui.viewWrappers.z());
        com.tencent.mm.plugin.record.ui.viewWrappers.q qVar = new com.tencent.mm.plugin.record.ui.viewWrappers.q(h0Var.f155409r, h0Var.f155401g);
        qVar.f155556e = h0Var.f155412u;
        qVar.f155557f = h0Var.f155413v;
        qVar.f155558g = h0Var.f155398d;
        qVar.f155559h = h0Var.f155399e;
        qVar.f155560i = h0Var.c();
        sparseArray.put(3, qVar);
        sparseArray.put(4, new com.tencent.mm.plugin.record.ui.viewWrappers.s(h0Var.f155409r));
        sparseArray.put(5, new com.tencent.mm.plugin.record.ui.viewWrappers.a());
        this.f155267n.f155411t = getIntent().getIntExtra("preChatTYPE", 0);
        this.f155266m.setOnScrollListener(new com.tencent.mm.plugin.record.ui.i0(this));
        setBackBtn(new com.tencent.mm.plugin.record.ui.j0(this));
        h7();
        this.f155266m.postDelayed(new com.tencent.mm.plugin.record.ui.k0(this), 100L);
    }

    public abstract void f7(int i17, int i18, android.content.Intent intent);

    public void g7() {
        java.lang.String d76 = d7();
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f491161c63);
        if (d76 != null && d76.endsWith(string) && d76.lastIndexOf(string) >= 1) {
            d76 = d76.substring(0, d76.lastIndexOf(string) - 1);
        }
        setMMTitle(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(getContext(), d76, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479568k)));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cd8;
    }

    public abstract void h7();

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        f7(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        e7();
        this.f155272s.alive();
        o25.n1.c(this);
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f155272s.dead();
        com.tencent.mm.plugin.record.ui.h0 h0Var = this.f155267n;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.record.ui.h0 h0Var = this.f155267n;
        if (h0Var != null) {
            int i17 = 0;
            while (true) {
                android.util.SparseArray sparseArray = h0Var.f155402h;
                if (i17 >= sparseArray.size()) {
                    break;
                }
                com.tencent.mm.plugin.record.ui.g0 g0Var = (com.tencent.mm.plugin.record.ui.g0) sparseArray.valueAt(i17);
                if (g0Var != null) {
                    g0Var.pause();
                }
                i17++;
            }
        }
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        uIStatusChangedEvent.f54907g.f7378a = 1;
        uIStatusChangedEvent.e();
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        android.widget.ListView listView = this.f155266m;
        if (listView != null) {
            am.mz mzVar = uIStatusChangedEvent.f54907g;
            mzVar.f7378a = 0;
            mzVar.f7379b = listView.getFirstVisiblePosition();
            mzVar.f7380c = this.f155266m.getLastVisiblePosition();
            mzVar.f7381d = this.f155266m.getHeaderViewsCount();
            uIStatusChangedEvent.e();
        }
    }
}
