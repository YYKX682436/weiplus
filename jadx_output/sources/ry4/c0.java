package ry4;

/* loaded from: classes.dex */
public final class c0 extends wm3.a implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f401589d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem f401590e;

    /* renamed from: f, reason: collision with root package name */
    public int f401591f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f401592g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f401593h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f401594i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f401595m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f401596n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f401597o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f401598p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f401599q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ScrollView f401600r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f401601s;

    /* renamed from: t, reason: collision with root package name */
    public int f401602t;

    /* renamed from: u, reason: collision with root package name */
    public final ry4.p f401603u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f401589d = "";
        this.f401591f = -1;
        this.f401598p = jz5.h.b(new ry4.m(this));
        this.f401599q = jz5.h.b(new ry4.i(this));
        this.f401603u = new ry4.p(this);
    }

    public static final java.lang.Object T6(ry4.c0 c0Var, xg3.a aVar, kotlin.coroutines.Continuation continuation) {
        c0Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        ry4.n nVar = new ry4.n(rVar);
        xg3.o0 fj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(nVar);
        e21.z0 z0Var = (e21.z0) fj6;
        z0Var.getClass();
        z0Var.d(aVar, null, weakReference);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar2 = pz5.a.f359186d;
        return j17;
    }

    public final void U6() {
        getActivity().finish();
        getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    public final void V6() {
        android.widget.LinearLayout linearLayout = this.f401601s;
        if (linearLayout != null && linearLayout.getPaddingBottom() > 0) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
        }
    }

    public final void W6() {
        java.lang.String str;
        com.tencent.mm.ui.base.NestedScrollEditText editText;
        android.text.Editable text;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f401593h;
        if (mMLimitedClearEditText == null || (editText = mMLimitedClearEditText.getEditText()) == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = this.f401594i;
        boolean z17 = false;
        boolean c17 = mMLimitedClearEditText2 != null ? mMLimitedClearEditText2.c() : false;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText3 = this.f401593h;
        boolean c18 = mMLimitedClearEditText3 != null ? mMLimitedClearEditText3.c() : false;
        if ((!r26.n0.N(str)) && !c17 && !c18) {
            z17 = true;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.enableOptionMenu(1, z17);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eqa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0270, code lost:
    
        if (((r12 == null || (r12 = r12.f188080e) == null || !(r26.n0.N(r12) ^ true)) ? false : true) != false) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateAfter(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry4.c0.onCreateAfter(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.ui.tools.f5 f5Var = this.f401597o;
        if (f5Var != null) {
            if (f5Var == null) {
                kotlin.jvm.internal.o.o("keyboardHeightProvider");
                throw null;
            }
            f5Var.d();
        }
        android.widget.ScrollView scrollView = this.f401600r;
        if (scrollView == null || (viewTreeObserver = scrollView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.f401603u);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.f401597o;
        if (f5Var != null) {
            if (f5Var != null) {
                f5Var.d();
            } else {
                kotlin.jvm.internal.o.o("keyboardHeightProvider");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f401597o;
        if (f5Var != null) {
            if (f5Var != null) {
                f5Var.f();
            } else {
                kotlin.jvm.internal.o.o("keyboardHeightProvider");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.mm.ui.base.NestedScrollEditText editText;
        android.text.Editable text;
        com.tencent.mm.ui.base.NestedScrollEditText editText2;
        android.text.Editable text2;
        com.tencent.mm.ui.base.NestedScrollEditText editText3;
        android.text.Editable text3;
        java.lang.String obj;
        java.lang.String str;
        com.tencent.mm.ui.base.NestedScrollEditText editText4;
        android.text.Editable text4;
        super.onSaveInstanceState(bundle);
        java.lang.String str2 = "";
        if (bundle != null) {
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f401593h;
            if (mMLimitedClearEditText == null || (editText4 = mMLimitedClearEditText.getEditText()) == null || (text4 = editText4.getText()) == null || (str = text4.toString()) == null) {
                str = "";
            }
            bundle.putString("state_content", str);
        }
        if (bundle != null) {
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = this.f401594i;
            if (mMLimitedClearEditText2 != null && (editText3 = mMLimitedClearEditText2.getEditText()) != null && (text3 = editText3.getText()) != null && (obj = text3.toString()) != null) {
                str2 = obj;
            }
            bundle.putString("state_title", str2);
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText3 = this.f401593h;
        java.lang.String str3 = null;
        objArr[0] = (mMLimitedClearEditText3 == null || (editText2 = mMLimitedClearEditText3.getEditText()) == null || (text2 = editText2.getText()) == null) ? null : text2.toString();
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText4 = this.f401594i;
        if (mMLimitedClearEditText4 != null && (editText = mMLimitedClearEditText4.getEditText()) != null && (text = editText.getText()) != null) {
            str3 = text.toString();
        }
        objArr[1] = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandEditUIC", "[onSaveInstanceState] content=%s, title=%s", objArr);
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.widget.LinearLayout linearLayout;
        android.widget.ScrollView scrollView = this.f401600r;
        if (scrollView == null || (linearLayout = this.f401601s) == null) {
            return;
        }
        if (i17 == 0) {
            V6();
            this.f401602t = 0;
            scrollView.post(new ry4.v(scrollView));
            return;
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f401596n;
        if (mMLimitedClearEditText == null) {
            V6();
            return;
        }
        if (kotlin.jvm.internal.o.b(mMLimitedClearEditText, this.f401593h)) {
            V6();
            scrollView.smoothScrollTo(0, ((java.lang.Number) ((jz5.n) this.f401599q).getValue()).intValue());
            return;
        }
        if (kotlin.jvm.internal.o.b(mMLimitedClearEditText, this.f401594i)) {
            int height = scrollView.getHeight() - (linearLayout.getHeight() - linearLayout.getPaddingBottom());
            int i18 = height >= 0 ? height : 0;
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = this.f401594i;
            if (mMLimitedClearEditText2 != null) {
                mMLimitedClearEditText = mMLimitedClearEditText2;
            }
            int[] iArr = new int[2];
            mMLimitedClearEditText.getLocationOnScreen(iArr);
            int height2 = iArr[1] + mMLimitedClearEditText.getHeight();
            int[] iArr2 = new int[2];
            scrollView.getLocationOnScreen(iArr2);
            linearLayout.post(new ry4.j(linearLayout, i18 + ((java.lang.Number) ((jz5.n) this.f401598p).getValue()).intValue(), height2 - ((iArr2[1] + scrollView.getHeight()) - i17)));
            scrollView.postDelayed(new ry4.k(this, scrollView, i17), 300L);
        }
    }
}
