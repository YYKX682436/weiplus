package ts1;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts1.o f421581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ts1.o oVar) {
        super(0);
        this.f421581d = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            ts1.o r0 = r7.f421581d
            com.tencent.mm.sdk.platformtools.v3 r1 = r0.f421591d
            java.lang.String r0 = r0.d()
            java.lang.Object r1 = r1.d(r0)
            com.tencent.mm.sdk.platformtools.o4 r1 = (com.tencent.mm.sdk.platformtools.o4) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L40
            boolean r4 = r1.f(r0)
            if (r4 == 0) goto L40
            byte[] r0 = r1.j(r0)
            if (r0 == 0) goto L40
            int r1 = r0.length
            if (r1 != 0) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = r3
        L24:
            r1 = r1 ^ r2
            if (r1 == 0) goto L40
            java.lang.Class<r45.n97> r1 = r45.n97.class
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L36
            r4 = r1
            com.tencent.mm.protobuf.f r4 = (com.tencent.mm.protobuf.f) r4     // Catch: java.lang.Exception -> L36
            r4.parseFrom(r0)     // Catch: java.lang.Exception -> L36
            com.tencent.mm.protobuf.f r1 = (com.tencent.mm.protobuf.f) r1     // Catch: java.lang.Exception -> L36
            goto L41
        L36:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r5 = "decode ProtoBuffer"
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r0, r5, r1)
        L40:
            r1 = 0
        L41:
            r45.n97 r1 = (r45.n97) r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r1 == 0) goto L8c
            java.util.LinkedList r1 = r1.f381188d
            java.lang.String r4 = "header"
            kotlin.jvm.internal.o.f(r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L5a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r1.next()
            r6 = r5
            r45.m97 r6 = (r45.m97) r6
            java.lang.String r6 = r6.f380287d
            if (r6 == 0) goto L6d
            r6 = r2
            goto L6e
        L6d:
            r6 = r3
        L6e:
            if (r6 == 0) goto L5a
            r4.add(r5)
            goto L5a
        L74:
            java.util.Iterator r1 = r4.iterator()
        L78:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r1.next()
            r45.m97 r2 = (r45.m97) r2
            java.lang.String r3 = r2.f380287d
            java.util.LinkedList r2 = r2.f380288e
            r0.put(r3, r2)
            goto L78
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ts1.h.invoke():java.lang.Object");
    }
}
