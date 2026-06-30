package com.tencent.mm.plugin.gwallet;

/* loaded from: classes15.dex */
public class GWalletUI extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f142245f = 0;

    /* renamed from: d, reason: collision with root package name */
    public b73.i f142246d = null;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.BroadcastReceiver f142247e = new a73.g(this);

    public void K6(boolean z17) {
        b73.i iVar = this.f142246d;
        a73.h hVar = new a73.h(this, z17);
        iVar.getClass();
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3();
        iVar.c("queryInventory");
        s75.d.b(new b73.f(iVar, "inapp", n3Var, hVar), "IabHelper_queryInventoryAsync");
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int longValue;
        b73.i iVar = this.f142246d;
        if (i17 != iVar.f18220e) {
            return;
        }
        iVar.c("handleActivityResult");
        if (intent == null) {
            iVar.g("Null data in IAB activity result.");
            b73.j jVar = new b73.j(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR, "Null data in IAB result");
            b73.h hVar = iVar.f18221f;
            if (hVar != null) {
                hVar.a(jVar, null);
                return;
            }
            return;
        }
        java.lang.Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            iVar.g("Intent with no response code, assuming OK (known issue)");
            longValue = 0;
        } else if (obj instanceof java.lang.Integer) {
            longValue = ((java.lang.Integer) obj).intValue();
        } else {
            if (!(obj instanceof java.lang.Long)) {
                iVar.g("Unexpected type for intent response code.");
                iVar.g(obj.getClass().getName());
                throw new java.lang.RuntimeException("Unexpected type for intent response code: ".concat(obj.getClass().getName()));
            }
            longValue = (int) ((java.lang.Long) obj).longValue();
        }
        intent.getStringExtra("INAPP_PURCHASE_DATA");
        intent.getStringExtra("INAPP_DATA_SIGNATURE");
        java.util.Objects.toString(intent.getExtras());
        b73.j jVar2 = new b73.j(longValue, "Null data in IAB result");
        b73.h hVar2 = iVar.f18221f;
        if (hVar2 != null) {
            hVar2.a(jVar2, intent);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        b73.i iVar = new b73.i(this);
        this.f142246d = iVar;
        iVar.h(new a73.d(this));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        b73.i iVar = this.f142246d;
        if (iVar != null) {
            iVar.d();
        }
        this.f142246d = null;
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if ("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST".equals(intent.getAction())) {
            K6(intent.getBooleanExtra("is_direct", true));
        }
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f142247e;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        unregisterReceiver(this.f142247e);
    }
}
