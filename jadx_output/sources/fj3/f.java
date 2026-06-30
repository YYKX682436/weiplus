package fj3;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static int f263198f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f263199a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f263200b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f263201c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f263202d;

    /* renamed from: e, reason: collision with root package name */
    public rs0.h f263203e;

    public f(int i17, int i18, kotlin.jvm.internal.i iVar) {
        if ((i18 & 1) != 0) {
            i17 = f263198f;
            f263198f = i17 + 1;
        }
        this.f263199a = "MicroMsg.MTR.GLHandlerThread-" + i17;
        this.f263201c = jz5.h.b(new fj3.e(i17));
        this.f263202d = jz5.h.b(new fj3.d(this));
    }
}
