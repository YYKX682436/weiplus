package pf5;

/* loaded from: classes5.dex */
public abstract class o extends pf5.p {
    public static final pf5.n Companion = new pf5.n(null);
    public static final java.lang.String TAG = "SimpleUIComponent";
    public androidx.appcompat.app.AppCompatActivity activity;
    private androidx.fragment.app.Fragment fragment;

    public o(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        setActivity(activity);
    }

    public android.content.Intent N6() {
        return getIntent();
    }

    @Override // pf5.p
    public <T extends android.view.View> T findViewByIdByActivity(int i17) {
        return (T) getActivity().findViewById(i17);
    }

    public final androidx.appcompat.app.AppCompatActivity getActivity() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.activity;
        if (appCompatActivity != null) {
            return appCompatActivity;
        }
        kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        throw null;
    }

    public final int getColor(int i17) {
        return getResources().getColor(i17);
    }

    public final float getDimension(int i17) {
        return getResources().getDimension(i17);
    }

    @Override // pf5.p
    public android.view.View getFindViewIdRootView() {
        androidx.fragment.app.Fragment fragment = this.fragment;
        if (fragment == null || fragment == null) {
            return null;
        }
        return fragment.getView();
    }

    public final androidx.fragment.app.Fragment getFragment() {
        return this.fragment;
    }

    public final android.content.Intent getIntent() {
        android.content.Intent intent = getActivity().getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        return intent;
    }

    public final androidx.lifecycle.o getLifecycle() {
        androidx.fragment.app.Fragment fragment = this.fragment;
        androidx.lifecycle.o mo133getLifecycle = fragment != null ? fragment.mo133getLifecycle() : null;
        if (mo133getLifecycle != null) {
            return mo133getLifecycle;
        }
        androidx.lifecycle.o mo133getLifecycle2 = getActivity().mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle2, "getLifecycle(...)");
        return mo133getLifecycle2;
    }

    public final android.content.res.Resources getResources() {
        android.content.res.Resources resources = getActivity().getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        return resources;
    }

    public final java.lang.String getString(int i17) {
        java.lang.String string = getResources().getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCleared] fragment=");
        androidx.fragment.app.Fragment fragment = this.fragment;
        sb6.append(fragment != null ? fragment.getClass().getName() : null);
        sb6.append(" activity=");
        sb6.append(getActivity().getClass().getName());
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i(TAG, sb7, obj);
        }
    }

    public final void setActivity(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        kotlin.jvm.internal.o.g(appCompatActivity, "<set-?>");
        this.activity = appCompatActivity;
    }

    public final void setFragment(androidx.fragment.app.Fragment fragment) {
        this.fragment = fragment;
    }

    public java.lang.String toString() {
        return getClass().getName() + '@' + hashCode();
    }

    public final int getColor(int i17, android.content.res.Resources.Theme theme) {
        return getResources().getColor(i17, theme);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(androidx.fragment.app.Fragment r3) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.g(r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            kotlin.jvm.internal.o.e(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            r2.<init>(r0)
            r2.fragment = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf5.o.<init>(androidx.fragment.app.Fragment):void");
    }

    public o() {
    }
}
