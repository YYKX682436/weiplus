package dk2;

/* loaded from: classes2.dex */
public final class i2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f233602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f233603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233604d;

    public i2(dk2.r4 r4Var, int i17, int i18, int i19) {
        this.f233601a = r4Var;
        this.f233602b = i17;
        this.f233603c = i18;
        this.f233604d = i19;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.ArrayList arrayList;
        r45.np1 np1Var = (r45.np1) ((com.tencent.mm.modelbase.f) obj).f70618d;
        km2.p pVar = new km2.p(null, null, null, 7, null);
        com.tencent.mm.protobuf.g byteString = np1Var.getByteString(2);
        dk2.r4 r4Var = this.f233601a;
        if (byteString != null) {
            pVar.f309167b = byteString;
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "Guide nav buffer captured, size: " + byteString.f192156a.length);
        }
        r45.lp1 lp1Var = (r45.lp1) np1Var.getCustom(3);
        boolean z17 = true;
        boolean z18 = false;
        if (lp1Var != null) {
            pVar.f309168c = lp1Var;
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "Guide ext_info captured, lightUrl=" + lp1Var.getString(0) + ", darkUrl=" + lp1Var.getString(1));
        }
        java.util.LinkedList list = np1Var.getList(1);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.fa2) obj2).f374126e == 18) {
                    break;
                }
            }
            r45.fa2 fa2Var = (r45.fa2) obj2;
            if (fa2Var != null) {
                int i17 = this.f233602b;
                int i18 = this.f233603c;
                int i19 = this.f233604d;
                pVar.f309166a = fa2Var;
                com.tencent.mars.xlog.Log.i(r4Var.f234009d, "Guide container set to guidePageData, type=" + fa2Var.f374126e);
                km2.n nVar = dk2.ef.H;
                if (nVar != null && (arrayList = nVar.f309153e) != null) {
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            if (((km2.t) it6.next()).f309223e != null) {
                                break;
                            }
                        }
                    }
                    z17 = false;
                    z18 = z17;
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.i(r4Var.f234009d, "Guide container already exists, skipping insertion");
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(new dk2.h2(i17, new km2.t(pVar), r4Var, i18, i19));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
