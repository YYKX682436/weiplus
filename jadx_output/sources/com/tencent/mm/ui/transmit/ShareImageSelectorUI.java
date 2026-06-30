package com.tencent.mm.ui.transmit;

/* loaded from: classes12.dex */
public class ShareImageSelectorUI extends com.tencent.mm.ui.MMActivity implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: m, reason: collision with root package name */
    public static int f211038m = 1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f211039d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f211040e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f211041f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f211042g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f211043h = new dk5.z6(this);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f211044i = new dk5.a7(this);

    public final void T6() {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 6, this.f211039d);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6323i = this;
        c4Var.f6327m = 52;
        doFavoriteEvent.e();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11048, 3, 0, 0);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f211044i;
        if (n3Var != null) {
            n3Var.sendEmptyMessageDelayed(0, 800L);
        }
    }

    public final void U6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.contact.SelectContactUI.class);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206789j);
        intent.putExtra("titile", getString(com.tencent.mm.R.string.f489931fu));
        intent.putExtra("list_type", 11);
        intent.putExtra("shareImage", true);
        intent.putExtra("shareImagePath", this.f211039d);
        startActivityForResult(intent, 1001);
    }

    public final void V6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", this.f211039d);
        intent.putExtra("need_result", true);
        j45.l.n(getContext(), "sns", ".ui.SnsUploadUI", intent, 1002);
    }

    public final void W6() {
        db5.e1.H(getContext(), getString(com.tencent.mm.R.string.bm8), getString(com.tencent.mm.R.string.bm_), true, new dk5.c7(this), new dk5.d7(this));
    }

    public final void X6() {
        db5.e1.g(getContext(), getString(com.tencent.mm.R.string.gus), new java.lang.String[]{getString(com.tencent.mm.R.string.bmb), getString(com.tencent.mm.R.string.bmc), getString(com.tencent.mm.R.string.bma)}, null, "", true, new dk5.e7(this), new dk5.f7(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489460cn3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1001) {
            if (i17 != 1002) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ShareImageSelectorUI", "unknow result");
                return;
            } else if (i18 != -1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ShareImageSelectorUI", "user cancle");
                return;
            } else {
                dp.a.makeText(getContext(), com.tencent.mm.R.string.f490940bb2, 0).show();
                finish();
                return;
            }
        }
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShareImageSelectorUI", "user cancle");
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("Select_Contact") : null;
        if (stringArrayListExtra != null && stringArrayListExtra.size() == 1) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
            intent2.putExtra("Chat_User", stringArrayListExtra.get(0));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        W6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int intValue;
        super.onCreate(bundle);
        java.lang.Object l17 = c01.d9.b().p().l(229635, null);
        if ((l17 instanceof java.lang.Integer) && ((intValue = ((java.lang.Integer) l17).intValue()) == 0 || intValue == 1)) {
            f211038m = intValue;
        }
        setMMTitle(com.tencent.mm.R.string.gus);
        setBackBtn(new dk5.b7(this));
        getIntent().getIntExtra("Select_Conv_Type", 2);
        this.f211039d = getIntent().getStringExtra("intent_extra_image_path");
        this.f211040e = findViewById(com.tencent.mm.R.id.j8c);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h88);
        this.f211041f = imageView;
        imageView.setOnClickListener(this.f211043h);
        this.f211042g = (android.widget.ListView) findViewById(com.tencent.mm.R.id.i38);
        this.f211042g.setAdapter((android.widget.ListAdapter) new dk5.h7(this));
        this.f211042g.setOnItemClickListener(this);
        if (f211038m == 1) {
            setTitleVisibility(8);
            this.f211042g.setVisibility(8);
            this.f211041f.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
            this.f211041f.setPadding(0, 0, 0, 0);
            this.f211041f.setOnClickListener(null);
            this.f211040e.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.j_));
            X6();
        }
        java.lang.System.currentTimeMillis();
        android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(this.f211039d), com.tencent.mm.sdk.platformtools.l.a(this.f211039d));
        if (w07 != null && !w07.isRecycled()) {
            this.f211041f.setImageBitmap(w07);
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/ShareImageSelectorUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 == 0) {
            U6();
        } else if (i17 == 1) {
            V6();
        } else if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImageSelectorUI", "unknow postion.");
        } else {
            T6();
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (f211038m == 1) {
            X6();
        }
    }
}
