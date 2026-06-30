package ze5;

/* loaded from: classes9.dex */
public abstract class i7 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472002s;

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (item.getItemId() != 111) {
            return false;
        }
        ze5.a7 a7Var = new ze5.a7(ui6, f9Var);
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.manager.t.a(f9Var, g17, a7Var);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r18, android.view.View r19, rd5.d r20) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.i7.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f472002s = ui6;
        l15.c cVar = new l15.c();
        java.lang.String U1 = msg.U1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        te5.t.a(str, ui6, msg, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x013a, code lost:
    
        if ((r14 != null && r14.getInteger(r14.f368365d + 6) == 68) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0140, code lost:
    
        if (com.tencent.mm.ui.chatting.viewitems.sg.b(r14) == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    @Override // ze5.w8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q31.p i0(yb5.d r19, rd5.d r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.i7.i0(yb5.d, rd5.d, java.lang.String):q31.p");
    }
}
