package tm2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tm2.s2 s2Var) {
        super(1);
        this.f420527d = s2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r10.getLong(0) == 0) goto L22;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            com.tencent.mm.modelbase.f r10 = (com.tencent.mm.modelbase.f) r10
            java.lang.String r0 = "result"
            kotlin.jvm.internal.o.g(r10, r0)
            int r0 = r10.f70615a
            if (r0 != 0) goto Lf
            int r1 = r10.f70616b
            if (r1 == 0) goto L17
        Lf:
            int r1 = r10.f70616b
            boolean r0 = hc2.p.b(r0, r1)
            if (r0 == 0) goto Lcf
        L17:
            com.tencent.mm.protobuf.f r10 = r10.f70618d
            r45.h51 r10 = (r45.h51) r10
            r0 = 2
            com.tencent.mm.protobuf.f r10 = r10.getCustom(r0)
            com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.mm.protocal.protobuf.FinderObject) r10
            if (r10 == 0) goto Lcf
            tm2.s2 r1 = r9.f420527d
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r3 = r1.c(r2)
            mm2.c1 r3 = (mm2.c1) r3
            r3.a9(r10)
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f328846n
            r3 = 0
            if (r10 == 0) goto L41
            r45.nw1 r10 = r10.getLiveInfo()
            goto L42
        L41:
            r10 = r3
        L42:
            r4 = 0
            if (r10 == 0) goto L62
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f328846n
            if (r10 == 0) goto L54
            r45.nw1 r10 = r10.getLiveInfo()
            goto L55
        L54:
            r10 = r3
        L55:
            kotlin.jvm.internal.o.d(r10)
            long r5 = r10.getLong(r4)
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L7a
        L62:
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f328846n
            if (r10 != 0) goto L6d
            goto L7a
        L6d:
            java.lang.Class<mm2.e1> r5 = mm2.e1.class
            androidx.lifecycle.c1 r5 = r1.c(r5)
            mm2.e1 r5 = (mm2.e1) r5
            r45.nw1 r5 = r5.f328988r
            r10.setLiveInfo(r5)
        L7a:
            com.tencent.mm.plugin.finder.live.plugin.nd0 r10 = r1.f420595k
            if (r10 == 0) goto L82
            r5 = 3
            com.tencent.mm.plugin.finder.live.plugin.nd0.P1(r10, r3, r4, r5, r3)
        L82:
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f328846n
            r5 = 1
            if (r10 == 0) goto L9d
            r45.nw1 r10 = r10.getLiveInfo()
            if (r10 == 0) goto L9d
            r6 = 17
            int r10 = r10.getInteger(r6)
            if (r10 != r5) goto L9d
            r10 = r5
            goto L9e
        L9d:
            r10 = r4
        L9e:
            if (r10 == 0) goto Lb0
            fm2.b r10 = r1.f19601c
            if (r10 == 0) goto Lcf
            androidx.lifecycle.c1 r1 = r1.c(r2)
            mm2.c1 r1 = (mm2.c1) r1
            java.lang.String r1 = r1.f328852o
            com.tencent.mm.plugin.finder.live.view.k0.fillBlurBg$default(r10, r1, r4, r0, r3)
            goto Lcf
        Lb0:
            androidx.lifecycle.c1 r10 = r1.c(r2)
            mm2.c1 r10 = (mm2.c1) r10
            int r10 = r10.f328807g2
            r0 = 524288(0x80000, float:7.34684E-40)
            boolean r10 = pm0.v.z(r10, r0)
            if (r10 == 0) goto Lcf
            fm2.b r10 = r1.f19601c
            if (r10 == 0) goto Lcf
            androidx.lifecycle.c1 r0 = r1.c(r2)
            mm2.c1 r0 = (mm2.c1) r0
            java.lang.String r0 = r0.f328852o
            r10.fillBlurBg(r0, r5)
        Lcf:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tm2.j.invoke(java.lang.Object):java.lang.Object");
    }
}
