package ei4;

/* loaded from: classes9.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f253228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.s f253229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l75.w0 w0Var, ei4.s sVar) {
        super(0);
        this.f253228d = w0Var;
        this.f253229e = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r3 < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r3 >= r0.size()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r0.remove(r3);
        r4.notifyItemRemoved(r3);
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r11 = this;
            l75.w0 r0 = r11.f253228d
            java.lang.Object r1 = r0.f316976d
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.data.TextStatusGreetingItem"
            kotlin.jvm.internal.o.e(r1, r2)
            hi4.e r1 = (hi4.e) r1
            int r0 = r0.f316974b
            r2 = 2
            r3 = 0
            ei4.s r4 = r11.f253229e
            if (r0 == r2) goto L53
            r2 = 5
            if (r0 == r2) goto L18
            goto L5b
        L18:
            java.util.LinkedList r0 = r4.f253239e
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.o.g(r0, r2)
            java.util.Iterator r2 = r0.iterator()
        L23:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r2.next()
            int r6 = r3 + 1
            if (r3 < 0) goto L3e
            hi4.e r5 = (hi4.e) r5
            long r7 = r5.field_newMsgId
            long r9 = r1.field_newMsgId
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L44
        L3c:
            r3 = r6
            goto L23
        L3e:
            kz5.c0.p()
            r0 = 0
            throw r0
        L43:
            r3 = -1
        L44:
            if (r3 < 0) goto L5b
            int r1 = r0.size()
            if (r3 >= r1) goto L5b
            r0.remove(r3)
            r4.notifyItemRemoved(r3)
            goto L5b
        L53:
            java.util.LinkedList r0 = r4.f253239e
            r0.add(r3, r1)
            r4.notifyItemInserted(r3)
        L5b:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ei4.m.invoke():java.lang.Object");
    }
}
