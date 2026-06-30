package fb1;

/* loaded from: classes7.dex */
public final class e implements fb1.g {

    /* renamed from: e, reason: collision with root package name */
    public static final fb1.e f260836e = new fb1.e();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb1.g f260837d;

    public e() {
        fb1.g gVar = (fb1.g) nd.f.a(fb1.g.class);
        this.f260837d = gVar == null ? fb1.f.f260838d : gVar;
    }

    @Override // fb1.g
    public void F3(fb1.d scene, boolean z17, java.lang.String token) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(token, "token");
        this.f260837d.F3(scene, z17, token);
    }

    @Override // fb1.g
    public boolean R() {
        return this.f260837d.R();
    }

    @Override // fb1.g
    public fb1.c ec(fb1.d scene, boolean z17, fb1.h hVar) {
        kotlin.jvm.internal.o.g(scene, "scene");
        return this.f260837d.ec(scene, z17, hVar);
    }
}
