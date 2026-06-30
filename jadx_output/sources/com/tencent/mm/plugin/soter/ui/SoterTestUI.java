package com.tencent.mm.plugin.soter.ui;

/* loaded from: classes15.dex */
public class SoterTestUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f171758d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f171759e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f171760f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f171761g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f171762h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f171763i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f171764m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f171765n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f171766o = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cva;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f171758d = (android.widget.Button) findViewById(com.tencent.mm.R.id.f487074ne5);
        this.f171759e = (android.widget.Button) findViewById(com.tencent.mm.R.id.f487069ne0);
        this.f171760f = (android.widget.Button) findViewById(com.tencent.mm.R.id.f487073ne4);
        this.f171761g = (android.widget.Button) findViewById(com.tencent.mm.R.id.f487071ne2);
        this.f171762h = (android.widget.Button) findViewById(com.tencent.mm.R.id.ndz);
        this.f171763i = (android.widget.Button) findViewById(com.tencent.mm.R.id.f487072ne3);
        this.f171764m = (android.widget.Button) findViewById(com.tencent.mm.R.id.f487070ne1);
        this.f171765n = (android.widget.Button) findViewById(com.tencent.mm.R.id.ndy);
        this.f171766o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m1x);
        this.f171758d.setOnClickListener(new te4.f(this));
        this.f171759e.setOnClickListener(new te4.g(this));
        this.f171760f.setOnClickListener(new te4.h(this));
        this.f171761g.setOnClickListener(new te4.i(this));
        this.f171762h.setOnClickListener(new te4.j(this));
        this.f171763i.setOnClickListener(new te4.k(this));
        this.f171764m.setOnClickListener(new te4.l(this));
        this.f171765n.setOnClickListener(new te4.n(this));
    }
}
