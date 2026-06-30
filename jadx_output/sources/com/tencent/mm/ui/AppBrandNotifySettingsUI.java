package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class AppBrandNotifySettingsUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f196579m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f196580d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.f1 f196581e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f196582f;

    /* renamed from: g, reason: collision with root package name */
    public android.database.DataSetObserver f196583g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f196584h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f196585i = new com.tencent.mm.ui.AppBrandNotifySettingsUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);

    /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1390647424;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent) {
            com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent2 = appBrandNotifyMessageStatusChangedEvent;
            com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI = com.tencent.mm.ui.AppBrandNotifySettingsUI.this;
            if (appBrandNotifySettingsUI.f196581e == null) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNotifySettingsUI", "change notify preferent status by event");
            com.tencent.mm.plugin.appbrand.service.f6 f6Var = (com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class);
            for (int i17 = 0; i17 < appBrandNotifySettingsUI.f196581e.getCount(); i17++) {
                com.tencent.mm.ui.a1 a1Var = (com.tencent.mm.ui.a1) appBrandNotifySettingsUI.f196581e.f208408e.get(i17);
                if (a1Var != null) {
                    k91.v5 Bi = ((k91.g4) f6Var).Bi(a1Var.f197112a);
                    if (Bi == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNotifySettingsUI", "can't find local record, username:%s", a1Var.f197112a);
                    } else {
                        java.lang.String str = Bi.field_appId;
                        if (str == null) {
                            str = "";
                        }
                        if (str.equals(appBrandNotifyMessageStatusChangedEvent2.f53982g.f8149a)) {
                            a1Var.f197115d = appBrandNotifyMessageStatusChangedEvent2.f53982g.f8150b;
                        }
                    }
                }
            }
            appBrandNotifySettingsUI.runOnUiThread(new com.tencent.mm.ui.s0(this));
            return true;
        }
    }

    public static void T6(com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI, java.util.LinkedList linkedList) {
        appBrandNotifySettingsUI.getClass();
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNotifySettingsUI", "saveNotifyMessageResult, configList is null or empty");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.le7 le7Var = (r45.le7) it.next();
            if (le7Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNotifySettingsUI", "scene end, item is null");
            } else {
                com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = new com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent();
                java.lang.String str = le7Var.f379398d;
                am.rz rzVar = updateAppBrandNotifyMessageEvent.f54912g;
                rzVar.f7853a = str;
                rzVar.f7854b = le7Var.f379399e == 0;
                updateAppBrandNotifyMessageEvent.e();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488143ic;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f196584h = intent.getStringExtra("report_session_id");
        java.lang.String stringExtra = intent.getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            setMMTitle(com.tencent.mm.R.string.f490848b11);
        } else {
            setMMTitle(stringExtra);
        }
        setBackBtn(new com.tencent.mm.ui.t0(this));
        this.f196580d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
        com.tencent.mm.ui.f1 f1Var = new com.tencent.mm.ui.f1(getLayoutInflater());
        this.f196581e = f1Var;
        this.f196580d.setAdapter((android.widget.ListAdapter) f1Var);
        this.f196582f = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.u0(this));
        com.tencent.mm.ui.v0 v0Var = new com.tencent.mm.ui.v0(this);
        this.f196583g = v0Var;
        this.f196581e.registerDataSetObserver(v0Var);
        gm0.j1.b().h();
        ((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).getClass();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ys3();
        lVar.f70665b = new r45.zs3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/getwxamsgconfig";
        lVar.f70667d = 357;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.z2.e(lVar.a(), new com.tencent.mm.ui.y0(this), true, this);
        this.f196585i.alive();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.service.f6 f6Var = (com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f196581e.f208409f;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.a1 a1Var = (com.tencent.mm.ui.a1) it.next();
                r45.le7 le7Var = new r45.le7();
                k91.v5 Bi = ((k91.g4) f6Var).Bi(a1Var.f197112a);
                if (Bi == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNotifySettingsUI", "get attribute fail, username: %s", a1Var.f197112a);
                } else {
                    java.lang.String str = Bi.field_appId;
                    boolean z17 = a1Var.f197115d;
                    le7Var.f379398d = str;
                    le7Var.f379399e = z17 ? 1 : 0;
                    linkedList.add(le7Var);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19724, 1, 5, 0, 0, 0, null, 0, 0, 0, str, null, null, null, 0, null, null, 0, null, null, this.f196584h);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            r45.h36 h36Var = new r45.h36();
            h36Var.f375808d = linkedList;
            h36Var.f375809e = 1;
            com.tencent.mm.modelbase.z2.d(((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).wi(h36Var), new com.tencent.mm.ui.w0(this, linkedList), true);
        }
        this.f196581e.unregisterDataSetObserver(this.f196583g);
        this.f196585i.dead();
        super.onDestroy();
    }
}
