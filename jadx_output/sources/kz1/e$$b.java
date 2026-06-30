package kz1;

/* loaded from: classes13.dex */
public final /* synthetic */ class e$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kz1.e f313851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313852e;

    public /* synthetic */ e$$b(kz1.e eVar, android.view.View view) {
        this.f313851d = eVar;
        this.f313852e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uz1.a aVar = this.f313851d.f313841d;
        android.view.View view = this.f313852e;
        if (aVar.contains(view)) {
            return;
        }
        aVar.add(view);
    }
}
