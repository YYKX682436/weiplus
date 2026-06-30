package com.tencent.mm.ui.contact;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/contact/ContactSayHiImagePreviewUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "com/tencent/mm/ui/contact/z2", "com/tencent/mm/ui/contact/a3", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ContactSayHiImagePreviewUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f206410s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f206411d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f206412e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f206413f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f206414g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f206415h;

    /* renamed from: i, reason: collision with root package name */
    public int f206416i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f206417m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.contact.z2 f206418n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f206419o = jz5.h.b(new com.tencent.mm.ui.contact.e3(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f206420p = jz5.h.b(new com.tencent.mm.ui.contact.h3(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f206421q = jz5.h.b(new com.tencent.mm.ui.contact.g3(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f206422r = jz5.h.b(new com.tencent.mm.ui.contact.c3(this));

    public final void U6() {
        if (this.f206417m) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("response_delete", true);
            intent.putExtra("remark_image_path", this.f206414g);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e3y;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f206412e = findViewById(com.tencent.mm.R.id.cgc);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ghs);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.tools.MMGestureGallery");
        this.f206411d = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById;
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0));
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f206411d;
        kotlin.jvm.internal.o.d(mMGestureGallery);
        mMGestureGallery.setVerticalFadingEdgeEnabled(false);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery2 = this.f206411d;
        kotlin.jvm.internal.o.d(mMGestureGallery2);
        mMGestureGallery2.setHorizontalFadingEdgeEnabled(false);
        boolean z17 = com.tencent.mm.sdk.platformtools.l1.f192817a;
        com.tencent.mm.ui.contact.z2 z2Var = new com.tencent.mm.ui.contact.z2(this);
        this.f206418n = z2Var;
        z2Var.f207268d = this.f206414g;
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery3 = this.f206411d;
        kotlin.jvm.internal.o.d(mMGestureGallery3);
        mMGestureGallery3.setAdapter((android.widget.SpinnerAdapter) this.f206418n);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery4 = this.f206411d;
        kotlin.jvm.internal.o.d(mMGestureGallery4);
        mMGestureGallery4.setSelection(this.f206416i);
        android.view.View view = (android.view.View) ((jz5.n) this.f206422r).getValue();
        int i17 = this.f206415h ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/ContactSayHiImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jz5.g gVar = this.f206420p;
        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.ui.contact.i3(this));
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).getValue()).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = com.tencent.mm.ui.bl.h(this);
        ((android.view.View) ((jz5.n) gVar).getValue()).setLayoutParams(layoutParams2);
        setBackBtn(new com.tencent.mm.ui.contact.j3(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f206413f = getIntent().getStringExtra("Contact_User");
        this.f206414g = getIntent().getStringArrayListExtra("remark_image_path");
        getIntent().getBooleanExtra("view_temp_remark_image", false);
        this.f206415h = getIntent().getBooleanExtra("view_only", false);
        this.f206416i = getIntent().getIntExtra("selected_item", 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f206413f)) {
            finish();
            return;
        }
        initView();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        getController().E0(0);
        getController().I();
        getWindow().getDecorView().setSystemUiVisibility(2);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 != 4 || event.getRepeatCount() != 0) {
            return super.onKeyDown(i17, event);
        }
        U6();
        return true;
    }
}
