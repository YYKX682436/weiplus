package kq4;

/* loaded from: classes.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r11) {
        /*
            r10 = this;
            com.tencent.mm.autogen.events.PostSyncTaskEvent r11 = (com.tencent.mm.autogen.events.PostSyncTaskEvent) r11
            boolean r11 = com.tencent.mm.plugin.voip.model.f0.a()
            r0 = 0
            if (r11 == 0) goto Ldc
            boolean r11 = gm0.j1.a()
            if (r11 == 0) goto L1a
            gm0.j1.b()
            boolean r11 = gm0.m.r()
            if (r11 != 0) goto L1a
            r11 = 1
            goto L1b
        L1a:
            r11 = r0
        L1b:
            if (r11 == 0) goto Lc6
            boolean r11 = com.tencent.mm.plugin.voip.model.f0.a()
            if (r11 == 0) goto Lc6
            gm0.b0 r11 = gm0.j1.u()
            com.tencent.mm.storage.n3 r11 = r11.c()
            r1 = 77829(0x13005, float:1.09062E-40)
            r2 = 0
            java.lang.Object r11 = r11.l(r1, r2)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto Lc6
            java.util.Map r11 = com.tencent.mm.plugin.voip.model.e0.b(r11)
            if (r11 == 0) goto Lc6
            int r3 = r11.size()
            if (r3 <= 0) goto Lc6
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L9d
            java.lang.Object r4 = r11.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            com.tencent.mm.plugin.voip.model.e0 r5 = (com.tencent.mm.plugin.voip.model.e0) r5
            if (r5 == 0) goto L50
            int r6 = r5.f176464a
            int r5 = r5.f176465b
            if (r6 > 0) goto L6c
            if (r5 <= 0) goto L96
        L6c:
            e21.p r7 = new e21.p
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.Object r9 = r4.getKey()
            java.lang.String r9 = (java.lang.String) r9
            r8.append(r9)
            java.lang.String r9 = ","
            r8.append(r9)
            r8.append(r6)
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r6 = 10166(0x27b6, float:1.4246E-41)
            r7.<init>(r6, r5)
            r3.add(r7)
        L96:
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            goto L50
        L9d:
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto Lc6
            java.lang.Class<vg3.x3> r11 = vg3.x3.class
            lm0.a r11 = gm0.j1.s(r11)
            vg3.x3 r11 = (vg3.x3) r11
            com.tencent.mm.plugin.messenger.foundation.h2 r11 = (com.tencent.mm.plugin.messenger.foundation.h2) r11
            xg3.o0 r11 = r11.fj()
            e21.q r4 = new e21.q
            r4.<init>(r3)
            e21.z0 r11 = (e21.z0) r11
            r11.c(r4)
            gm0.b0 r11 = gm0.j1.u()
            com.tencent.mm.storage.n3 r11 = r11.c()
            r11.w(r1, r2)
        Lc6:
            gm0.b0 r11 = gm0.j1.u()
            com.tencent.mm.storage.n3 r11 = r11.c()
            long r1 = com.tencent.mm.sdk.platformtools.t8.i1()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 77828(0x13004, float:1.0906E-40)
            r11.w(r2, r1)
        Ldc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kq4.e.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
