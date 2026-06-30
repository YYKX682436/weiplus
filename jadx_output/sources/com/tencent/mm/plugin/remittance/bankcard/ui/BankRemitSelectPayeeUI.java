package com.tencent.mm.plugin.remittance.bankcard.ui;

/* loaded from: classes9.dex */
public class BankRemitSelectPayeeUI extends com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI implements db5.t4 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f156538q = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f156539e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s6 f156540f;

    /* renamed from: g, reason: collision with root package name */
    public qw3.t1 f156541g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f156542h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f156543i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f156544m;

    /* renamed from: n, reason: collision with root package name */
    public int f156545n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f156546o = -1;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Intent f156547p;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488190k0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f156539e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.azc);
        this.f156540f = new com.tencent.mm.ui.tools.s6(this);
        qw3.t1 t1Var = new qw3.t1(this, null);
        this.f156541g = t1Var;
        this.f156539e.setAdapter((android.widget.ListAdapter) t1Var);
        this.f156539e.setOnItemClickListener(new qw3.m1(this));
        this.f156539e.setOnItemLongClickListener(new qw3.n1(this));
    }

    @Override // com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_self_transfer_record_list");
        java.util.ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("key_freq_transfer_record_list");
        this.f156542h = new java.util.ArrayList();
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            this.f156545n = 0;
            ((java.util.ArrayList) this.f156542h).addAll(parcelableArrayListExtra);
        }
        if (parcelableArrayListExtra2 != null && !parcelableArrayListExtra2.isEmpty()) {
            this.f156546o = ((java.util.ArrayList) this.f156542h).size() + this.f156545n + 1;
            ((java.util.ArrayList) this.f156542h).addAll(parcelableArrayListExtra2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "selfHeaderPos: %s, otherHeaderPos: %s", java.lang.Integer.valueOf(this.f156545n), java.lang.Integer.valueOf(this.f156546o));
        java.util.Iterator it = ((java.util.ArrayList) this.f156542h).iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) it.next()).f156470d;
        }
        this.f156547p = new android.content.Intent();
        initView();
        setMMTitle(com.tencent.mm.R.string.aez);
        addSceneEndListener(1590);
        addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.finder.g0.CTRL_INDEX);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, com.tencent.mm.R.string.aex);
        contextMenu.add(0, 0, 0, com.tencent.mm.R.string.aeu);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1590);
        removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.finder.g0.CTRL_INDEX);
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) this.f156539e.getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (transferRecordParcel == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "select record is null");
            return;
        }
        if (itemId == 1) {
            gt4.l.b(this, getString(com.tencent.mm.R.string.b9y), transferRecordParcel.f156476m, "", false, 32, new qw3.o1(this, transferRecordParcel), new qw3.q1(this));
        } else {
            if (itemId != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "unknown itemId: %s", java.lang.Integer.valueOf(itemId));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "do delete record");
            doSceneProgress(new ow3.e(transferRecordParcel.f156470d), true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14673, 7);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ow3.h) {
            ow3.h hVar = (ow3.h) m1Var;
            hVar.O(new qw3.r1(this, hVar));
            if (hVar.f214032m) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", java.lang.Integer.valueOf(hVar.f349411s.f380728d), hVar.f349411s.f380729e);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(hVar.f349411s.f380729e)) {
                    dp.a.makeText(this, hVar.f349411s.f380729e, 1).show();
                }
            }
            if (!hVar.f214031i) {
                return false;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitSelectPayeeUI", "net error: %s", hVar);
            return false;
        }
        if (!(m1Var instanceof ow3.e)) {
            return false;
        }
        ow3.e eVar = (ow3.e) m1Var;
        eVar.O(new qw3.l1(this, eVar));
        if (eVar.f214032m) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", java.lang.Integer.valueOf(eVar.f349400s.f380376d), eVar.f349400s.f380377e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(eVar.f349400s.f380377e)) {
                dp.a.makeText(this, eVar.f349400s.f380377e, 1).show();
            }
        }
        if (!eVar.f214031i) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitSelectPayeeUI", "net error: %s", eVar);
        return false;
    }
}
