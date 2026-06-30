package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class e0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.AddFavoriteUI f210368a;

    public e0(com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI) {
        this.f210368a = addFavoriteUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (com.tencent.mm.sdk.platformtools.y1.f(r0) == false) goto L24;
     */
    @Override // com.tencent.mm.sdk.platformtools.n3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            int r5 = com.tencent.mm.ui.tools.AddFavoriteUI.f209975p
            com.tencent.mm.ui.tools.AddFavoriteUI r5 = r4.f210368a
            r5.X6()
            java.lang.String r0 = r5.f209979g
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            java.lang.String r1 = "MicroMsg.AddFavoriteUI"
            if (r0 != 0) goto Laa
            java.lang.String r0 = r5.f209979g
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.H0(r0)
            if (r0 == 0) goto L26
            java.lang.String r0 = r5.f209979g
            r5.getClass()
            boolean r0 = com.tencent.mm.sdk.platformtools.y1.f(r0)
            if (r0 != 0) goto L26
            goto Laa
        L26:
            java.lang.String r0 = r5.f209979g
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "filepath:[%s]"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.resolveType(r5)
            int r0 = r5.Y6(r0)
            r2 = -1
            if (r0 != r2) goto L49
            java.lang.String r0 = "launch, msgType is invalid"
            com.tencent.mars.xlog.Log.e(r1, r0)
            r5.finish()
            goto La9
        L49:
            java.lang.String r2 = r5.f209979g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "filepath:[%s] dealWithSimpleItem msgType is %d"
            com.tencent.mars.xlog.Log.i(r1, r3, r2)
            java.lang.String r1 = r5.f209979g
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto L68
            java.lang.String r1 = r5.f209979g
            r2 = 0
            r3 = 1
            r5.W6(r0, r1, r2, r3)
            goto La9
        L68:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "Intro_Switch"
            r2 = 0
            boolean r0 = com.tencent.mm.sdk.platformtools.c2.c(r0, r1, r2)
            if (r0 != 0) goto La3
            boolean r0 = c01.d9.h()
            if (r0 == 0) goto La3
            boolean r0 = gm0.m.r()
            if (r0 != 0) goto La3
            com.tencent.mm.autogen.events.DoFavoriteEvent r0 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r0.<init>()
            r1 = 13
            java.lang.String r2 = r5.f209979g
            com.tencent.mm.pluginsdk.model.a2.g(r0, r1, r2)
            am.c4 r1 = r0.f54090g
            r1.f6323i = r5
            com.tencent.mm.ui.tools.h0 r2 = new com.tencent.mm.ui.tools.h0
            r2.<init>(r5)
            r1.f6329o = r2
            com.tencent.mm.ui.tools.t r2 = new com.tencent.mm.ui.tools.t
            r2.<init>(r5)
            r1.f6330p = r2
            r0.e()
            goto La9
        La3:
            r5.finish()
            r5.a7()
        La9:
            return
        Laa:
            java.lang.String r0 = "launch : fail, filePath is null or file is not a valid img."
            com.tencent.mars.xlog.Log.e(r1, r0)
            r5.U6()
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.e0.handleMessage(android.os.Message):void");
    }
}
