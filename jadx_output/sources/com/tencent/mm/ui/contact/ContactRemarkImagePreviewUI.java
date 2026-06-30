package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public class ContactRemarkImagePreviewUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f206359o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f206360d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f206361e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f206362f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f206363g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f206364h;

    /* renamed from: i, reason: collision with root package name */
    public int f206365i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f206366m = false;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.contact.q1 f206367n;

    public final void U6() {
        if (this.f206366m) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("response_delete", true);
            intent.putExtra("remark_image_path", this.f206363g);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a2m;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f206361e = findViewById(com.tencent.mm.R.id.cgc);
        this.f206360d = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById(com.tencent.mm.R.id.ghs);
        setMMTitle(com.tencent.mm.R.string.f492555gy5);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0));
        this.f206360d.setVerticalFadingEdgeEnabled(false);
        this.f206360d.setHorizontalFadingEdgeEnabled(false);
        boolean z17 = com.tencent.mm.sdk.platformtools.l1.f192817a;
        com.tencent.mm.ui.contact.q1 q1Var = new com.tencent.mm.ui.contact.q1(this);
        this.f206367n = q1Var;
        q1Var.f207126d = this.f206363g;
        this.f206360d.setAdapter((android.widget.SpinnerAdapter) q1Var);
        this.f206360d.setSelection(this.f206365i);
        this.f206360d.setOnItemClickListener(new com.tencent.mm.ui.contact.p1(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new com.tencent.mm.ui.contact.n1(this));
        setBackBtn(new com.tencent.mm.ui.contact.o1(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f206362f = getIntent().getStringExtra("Contact_User");
        this.f206363g = getIntent().getStringArrayListExtra("remark_image_path");
        getIntent().getBooleanExtra("view_temp_remark_image", false);
        this.f206364h = getIntent().getBooleanExtra("view_only", false);
        this.f206365i = getIntent().getIntExtra("selected_item", 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f206362f)) {
            finish();
        } else {
            initView();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
