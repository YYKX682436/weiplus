package fk3;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek3.e f263545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263547f;

    public c(ek3.e eVar, fk3.o oVar, android.graphics.Bitmap bitmap) {
        this.f263545d = eVar;
        this.f263546e = oVar;
        this.f263547f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f263545d.setVisibility(8);
        com.tencent.mm.sdk.platformtools.u3.h(new fk3.b(this.f263546e, this.f263547f));
    }
}
