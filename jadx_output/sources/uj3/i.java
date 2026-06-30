package uj3;

/* loaded from: classes14.dex */
public final class i extends uj3.v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        int[] iArr = {1, 3, 4};
        for (int i17 = 0; i17 < 3; i17++) {
            hashSet.add(java.lang.Integer.valueOf(iArr[i17]));
        }
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.ibb);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        uj3.j jVar = new uj3.j(string, 5);
        java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.ib_);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        uj3.j jVar2 = new uj3.j(string2, 6);
        java.lang.String string3 = getContext().getResources().getString(com.tencent.mm.R.string.iba);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        uj3.j jVar3 = new uj3.j(string3, 7);
        java.lang.String string4 = getContext().getResources().getString(com.tencent.mm.R.string.ibq);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        uj3.j[] jVarArr = {jVar, jVar2, jVar3, new uj3.j(string4, 8)};
        for (int i18 = 0; i18 < 4; i18++) {
            hashSet2.add(jVarArr[i18]);
        }
        int[] iArr2 = {11, 9};
        for (int i19 = 0; i19 < 2; i19++) {
            hashSet3.add(java.lang.Integer.valueOf(iArr2[i19]));
        }
        setScreenFuncConfig(new uj3.k(hashSet, hashSet2, hashSet3, 3));
        android.view.LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        setMReadyLayout((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.asr));
        setMEditLayout((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.asq));
        setBottomRoot((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.asp));
        setTopRoot((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.ass));
        setAvatarRoot((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.aso));
        android.widget.FrameLayout mEditLayout = getMEditLayout();
        if (mEditLayout != null) {
            mEditLayout.setVisibility(8);
        }
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        setMultiTalkStrokeContext(new uj3.c(context2, this, getScreenFuncConfig()));
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        setTopUiLayout(new uj3.f1(context3, this));
        android.content.Context context4 = getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        setAvatarLayout(new uj3.b0(context4, this));
        android.content.Context context5 = getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        setBottomUiLayout(new uj3.l0(context5, this, getScreenFuncConfig()));
        setMScreenReportData(new uj3.k1());
        android.content.Context context6 = getContext();
        kotlin.jvm.internal.o.f(context6, "getContext(...)");
        setReadyUI(new uj3.j1(context6, this, getScreenFuncConfig()));
        p();
        r(true);
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new uj3.h(this));
        }
    }

    @Override // uj3.v0
    public android.view.View getBackgroundView() {
        return getMEditLayout();
    }

    @Override // uj3.v0
    public java.lang.String getCurrentFileMd5() {
        return null;
    }

    @Override // uj3.v0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c3l;
    }
}
