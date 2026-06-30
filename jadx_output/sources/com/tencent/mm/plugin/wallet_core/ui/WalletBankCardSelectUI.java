package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class WalletBankCardSelectUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    private static final java.lang.String TAG = "WalletBankCardSelectUI";
    protected java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> bankcardList;
    private java.util.List<fb5.n> bankcardQueryList;
    protected java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> bankcardTypeList;
    protected com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView mBankCardSelectSortView;
    private com.tencent.mm.ui.tools.c9 mSearchViewHelper;
    protected java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> majorBankCardList;
    private java.util.List<fb5.n> origBankcardList;
    protected com.tencent.mm.plugin.wallet_core.ui.v0 mBankCardComparator = new com.tencent.mm.plugin.wallet_core.ui.v0(null);
    private boolean isSearchMode = false;

    public static char getAlpha(java.lang.String str, char c17, boolean z17) {
        return getFullPY(str, "" + c17, "_", z17).charAt(0);
    }

    public static java.lang.String getFullPY(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String a17 = com.tencent.mm.platformtools.SpellMap.a(str.charAt(i17));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                if (z17) {
                    sb6.append(a17.toUpperCase());
                } else {
                    sb6.append(a17);
                }
                if (i17 != length - 1) {
                    sb6.append(str3);
                }
            }
        }
        java.lang.String sb7 = sb6.toString();
        return !com.tencent.mm.sdk.platformtools.t8.K0(sb7) ? sb7 : str2;
    }

    public final boolean U6(com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery) {
        java.util.Iterator<fb5.n> it = this.origBankcardList.iterator();
        while (it.hasNext()) {
            gt4.n nVar = (gt4.n) it.next().f260898b;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(elementQuery.f179648e) && elementQuery.f179648e.equals(nVar.f275473c)) {
                return true;
            }
        }
        return false;
    }

    public final void V6(java.util.Map map) {
        at4.k kVar;
        at4.k kVar2;
        this.origBankcardList.clear();
        java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> list = this.majorBankCardList;
        if (list != null) {
            for (com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery : list) {
                if (!U6(elementQuery)) {
                    fb5.n nVar = new fb5.n();
                    gt4.n nVar2 = new gt4.n();
                    nVar2.f275473c = elementQuery.f179648e;
                    java.lang.String str = elementQuery.f179659s;
                    nVar2.f275475e = str;
                    if (map != null && (kVar2 = (at4.k) map.get(str)) != null) {
                        nVar2.f275471a = kVar2.f13878a;
                        nVar2.f275472b = kVar2.f13881d;
                        nVar2.f275474d = kVar2.f13885h;
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(nVar2.f275474d)) {
                        nVar2.f275474d = getFullPY(nVar2.f275473c, "#", "_", true);
                    }
                    nVar.f260897a = "☆";
                    nVar.f260898b = nVar2;
                    this.origBankcardList.add(nVar);
                }
            }
        }
        for (com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery2 : this.bankcardList) {
            if (!U6(elementQuery2)) {
                fb5.n nVar3 = new fb5.n();
                gt4.n nVar4 = new gt4.n();
                nVar4.f275473c = elementQuery2.f179648e;
                java.lang.String str2 = elementQuery2.f179659s;
                nVar4.f275475e = str2;
                if (map != null && (kVar = (at4.k) map.get(str2)) != null) {
                    nVar4.f275471a = kVar.f13878a;
                    nVar4.f275472b = kVar.f13881d;
                    nVar4.f275474d = kVar.f13885h;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(nVar4.f275474d)) {
                    nVar4.f275474d = getFullPY(nVar4.f275473c, "#", "_", true);
                }
                nVar3.f260897a = "" + nVar4.f275474d.toUpperCase().charAt(0);
                nVar3.f260898b = nVar4;
                this.origBankcardList.add(nVar3);
            }
        }
        java.util.Collections.sort(this.origBankcardList, this.mBankCardComparator);
        runOnUiThread(new com.tencent.mm.plugin.wallet_core.ui.u0(this));
    }

    public void fetchData() {
        this.origBankcardList = new java.util.ArrayList();
        java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> list = this.bankcardList;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w(TAG, "bankcardlist is null, start to doScene");
            this.mNetSceneMgr.e(new ss4.z("", "", null), true, 1, 0);
            return;
        }
        V6(null);
        com.tencent.mm.plugin.wallet_core.utils.m mVar = new com.tencent.mm.plugin.wallet_core.utils.m();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> list2 = this.bankcardList;
        if (list2 != null) {
            for (com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery : list2) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                bankcard.field_bankName = elementQuery.f179648e;
                bankcard.field_bankcardType = elementQuery.f179659s;
                linkedList.add(bankcard);
            }
        }
        java.util.List<com.tencent.mm.plugin.wallet_core.model.ElementQuery> list3 = this.majorBankCardList;
        if (list3 != null) {
            for (com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery2 : list3) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                bankcard2.field_bankName = elementQuery2.f179648e;
                bankcard2.field_bankcardType = elementQuery2.f179659s;
                linkedList.add(bankcard2);
            }
        }
        getContext();
        com.tencent.mm.plugin.wallet_core.ui.t0 t0Var = new com.tencent.mm.plugin.wallet_core.ui.t0(this);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BankcardLogoHelper", "req is null");
            com.tencent.mars.xlog.Log.i(TAG, "get logo callback: %s", java.lang.Integer.valueOf(hashMap.size()));
            V6(hashMap);
        } else {
            ((km5.q) km5.u.e(linkedList)).q(new com.tencent.mm.plugin.wallet_core.utils.h(mVar)).q(new com.tencent.mm.plugin.wallet_core.utils.f(mVar, linkedList, hashMap, t0Var));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5m;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView bankCardSelectSortView = (com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView) findViewById(com.tencent.mm.R.id.aes);
        this.mBankCardSelectSortView = bankCardSelectSortView;
        bankCardSelectSortView.setOnItemClickListener(new com.tencent.mm.plugin.wallet_core.ui.r0(this));
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        this.mSearchViewHelper = c9Var;
        c9Var.f210324i = new com.tencent.mm.plugin.wallet_core.ui.s0(this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.aet);
        this.bankcardList = ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.f13811b;
        initView();
        fetchData();
        addSearchMenu(true, this.mSearchViewHelper);
    }

    public void onItemSelect(java.lang.Object obj, int i17) {
        gt4.n nVar = (gt4.n) obj;
        if (nVar != null) {
            hideVKB();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("bank_name", nVar.f275473c);
            intent.putExtra("bank_type", nVar.f275475e);
            intent.putExtra("bank_icon", nVar.f275471a);
            com.tencent.mars.xlog.Log.i(TAG, "item bank: %s", nVar.f275473c);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof ss4.z)) {
            return false;
        }
        this.bankcardList = ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.f13811b;
        fetchData();
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.a.class);
    }
}
