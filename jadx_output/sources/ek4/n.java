package ek4;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.u f253669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ek4.w f253672g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ek4.u uVar, java.lang.String str, ek4.s sVar, ek4.w wVar) {
        super(0);
        this.f253669d = uVar;
        this.f253670e = str;
        this.f253671f = sVar;
        this.f253672g = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r0 == null) goto L25;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            ek4.u r0 = r10.f253669d
            java.lang.String r1 = r10.f253670e
            dn.o r0 = r0.a(r1)
            jz5.f0 r2 = jz5.f0.f302826a
            ek4.w r3 = r10.f253672g
            r4 = -1
            if (r0 == 0) goto L60
            java.lang.String r5 = r0.field_fileId
            java.lang.String r6 = ""
            if (r5 != 0) goto L17
            r0.field_fileId = r6
        L17:
            java.lang.String r5 = r0.field_aesKey
            if (r5 != 0) goto L1d
            r0.field_aesKey = r6
        L1d:
            r5 = 0
            r0.f241786e = r5
            ek4.s r6 = r10.f253671f
            java.util.HashMap r7 = r6.f253685a
            java.lang.String r8 = r0.field_mediaId
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L32
            if (r3 == 0) goto L5d
            r3.b(r4, r0)
            goto L5b
        L32:
            dn.c r7 = new dn.c
            r7.<init>()
            java.lang.String r8 = r0.field_mediaId
            java.lang.String r9 = "field_mediaId"
            kotlin.jvm.internal.o.f(r8, r9)
            ek4.s.d(r6, r8, r7)
            long r7 = c01.id.c()
            r0.field_startTime = r7
            int r7 = r0.Z
            r8 = 8
            if (r7 != r8) goto L4e
            r5 = 1
        L4e:
            if (r5 == 0) goto L55
            int r5 = ek4.s.b(r6, r0)
            goto L56
        L55:
            r5 = r4
        L56:
            if (r3 == 0) goto L5d
            r3.b(r5, r0)
        L5b:
            r0 = r2
            goto L5e
        L5d:
            r0 = 0
        L5e:
            if (r0 != 0) goto L6c
        L60:
            dn.o r0 = new dn.o
            r0.<init>()
            r0.field_mediaId = r1
            if (r3 == 0) goto L6c
            r3.b(r4, r0)
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ek4.n.invoke():java.lang.Object");
    }
}
