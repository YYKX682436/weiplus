package n3;

/* loaded from: classes14.dex */
public class p0 extends n3.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f334383a;

    public p0(android.view.View view) {
        this.f334383a = view;
    }

    @Override // n3.r0
    public void a() {
        android.view.View view = this.f334383a;
        if (view != null) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // n3.r0
    public void b() {
        final android.view.View view;
        android.view.View view2 = this.f334383a;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(android.R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new java.lang.Runnable() { // from class: n3.p0$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.view.View view3 = view;
                ((android.view.inputmethod.InputMethodManager) view3.getContext().getSystemService("input_method")).showSoftInput(view3, 0);
            }
        });
    }
}
