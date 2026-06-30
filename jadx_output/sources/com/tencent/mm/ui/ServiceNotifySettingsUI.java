package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class ServiceNotifySettingsUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f197056o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f197057d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f197058e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.xh f197059f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f197060g;

    /* renamed from: h, reason: collision with root package name */
    public android.database.DataSetObserver f197061h;

    /* renamed from: i, reason: collision with root package name */
    public int f197062i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f197063m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f197064n;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cki;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f197062i = intent.getIntExtra("mode", 0);
        this.f197063m = intent.getStringExtra("scene_id");
        this.f197064n = intent.getStringExtra("from_scene");
        intent.putExtra("scene_id", this.f197063m);
        java.lang.String stringExtra = intent.getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            setMMTitle(com.tencent.mm.R.string.hdg);
        } else {
            setMMTitle(stringExtra);
        }
        setBackBtn(new com.tencent.mm.ui.mh(this));
        this.f197057d = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.btf);
        this.f197058e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.i3_)).setText(this.f197062i == 1 ? com.tencent.mm.R.string.hch : com.tencent.mm.R.string.hce);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.ob6)).setText(this.f197062i == 1 ? com.tencent.mm.R.string.hcj : com.tencent.mm.R.string.hcl);
        if (this.f197062i == 0) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.p5b);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/ServiceNotifySettingsUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/ServiceNotifySettingsUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById.findViewById(com.tencent.mm.R.id.p5a);
            mMSwitchBtn.setCheck(c01.d9.b().p().o(com.tencent.mm.storage.u3.USERINFO_SUBSCRIBEMSG_VOICE_BROADCAST_BOOLEAN, true));
            mMSwitchBtn.setSwitchListener(new com.tencent.mm.ui.nh(this));
        }
        com.tencent.mm.ui.xh xhVar = new com.tencent.mm.ui.xh(this, getLayoutInflater(), this.f197062i, this.f197063m);
        this.f197059f = xhVar;
        this.f197058e.setAdapter((android.widget.ListAdapter) xhVar);
        com.tencent.mm.ui.oh ohVar = new com.tencent.mm.ui.oh(this);
        this.f197061h = ohVar;
        this.f197059f.registerDataSetObserver(ohVar);
        if (this.f197062i == 1) {
            c01.d9.e().a(1145, this);
            com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
            ((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).getClass();
            e17.g(new k01.a1(12));
            this.f197060g = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.ph(this));
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f197057d;
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
        if (this.f197062i == 1) {
            u3Var = com.tencent.mm.storage.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC;
        }
        mMSwitchBtn2.setCheck(c01.d9.b().p().o(u3Var, true));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(1145, this);
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
        boolean o17 = c01.d9.b().p().o(this.f197062i == 1 ? com.tencent.mm.storage.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC : u3Var, true);
        boolean z17 = this.f197057d.f211363x != o17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (z17) {
            r45.vi6 vi6Var = new r45.vi6();
            vi6Var.f388295e = this.f197057d.f211363x ? 1 : 0;
            vi6Var.f388294d = this.f197062i == 1 ? 2 : 0;
            linkedList.add(vi6Var);
            boolean z18 = !o17;
            if (this.f197062i == 1) {
                u3Var = com.tencent.mm.storage.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC;
                bn0.g.f22779a.i("USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC", z18);
            } else {
                bn0.g.f22779a.i("USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC", z18);
            }
            c01.d9.b().p().x(u3Var, java.lang.Boolean.valueOf(z18));
            ((zr.c) com.tencent.mm.sdk.event.q.f192403a.a(zr.c.class)).O6(new java.lang.Object());
            if (this.f197062i == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13798, java.lang.Integer.valueOf(vi6Var.f388295e == 1 ? 3 : 2), "", 0, this.f197063m, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13796, java.lang.Integer.valueOf(vi6Var.f388295e == 1 ? 11 : 10), "", "", 0, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            }
            if ("scene_service_notify_conversation".equals(this.f197064n)) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[10];
                objArr[0] = 3;
                objArr[1] = null;
                objArr[2] = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1());
                objArr[3] = null;
                objArr[4] = null;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = java.lang.Integer.valueOf(this.f197057d.f211363x ? 1 : 2);
                objArr[8] = 0;
                objArr[9] = te5.v1.f418758b;
                g0Var.d(21825, objArr);
            }
        }
        int i17 = this.f197062i == 1 ? 2 : 1;
        java.util.LinkedList linkedList2 = this.f197059f.f212561i;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            int i18 = this.f197062i != 1 ? 1 : 3;
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.vh vhVar = (com.tencent.mm.ui.vh) it.next();
                r45.vi6 vi6Var2 = new r45.vi6();
                vi6Var2.f388296f = vhVar.f211157a;
                vi6Var2.f388294d = i18;
                vi6Var2.f388295e = 1;
                linkedList.add(vi6Var2);
                com.tencent.mm.autogen.events.UpdateWxaOptionsEvent updateWxaOptionsEvent = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent();
                java.lang.String str = vhVar.f211157a;
                am.g00 g00Var = updateWxaOptionsEvent.f54927g;
                g00Var.f6724a = str;
                g00Var.f6725b = 2;
                g00Var.f6726c = i17;
                updateWxaOptionsEvent.e();
            }
        }
        if (!linkedList.isEmpty()) {
            c01.d9.e().a(1176, new com.tencent.mm.ui.qh(this, z17, o17, linkedList, i17));
            com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
            ((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).getClass();
            e17.g(new k01.z0(linkedList));
        }
        this.f197059f.unregisterDataSetObserver(this.f197061h);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f197060g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(GetServiceNotifyOptions), errType : %s, errCode : %s, errMsg : %s.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            db5.t7.makeText(this, com.tencent.mm.R.string.hcs, 0).show();
            return;
        }
        r45.un3 un3Var = (r45.un3) ((k01.a1) ((k01.o0) m1Var)).f303001d.f70711b.f70700a;
        if (this.f197062i == 1) {
            this.f197057d.setCheck(un3Var.f387492f);
        } else {
            this.f197057d.setCheck(un3Var.f387490d);
        }
        runOnUiThread(new com.tencent.mm.ui.rh(this, un3Var));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.addAll(super.importUIComponents());
        hashSet.add(com.tencent.mm.ui.lh.class);
    }
}
