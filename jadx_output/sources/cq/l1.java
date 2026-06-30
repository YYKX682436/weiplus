package cq;

/* loaded from: classes2.dex */
public abstract class l1 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r45.tb4 a(cq.k r7, int r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r7, r0)
            dq.b r7 = r7.f221226g
            r7.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "kFinderExitFeedInfoKey"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r45.tb4 r1 = new r45.tb4
            r1.<init>()
            r2 = 0
            com.tencent.mm.sdk.platformtools.o4 r7 = r7.f242284a
            if (r7 == 0) goto L27
            byte[] r7 = r7.j(r0)
            goto L28
        L27:
            r7 = r2
        L28:
            if (r7 != 0) goto L2b
            goto L3c
        L2b:
            r1.parseFrom(r7)     // Catch: java.lang.Exception -> L2f
            goto L3d
        L2f:
            r7 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r0 = "safeParser"
            java.lang.String r1 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r0, r1, r7)
        L3c:
            r1 = r2
        L3d:
            r7 = 1
            if (r1 == 0) goto L4e
            long r3 = r1.getLong(r7)
            int r0 = c01.id.e()
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L4e
            goto L4f
        L4e:
            r1 = r2
        L4f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "getExitFeedInfoWithCommentScene:"
            r0.<init>(r3)
            r0.append(r8)
            java.lang.String r8 = ", tid:"
            r0.append(r8)
            if (r1 == 0) goto L66
            r8 = 0
            java.lang.String r8 = r1.getString(r8)
            goto L67
        L66:
            r8 = r2
        L67:
            r0.append(r8)
            java.lang.String r8 = ", expiredTime:"
            r0.append(r8)
            if (r1 == 0) goto L79
            long r7 = r1.getLong(r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
        L79:
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "Finder.FinderMMKVManager"
            com.tencent.mars.xlog.Log.i(r8, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cq.l1.a(cq.k, int):r45.tb4");
    }

    public static final boolean b(cq.k kVar) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        com.tencent.mm.sdk.platformtools.o4 o4Var = kVar.f221226g.f242285b;
        if (o4Var != null) {
            return o4Var.i("KEY_FINDER_SAVE_EDITED_MEDIA_SWITCH", true);
        }
        return true;
    }
}
