package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class p2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f186421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186423f;

    public p2(java.util.Map map, java.lang.String str, java.lang.String str2, nw4.k kVar, nw4.y2 y2Var) {
        this.f186421d = map;
        this.f186422e = kVar;
        this.f186423f = y2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.tencent.mm.ipcinvoker.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r6) {
        /*
            r5 = this;
            android.os.Bundle r6 = (android.os.Bundle) r6
            r45.fs3 r0 = new r45.fs3
            r0.<init>()
            r1 = 0
            if (r6 == 0) goto L12
            java.lang.String r2 = "responseKey"
            byte[] r6 = r6.getByteArray(r2)
            goto L13
        L12:
            r6 = r1
        L13:
            if (r6 != 0) goto L16
            goto L27
        L16:
            r0.parseFrom(r6)     // Catch: java.lang.Exception -> L1a
            goto L28
        L1a:
            r6 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r0 = "safeParser"
            java.lang.String r2 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r0, r2, r6)
        L27:
            r0 = r1
        L28:
            nw4.k r6 = r5.f186422e
            nw4.y2 r2 = r5.f186423f
            if (r0 == 0) goto L61
            long r3 = r0.f374585d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "balance"
            java.util.Map r4 = r5.f186421d
            r4.put(r3, r1)
            boolean r0 = r0.f374586e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "newUserDiscount"
            r4.put(r1, r0)
            nw4.g r6 = r6.f340863d
            java.lang.String r0 = r2.f341013c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.f341019i
            r1.append(r2)
            java.lang.String r2 = ":ok"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.e(r0, r1, r4)
            goto L7b
        L61:
            nw4.g r6 = r6.f340863d
            java.lang.String r0 = r2.f341013c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.f341019i
            r3.append(r2)
            java.lang.String r2 = ":fail"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r6.e(r0, r2, r1)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.p2.a(java.lang.Object):void");
    }
}
