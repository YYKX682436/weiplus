package fi5;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f263076d;

    public d(android.app.Dialog dialog) {
        this.f263076d = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f263076d.dismiss();
    }
}
