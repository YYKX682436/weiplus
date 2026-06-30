package p05;

@j95.b
/* loaded from: classes.dex */
public final class l2 extends i95.w implements lg0.o {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String Ai(int r12, int r13) {
        /*
            r11 = this;
            p05.k2 r0 = p05.k2.f350567a
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "prepare: subtype="
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.WaveVideoModelResMgr"
            com.tencent.mars.xlog.Log.i(r2, r1)
            java.lang.String r1 = r0.a(r12)
            int r3 = p05.k2.f350572f
            r4 = 0
            if (r3 != 0) goto L45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "getPathOccasionalCheckCount is initiated. subtype="
            r3.<init>(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r3)
            com.tencent.mm.sdk.event.IListener r3 = p05.k2.f350571e
            r3.alive()
            kotlinx.coroutines.y0 r5 = p05.k2.f350570d
            r6 = 0
            r7 = 0
            p05.j2 r8 = new p05.j2
            r8.<init>(r12, r4)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
        L45:
            int r3 = p05.k2.f350572f
            int r3 = r3 + 1
            int r3 = r3 % 10
            p05.k2.f350572f = r3
            if (r1 != 0) goto L50
            goto L81
        L50:
            boolean r3 = com.tencent.mm.vfs.w6.j(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "prepareModel subtype="
            r5.<init>(r6)
            r5.append(r12)
            java.lang.String r6 = " modelFile: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = " exist: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r2, r5)
            com.tencent.mm.plugin.xlabeffect.IWaveVideoModelResMgr r5 = p05.k2.f350569c
            if (r3 != 0) goto L83
            r5.setModelPathWithName(r12, r4)
            java.lang.String r1 = "md5invalid"
            r5.setResFileMd5(r12, r1)
        L81:
            r1 = r4
            goto L96
        L83:
            r5.setModelPathWithName(r12, r1)
            java.lang.String r3 = r0.b(r12)
            java.lang.String r6 = "md5 "
            java.lang.String r6 = r6.concat(r3)
            com.tencent.mars.xlog.Log.i(r2, r6)
            r5.setResFileMd5(r12, r3)
        L96:
            if (r1 == 0) goto L9d
            r0.c(r12, r13)
            r4 = r1
            goto La1
        L9d:
            r13 = -1
            r0.c(r12, r13)
        La1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.l2.Ai(int, int):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int wi(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "model"
            kotlin.jvm.internal.o.g(r2, r0)
            p05.k2 r0 = p05.k2.f350567a
            r0.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case -594911873: goto L4c;
                case -537906137: goto L40;
                case 108275705: goto L35;
                case 435568920: goto L2a;
                case 1366516253: goto L1e;
                case 1664089787: goto L12;
                default: goto L11;
            }
        L11:
            goto L58
        L12:
            java.lang.String r0 = "roi_c2c_face"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L58
        L1c:
            r2 = 7
            goto L59
        L1e:
            java.lang.String r0 = "roi_facetext"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L28
            goto L58
        L28:
            r2 = 1
            goto L59
        L2a:
            java.lang.String r0 = "finder_sr"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L33
            goto L58
        L33:
            r2 = 3
            goto L59
        L35:
            java.lang.String r0 = "raisr"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3e
            goto L58
        L3e:
            r2 = 6
            goto L59
        L40:
            java.lang.String r0 = "raisrlite"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L49
            goto L58
        L49:
            r2 = 8
            goto L59
        L4c:
            java.lang.String r0 = "roi_saliencymap"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L56
            goto L58
        L56:
            r2 = 2
            goto L59
        L58:
            r2 = 0
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.l2.wi(java.lang.String):int");
    }
}
