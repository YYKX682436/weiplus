package gm2;

/* loaded from: classes3.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f273522d;

    public w1(android.view.View view) {
        this.f273522d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f273522d.invalidate();
    }
}
