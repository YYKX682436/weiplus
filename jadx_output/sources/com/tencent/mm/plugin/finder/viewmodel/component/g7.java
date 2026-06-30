package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.o7 f134471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f134472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.tencent.mm.plugin.finder.viewmodel.component.o7 o7Var, long j17) {
        super(1);
        this.f134471d = o7Var;
        this.f134472e = j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[LOOP:0: B:10:0x001c->B:22:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[EDGE_INSN: B:23:0x0052->B:24:0x0052 BREAK  A[LOOP:0: B:10:0x001c->B:22:0x004e], SYNTHETIC] */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            com.tencent.mm.modelbase.f r11 = (com.tencent.mm.modelbase.f) r11
            r0 = 1
            r1 = 0
            if (r11 == 0) goto Lc
            int r2 = r11.f70615a
            if (r2 != 0) goto Lc
            r2 = r0
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 == 0) goto L90
            int r11 = r11.f70616b
            if (r11 != 0) goto L90
            com.tencent.mm.plugin.finder.viewmodel.component.o7 r11 = r10.f134471d
            java.util.ArrayList r2 = r11.f135431g
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L1c:
            boolean r4 = r2.hasNext()
            r5 = -1
            long r6 = r10.f134472e
            if (r4 == 0) goto L51
            java.lang.Object r4 = r2.next()
            so2.j5 r4 = (so2.j5) r4
            boolean r8 = r4 instanceof so2.j0
            if (r8 == 0) goto L4a
            so2.j0 r4 = (so2.j0) r4
            r45.zx0 r4 = r4.f410438d
            com.tencent.mm.protobuf.f r4 = r4.getCustom(r1)
            r45.vx0 r4 = (r45.vx0) r4
            if (r4 == 0) goto L45
            long r8 = r4.getLong(r1)
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 != 0) goto L45
            r4 = r0
            goto L46
        L45:
            r4 = r1
        L46:
            if (r4 == 0) goto L4a
            r4 = r0
            goto L4b
        L4a:
            r4 = r1
        L4b:
            if (r4 == 0) goto L4e
            goto L52
        L4e:
            int r3 = r3 + 1
            goto L1c
        L51:
            r3 = r5
        L52:
            if (r3 == r5) goto L68
            java.util.ArrayList r1 = r11.f135431g
            r1.remove(r3)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r11.f135430f
            if (r1 == 0) goto L61
            r1.notifyItemRemoved(r3)
            goto L68
        L61:
            java.lang.String r11 = "adapter"
            kotlin.jvm.internal.o.o(r11)
            r11 = 0
            throw r11
        L68:
            android.app.Activity r11 = r11.getContext()
            int r1 = com.tencent.mm.ui.widget.dialog.f4.f211790n
            com.tencent.mm.ui.widget.dialog.e4 r1 = new com.tencent.mm.ui.widget.dialog.e4
            r1.<init>(r11)
            r11 = 2131689956(0x7f0f01e4, float:1.9008942E38)
            r1.b(r11)
            r11 = 2131767664(0x7f103170, float:1.9166553E38)
            r1.d(r11)
            r1.c()
            com.tencent.mm.autogen.events.FinderContinueWatchEvent r11 = new com.tencent.mm.autogen.events.FinderContinueWatchEvent
            r11.<init>()
            am.xa r1 = r11.f54267g
            r1.f8369a = r0
            r1.f8370b = r6
            r11.e()
        L90:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.g7.invoke(java.lang.Object):java.lang.Object");
    }
}
