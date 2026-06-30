package pk2;

/* loaded from: classes3.dex */
public final class g0 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355756h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355757i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f355758j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355756h = helper.T;
        this.f355757i = "";
        this.f355758j = true;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        boolean D = D();
        pk2.o9 o9Var2 = this.f364427a;
        if (D) {
            df2.dd ddVar = df2.od.f230952w;
            gk2.e eVar = o9Var2.f356074b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 2, 7, odVar != null ? odVar.f230958r : null, 18);
        }
        if (n()) {
            pk2.f8.a(pk2.f8.f355747a, 12, 2, null, 4, null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 9);
            jSONObject.put("type", 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        if (((mm2.c1) o9Var2.c(mm2.c1.class)).O7()) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.mk_), 0).show();
        } else {
            df2.g3 g3Var = (df2.g3) o9Var.e(df2.g3.class);
            if (g3Var != null) {
                g3Var.Z6(this.f364428b, (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q, ((mm2.o4) o9Var.c(mm2.o4.class)).U.f377132g, pk2.f0.f355721d);
            }
        }
    }

    public final boolean D() {
        df2.od odVar = (df2.od) this.f364427a.e(df2.od.class);
        return odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_MIC_COUNT);
    }

    @Override // qk2.f
    public boolean h() {
        return this.f355758j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355757i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    @Override // qk2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o() {
        /*
            r6 = this;
            java.lang.Class<mm2.h7> r0 = mm2.h7.class
            pk2.o9 r1 = r6.f364427a
            androidx.lifecycle.c1 r0 = r1.c(r0)
            mm2.h7 r0 = (mm2.h7) r0
            boolean r0 = r0.O6()
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L13
            return r3
        L13:
            java.lang.Class<mm2.e1> r0 = mm2.e1.class
            androidx.lifecycle.c1 r0 = r1.c(r0)
            mm2.e1 r0 = (mm2.e1) r0
            boolean r0 = r0.d7()
            if (r0 == 0) goto L5a
            java.lang.Class<jf2.u> r0 = jf2.u.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r1.e(r0)
            jf2.u r0 = (jf2.u) r0
            if (r0 == 0) goto L56
            java.util.LinkedList r0 = r0.f299401p
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            r4 = r1
            jf2.h r4 = (jf2.h) r4
            int r4 = r4.type()
            r5 = 10
            if (r4 != r5) goto L48
            r4 = r2
            goto L49
        L48:
            r4 = r3
        L49:
            if (r4 == 0) goto L31
            goto L4d
        L4c:
            r1 = 0
        L4d:
            if (r1 == 0) goto L51
            r0 = r2
            goto L52
        L51:
            r0 = r3
        L52:
            if (r0 != 0) goto L56
            r0 = r2
            goto L57
        L56:
            r0 = r3
        L57:
            if (r0 == 0) goto L5a
            return r2
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.g0.o():boolean");
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        if (D()) {
            int i17 = this.f355756h;
            com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
            java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.dw8);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = mMActivity.getString(com.tencent.mm.R.string.mpo);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            u(menu, i17, string, com.tencent.mm.R.raw.finder_icons_request_link_mic, string2, mMActivity.getResources().getColor(com.tencent.mm.R.color.f478554ao));
        } else {
            int i18 = this.f355756h;
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dw8);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            t(menu, i18, string3, com.tencent.mm.R.raw.finder_icons_request_link_mic, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        if (n()) {
            pk2.f8.a(pk2.f8.f355747a, 12, 1, null, 4, null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 9);
            jSONObject.put("type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        if (D()) {
            df2.dd ddVar = df2.od.f230952w;
            pk2.o9 o9Var2 = this.f364427a;
            gk2.e eVar = o9Var2.f356074b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 1, 7, odVar != null ? odVar.f230958r : null, 18);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f355756h;
    }
}
