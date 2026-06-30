package vf5;

/* loaded from: classes3.dex */
public final class j extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.ui.tools.c5, android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f436423d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f436424e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f436425f;

    /* renamed from: g, reason: collision with root package name */
    public int f436426g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.GestureDetector f436427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f436425f = new com.tencent.mm.ui.tools.f5(activity);
        this.f436427h = new android.view.GestureDetector(activity, new vf5.e(activity));
    }

    public final java.util.List O6(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    if ((childAt instanceof android.widget.EditText) && ((android.widget.EditText) childAt).isFocused()) {
                        arrayList.add(childAt);
                    }
                    arrayList.addAll(O6(childAt));
                }
            }
        }
        return arrayList;
    }

    public final void P6(android.widget.FrameLayout scrollview) {
        android.view.ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.o.g(scrollview, "scrollview");
        android.widget.FrameLayout frameLayout = this.f436424e;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.f436424e = scrollview;
        if (scrollview instanceof android.widget.ScrollView) {
            scrollview.setOnTouchListener(new vf5.f(this));
        } else if (scrollview instanceof androidx.core.widget.NestedScrollView) {
            scrollview.setOnTouchListener(new vf5.g(this));
        }
        android.view.ViewTreeObserver viewTreeObserver2 = scrollview.getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (this.f436426g == 0) {
            this.f436426g = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv);
        }
        this.f436425f.f210400e = this;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.view.ViewTreeObserver viewTreeObserver;
        this.f436425f.d();
        android.widget.FrameLayout frameLayout = this.f436424e;
        if (frameLayout == null || (viewTreeObserver = frameLayout.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View childAt;
        android.widget.FrameLayout frameLayout = this.f436424e;
        if (frameLayout == null || frameLayout.getChildCount() == 0 || (childAt = frameLayout.getChildAt(0)) == null) {
            return;
        }
        int height = childAt.getHeight();
        int i17 = this.f436423d;
        int i18 = height - i17;
        if (i17 != 0 && height != 0 && i18 != 0 && i18 > 0) {
            frameLayout.post(new vf5.h(frameLayout, i18));
        }
        this.f436423d = height;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f436425f.d();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f436425f.f();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            this.f436425f.f();
        }
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.widget.FrameLayout frameLayout = this.f436424e;
        if (frameLayout == null) {
            return;
        }
        android.view.View childAt = frameLayout.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (i17 == 0) {
            childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), 0);
            return;
        }
        int height = frameLayout.getHeight() - (childAt.getHeight() - childAt.getPaddingBottom());
        int i18 = height >= 0 ? height : 0;
        java.util.ArrayList arrayList = (java.util.ArrayList) O6(frameLayout);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactModScrollUIC", "onKeyboardHeightChanged, editTexts:%s", java.lang.Integer.valueOf(arrayList.size()));
        if (arrayList.isEmpty()) {
            return;
        }
        android.widget.EditText editText = (android.widget.EditText) arrayList.get(arrayList.size() - 1);
        int[] iArr = new int[2];
        editText.getLocationOnScreen(iArr);
        int height2 = editText.getHeight();
        int[] iArr2 = new int[2];
        frameLayout.getLocationOnScreen(iArr2);
        int height3 = (iArr2[1] + frameLayout.getHeight()) - i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactModScrollUIC", "scrollTop: " + iArr2[1] + ", height: " + frameLayout.getHeight() + ", imeHeight: " + i17 + ", visibleHeight: " + height3);
        int i19 = (iArr[1] + height2) - height3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("editTextTop: ");
        sb6.append(iArr[1]);
        sb6.append(", editTextHeight: ");
        sb6.append(height2);
        sb6.append(", outOfScreenHeight:%s");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactModScrollUIC", sb6.toString(), java.lang.Integer.valueOf(i19));
        childAt.post(new vf5.i(childAt, i18 + this.f436426g, i19));
    }
}
