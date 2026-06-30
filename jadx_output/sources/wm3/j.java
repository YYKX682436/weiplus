package wm3;

/* loaded from: classes9.dex */
public class j extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f447271d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f447272e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.base.preference.g0 f447273f;

    /* renamed from: g, reason: collision with root package name */
    public final android.database.DataSetObserver f447274g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f447275h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f447276i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f447277m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f447278n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.WeakHashMap f447279o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f447271d = new android.graphics.Rect();
        this.f447272e = jz5.h.b(new wm3.i(this, activity));
        this.f447273f = new wm3.f(this);
        this.f447274g = new wm3.b(this);
        this.f447275h = new wm3.g(this);
        this.f447276i = jz5.h.b(new wm3.d(this, activity));
        this.f447277m = jz5.h.b(new wm3.e(activity));
        this.f447278n = new java.util.ArrayList();
        this.f447279o = new java.util.WeakHashMap();
    }

    public final android.view.ViewGroup T6() {
        java.lang.Object value = ((jz5.n) this.f447272e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    public final void U6() {
        T6().post(new wm3.h(this));
    }

    public final void V6() {
        boolean z17;
        int i17;
        boolean z18;
        android.view.View view;
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = this.f447278n;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) ((java.lang.ref.WeakReference) it.next()).get();
            if (preference != null) {
                java.util.Set entrySet = this.f447279o.entrySet();
                kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
                java.util.Iterator it6 = entrySet.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        view = null;
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                    com.tencent.mm.ui.base.preference.Preference preference2 = (com.tencent.mm.ui.base.preference.Preference) ((java.lang.ref.WeakReference) entry.getValue()).get();
                    if (kotlin.jvm.internal.o.b(preference2 != null ? preference2.f197780q : null, preference.f197780q)) {
                        view = (android.view.View) entry.getKey();
                        break;
                    }
                }
                if (view != null) {
                    android.graphics.Rect rect = this.f447271d;
                    if (!(view.getGlobalVisibleRect(rect) && rect.width() >= view.getMeasuredWidth() && rect.height() >= view.getMeasuredHeight() && view.isAttachedToWindow())) {
                        z17 = true;
                        break;
                    }
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        int childCount = T6().getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = T6().getChildAt(i18);
            if (childAt != null) {
                java.lang.Object tag = childAt.getTag();
                kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) tag;
                if (z17) {
                    java.util.Iterator it7 = arrayList.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            z18 = false;
                            break;
                        }
                        com.tencent.mm.ui.base.preference.Preference preference3 = (com.tencent.mm.ui.base.preference.Preference) ((java.lang.ref.WeakReference) it7.next()).get();
                        if (kotlin.jvm.internal.o.b(preference3 != null ? preference3.f197780q : null, str)) {
                            z18 = true;
                            break;
                        }
                    }
                    if (z18) {
                        i17 = 0;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(java.lang.Integer.valueOf(i17));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                i17 = 8;
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList22.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList22);
                yj0.a.d(childAt, arrayList22.toArray(), "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.base.preference.MMPreference mMPreference = activity instanceof com.tencent.mm.ui.base.preference.MMPreference ? (com.tencent.mm.ui.base.preference.MMPreference) activity : null;
        if (mMPreference != null) {
            mMPreference.addOnScrollListener(this.f447275h);
            com.tencent.mm.ui.base.preference.r preferenceScreen = mMPreference.getPreferenceScreen();
            com.tencent.mm.ui.base.preference.h0 h0Var = preferenceScreen instanceof com.tencent.mm.ui.base.preference.h0 ? (com.tencent.mm.ui.base.preference.h0) preferenceScreen : null;
            if (h0Var != null) {
                h0Var.a(this.f447273f);
                h0Var.registerDataSetObserver(this.f447274g);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        U6();
    }
}
