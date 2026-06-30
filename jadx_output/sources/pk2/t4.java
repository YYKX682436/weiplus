package pk2;

/* loaded from: classes3.dex */
public final class t4 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356264i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356264i = "";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356264i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if ((r0 != null && r0.f230903t) == false) goto L15;
     */
    @Override // qk2.d, qk2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o() {
        /*
            r5 = this;
            boolean r0 = r5.n()
            r1 = 0
            if (r0 != 0) goto Lc
            r0 = 3
            int r2 = r5.f364428b
            if (r2 != r0) goto L3e
        Lc:
            mm2.y6 r0 = r5.w()
            boolean r0 = r0.d()
            pk2.o9 r2 = r5.f364427a
            java.lang.Class<df2.o> r3 = df2.o.class
            r4 = 1
            if (r0 == 0) goto L2c
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r2.e(r3)
            df2.o r0 = (df2.o) r0
            if (r0 == 0) goto L29
            boolean r0 = r0.f230903t
            if (r0 != r4) goto L29
            r0 = r4
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L3d
        L2c:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r2.e(r3)
            df2.o r0 = (df2.o) r0
            if (r0 == 0) goto L3a
            boolean r0 = r0.f230902s
            if (r0 != r4) goto L3a
            r0 = r4
            goto L3b
        L3a:
            r0 = r1
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            r1 = r4
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.t4.o():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    @Override // qk2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(pk2.o9 r12, com.tencent.mm.plugin.finder.view.e3 r13, java.lang.Integer r14) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.t4.t(pk2.o9, com.tencent.mm.plugin.finder.view.e3, java.lang.Integer):void");
    }

    public final mm2.y6 w() {
        return (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) this.f364427a.c(mm2.g1.class)).f329078s).getValue();
    }

    public final void x(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 6);
        jSONObject.put("sub_element", w().d() ? 9 : 8);
        jSONObject.put("sub_type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
    }
}
