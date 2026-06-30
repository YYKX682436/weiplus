package gt;

/* loaded from: classes7.dex */
public class c6 extends com.tencent.mm.sdk.event.n {
    public c6() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (r0.f305625d.p(r0.getTableName(), r4, java.lang.String.format("%s=?", dm.i4.COL_USERNAME), new java.lang.String[]{r3}) > 0) goto L26;
     */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r11) {
        /*
            r10 = this;
            com.tencent.mm.autogen.events.UpdateWxaOptionsEvent r11 = (com.tencent.mm.autogen.events.UpdateWxaOptionsEvent) r11
            boolean r0 = gm0.j1.a()
            r1 = 0
            if (r0 != 0) goto Lb
            goto L9a
        Lb:
            am.g00 r0 = r11.f54927g
            java.lang.String r0 = r0.f6724a
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L17
            goto L9a
        L17:
            k91.k4 r0 = k91.k4.g()
            am.g00 r2 = r11.f54927g
            java.lang.String r3 = r2.f6724a
            int r4 = r2.f6726c
            int r2 = r2.f6725b
            r5 = 1
            if (r2 != r5) goto L28
            r2 = r5
            goto L29
        L28:
            r2 = r1
        L29:
            r0.getClass()
            k91.m4 r0 = com.tencent.mm.plugin.appbrand.app.r9.ij()
            r0.getClass()
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            java.lang.String r7 = "appOpt"
            if (r6 == 0) goto L3c
            goto L7a
        L3c:
            java.lang.String[] r6 = new java.lang.String[]{r7}
            k91.v5 r6 = r0.n1(r3, r6)
            if (r6 != 0) goto L47
            goto L7a
        L47:
            int r6 = r6.field_appOpt
            if (r2 != 0) goto L4e
            int r2 = ~r4
            r2 = r2 & r6
            goto L50
        L4e:
            r2 = r4 | r6
        L50:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r7, r2)
            java.lang.String r2 = r0.getTableName()
            java.lang.String r6 = "username"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r8 = "%s=?"
            java.lang.String r6 = java.lang.String.format(r8, r6)
            java.lang.String[] r8 = new java.lang.String[]{r3}
            l75.k0 r9 = r0.f305625d
            int r2 = r9.p(r2, r4, r6, r8)
            if (r2 <= 0) goto L7a
            goto L7b
        L7a:
            r5 = r1
        L7b:
            if (r5 == 0) goto L95
            java.lang.String[] r2 = new java.lang.String[]{r7}
            k91.v5 r0 = r0.n1(r3, r2)
            com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent r2 = new com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent
            r2.<init>()
            am.gn r4 = r2.f54587g
            r4.f6783a = r3
            int r0 = r0.field_appOpt
            r4.f6784b = r0
            r2.e()
        L95:
            am.h00 r11 = r11.f54928h
            r11.getClass()
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gt.c6.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
