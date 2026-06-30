package se2;

/* loaded from: classes3.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ se2.a0 f406908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406909e;

    public z(se2.a0 a0Var, int i17) {
        this.f406908d = a0Var;
        this.f406909e = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            se2.a0 r1 = r0.f406908d
            java.lang.Class<mm2.e0> r2 = mm2.e0.class
            androidx.lifecycle.c1 r3 = r1.b(r2)
            mm2.e0 r3 = (mm2.e0) r3
            long r3 = r3.f328974q
            r1.f406833b = r3
            boolean r3 = r1.g()
            com.tencent.mm.plugin.finder.live.plugin.tb r4 = r1.f406832a
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L29
            boolean r3 = r4.f114370r
            if (r3 == 0) goto L23
            r4.A1(r6)
            r3 = r5
            goto L24
        L23:
            r3 = r6
        L24:
            if (r3 == 0) goto L27
            goto L29
        L27:
            r3 = r6
            goto L2a
        L29:
            r3 = r5
        L2a:
            androidx.lifecycle.c1 r7 = r1.b(r2)
            mm2.e0 r7 = (mm2.e0) r7
            int r7 = r7.f328972o
            int r8 = r0.f406909e
            long r9 = (long) r8
            long r11 = r1.f406833b
            long r9 = r9 - r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "[updateMessagesOnViewAttach] listSize:"
            r11.<init>(r12)
            r11.append(r8)
            java.lang.String r12 = " readCount:"
            r11.append(r12)
            long r12 = r1.f406833b
            r11.append(r12)
            java.lang.String r12 = ", reachLastVisibleComment:"
            r11.append(r12)
            androidx.lifecycle.c1 r2 = r1.b(r2)
            mm2.e0 r2 = (mm2.e0) r2
            boolean r2 = r2.f328973p
            r11.append(r2)
            java.lang.String r2 = ",unreadCount"
            r11.append(r2)
            r11.append(r9)
            java.lang.String r2 = ",reachLast:"
            r11.append(r2)
            r11.append(r3)
            java.lang.String r2 = ", last position:"
            r11.append(r2)
            r11.append(r7)
            java.lang.String r2 = r11.toString()
            java.lang.String r11 = "BoxCommentListPresenter"
            com.tencent.mars.xlog.Log.i(r11, r2)
            if (r3 == 0) goto L8c
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r4.t1()
            se2.y r3 = new se2.y
            r3.<init>(r1)
            r2.post(r3)
            goto Le5
        L8c:
            if (r7 >= 0) goto L8f
            r7 = r6
        L8f:
            int r8 = r8 - r5
            if (r7 <= r8) goto L93
            r7 = r8
        L93:
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r4.t1()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r12 = r2.toArray()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter$recoveryCommentStatus$1"
            java.lang.String r14 = "run"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "scrollToPosition"
            java.lang.String r18 = "(I)V"
            r11 = r1
            yj0.a.d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.a1(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter$recoveryCommentStatus$1"
            java.lang.String r13 = "run"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "scrollToPosition"
            java.lang.String r17 = "(I)V"
            yj0.a.f(r11, r12, r13, r14, r15, r16, r17)
            jz5.g r1 = r4.f114378z
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            se2.e0 r1 = (se2.e0) r1
            r1.b(r9)
        Le5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: se2.z.run():void");
    }
}
