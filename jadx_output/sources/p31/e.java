package p31;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp31/e;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/msgsubscription/voice/PlayVoiceData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class e implements com.tencent.mm.ipcinvoker.j {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        n01.c.h(r0);
        n01.c.b(r0);
     */
    @Override // com.tencent.mm.ipcinvoker.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.Object r8, com.tencent.mm.ipcinvoker.r r9) {
        /*
            r7 = this;
            com.tencent.mm.msgsubscription.voice.PlayVoiceData r8 = (com.tencent.mm.msgsubscription.voice.PlayVoiceData) r8
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r8, r0)
            int r0 = r8.f71892f
            if (r0 != 0) goto L59
            p31.c r0 = p31.c.f351450a
            java.lang.String r1 = r8.f71891e
            long r2 = r8.f71890d
            java.lang.String r8 = "[play] id["
            java.lang.String r4 = "url"
            kotlin.jvm.internal.o.g(r1, r4)
            byte[] r4 = p31.c.f351453d
            monitor-enter(r4)
            java.lang.String r5 = "MicroMsg.MsgSubscriptionVoicePlayer"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L56
            r6.append(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = "]  url["
            r6.append(r8)     // Catch: java.lang.Throwable -> L56
            r6.append(r1)     // Catch: java.lang.Throwable -> L56
            r8 = 93
            r6.append(r8)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L56
            com.tencent.mars.xlog.Log.i(r5, r8)     // Catch: java.lang.Throwable -> L56
            java.util.LinkedHashMap r8 = p31.c.f351451b     // Catch: java.lang.Throwable -> L56
            boolean r5 = r8.isEmpty()     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L4d
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            r8.put(r5, r1)     // Catch: java.lang.Throwable -> L56
            r0.a(r1, r2)     // Catch: java.lang.Throwable -> L56
            goto L54
        L4d:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L56
            r8.put(r0, r1)     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r4)
            goto Lb1
        L56:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        L59:
            r1 = 1
            if (r0 != r1) goto Lb1
            p31.c r0 = p31.c.f351450a
            long r2 = r8.f71890d
            byte[] r8 = p31.c.f351453d
            monitor-enter(r8)
            java.util.LinkedHashMap r0 = p31.c.f351451b     // Catch: java.lang.Throwable -> Lae
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lae
            r0.remove(r4)     // Catch: java.lang.Throwable -> Lae
            java.util.Map r0 = p31.c.f351452c     // Catch: java.lang.Throwable -> Lae
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Lae
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Lae
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lae
        L78:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L99
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> Lae
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r5 = r4.getValue()     // Catch: java.lang.Throwable -> Lae
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> Lae
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> Lae
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 != 0) goto L78
            java.lang.Object r0 = r4.getKey()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lae
            goto L9a
        L99:
            r0 = 0
        L9a:
            if (r0 == 0) goto La4
            int r2 = r0.length()     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto La3
            goto La4
        La3:
            r1 = 0
        La4:
            if (r1 != 0) goto Lac
            n01.c.h(r0)     // Catch: java.lang.Throwable -> Lae
            n01.c.b(r0)     // Catch: java.lang.Throwable -> Lae
        Lac:
            monitor-exit(r8)
            goto Lb1
        Lae:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        Lb1:
            if (r9 == 0) goto Lbb
            com.tencent.mm.ipcinvoker.type.IPCVoid r8 = new com.tencent.mm.ipcinvoker.type.IPCVoid
            r8.<init>()
            r9.a(r8)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p31.e.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
