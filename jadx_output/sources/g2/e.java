package g2;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public g2.e0 f267691a;

    /* renamed from: b, reason: collision with root package name */
    public g2.f f267692b;

    public e() {
        a2.d dVar = a2.e.f687a;
        int i17 = a2.m1.f782c;
        g2.e0 e0Var = new g2.e0(dVar, a2.m1.f781b, null, null);
        this.f267691a = e0Var;
        this.f267692b = new g2.f(dVar, e0Var.f267694b, null);
    }

    public final g2.e0 a(java.util.List editCommands) {
        kotlin.jvm.internal.o.g(editCommands, "editCommands");
        int size = editCommands.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((g2.d) editCommands.get(i17)).a(this.f267692b);
        }
        a2.d dVar = new a2.d(this.f267692b.toString(), null, null, 6, null);
        g2.f fVar = this.f267692b;
        long a17 = a2.n1.a(fVar.f267697b, fVar.f267698c);
        g2.f fVar2 = this.f267692b;
        int i18 = fVar2.f267699d;
        g2.e0 e0Var = new g2.e0(dVar, a17, i18 != -1 ? new a2.m1(a2.n1.a(i18, fVar2.f267700e)) : null, null);
        this.f267691a = e0Var;
        return e0Var;
    }
}
