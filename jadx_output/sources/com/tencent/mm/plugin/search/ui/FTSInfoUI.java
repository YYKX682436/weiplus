package com.tencent.mm.plugin.search.ui;

/* loaded from: classes12.dex */
public class FTSInfoUI extends com.tencent.mm.ui.MMActivity implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f160039d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f160040e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f160041f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f160042g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160043h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160044i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f160045m = new m04.d(this);

    public static long T6() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f160044i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[DBSize]=");
        o13.o oVar = o13.p.f342249b;
        sb6.append(com.tencent.mm.sdk.platformtools.t8.h0(oVar.f342243a * 1048576));
        stringBuffer.append(sb6.toString());
        stringBuffer.append("\n");
        stringBuffer.append("[WXContact]=" + oVar.f342244b);
        stringBuffer.append("\n");
        stringBuffer.append("[WXChatroom]=" + oVar.f342245c);
        stringBuffer.append("\n");
        stringBuffer.append("[Favorite]=" + oVar.f342247e);
        stringBuffer.append("\n");
        stringBuffer.append("[Message]=" + oVar.f342246d);
        stringBuffer.append("\n");
        stringBuffer.append("[WebSearchH5Version]=" + com.tencent.mm.plugin.websearch.l2.a(0));
        stringBuffer.append("\n");
        stringBuffer.append("[TopStoryH5Version]=" + com.tencent.mm.plugin.websearch.l2.a(1));
        stringBuffer.append("\n");
        stringBuffer.append("[WxAppH5Version]=" + com.tencent.mm.plugin.websearch.l2.a(3));
        stringBuffer.append("\n");
        stringBuffer.append("[BoxH5Version]=" + com.tencent.mm.plugin.websearch.l2.a(2));
        stringBuffer.append("\n");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[TopStoryWebViewCore]=");
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).getClass();
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.WebView.f220189m;
        sb7.append(com.tencent.xweb.f1.WV_KIND_PINUS);
        stringBuffer.append(sb7.toString());
        stringBuffer.append("\n");
        stringBuffer.append("[PardusH5Version]=" + com.tencent.mm.plugin.websearch.l2.a(5));
        stringBuffer.append("\n");
        this.f160043h.setText(stringBuffer.toString());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bcb;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.fge);
        setBackBtn(new m04.a(this));
        this.f160039d = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485340hc5);
        this.f160043h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hcv);
        this.f160039d.setOnClickListener(new m04.c(this));
        this.f160040e = (android.widget.Button) findViewById(com.tencent.mm.R.id.l5c);
        this.f160041f = (android.widget.Button) findViewById(com.tencent.mm.R.id.l5e);
        this.f160042g = (android.widget.Button) findViewById(com.tencent.mm.R.id.l5d);
        this.f160040e.setTag(1);
        this.f160041f.setTag(2);
        this.f160042g.setTag(3);
        android.widget.Button button = this.f160040e;
        android.view.View.OnClickListener onClickListener = this.f160045m;
        button.setOnClickListener(onClickListener);
        this.f160041f.setOnClickListener(onClickListener);
        this.f160042g.setOnClickListener(onClickListener);
    }
}
