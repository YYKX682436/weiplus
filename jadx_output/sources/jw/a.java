package jw;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jw.b f302291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jw.b bVar) {
        super(2);
        this.f302291d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if ((r5.length() > 0) == true) goto L11;
     */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.mm.flutter.plugin.proto.s r6 = (com.tencent.mm.flutter.plugin.proto.s) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "info: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "getFrameSetOffsetInfo"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 0
            if (r5 == 0) goto L27
            int r1 = r5.length()
            r2 = 1
            if (r1 <= 0) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = r0
        L24:
            if (r1 != r2) goto L27
            goto L28
        L27:
            r2 = r0
        L28:
            jw.b r1 = r4.f302291d
            if (r2 == 0) goto L39
            yz5.l r6 = r1.s()
            r0 = 2
            lc3.a0 r5 = r1.h(r0, r5)
            r6.invoke(r5)
            goto L6c
        L39:
            yz5.l r5 = r1.s()
            lc3.a0 r1 = r1.k()
            if (r6 == 0) goto L48
            int r2 = r6.getOffsetHeight()
            goto L49
        L48:
            r2 = r0
        L49:
            java.lang.String r3 = "offsetHeight"
            r1.put(r3, r2)
            if (r6 == 0) goto L56
            int r2 = r6.getOffsetTop()
            goto L57
        L56:
            r2 = r0
        L57:
            java.lang.String r3 = "offsetTop"
            r1.put(r3, r2)
            if (r6 == 0) goto L63
            int r0 = r6.getOffsetTopFromListStart()
        L63:
            java.lang.String r6 = "offsetTopFromListStart"
            r1.put(r6, r0)
            r5.invoke(r1)
        L6c:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jw.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
