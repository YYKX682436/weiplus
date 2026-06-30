package mh2;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k f326317d;

    public e(mh2.k kVar) {
        this.f326317d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mh2.k kVar = this.f326317d;
        kVar.f326377f.setVisibility(0);
        kVar.f326377f.setAlpha(0.0f);
        android.view.View view = kVar.f326378g;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVCoverBackgroundWidget$doShowCoverView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/ktv/view/KTVCoverBackgroundWidget$doShowCoverView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
