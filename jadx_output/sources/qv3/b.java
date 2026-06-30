package qv3;

/* loaded from: classes5.dex */
public final class b extends wt3.b0 implements wt3.j0 {

    /* renamed from: p, reason: collision with root package name */
    public nv3.f f366950p;

    /* renamed from: q, reason: collision with root package name */
    public wt3.i0 f366951q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(im5.b r14, yu3.a r15, int r16) {
        /*
            r13 = this;
            r0 = r13
            r2 = r14
            r1 = r15
            java.lang.String r3 = "lifeCycleKeeper"
            kotlin.jvm.internal.o.g(r14, r3)
            java.lang.String r3 = "createInfo"
            kotlin.jvm.internal.o.g(r15, r3)
            java.util.ArrayList r3 = r1.f465854d
            int r4 = r1.f465851a
            r13.<init>(r14, r3, r4)
            nv3.f r12 = new nv3.f
            int r4 = r0.f449399h
            long r5 = r0.f449395d
            int r7 = r1.f465858h
            int r8 = r3.size()
            com.tencent.mm.protobuf.g r9 = r1.f465859i
            com.tencent.mm.protobuf.g r10 = r1.f465860j
            qv3.a r11 = new qv3.a
            r11.<init>(r13)
            r1 = r12
            r2 = r14
            r3 = r4
            r4 = r5
            r6 = r16
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            r0.f366950p = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qv3.b.<init>(im5.b, yu3.a, int):void");
    }

    @Override // wt3.j0
    public void a(wt3.i0 i0Var) {
        this.f366951q = i0Var;
    }

    @Override // wt3.e
    public wt3.q e() {
        return new wt3.a0();
    }

    @Override // wt3.j0
    public nv3.f getHelper() {
        return this.f366950p;
    }

    @Override // wt3.e
    public void h(com.tencent.mm.protobuf.g gVar, boolean z17) {
        this.f366950p.a(z17, gVar, null);
    }
}
