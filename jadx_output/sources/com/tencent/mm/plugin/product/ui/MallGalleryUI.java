package com.tencent.mm.plugin.product.ui;

@db5.a(3)
/* loaded from: classes15.dex */
public class MallGalleryUI extends com.tencent.mm.plugin.product.ui.MallBaseUI {

    /* renamed from: e, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f153193e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.b0 f153194f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f153195g;

    /* renamed from: h, reason: collision with root package name */
    public int f153196h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f153197i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String T6() {
        /*
            r5 = this;
            java.util.List r0 = r5.f153195g
            r1 = 0
            java.lang.String r2 = "MicroMsg.MallGalleryUI"
            if (r0 == 0) goto L1b
            int r0 = r0.size()
            int r3 = r5.f153196h
            int r4 = r3 + 1
            if (r0 >= r4) goto L12
            goto L1b
        L12:
            java.util.List r0 = r5.f153195g
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L21
        L1b:
            java.lang.String r0 = "data not ready.retransmit failed"
            com.tencent.mars.xlog.Log.e(r2, r0)
            r0 = r1
        L21:
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r3 == 0) goto L2d
            java.lang.String r0 = "invoke error. No current url"
            com.tencent.mars.xlog.Log.w(r2, r0)
            return r1
        L2d:
            java.lang.String r0 = com.tencent.mm.plugin.product.ui.o.m(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.product.ui.MallGalleryUI.T6():java.lang.String");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ca8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) findViewById(com.tencent.mm.R.id.j9k);
        this.f153193e = viewPager;
        viewPager.setOnPageChangeListener(new com.tencent.mm.plugin.product.ui.j(this));
        com.tencent.mm.plugin.product.ui.b0 b0Var = new com.tencent.mm.plugin.product.ui.b0(this);
        this.f153194f = b0Var;
        b0Var.f153273g = new com.tencent.mm.plugin.product.ui.k(this);
        this.f153193e.setAdapter(b0Var);
        setBackBtn(new com.tencent.mm.plugin.product.ui.l(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.product.ui.n(this));
    }

    @Override // com.tencent.mm.plugin.product.ui.MallBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f153195g = getIntent().getStringArrayListExtra("keys_img_urls");
        hideTitleView();
        this.f153197i = false;
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.product.ui.b0 b0Var = this.f153194f;
        java.util.List list = this.f153195g;
        b0Var.getClass();
        if (list != null) {
            if (list.size() > 0) {
                b0Var.f153271e = list;
            }
            java.util.ArrayList arrayList = b0Var.f153272f;
            if (arrayList == null) {
                b0Var.f153272f = new java.util.ArrayList();
            } else {
                arrayList.clear();
            }
            java.util.Iterator it = b0Var.f153271e.iterator();
            while (it.hasNext()) {
                b0Var.f153272f.add(new com.tencent.mm.plugin.product.ui.a0(b0Var, (java.lang.String) it.next()));
            }
        }
        this.f153194f.notifyDataSetChanged();
        java.util.List list2 = this.f153195g;
        if (list2 != null) {
            list2.size();
        }
    }
}
