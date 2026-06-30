package com.tencent.mm.plugin.label.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/ContactLabelCreateUI;", "Lcom/tencent/mm/plugin/label/ui/ContactLabelBaseUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ContactLabelCreateUI extends com.tencent.mm.plugin.label.ui.ContactLabelBaseUI implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f143212o = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f143213e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f143214f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f143215g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143216h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143217i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f143218m;

    /* renamed from: n, reason: collision with root package name */
    public final int f143219n = 36;

    public final void W6() {
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f143213e;
        if (mMClearEditText != null) {
            android.text.Editable text = mMClearEditText.getText();
            kotlin.jvm.internal.o.f(text, "getText(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactLabelCreateUI", "updateCanSaveStatus " + r26.n0.u0(text).toString());
            if (!r26.n0.N(r0)) {
                android.widget.Button button = this.f143215g;
                if (button != null) {
                    button.setEnabled(true);
                    return;
                }
                return;
            }
            android.widget.Button button2 = this.f143215g;
            if (button2 != null) {
                button2.setEnabled(false);
            }
        }
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e3o;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onClickDialogSpaceOnHalfScreenMode");
        return true;
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f143216h = getIntent().getStringExtra("Contact_ReportSessionId");
        this.f143217i = getIntent().getStringExtra("label_username");
        this.f143213e = (com.tencent.mm.ui.base.MMClearEditText) findViewById(com.tencent.mm.R.id.f483902sz1);
        this.f143214f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dhl);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f143213e;
        if (mMClearEditText != null) {
            mMClearEditText.setFilters(new f93.x0[]{new f93.x0(this)});
        }
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = this.f143213e;
        if (mMClearEditText2 != null) {
            mMClearEditText2.addTextChangedListener(new f93.y0(this));
        }
        java.lang.String stringExtra = getIntent().getStringExtra("create_label_from_search");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactLabelCreateUI", "createLabelFromSearch: " + stringExtra);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText3 = this.f143213e;
        if (mMClearEditText3 != null) {
            mMClearEditText3.setText(stringExtra);
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483901sz0);
        this.f143215g = button;
        if (button != null) {
            button.setEnabled(false);
        }
        android.widget.Button button2 = this.f143215g;
        if (button2 != null) {
            button2.setOnClickListener(new f93.z0(this));
        }
        W6();
        setMMTitle(com.tencent.mm.R.string.g9h);
        setBackBtn(new f93.a1(this), 0);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c01.d9.e().q(kd1.c.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(kd1.c.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactLabelCreateUI", "onSceneEnd: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 635) {
            if (i17 != 0 || i18 != 0) {
                hideLoading();
                setResult(0);
                db5.e1.t(this, getString(com.tencent.mm.R.string.f489827cv), "", new f93.w0(this));
                return;
            }
            hideLoading();
            if (m1Var instanceof e93.a) {
                java.util.LinkedList linkedList = ((e93.a) m1Var).f250351g;
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactLabelCreateUI", "createdLabelPairList: " + linkedList.size());
                if (!linkedList.isEmpty()) {
                    int i19 = ((r45.f54) linkedList.get(0)).f374022e;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("create_label_by_half_screen_create", i19);
                    setResult(-1, intent);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactLabelCreateUI", "save new label success id=" + i19 + ", label=" + ((r45.f54) linkedList.get(0)).f374021d);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ContactLabelCreateUI", "createdLabelPairList is empty");
                }
                ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436646f, vg3.c.f436668w, i18, kz5.b0.c(this.f143217i)));
            } else {
                setResult(0);
            }
            finish();
        }
    }
}
