package vq2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView f439246d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView playTogetherBulletView) {
        super(0);
        this.f439246d = playTogetherBulletView;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView r0 = r8.f439246d
            r45.le1 r1 = r0.f122110d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 0
            if (r1 == 0) goto L4f
            r45.pe1 r1 = r1.f379364x
            if (r1 == 0) goto L4f
            java.util.LinkedList r1 = r1.f382980d
            if (r1 == 0) goto L4f
            boolean r4 = r1.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r3
        L1b:
            if (r1 == 0) goto L4f
            zm0.i r4 = r0.f122111e
            if (r4 == 0) goto L4f
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kz5.d0.q(r1, r6)
            r5.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L48
            java.lang.Object r6 = r1.next()
            r45.oe1 r6 = (r45.oe1) r6
            vq2.a r7 = new vq2.a
            kotlin.jvm.internal.o.d(r6)
            r7.<init>(r6)
            r5.add(r7)
            goto L30
        L48:
            java.lang.String r1 = "onDataEmpty"
            r4.a(r1, r5)
            r1 = r2
            goto L50
        L4f:
            r1 = r3
        L50:
            if (r1 != 0) goto L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "onDataEmpty: error, msg list is empty, msg_list="
            r1.<init>(r4)
            r45.le1 r0 = r0.f122110d
            if (r0 == 0) goto L63
            r45.pe1 r0 = r0.f379364x
            if (r0 == 0) goto L63
            java.util.LinkedList r3 = r0.f382980d
        L63:
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "PlayTogetherBulletView"
            com.tencent.mars.xlog.Log.w(r1, r0)
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vq2.e.invoke():java.lang.Object");
    }
}
