package com.tencent.mm.protobuf;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f192153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.LinkedList linkedList) {
        super(2);
        this.f192153d = linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (kotlin.jvm.internal.o.b(r4.getOrDefault(1), r9) != false) goto L11;
     */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.lang.String r0 = "k"
            kotlin.jvm.internal.o.g(r8, r0)
            java.util.LinkedList r0 = r7.f192153d
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
            r3 = r2
        Ld:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L37
            java.lang.Object r4 = r1.next()
            com.tencent.mm.protobuf.e r4 = (com.tencent.mm.protobuf.e) r4
            java.lang.Object r6 = r4.getOrDefault(r2)
            boolean r6 = kotlin.jvm.internal.o.b(r6, r8)
            if (r6 == 0) goto L30
            r6 = 1
            java.lang.Object r4 = r4.getOrDefault(r6)
            boolean r4 = kotlin.jvm.internal.o.b(r4, r9)
            if (r4 == 0) goto L30
            goto L31
        L30:
            r6 = r2
        L31:
            if (r6 == 0) goto L34
            goto L38
        L34:
            int r3 = r3 + 1
            goto Ld
        L37:
            r3 = r5
        L38:
            if (r3 == r5) goto L3d
            r0.remove(r3)
        L3d:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.protobuf.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
