package f00;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f00.o f258315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCBoolean f258316e;

    public k(f00.o oVar, com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean) {
        this.f258315d = oVar;
        this.f258316e = iPCBoolean;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1.f68400d == true) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            f00.o r0 = r11.f258315d
            android.view.View r0 = r0.f258320a
            if (r0 != 0) goto L7
            goto L5b
        L7:
            r9 = 0
            com.tencent.mm.ipcinvoker.type.IPCBoolean r1 = r11.f258316e
            if (r1 == 0) goto L12
            boolean r1 = r1.f68400d
            r2 = 1
            if (r1 != r2) goto L12
            goto L13
        L12:
            r2 = r9
        L13:
            if (r2 == 0) goto L17
            r1 = r9
            goto L19
        L17:
            r1 = 8
        L19:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r2 = r10.toArray()
            java.lang.String r3 = "com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget$createWidget$1$1"
            java.lang.String r4 = "run"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r10.get(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget$createWidget$1$1"
            java.lang.String r3 = "run"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f00.k.run():void");
    }
}
