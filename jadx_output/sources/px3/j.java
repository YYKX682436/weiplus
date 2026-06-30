package px3;

/* loaded from: classes10.dex */
public final class j extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final rx3.h f358949d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f358950e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f358951f;

    /* renamed from: g, reason: collision with root package name */
    public final int f358952g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f358953h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f358954i;

    public j(rx3.h ringtoneRepository) {
        kotlin.jvm.internal.o.g(ringtoneRepository, "ringtoneRepository");
        this.f358949d = ringtoneRepository;
        this.f358950e = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(new px3.a(null, 1));
        this.f358951f = a17;
        this.f358952g = 10;
        this.f358953h = a17;
    }

    public final void N6(java.util.ArrayList availData) {
        kotlin.jvm.internal.o.g(availData, "availData");
        this.f358954i = kotlinx.coroutines.l.d(this.f358950e, null, null, new px3.h(this, availData, null), 3, null);
    }
}
