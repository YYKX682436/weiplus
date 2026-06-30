package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = com.tencent.mm.ui.chatting.component.gg.class)
/* loaded from: classes9.dex */
public final class y7 extends com.tencent.mm.ui.chatting.component.a implements com.tencent.mm.ui.chatting.component.gg {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f200285e = new java.util.LinkedHashMap();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        java.lang.String d17 = this.f198580d.u().d1();
        if ((d17 == null || d17.length() == 0) || com.tencent.mm.storage.z3.R4(d17) || ai4.m0.f5173a.M(d17) == null) {
            return;
        }
        kotlin.jvm.internal.o.d(d17);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).mj("single_status_icon", "view_exp", new xe0.n0(d17, d17, d17, d17));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.x7(this, valueOf));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        r0 = r6.f394254d.f445300b;
     */
    @Override // yn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Y(androidx.recyclerview.widget.RecyclerView r5, in5.w0 r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L91
            java.util.LinkedList r5 = r6.f293156i
            if (r5 != 0) goto L8
            goto L91
        L8:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Lf
            return
        Lf:
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L91
            java.lang.Object r6 = r5.next()
            in5.x0 r6 = (in5.x0) r6
            in5.c r6 = r6.f293158a
            boolean r0 = r6 instanceof rd5.d
            if (r0 == 0) goto L28
            rd5.d r6 = (rd5.d) r6
            goto L29
        L28:
            r6 = 0
        L29:
            if (r6 == 0) goto L7f
            we5.a r0 = r6.f394254d
            com.tencent.mm.storage.f9 r0 = r0.f445300b
            java.lang.String r0 = r0.Q0()
            boolean r0 = com.tencent.mm.storage.z3.R4(r0)
            if (r0 == 0) goto L7f
            we5.a r0 = r6.f394254d
            com.tencent.mm.storage.f9 r0 = r0.f445300b
            long r0 = r0.getMsgId()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L7f
            we5.a r0 = r6.f394254d
            com.tencent.mm.storage.f9 r0 = r0.f445300b
            java.lang.String r0 = r0.V1()
            java.lang.String r1 = en1.a.a()
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            if (r0 != 0) goto L7f
            ai4.m0 r0 = ai4.m0.f5173a
            we5.a r1 = r6.f394254d
            com.tencent.mm.storage.f9 r1 = r1.f445300b
            java.lang.String r1 = r1.V1()
            mj4.h r0 = r0.M(r1)
            if (r0 == 0) goto L7f
            java.util.Map r0 = r4.f200285e
            we5.a r1 = r6.f394254d
            com.tencent.mm.storage.f9 r1 = r1.f445300b
            long r1 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            we5.a r6 = r6.f394254d
            com.tencent.mm.storage.f9 r6 = r6.f445300b
            r0.put(r1, r6)
            goto L13
        L7f:
            if (r6 == 0) goto L85
            we5.a r0 = r6.f394254d
            com.tencent.mm.storage.f9 r0 = r0.f445300b
        L85:
            if (r6 == 0) goto L13
            we5.a r6 = r6.f394254d
            com.tencent.mm.storage.f9 r6 = r6.f445300b
            if (r6 == 0) goto L13
            r6.V1()
            goto L13
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.y7.Y(androidx.recyclerview.widget.RecyclerView, in5.w0):void");
    }
}
