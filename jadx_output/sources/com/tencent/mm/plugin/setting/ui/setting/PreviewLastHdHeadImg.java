package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class PreviewLastHdHeadImg extends com.tencent.mm.ui.MMActivity implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f160164i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f160165d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f160166e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f160167f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160168g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f160169h;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bid;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.irs);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.BW_0));
        this.f160168g = c01.z1.r();
        this.f160169h = getIntent().getStringExtra("last_avatar_path");
        this.f160165d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.gxr);
        this.f160166e = com.tencent.mm.sdk.platformtools.x.i0(this.f160169h);
        this.f160167f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ou6);
        this.f160165d.setImageBitmap(this.f160166e);
        this.f160167f.setOnClickListener(this);
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.setting.ui.setting.u1(this));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.v1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0063  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/setting/ui/setting/PreviewLastHdHeadImg"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r12)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r11
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "CropImage_OutputPath"
            java.lang.String r12 = r12.getStringExtra(r0)
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "com/tencent/mm/plugin/setting/ui/setting/PreviewLastHdHeadImg"
            r5 = 0
            if (r12 == 0) goto L7b
            android.graphics.Bitmap r6 = r11.f160166e
            java.lang.String r7 = ""
            boolean r8 = r12.equals(r7)
            if (r8 != 0) goto L60
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L43
            r9 = 100
            r10 = 1
            com.tencent.mm.sdk.platformtools.x.D0(r6, r9, r8, r12, r10)     // Catch: java.lang.Exception -> L43
            goto L61
        L43:
            r6 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = "MicroMsg.PreviewLastHdHeadImg"
            com.tencent.mars.xlog.Log.printErrStackTrace(r9, r6, r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "saveBitmapToImage failed:"
            r7.<init>(r8)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.mars.xlog.Log.e(r9, r6)
        L60:
            r10 = r5
        L61:
            if (r10 == 0) goto L7b
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r6.putExtra(r0, r12)
            java.lang.String r12 = "CropImage_NeedCompress"
            r6.putExtra(r12, r5)
            r12 = -1
            r11.setResult(r12, r6)
            r11.finish()
            yj0.a.h(r11, r4, r3, r2, r1)
            return
        L7b:
            r11.setResult(r5)
            r11.finish()
            yj0.a.h(r11, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg.onClick(android.view.View):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        initView();
    }
}
