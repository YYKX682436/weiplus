package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public final class e5 extends com.tencent.mm.ui.contact.o4 implements o13.x {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f206682m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f206683n;

    /* renamed from: o, reason: collision with root package name */
    public p13.c f206684o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f206685p;

    /* renamed from: q, reason: collision with root package name */
    public p13.r f206686q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f206687r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.tencent.mm.ui.contact.l4 ui6, java.lang.String chatroom, int i17, boolean z17, java.util.HashSet blockSet) {
        super(ui6, z17, i17);
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(chatroom, "chatroom");
        kotlin.jvm.internal.o.g(blockSet, "blockSet");
        this.f206682m = chatroom;
        this.f206683n = blockSet;
        this.f206687r = jz5.h.b(com.tencent.mm.ui.contact.c5.f206641d);
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        if (vVar != null) {
            if ((kotlin.jvm.internal.o.b(vVar.f351157b, this.f206684o) ? vVar : null) != null) {
                int i17 = vVar.f351158c;
                if (i17 == -3 || i17 == -2 || i17 == -1) {
                    this.f206685p = null;
                    this.f206686q = null;
                    h();
                    com.tencent.mm.ui.contact.n4 n4Var = this.f207051i;
                    if (n4Var != null) {
                        n4Var.d4(vVar.f351159d.f351129a, getCount(), true);
                    }
                    notifyDataSetChanged();
                    return;
                }
                if (i17 != 0) {
                    return;
                }
                java.util.List resultList = vVar.f351160e;
                kotlin.jvm.internal.o.f(resultList, "resultList");
                p13.y yVar = (p13.y) kz5.n0.a0(resultList, 0);
                if (yVar != null) {
                    yVar.f351203u = vVar.f351159d;
                } else {
                    yVar = null;
                }
                this.f206685p = yVar != null ? yVar.f351196n : null;
                this.f206686q = yVar != null ? yVar.f351203u : null;
                h();
                com.tencent.mm.ui.contact.n4 n4Var2 = this.f207051i;
                if (n4Var2 != null) {
                    n4Var2.d4(vVar.f351159d.f351129a, getCount(), true);
                }
                notifyDataSetChanged();
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f206685p;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        p13.l lVar;
        com.tencent.mm.ui.contact.item.m mVar = new com.tencent.mm.ui.contact.item.m(i17, this.f207078f);
        java.util.List list = this.f206685p;
        if (list != null && (lVar = (p13.l) kz5.n0.a0(list, i17)) != null) {
            mVar.F = lVar;
            mVar.f206849r = this.f206682m;
            mVar.A = this.f206686q;
        }
        return mVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        p13.c cVar = this.f206684o;
        if (cVar != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            this.f206684o = null;
        }
        this.f206685p = null;
        this.f206686q = null;
        h();
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void r() {
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        w(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Class<o13.z> r0 = o13.z.class
            r1 = 1
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L54
            java.lang.CharSequence r4 = r26.n0.u0(r7)
            java.lang.String r4 = r4.toString()
            int r4 = r4.length()
            if (r4 <= 0) goto L17
            r4 = r1
            goto L18
        L17:
            r4 = r2
        L18:
            if (r4 == 0) goto L1b
            goto L1c
        L1b:
            r7 = r3
        L1c:
            if (r7 == 0) goto L54
            p13.u r4 = new p13.u
            r4.<init>()
            java.lang.String r5 = r6.f206682m
            r4.f351142d = r5
            r4.f351141c = r7
            r7 = 12
            r4.f351140b = r7
            jz5.g r7 = r6.f206687r
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            com.tencent.mm.sdk.platformtools.n3 r7 = (com.tencent.mm.sdk.platformtools.n3) r7
            r4.f351152n = r7
            r4.f351151m = r6
            java.util.HashSet r7 = r4.f351148j
            java.util.HashSet r5 = r6.f206683n
            r7.addAll(r5)
            i95.m r7 = i95.n0.c(r0)
            o13.z r7 = (o13.z) r7
            r5 = 2
            com.tencent.mm.plugin.fts.d0 r7 = (com.tencent.mm.plugin.fts.d0) r7
            p13.c r7 = r7.sj(r5, r4)
            r6.f206684o = r7
            jz5.f0 r7 = jz5.f0.f302826a
            goto L55
        L54:
            r7 = r3
        L55:
            if (r7 != 0) goto L79
            p13.c r7 = r6.f206684o
            if (r7 == 0) goto L68
            i95.m r0 = i95.n0.c(r0)
            o13.z r0 = (o13.z) r0
            com.tencent.mm.plugin.fts.d0 r0 = (com.tencent.mm.plugin.fts.d0) r0
            r0.Ni(r7)
            r6.f206684o = r3
        L68:
            com.tencent.mm.ui.contact.n4 r7 = r6.f207051i
            if (r7 == 0) goto L71
            java.lang.String r0 = ""
            r7.d4(r0, r2, r1)
        L71:
            com.tencent.mm.ui.contact.d5 r7 = new com.tencent.mm.ui.contact.d5
            r7.<init>(r6)
            pm0.v.X(r7)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.e5.w(java.lang.String):void");
    }
}
