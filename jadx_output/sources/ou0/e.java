package ou0;

/* loaded from: classes5.dex */
public abstract class e {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r3 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.tencent.maas.model.MJMusicInfo a(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r21, boolean r22) {
        /*
            r0 = r21
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.o.g(r0, r1)
            long r1 = r21.c()
            com.tencent.maas.model.time.MJTime r9 = com.tencent.maas.model.time.MJTime.fromMilliseconds(r1)
            long r1 = r21.b()
            java.util.ArrayList r3 = r0.f155713g
            r4 = 0
            if (r3 == 0) goto L6c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r3.size()
            r7 = r4
        L22:
            if (r7 >= r6) goto L62
            java.lang.Object r8 = r3.get(r7)
            wt3.h r8 = (wt3.h) r8
            int r8 = r8.f449422b
            long r10 = (long) r8
            com.tencent.maas.model.time.MJTime r8 = com.tencent.maas.model.time.MJTime.fromMilliseconds(r10)
            int r10 = r7 + 1
            int r11 = r3.size()
            if (r10 >= r11) goto L47
            java.lang.Object r11 = r3.get(r10)
            wt3.h r11 = (wt3.h) r11
            int r11 = r11.f449422b
            long r11 = (long) r11
            com.tencent.maas.model.time.MJTime r11 = com.tencent.maas.model.time.MJTime.fromMilliseconds(r11)
            goto L4e
        L47:
            int r11 = r0.f155720q
            long r11 = (long) r11
            com.tencent.maas.model.time.MJTime r11 = com.tencent.maas.model.time.MJTime.fromMilliseconds(r11)
        L4e:
            com.tencent.maas.model.MJLyricInfo r12 = new com.tencent.maas.model.MJLyricInfo
            java.lang.Object r7 = r3.get(r7)
            wt3.h r7 = (wt3.h) r7
            java.lang.String r7 = r7.f449421a
            java.lang.String r13 = ""
            r12.<init>(r8, r11, r7, r13)
            r5.add(r12)
            r7 = r10
            goto L22
        L62:
            com.tencent.maas.model.MJLyricInfo[] r3 = new com.tencent.maas.model.MJLyricInfo[r4]
            java.lang.Object[] r3 = r5.toArray(r3)
            com.tencent.maas.model.MJLyricInfo[] r3 = (com.tencent.maas.model.MJLyricInfo[]) r3
            if (r3 != 0) goto L6e
        L6c:
            com.tencent.maas.model.MJLyricInfo[] r3 = new com.tencent.maas.model.MJLyricInfo[r4]
        L6e:
            r10 = r3
            if (r22 == 0) goto L74
            java.lang.String r3 = r0.C
            goto L7a
        L74:
            int r3 = r0.f155711e
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L7a:
            r4 = r3
            com.tencent.maas.model.MJMusicInfo r11 = new com.tencent.maas.model.MJMusicInfo
            java.lang.String r5 = r0.f155723t
            java.util.ArrayList r12 = r0.f155714h
            java.lang.String r13 = ", "
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 62
            r20 = 0
            java.lang.String r6 = kz5.n0.g0(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r7 = r0.f155725v
            com.tencent.maas.model.time.MJTime r8 = com.tencent.maas.model.time.MJTime.fromMilliseconds(r1)
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ou0.e.a(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, boolean):com.tencent.maas.model.MJMusicInfo");
    }
}
