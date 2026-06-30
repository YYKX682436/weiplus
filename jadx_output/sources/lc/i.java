package lc;

/* loaded from: classes14.dex */
public abstract class i extends android.app.Fragment {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f317844d;

    public final void a(java.lang.Runnable runnable) {
        android.app.Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else {
            mc.p.f325531a.e("BaseFragment", "fragment attach activity is null");
        }
    }

    public final android.content.res.Resources b() {
        if (!isAdded()) {
            int i17 = ic.d.f290281k;
            ic.d dVar = ic.c.f290280a;
            java.lang.ref.WeakReference weakReference = dVar.f290283b;
            android.content.Context context = weakReference == null ? null : (android.content.Context) weakReference.get();
            if (context != null) {
                return context.getResources();
            }
            android.content.Context a17 = dVar.a();
            if (a17 != null) {
                return a17.getResources();
            }
        }
        return getResources();
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View view = this.f317844d;
        if (view == null) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        int i17 = ic.d.f290281k;
        com.tencent.cloud.huiyan.callback.HuiYanSdkEventCallBack huiYanSdkEventCallBack = ic.c.f290280a.f290287f;
        if (huiYanSdkEventCallBack != null) {
            huiYanSdkEventCallBack.onMainViewCreate(view);
        }
        return this.f317844d;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i17 = ic.d.f290281k;
        com.tencent.cloud.huiyan.callback.HuiYanSdkEventCallBack huiYanSdkEventCallBack = ic.c.f290280a.f290287f;
        if (huiYanSdkEventCallBack != null) {
            huiYanSdkEventCallBack.onMainViewDestroy();
        }
        if (this.f317844d != null) {
            this.f317844d = null;
        }
        super.onDestroy();
    }
}
