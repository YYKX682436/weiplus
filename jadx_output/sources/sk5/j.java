package sk5;

/* loaded from: classes14.dex */
public abstract class j {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f409015b = jz5.h.b(sk5.i.f409014d);

    /* renamed from: a, reason: collision with root package name */
    public final long f409016a;

    public j(long j17, int i17, kotlin.jvm.internal.i iVar) {
        this.f409016a = (i17 & 1) != 0 ? ((java.lang.Boolean) ((jz5.n) f409015b).getValue()).booleanValue() ? 1500L : 300L : j17;
    }

    public abstract android.animation.Animator a(android.view.View view, int i17, int i18, sk5.k kVar);
}
