package jf4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final jf4.a f299432a = new jf4.a();

    public final void a(java.lang.String taskId) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryMixManager", "run cleanNullData data");
        ((pc0.m2) ((qc0.j1) i95.n0.c(qc0.j1.class))).getClass();
        lt3.n nVar = lt3.n.f321260a;
        lt3.h hVar = lt3.n.f321261b;
        hVar.getClass();
        java.lang.String str = lt3.h.f321242f;
        hVar.f321243d.delete(str, "taskId=?", new java.lang.String[]{taskId});
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "taskId"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "MicroMsg.StoryMixManager"
            java.lang.String r1 = "run cleanUnAvailableData data"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.Class<qc0.j1> r0 = qc0.j1.class
            i95.m r0 = i95.n0.c(r0)
            qc0.j1 r0 = (qc0.j1) r0
            pc0.m2 r0 = (pc0.m2) r0
            r0.getClass()
            lt3.h r0 = lt3.n.f321261b
            lt3.g r6 = r0.y0(r6)
            r45.hi0 r0 = new r45.hi0
            r0.<init>()
            r1 = 0
            if (r6 == 0) goto L2c
            byte[] r6 = r6.field_baseItemData
            goto L2d
        L2c:
            r6 = r1
        L2d:
            if (r6 != 0) goto L30
            goto L41
        L30:
            r0.parseFrom(r6)     // Catch: java.lang.Exception -> L34
            goto L42
        L34:
            r6 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r0 = "safeParser"
            java.lang.String r2 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r0, r2, r6)
        L41:
            r0 = r1
        L42:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "cleanUnAvailableData, videoPath "
            r6.<init>(r2)
            r6.append(r0)
            java.lang.String r2 = "?.videoPath"
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "MicroMsg.mix_background.VideoEditStorageUtil"
            com.tencent.mm.sdk.platformtools.Log.c(r4, r6, r3)
            if (r0 == 0) goto L65
            boolean r6 = r0.f376198y
            r3 = 1
            if (r6 != r3) goto L65
            r2 = r3
        L65:
            if (r2 == 0) goto L6c
            java.lang.String r6 = r0.f376180d
            com.tencent.mm.vfs.w6.h(r6)
        L6c:
            if (r0 == 0) goto L71
            java.lang.String r6 = r0.f376183g
            goto L72
        L71:
            r6 = r1
        L72:
            com.tencent.mm.vfs.w6.h(r6)
            if (r0 == 0) goto L7a
            java.lang.String r6 = r0.f376186m
            goto L7b
        L7a:
            r6 = r1
        L7b:
            com.tencent.mm.vfs.w6.h(r6)
            if (r0 == 0) goto L82
            java.lang.String r1 = r0.f376185i
        L82:
            com.tencent.mm.vfs.w6.h(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jf4.a.b(java.lang.String):void");
    }
}
