package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class c implements com.tencent.mm.plugin.wallet_index.ui.d {

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f181138l = com.tencent.mm.sdk.platformtools.x2.f193072b;

    /* renamed from: m, reason: collision with root package name */
    public static long f181139m = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_index.ui.f f181140a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_index.ui.f f181141b = null;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_index.ui.e f181142c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_index.ui.f f181143d;

    /* renamed from: e, reason: collision with root package name */
    public final mt4.c f181144e;

    /* renamed from: f, reason: collision with root package name */
    public mt4.d f181145f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181146g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181147h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f181148i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f181149j;

    /* renamed from: k, reason: collision with root package name */
    public final android.content.BroadcastReceiver f181150k;

    public c(android.app.Activity activity, com.tencent.mm.plugin.wallet_index.ui.e eVar, com.tencent.mm.plugin.wallet_index.ui.f fVar) {
        com.tencent.mm.plugin.wallet_index.ui.b bVar = new com.tencent.mm.plugin.wallet_index.ui.b(this);
        this.f181150k = bVar;
        this.f181143d = fVar;
        f181139m = 0L;
        this.f181142c = eVar;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
        intentFilter.addAction("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE");
        if (fp.h.a(33)) {
            activity.registerReceiver(bVar, intentFilter);
        } else {
            activity.registerReceiver(bVar, intentFilter, 2);
        }
        this.f181144e = new mt4.c();
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public int a() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public void b(com.tencent.mm.ui.MMActivity mMActivity) {
        try {
            mMActivity.unregisterReceiver(this.f181150k);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleWallet", e17.toString());
        }
        if (com.tencent.mm.sdk.platformtools.t8.U0(mMActivity)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
        intent.setPackage(f181138l);
        mMActivity.sendBroadcast(intent);
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public boolean c(com.tencent.mm.ui.MMActivity mMActivity, int i17, int i18, android.content.Intent intent) {
        if (i17 == 10001) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleWallet", "purchase flow!result_code: %d", java.lang.Integer.valueOf(i18));
            if (intent == null) {
                g(mMActivity, 1);
                return true;
            }
            int intExtra = intent.getIntExtra("RESPONSE_CODE", 0);
            if (intExtra == 3 || intExtra == 105) {
                com.tencent.mm.wallet_core.model.n1.c(this.f181149j, this.f181148i, this.f181146g, intExtra, "");
                g(mMActivity, intExtra);
                return true;
            }
            if (intExtra == 100000001) {
                g(mMActivity, intExtra);
                return true;
            }
        }
        com.tencent.mm.plugin.wallet_index.ui.f fVar = this.f181141b;
        java.lang.String str = this.f181149j;
        java.lang.String str2 = this.f181148i;
        java.lang.String str3 = this.f181146g;
        int a17 = this.f181144e.a(intent);
        java.lang.String.valueOf(a17);
        nt4.f a18 = nt4.f.a(a17);
        com.tencent.mm.wallet_core.model.n1.c(str, str2, str3, a17, a18.f339824b);
        if (fVar != null) {
            fVar.a(a18, null);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public void d(com.tencent.mm.ui.MMActivity mMActivity, java.util.ArrayList arrayList, com.tencent.mm.plugin.wallet_index.ui.f fVar, boolean z17) {
        this.f181141b = fVar;
        mt4.d dVar = this.f181145f;
        dVar.getClass();
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mt4.e eVar = (mt4.e) ((java.util.HashMap) dVar.f331301a).get((java.lang.String) it.next());
            if (eVar != null) {
                arrayList2.add(eVar.f331306e);
            }
        }
        if (arrayList2.size() > 0) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
            intent.setPackage(f181138l);
            intent.putStringArrayListExtra("tokens", arrayList2);
            intent.putExtra("IS_FAILED_CONSUME", z17);
            mMActivity.sendBroadcast(intent);
            return;
        }
        nt4.f a17 = nt4.f.a(0);
        com.tencent.mm.plugin.wallet_index.ui.f fVar2 = this.f181141b;
        if (fVar2 != null) {
            fVar2.a(a17, null);
        }
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public void e(com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST");
        intent.setPackage(f181138l);
        intent.putExtra("is_direct", z17);
        mMActivity.startActivityForResult(intent, 10001);
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public int f(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.wallet_index.ui.f fVar) {
        this.f181140a = fVar;
        com.tencent.mm.plugin.wallet_index.ui.e eVar = this.f181142c;
        r45.oy3 oy3Var = eVar.f181155d;
        this.f181148i = oy3Var.f382611d;
        this.f181146g = oy3Var.f382612e;
        this.f181147h = oy3Var.f382613f;
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_PAY_REQUEST");
        intent.setPackage(f181138l);
        intent.putExtra("product_id", this.f181148i);
        java.lang.String str = eVar.f181155d.f382614g;
        this.f181149j = str;
        java.lang.String str2 = this.f181146g;
        java.lang.String str3 = this.f181147h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = "";
        }
        intent.putExtra("developer_pay_load", str + "[#]" + str2 + "[#]" + str3);
        if (mMActivity.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleWallet", "Try to downloading GWallet Moudle!");
            nt4.f a17 = nt4.f.a(3);
            com.tencent.mm.plugin.wallet_index.ui.f fVar2 = this.f181140a;
            if (fVar2 != null) {
                fVar2.a(a17, null);
            }
        } else {
            f181139m = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleWallet", "GWallet Found!");
            mMActivity.startActivityForResult(intent, 10001);
        }
        return 10001;
    }

    public final void g(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        nt4.f a17 = nt4.f.a(i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", a17.f339823a);
        intent.putExtra("key_err_msg", a17.f339824b);
        intent.putExtra("key_launch_ts", f181139m);
        mMActivity.setResult(-1, intent);
        mMActivity.finish();
    }
}
