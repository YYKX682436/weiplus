package cr2;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f221878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr2.x f221879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f221880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i17, cr2.x xVar, boolean z17) {
        super(0);
        this.f221878d = i17;
        this.f221879e = xVar;
        this.f221880f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.g gVar;
        java.util.LinkedList linkedList;
        r45.xz2 xz2Var = new r45.xz2();
        r45.kv0 a17 = db2.t4.f228171a.a(10200);
        cr2.x xVar = this.f221879e;
        com.tencent.mm.ui.MMActivity mMActivity = xVar.f221895a;
        kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        a17.set(1, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.ui.MMFinderUI) mMActivity).getD()));
        xz2Var.f390610d = a17;
        xz2Var.f390616m = this.f221878d;
        int i17 = xVar.f221903i;
        xz2Var.f390626w = i17;
        boolean z17 = this.f221880f;
        if (z17) {
            r45.yz2 yz2Var = ((wq2.e) ((gr2.p0) xVar.f221904j).f274806b).f448522a.f448532d;
            if (yz2Var != null) {
                gVar = yz2Var.f391522i;
            }
            gVar = null;
        } else {
            r45.yz2 yz2Var2 = xVar.f221914t;
            if (yz2Var2 != null) {
                gVar = yz2Var2.f391522i;
            }
            gVar = null;
        }
        xz2Var.f390611e = gVar;
        er2.a aVar = xVar.f221898d;
        if (z17) {
            linkedList = new java.util.LinkedList();
            linkedList.add(aVar.f256014g);
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.u80 u80Var = aVar.f256014g;
            java.util.ArrayList arrayList2 = xVar.f221911q;
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i18 = size - 1;
                    java.lang.Object obj = arrayList2.get(size);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    so2.j5 j5Var = (so2.j5) obj;
                    if (j5Var instanceof wp2.a) {
                        wp2.a aVar2 = (wp2.a) j5Var;
                        if (!arrayList.contains(java.lang.Integer.valueOf(aVar2.i()))) {
                            arrayList.add(java.lang.Integer.valueOf(aVar2.i()));
                            r45.u80 u80Var2 = new r45.u80();
                            u80Var2.set(0, java.lang.Integer.valueOf(aVar2.i()));
                            u80Var2.set(1, aVar2.a());
                            u80Var2.getList(2).addAll(j5Var instanceof wp2.b ? xVar.c() : aVar2.g());
                            if (aVar2.i() == i17) {
                                u80Var = u80Var2;
                            } else {
                                linkedList2.add(u80Var2);
                            }
                        }
                    }
                    if (i18 < 0) {
                        break;
                    }
                    size = i18;
                }
            }
            linkedList2.add(u80Var);
            com.tencent.mars.xlog.Log.i(xVar.f221901g, "collectAllContainerContext containerId:" + i17 + ", lastBuf:" + u80Var.getByteString(1));
            linkedList = linkedList2;
        }
        xz2Var.f390628y = linkedList;
        xz2Var.A = null;
        xz2Var.B = xVar.f221899e;
        xz2Var.C = xVar.f221900f;
        xz2Var.E = aVar.f256016i;
        return (az2.j) xz2Var.b();
    }
}
