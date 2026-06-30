package xe2;

/* loaded from: classes3.dex */
public final class d extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453842c = "LiveAppMsgLikeUpdateInterceptor";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r10 = (mm2.e5) r12.f445267a.a(mm2.e5.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        r11 = r10.f329006m.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r11.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        r3 = r11.next();
        kotlin.jvm.internal.o.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (h(r3, r8, r0, r1) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0009 A[SYNTHETIC] */
    @Override // we2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.LinkedList r13) {
        /*
            r12 = this;
            java.lang.String r0 = "msgList"
            kotlin.jvm.internal.o.g(r13, r0)
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> Lad
        L9:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r13.next()     // Catch: java.lang.Throwable -> Lad
            r45.ch1 r0 = (r45.ch1) r0     // Catch: java.lang.Throwable -> Lad
            r45.zi1 r1 = new r45.zi1     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            r2 = 4
            com.tencent.mm.protobuf.g r0 = r0.getByteString(r2)     // Catch: java.lang.Throwable -> Lad
            r2 = 0
            if (r0 == 0) goto L27
            byte[] r0 = r0.g()     // Catch: java.lang.Throwable -> Lad
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 != 0) goto L2c
        L2a:
            r1 = r2
            goto L3d
        L2c:
            r1.parseFrom(r0)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> Lad
            goto L3d
        L30:
            r0 = move-exception
            java.lang.String r1 = "safeParser"
            java.lang.String r3 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lad
            com.tencent.mm.sdk.platformtools.Log.a(r1, r3, r0)     // Catch: java.lang.Throwable -> Lad
            goto L2a
        L3d:
            if (r1 == 0) goto L9
            long r8 = r1.f392083d     // Catch: java.lang.Throwable -> Lad
            int r0 = r1.f392086g     // Catch: java.lang.Throwable -> Lad
            boolean r1 = r1.f392088i     // Catch: java.lang.Throwable -> Lad
            gk2.e r2 = r12.f445267a     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<mm2.x4> r3 = mm2.x4.class
            androidx.lifecycle.c1 r2 = r2.a(r3)     // Catch: java.lang.Throwable -> Lad
            mm2.x4 r2 = (mm2.x4) r2     // Catch: java.lang.Throwable -> Lad
            java.util.List r10 = r2.f329528f     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = "<get-msgList>(...)"
            kotlin.jvm.internal.o.f(r10, r2)     // Catch: java.lang.Throwable -> Lad
            monitor-enter(r10)     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r11 = r10.iterator()     // Catch: java.lang.Throwable -> Laa
        L5b:
            boolean r2 = r11.hasNext()     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L77
            java.lang.Object r2 = r11.next()     // Catch: java.lang.Throwable -> Laa
            r3 = r2
            dk2.zf r3 = (dk2.zf) r3     // Catch: java.lang.Throwable -> Laa
            kotlin.jvm.internal.o.d(r3)     // Catch: java.lang.Throwable -> Laa
            r2 = r12
            r4 = r8
            r6 = r0
            r7 = r1
            boolean r2 = r2.h(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L5b
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lad
            goto L9
        L77:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lad
            gk2.e r2 = r12.f445267a     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<mm2.e5> r3 = mm2.e5.class
            androidx.lifecycle.c1 r2 = r2.a(r3)     // Catch: java.lang.Throwable -> Lad
            r10 = r2
            mm2.e5 r10 = (mm2.e5) r10     // Catch: java.lang.Throwable -> Lad
            monitor-enter(r10)     // Catch: java.lang.Throwable -> Lad
            mm2.y4 r2 = r10.f329006m     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r11 = r2.iterator()     // Catch: java.lang.Throwable -> La7
        L8a:
            boolean r2 = r11.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto La4
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> La7
            kotlin.jvm.internal.o.d(r3)     // Catch: java.lang.Throwable -> La7
            r2 = r12
            r4 = r8
            r6 = r0
            r7 = r1
            boolean r2 = r2.h(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L8a
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lad
            goto L9
        La4:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lad
            goto L9
        La7:
            r13 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lad
            throw r13     // Catch: java.lang.Throwable -> Lad
        Laa:
            r13 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lad
            throw r13     // Catch: java.lang.Throwable -> Lad
        Lad:
            r13 = move-exception
            xy2.b r0 = xy2.b.f458155b
            java.lang.String r1 = "LiveMsgSliceMsgList"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 124(0x7c, float:1.74E-43)
            r9 = 0
            pm0.z.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = r12.f453842c
            java.lang.String r1 = "dealWithMsgList exception"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r13, r1, r2)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.d.d(java.util.LinkedList):void");
    }

    @Override // we2.z
    public boolean e() {
        return false;
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20062};
    }

    public final boolean h(java.lang.Object obj, long j17, int i17, boolean z17) {
        if (!(obj instanceof dk2.zf) || !(obj instanceof dk2.cg)) {
            return false;
        }
        dk2.zf zfVar = (dk2.zf) obj;
        if (zfVar.m() != j17) {
            return false;
        }
        dk2.cg cgVar = (dk2.cg) obj;
        boolean g17 = cgVar.g();
        java.lang.String str = this.f453842c;
        if (!g17 || cgVar.o() == z17) {
            cgVar.w(i17);
            cgVar.d(z17);
            cgVar.c(true);
            ((mm2.j2) this.f445267a.a(mm2.j2.class)).b7("appMsg", obj);
            com.tencent.mars.xlog.Log.i(str, "updateMsg, updateSeq:" + j17 + ", likeCount:" + i17 + ", selfLike:" + z17 + ", msg:" + ((dk2.zf) obj).j());
        } else {
            com.tencent.mars.xlog.Log.i(str, "updateMsg, ignore because it.selfOp:" + cgVar.g() + ", it.selfLike:" + cgVar.o() + ", selfLike:" + z17 + ", msg:" + zfVar.j());
        }
        return true;
    }
}
