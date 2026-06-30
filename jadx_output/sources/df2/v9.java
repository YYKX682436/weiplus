package df2;

/* loaded from: classes3.dex */
public final class v9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.x9 f231589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(df2.x9 x9Var) {
        super(0);
        this.f231589d = x9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r3.booleanValue() == false) goto L18;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r20 = this;
            r0 = r20
            df2.x9 r1 = r0.f231589d
            java.lang.String r1 = r1.f231766m
            java.lang.String r2 = "[preloadProductList]"
            com.tencent.mars.xlog.Log.i(r1, r2)
            com.tencent.mm.plugin.finder.live.view.k0 r1 = dk2.ef.f233380e
            boolean r2 = r1 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout
            r3 = 0
            if (r2 == 0) goto L15
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r1 = (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) r1
            goto L16
        L15:
            r1 = r3
        L16:
            if (r1 == 0) goto Lde
            um2.x5 r1 = r1.getStartUIC()
            if (r1 == 0) goto Lde
            java.lang.Class<mm2.f6> r2 = mm2.f6.class
            androidx.lifecycle.c1 r4 = r1.c(r2)
            mm2.f6 r4 = (mm2.f6) r4
            boolean r4 = r4.f329035i
            if (r4 == 0) goto Lde
            com.tencent.mm.plugin.finder.live.plugin.ui r4 = r1.f429078u0
            if (r4 == 0) goto L45
            com.tencent.mm.plugin.finder.live.widget.dk r4 = r4.f114568p
            if (r4 == 0) goto L3a
            boolean r3 = r4.b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        L3a:
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.o.e(r3, r4)
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto Lde
        L45:
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            androidx.lifecycle.c1 r4 = r1.c(r3)
            mm2.c1 r4 = (mm2.c1) r4
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.f328846n
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L5f
            long r7 = vd2.a2.f435640k
            long r9 = r4.getId()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L5f
            r4 = r5
            goto L60
        L5f:
            r4 = r6
        L60:
            if (r4 != 0) goto Lde
            java.lang.Class<ml2.r0> r4 = ml2.r0.class
            i95.m r4 = i95.n0.c(r4)
            ml2.r0 r4 = (ml2.r0) r4
            r4.K = r5
            androidx.lifecycle.c1 r4 = r1.c(r2)
            mm2.f6 r4 = (mm2.f6) r4
            boolean r4 = r4.f329056z
            if (r4 != 0) goto Lde
            androidx.lifecycle.c1 r2 = r1.c(r2)
            mm2.f6 r2 = (mm2.f6) r2
            r2.f329056z = r5
            dk2.xf r2 = r1.h()
            if (r2 == 0) goto Lde
            androidx.appcompat.app.AppCompatActivity r4 = r1.f19605b
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            kotlin.jvm.internal.o.e(r4, r5)
            r8 = r4
            com.tencent.mm.ui.MMActivity r8 = (com.tencent.mm.ui.MMActivity) r8
            java.lang.Class<mm2.e1> r4 = mm2.e1.class
            androidx.lifecycle.c1 r5 = r1.c(r4)
            mm2.e1 r5 = (mm2.e1) r5
            r45.nw1 r5 = r5.f328988r
            long r9 = r5.getLong(r6)
            androidx.lifecycle.c1 r5 = r1.c(r4)
            mm2.e1 r5 = (mm2.e1) r5
            long r11 = r5.f328983m
            androidx.lifecycle.c1 r5 = r1.c(r4)
            mm2.e1 r5 = (mm2.e1) r5
            java.lang.String r13 = r5.f328984n
            androidx.lifecycle.c1 r5 = r1.c(r3)
            mm2.c1 r5 = (mm2.c1) r5
            java.lang.String r14 = r5.f328852o
            androidx.lifecycle.c1 r4 = r1.c(r4)
            mm2.e1 r4 = (mm2.e1) r4
            byte[] r15 = r4.f328985o
            r16 = 0
            r17 = 1
            androidx.lifecycle.c1 r3 = r1.c(r3)
            mm2.c1 r3 = (mm2.c1) r3
            java.lang.String r3 = r3.f328844m5
            um2.t r4 = new um2.t
            java.lang.ref.SoftReference r5 = new java.lang.ref.SoftReference
            r5.<init>(r1)
            java.lang.String r1 = r1.f429032f
            r4.<init>(r5, r1)
            r7 = r2
            dk2.r4 r7 = (dk2.r4) r7
            r18 = r3
            r19 = r4
            r7.R(r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
        Lde:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.v9.invoke():java.lang.Object");
    }
}
