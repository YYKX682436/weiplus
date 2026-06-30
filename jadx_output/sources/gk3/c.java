package gk3;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f272493e;

    public c(gk3.m mVar, android.graphics.Bitmap bitmap) {
        this.f272492d = mVar;
        this.f272493e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.u3.h(new gk3.b(this.f272492d, this.f272493e));
    }
}
