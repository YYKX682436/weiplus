package kr3;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.j f311340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kr3.j jVar) {
        super(0);
        this.f311340d = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r3 != false) goto L16;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r5 = this;
            kr3.j r0 = r5.f311340d
            java.lang.String r1 = r0.getUsername()
            if (r1 != 0) goto La
            r0 = 0
            goto L63
        La:
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r1)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.tencent.mm.plugin.messenger.foundation.h2) r1
            com.tencent.mm.storage.k4 r1 = r1.Bi()
            java.lang.String r2 = r0.getUsername()
            r3 = 1
            com.tencent.mm.storage.z3 r1 = r1.n(r2, r3)
            if (r1 == 0) goto L36
            java.lang.String r2 = r1.d1()
            if (r2 == 0) goto L31
            boolean r2 = r26.n0.N(r2)
            if (r2 == 0) goto L30
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L34
            goto L36
        L34:
            r0 = r1
            goto L63
        L36:
            com.tencent.mm.storage.z3 r1 = new com.tencent.mm.storage.z3
            java.lang.String r2 = r0.getUsername()
            r1.<init>(r2)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r3 = "Contact_Nick"
            java.lang.String r2 = r2.getStringExtra(r3)
            java.lang.String r3 = ""
            if (r2 != 0) goto L4e
            r2 = r3
        L4e:
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r4 = "Contact_RemarkName"
            java.lang.String r0 = r0.getStringExtra(r4)
            if (r0 != 0) goto L5b
            goto L5c
        L5b:
            r3 = r0
        L5c:
            r1.M1(r2)
            r1.n1(r3)
            goto L34
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kr3.b.invoke():java.lang.Object");
    }
}
