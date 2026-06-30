package z;

/* loaded from: classes13.dex */
public final class z3 implements z.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final z.y f468885a;

    /* renamed from: b, reason: collision with root package name */
    public z.w f468886b;

    /* renamed from: c, reason: collision with root package name */
    public z.w f468887c;

    /* renamed from: d, reason: collision with root package name */
    public z.w f468888d;

    public z3(z.y anims) {
        kotlin.jvm.internal.o.g(anims, "anims");
        this.f468885a = anims;
    }

    @Override // z.r3
    public boolean a() {
        return false;
    }

    @Override // z.r3
    public z.w b(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        if (this.f468888d == null) {
            this.f468888d = initialVelocity.c();
        }
        z.w wVar = this.f468888d;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("endVelocityVector");
            throw null;
        }
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            z.w wVar2 = this.f468888d;
            if (wVar2 == null) {
                kotlin.jvm.internal.o.o("endVelocityVector");
                throw null;
            }
            wVar2.e(i17, this.f468885a.get(i17).d(initialValue.a(i17), targetValue.a(i17), initialVelocity.a(i17)));
        }
        z.w wVar3 = this.f468888d;
        if (wVar3 != null) {
            return wVar3;
        }
        kotlin.jvm.internal.o.o("endVelocityVector");
        throw null;
    }

    @Override // z.r3
    public z.w c(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        if (this.f468886b == null) {
            this.f468886b = initialValue.c();
        }
        z.w wVar = this.f468886b;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("valueVector");
            throw null;
        }
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            z.w wVar2 = this.f468886b;
            if (wVar2 == null) {
                kotlin.jvm.internal.o.o("valueVector");
                throw null;
            }
            wVar2.e(i17, this.f468885a.get(i17).e(j17, initialValue.a(i17), targetValue.a(i17), initialVelocity.a(i17)));
        }
        z.w wVar3 = this.f468886b;
        if (wVar3 != null) {
            return wVar3;
        }
        kotlin.jvm.internal.o.o("valueVector");
        throw null;
    }

    @Override // z.r3
    public long d(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        java.util.Iterator it = e06.p.m(0, initialValue.b()).iterator();
        long j17 = 0;
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            j17 = java.lang.Math.max(j17, this.f468885a.get(b17).c(initialValue.a(b17), targetValue.a(b17), initialVelocity.a(b17)));
        }
        return j17;
    }

    @Override // z.r3
    public z.w f(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        if (this.f468887c == null) {
            this.f468887c = initialVelocity.c();
        }
        z.w wVar = this.f468887c;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("velocityVector");
            throw null;
        }
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            z.w wVar2 = this.f468887c;
            if (wVar2 == null) {
                kotlin.jvm.internal.o.o("velocityVector");
                throw null;
            }
            wVar2.e(i17, this.f468885a.get(i17).b(j17, initialValue.a(i17), targetValue.a(i17), initialVelocity.a(i17)));
        }
        z.w wVar3 = this.f468887c;
        if (wVar3 != null) {
            return wVar3;
        }
        kotlin.jvm.internal.o.o("velocityVector");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z3(z.l0 anim) {
        this(new z.y3(anim));
        kotlin.jvm.internal.o.g(anim, "anim");
    }
}
