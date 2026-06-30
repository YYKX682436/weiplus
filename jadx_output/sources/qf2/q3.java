package qf2;

/* loaded from: classes3.dex */
public final class q3 extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public lj2.o0 f362548m;

    /* renamed from: n, reason: collision with root package name */
    public pi2.w0 f362549n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f362550o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f362550o = jz5.h.b(new qf2.l3(this));
    }

    public static final km2.q Z6(qf2.q3 q3Var, java.util.List list, r45.if5 if5Var, java.util.HashMap hashMap) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        q3Var.getClass();
        km2.q qVar = (km2.q) hashMap.get(if5Var.getString(0));
        if (qVar == null) {
            java.lang.String string = if5Var.getString(0);
            r45.xn1 xn1Var = (r45.xn1) if5Var.getCustom(1);
            java.lang.String headUrl = (xn1Var == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact3.getHeadUrl();
            r45.xn1 xn1Var2 = (r45.xn1) if5Var.getCustom(1);
            java.lang.String username = (xn1Var2 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact2.getUsername();
            r45.xn1 xn1Var3 = (r45.xn1) if5Var.getCustom(1);
            qVar = new km2.q(string, headUrl, username, (xn1Var3 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact.getNickname(), if5Var.getInteger(6), if5Var.getString(5), null, false, ((mm2.c1) q3Var.business(mm2.c1.class)).l8(), null, null, 0, 0, false, null, false, 0L, (r45.xn1) if5Var.getCustom(1), false, null, null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -71500096, 1, null);
            int integer = if5Var.getInteger(2);
            java.lang.String string2 = if5Var.getString(3);
            if (string2 == null) {
                string2 = "";
            }
            qVar.v(new km2.b0(integer, string2));
        }
        int integer2 = if5Var.getInteger(2);
        java.lang.String string3 = if5Var.getString(3);
        qVar.v(new km2.b0(integer2, string3 != null ? string3 : ""));
        list.add(qVar);
        return qVar;
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        qf2.t3 a76 = a7();
        a76.getClass();
        java.util.LinkedHashMap micViewRect = micInfoData.f454522a;
        kotlin.jvm.internal.o.g(micViewRect, "micViewRect");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = a76.f362592c;
        java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            if (!micViewRect.containsKey(entry.getKey())) {
                arrayList.add(entry.getKey());
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qf2.s3 s3Var = (qf2.s3) hashMap.remove((java.lang.String) it.next());
            if (s3Var != null) {
                kotlinx.coroutines.r2 r2Var = s3Var.f362577c;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                s3Var.f362578d = null;
                com.tencent.mars.xlog.Log.i(s3Var.f362576b, "stopCountDown");
            }
        }
    }

    public final qf2.t3 a7() {
        return (qf2.t3) ((jz5.n) this.f362550o).getValue();
    }

    public final void b7() {
        lj2.o0 o0Var = this.f362548m;
        if (o0Var == null || o0Var.f318901a.getVisibility() == 8) {
            return;
        }
        pm0.v.X(new lj2.l0(o0Var));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        java.util.HashMap hashMap = a7().f362592c;
        java.util.Set entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            qf2.s3 s3Var = (qf2.s3) ((java.util.Map.Entry) it.next()).getValue();
            kotlinx.coroutines.r2 r2Var = s3Var.f362577c;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            s3Var.f362578d = null;
            com.tencent.mars.xlog.Log.i(s3Var.f362576b, "stopCountDown");
        }
        hashMap.clear();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.wz1 wz1Var;
        super.onLiveStart(hc1Var);
        if (hc1Var == null || (wz1Var = (r45.wz1) hc1Var.getCustom(4)) == null) {
            return;
        }
        ((mm2.g5) business(mm2.g5.class)).O6(wz1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewMount(android.view.ViewGroup r3) {
        /*
            r2 = this;
            java.lang.String r0 = "pluginLayout"
            kotlin.jvm.internal.o.g(r3, r0)
            super.onViewMount(r3)
            r0 = 2131307067(0x7f092a3b, float:1.823235E38)
            android.view.View r3 = r3.findViewById(r0)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r0 = 0
            if (r3 == 0) goto L20
            android.view.View r3 = r3.inflate()     // Catch: java.lang.Throwable -> L19
            goto L21
        L19:
            java.lang.String r3 = "genRootViewByStub fail: 2131307067"
            java.lang.String r1 = r2.f291098d
            com.tencent.mars.xlog.Log.i(r1, r3)
        L20:
            r3 = r0
        L21:
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L28
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L28:
            if (r0 == 0) goto L31
            lj2.o0 r3 = new lj2.o0
            r3.<init>(r0, r2)
            r2.f362548m = r3
        L31:
            zl2.r4 r3 = zl2.r4.f473950a
            boolean r3 = r3.x1()
            if (r3 != 0) goto L44
            pi2.w0 r3 = new pi2.w0
            android.content.Context r0 = r2.O6()
            r3.<init>(r0, r2)
            r2.f362549n = r3
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.q3.onViewMount(android.view.ViewGroup):void");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f362548m = null;
        this.f362549n = null;
    }
}
