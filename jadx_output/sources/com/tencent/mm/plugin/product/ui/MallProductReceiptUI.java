package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class MallProductReceiptUI extends com.tencent.mm.plugin.product.ui.MallBaseUI {

    /* renamed from: f, reason: collision with root package name */
    public wq3.j f153204f;

    /* renamed from: e, reason: collision with root package name */
    public wq3.k f153203e = null;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.AutoCompleteTextView f153205g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.e0 f153206h = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.caf;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.grt);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.product.ui.f0(this));
        this.f153205g = (android.widget.AutoCompleteTextView) findViewById(com.tencent.mm.R.id.j_t);
        r45.ek5 h17 = this.f153204f.h();
        if (h17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.f373583e)) {
            this.f153205g.setText(h17.f373583e);
        }
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f153205g;
        autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
        com.tencent.mm.plugin.product.ui.e0 e0Var = new com.tencent.mm.plugin.product.ui.e0(this);
        this.f153206h = e0Var;
        this.f153205g.setAdapter(e0Var);
        this.f153205g.setOnItemClickListener(new com.tencent.mm.plugin.product.ui.g0(this));
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cac, null).setOnClickListener(new com.tencent.mm.plugin.product.ui.h0(this));
    }

    @Override // com.tencent.mm.plugin.product.ui.MallBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f153203e = vq3.e.wi().Bi();
        this.f153204f = vq3.e.wi().Ai();
        initView();
    }
}
