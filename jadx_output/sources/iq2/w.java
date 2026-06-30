package iq2;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f293776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f293777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f293778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(iq2.d0 d0Var, boolean z17, int i17, long j17) {
        super(0);
        this.f293775d = d0Var;
        this.f293776e = z17;
        this.f293777f = i17;
        this.f293778g = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.g byteString;
        int i17;
        iq2.d0 d0Var = this.f293775d;
        int i18 = d0Var.f293722f;
        fq2.a aVar = d0Var.f293723g;
        if (this.f293776e) {
            byteString = ((gq2.j) aVar).f274564g.f();
        } else {
            r45.dk2 dk2Var = d0Var.f293736t;
            byteString = dk2Var != null ? dk2Var.getByteString(6) : null;
        }
        java.lang.String str = (java.lang.String) ((jz5.n) d0Var.f293739w).getValue();
        java.util.List V0 = kz5.n0.V0(((gq2.j) aVar).f274564g.a());
        r45.u80 u80Var = d0Var.f293719c.f301100f;
        java.util.ArrayList arrayList = d0Var.f293732p;
        int size = arrayList.size() - 1;
        int i19 = d0Var.f293722f;
        if (size >= 0) {
            while (true) {
                int i27 = size - 1;
                java.lang.Object obj = arrayList.get(size);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof wp2.a) {
                    wp2.a aVar2 = (wp2.a) j5Var;
                    if (aVar2.i() == i19) {
                        u80Var = new r45.u80();
                        u80Var.set(0, java.lang.Integer.valueOf(aVar2.i()));
                        u80Var.set(1, aVar2.a());
                        u80Var.getList(2).addAll(j5Var instanceof wp2.b ? d0Var.e() : aVar2.g());
                    }
                }
                if (i27 < 0) {
                    break;
                }
                size = i27;
            }
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList2.iterator();
        int i28 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((r45.u80) it.next()).getInteger(0) == i19) {
                i17 = i28;
                break;
            }
            i28++;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer num = valueOf.intValue() >= 0 ? valueOf : null;
        if (num != null) {
            arrayList2.set(num.intValue(), u80Var);
        } else {
            arrayList2.add(u80Var);
        }
        java.lang.String str2 = "getAndUpdateContainerContext containerId:" + i19 + ", lastBuf:" + u80Var.getByteString(1) + ", contexts:" + arrayList2.size();
        java.lang.String str3 = d0Var.f293721e;
        com.tencent.mars.xlog.Log.i(str3, str2);
        com.tencent.mm.ui.MMActivity mMActivity = d0Var.f293717a;
        kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        int d17 = ((com.tencent.mm.plugin.finder.ui.MMFinderUI) mMActivity).getD();
        r45.dd2 dd2Var = new r45.dd2();
        int i29 = d0Var.f293720d;
        dd2Var.set(0, java.lang.Integer.valueOf(i29));
        if (d0Var.f293731o != null && i29 != d0Var.f() && d0Var.f() != 0) {
            java.util.LinkedList list = dd2Var.getList(6);
            r45.dd2 dd2Var2 = new r45.dd2();
            dd2Var2.set(0, java.lang.Integer.valueOf(d0Var.f()));
            list.add(dd2Var2);
        }
        int i37 = this.f293777f;
        kotlin.jvm.internal.o.d(str);
        aq2.a aVar3 = new aq2.a(i37, i18, byteString, str, V0, d17, this.f293778g, null, dd2Var, 0, 0.0f, false, null, null, null, false, null, 130560, null);
        com.tencent.mars.xlog.Log.i(str3, "#loadDataWithCgi req=" + aVar3);
        return new aq2.c(aVar3, null, d0Var.f293717a, 2, null);
    }
}
