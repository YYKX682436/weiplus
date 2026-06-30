package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderEditTextUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderEditTextUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f128562w = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView f128563t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter f128564u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f128565v = "Finder.FinderEditTextUI";

    public final void c7() {
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView = this.f128563t;
        if (finderEditTextView == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(finderEditTextView.getText().toString())) {
            finish();
        } else {
            db5.e1.l(this, com.tencent.mm.R.string.f9e, 0, com.tencent.mm.R.string.f9j, com.tencent.mm.R.string.f9i, true, new com.tencent.mm.plugin.finder.ui.e5(this), new com.tencent.mm.plugin.finder.ui.f5(this), com.tencent.mm.R.color.f478621cg);
        }
    }

    public final void d7(int i17) {
        int i18 = com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter.f136940p;
        if (i17 == 101) {
            com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView = this.f128563t;
            if (finderEditTextView == null) {
                kotlin.jvm.internal.o.o("editView");
                throw null;
            }
            finderEditTextView.setTextGravity(8388611);
        } else if (i17 == 102) {
            com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView2 = this.f128563t;
            if (finderEditTextView2 == null) {
                kotlin.jvm.internal.o.o("editView");
                throw null;
            }
            finderEditTextView2.setTextGravity(1);
        }
        getIntent().putExtra("saveAlign", i17);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ag_;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490502ww), new com.tencent.mm.plugin.finder.ui.g5(this), null, com.tencent.mm.ui.fb.GREEN);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d76);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128563t = (com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484151d61);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f128564u = (com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter) findViewById2;
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView = this.f128563t;
        if (finderEditTextView == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        finderEditTextView.setTextMaxLines(10);
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView2 = this.f128563t;
        if (finderEditTextView2 == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        finderEditTextView2.setTextCursorDrawable(com.tencent.mm.R.drawable.afr);
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView3 = this.f128563t;
        if (finderEditTextView3 == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        finderEditTextView3.setTextGravity(8388611);
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView4 = this.f128563t;
        if (finderEditTextView4 == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        finderEditTextView4.setTextInputType(147457);
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView5 = this.f128563t;
        if (finderEditTextView5 == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        java.lang.String string = getString(com.tencent.mm.R.string.f492005ex2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        finderEditTextView5.setTextHint(string);
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView6 = this.f128563t;
        if (finderEditTextView6 == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderEditTextView6.f136948e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        mMEditText.requestFocus();
        java.lang.String stringExtra = getIntent().getStringExtra("saveText");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView7 = this.f128563t;
            if (finderEditTextView7 == null) {
                kotlin.jvm.internal.o.o("editView");
                throw null;
            }
            kotlin.jvm.internal.o.d(stringExtra);
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = finderEditTextView7.f136948e;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("editText");
                throw null;
            }
            mMEditText2.n(stringExtra);
        }
        int intExtra = getIntent().getIntExtra("saveAlign", -1);
        if (intExtra > 0) {
            d7(intExtra);
        }
        showVKB();
        com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter finderEditFooter = this.f128564u;
        if (finderEditFooter == null) {
            kotlin.jvm.internal.o.o("editFooter");
            throw null;
        }
        finderEditFooter.setAlignModeChangeListener(new com.tencent.mm.plugin.finder.ui.h5(this));
        com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter finderEditFooter2 = this.f128564u;
        if (finderEditFooter2 == null) {
            kotlin.jvm.internal.o.o("editFooter");
            throw null;
        }
        finderEditFooter2.setSmileyTextOperationListener(new com.tencent.mm.plugin.finder.ui.i5(this));
        setBackBtn(new com.tencent.mm.plugin.finder.ui.j5(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        c7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
