package pk2;

/* loaded from: classes3.dex */
public final class p4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356147h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356148i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356147h = helper.f356091j0;
        this.f356148i = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if ((r6 != null ? r6.f355890f : false) != false) goto L22;
     */
    @Override // qk2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(pk2.o9 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r6, r0)
            r0 = 2
            r5.D(r0)
            java.lang.Class<yf2.g0> r0 = yf2.g0.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r6.e(r0)
            if2.b r0 = (if2.b) r0
            if (r0 == 0) goto L52
            boolean r1 = r0 instanceof jm2.b
            if (r1 == 0) goto L52
            r1 = 1
            r2 = 0
            pk2.j9 r6 = r6.f356084g
            if (r6 == 0) goto L2c
            java.lang.Integer r3 = r6.f355889e
            if (r3 != 0) goto L22
            goto L2c
        L22:
            int r3 = r3.intValue()
            int r4 = r5.f356147h
            if (r3 != r4) goto L2c
            r3 = r1
            goto L2d
        L2c:
            r3 = r2
        L2d:
            if (r3 == 0) goto L38
            if (r6 == 0) goto L34
            boolean r6 = r6.f355890f
            goto L35
        L34:
            r6 = r2
        L35:
            if (r6 == 0) goto L38
            goto L39
        L38:
            r1 = r2
        L39:
            jm2.b r0 = (jm2.b) r0
            yf2.g0 r0 = (yf2.g0) r0
            java.lang.Class<mm2.g1> r6 = mm2.g1.class
            androidx.lifecycle.c1 r6 = r0.business(r6)
            mm2.g1 r6 = (mm2.g1) r6
            kotlinx.coroutines.flow.j2 r6 = r6.f329068f
            kotlinx.coroutines.flow.h3 r6 = (kotlinx.coroutines.flow.h3) r6
            java.lang.Object r6 = r6.getValue()
            r45.q12 r6 = (r45.q12) r6
            r0.Z6(r6, r1)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.p4.B(pk2.o9):void");
    }

    public final void D(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 63L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356148i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f356147h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ozi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.eyes_on_regular, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
        D(1);
    }

    @Override // qk2.h
    public int y() {
        return this.f356147h;
    }
}
