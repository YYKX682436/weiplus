package p75;

/* loaded from: classes.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.database.Cursor f352669d;

    public k0(android.database.Cursor cursor) {
        this.f352669d = cursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.database.Cursor cursor = this.f352669d;
        if (((l75.h0) cursor).a() || cursor.isClosed()) {
            return;
        }
        ((l75.h0) cursor).cancel();
    }
}
