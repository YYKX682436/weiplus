package com.tencent.mm.roomsdk.model.factory;

/* loaded from: classes11.dex */
public class g implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.h f192265d;

    public g(com.tencent.mm.roomsdk.model.factory.h hVar) {
        this.f192265d = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r5, int r6, java.lang.String r7, com.tencent.mm.modelbase.m1 r8) {
        /*
            r4 = this;
            com.tencent.mm.roomsdk.model.factory.h r7 = r4.f192265d
            e21.k r0 = r7.f192266f
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L89
            gm0.j1.i()
            gm0.y r0 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r0 = r0.f273288b
            int r1 = r8.getType()
            com.tencent.mm.modelbase.u0 r2 = r7.f192267g
            r0.q(r1, r2)
            com.tencent.mm.ui.widget.dialog.u3 r0 = r7.f192249e
            if (r0 == 0) goto L23
            r0.dismiss()
        L23:
            o65.b r0 = r7.f192248d
            if (r0 == 0) goto L89
            e21.j r8 = (e21.j) r8
            e21.g r8 = r8.f246537e
            e21.i r8 = r8.f246521b
            r45.i25 r8 = r8.f246528a
            java.lang.String r0 = ""
            r1 = 0
            if (r5 != 0) goto L75
            if (r6 != 0) goto L75
            r45.j25 r5 = r8.f376688e     // Catch: java.lang.Exception -> L63
            java.util.LinkedList r5 = r5.f377518e     // Catch: java.lang.Exception -> L63
            java.lang.Object r5 = r5.getLast()     // Catch: java.lang.Exception -> L63
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L63
            int r6 = r5.intValue()     // Catch: java.lang.Exception -> L63
            r45.j25 r5 = r8.f376688e     // Catch: java.lang.Exception -> L63
            java.util.LinkedList r5 = r5.f377519f     // Catch: java.lang.Exception -> L63
            java.lang.Object r5 = r5.getLast()     // Catch: java.lang.Exception -> L63
            r45.g25 r5 = (r45.g25) r5     // Catch: java.lang.Exception -> L63
            if (r5 == 0) goto L75
            java.lang.String r8 = r5.f374841d     // Catch: java.lang.Exception -> L63
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r8)     // Catch: java.lang.Exception -> L63
            if (r8 != 0) goto L75
            java.lang.String r8 = r5.f374841d     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = r5.f374842e     // Catch: java.lang.Exception -> L61
            if (r5 != 0) goto L5f
            r5 = r0
        L5f:
            r1 = r5
            goto L76
        L61:
            r5 = move-exception
            goto L65
        L63:
            r5 = move-exception
            r8 = r1
        L65:
            java.lang.String r5 = r5.getMessage()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r2 = "MicroMsg.RoomCallbackFactory"
            java.lang.String r3 = "NetSceneSyncOplog %s"
            com.tencent.mars.xlog.Log.e(r2, r3, r5)
            goto L76
        L75:
            r8 = r1
        L76:
            o65.b r5 = r7.f192248d
            boolean r7 = r5 instanceof o65.f
            if (r7 == 0) goto L85
            r7 = r5
            o65.f r7 = (o65.f) r7
            r7.f343223a = r6
            r7.f343224b = r1
            r7.f343225c = r8
        L85:
            r7 = 0
            r5.a(r7, r6, r0, r5)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.roomsdk.model.factory.g.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
