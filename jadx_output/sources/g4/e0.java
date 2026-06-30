package g4;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f268259a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f268260b;

    public e0(java.lang.Object obj, int i17, kotlin.jvm.internal.i iVar) {
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(new jz5.l(Integer.MIN_VALUE, (i17 & 1) != 0 ? null : obj));
        this.f268259a = a17;
        this.f268260b = new g4.d0(a17);
    }

    public final void a(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlinx.coroutines.flow.j2 j2Var = this.f268259a;
        ((kotlinx.coroutines.flow.h3) j2Var).k(new jz5.l(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).f302833d).intValue() + 1), data));
    }
}
