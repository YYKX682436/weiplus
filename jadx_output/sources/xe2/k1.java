package xe2;

/* loaded from: classes3.dex */
public final class k1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453876c = "LiveSpamDropStickerInterceptor";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
    @Override // we2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.LinkedList r5) {
        /*
            r4 = this;
            java.lang.String r0 = "msgList"
            kotlin.jvm.internal.o.g(r5, r0)
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r5.next()
            r45.ch1 r0 = (r45.ch1) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "msgType = "
            r1.<init>(r2)
            r2 = 1
            int r3 = r0.getInteger(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = r4.f453876c
            com.tencent.mars.xlog.Log.i(r3, r1)
            int r1 = r0.getInteger(r2)
            r2 = 20103(0x4e87, float:2.817E-41)
            if (r1 != r2) goto L9
            r45.ck1 r1 = new r45.ck1
            r1.<init>()
            r2 = 4
            com.tencent.mm.protobuf.g r0 = r0.getByteString(r2)
            r2 = 0
            if (r0 == 0) goto L47
            byte[] r0 = r0.g()
            goto L48
        L47:
            r0 = r2
        L48:
            if (r0 != 0) goto L4c
        L4a:
            r1 = r2
            goto L5d
        L4c:
            r1.parseFrom(r0)     // Catch: java.lang.Exception -> L50
            goto L5d
        L50:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r3, r1, r0)
            goto L4a
        L5d:
            if (r1 == 0) goto L9
            java.lang.Class<je2.g> r0 = je2.g.class
            gk2.e r2 = r4.f445267a
            androidx.lifecycle.c1 r0 = r2.a(r0)
            je2.g r0 = (je2.g) r0
            kotlinx.coroutines.flow.i2 r0 = r0.f299232t
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r2.add(r1)
            kotlinx.coroutines.flow.q2 r0 = (kotlinx.coroutines.flow.q2) r0
            r0.e(r2)
            goto L9
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.k1.d(java.util.LinkedList):void");
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20103};
    }
}
