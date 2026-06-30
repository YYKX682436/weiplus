package sf2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn2.a f407061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f407065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407066i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f407067m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gn2.a aVar, int i17, java.lang.String str, java.lang.String str2, java.lang.Integer num, sf2.x xVar, dk2.yg ygVar) {
        super(3);
        this.f407061d = aVar;
        this.f407062e = i17;
        this.f407063f = str;
        this.f407064g = str2;
        this.f407065h = num;
        this.f407066i = xVar;
        this.f407067m = ygVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Integer num;
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.List songInfoList = (java.util.List) obj2;
        java.util.LinkedList unComplianceList = (java.util.LinkedList) obj3;
        kotlin.jvm.internal.o.g(songInfoList, "songInfoList");
        kotlin.jvm.internal.o.g(unComplianceList, "unComplianceList");
        sf2.x xVar = this.f407066i;
        if (intValue == 0) {
            gn2.a aVar = this.f407061d;
            int i17 = this.f407062e;
            aVar.n(i17);
            aVar.k(aVar.m());
            if (kotlin.jvm.internal.o.b(this.f407063f, this.f407064g) && (num = this.f407065h) != null && i17 == num.intValue()) {
                xl2.d.a(xl2.d.f455115a, xVar.O6(), this.f407063f, 2, ((mm2.e1) xVar.business(mm2.e1.class)).f328983m, ((mm2.e1) xVar.business(mm2.e1.class)).f328988r.getLong(0), ((mm2.c1) xVar.business(mm2.c1.class)).f328852o, null, 64, null);
            }
            if (!unComplianceList.isEmpty()) {
                mm2.m6 m6Var = (mm2.m6) xVar.business(mm2.m6.class);
                m6Var.getClass();
                java.util.LinkedList linkedList = m6Var.f329247o;
                linkedList.clear();
                linkedList.addAll(unComplianceList);
                db5.t7.g(xVar.O6(), xVar.O6().getResources().getString(com.tencent.mm.R.string.efh));
            }
            dk2.s sVar = ((mm2.m6) xVar.business(mm2.m6.class)).f329241f;
            sVar.getClass();
            dk2.yg item = this.f407067m;
            kotlin.jvm.internal.o.g(item, "item");
            java.util.ArrayList arrayList = sVar.f234053b;
            try {
                java.lang.Object obj4 = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj4, "get(...)");
                dk2.yg ygVar = (dk2.yg) obj4;
                boolean b17 = kotlin.jvm.internal.o.b(item.f234393a, ygVar.f234393a);
                androidx.lifecycle.j0 j0Var = sVar.f234052a;
                if (b17) {
                    java.lang.Integer num2 = (java.lang.Integer) j0Var.getValue();
                    int i18 = -1;
                    if (num2 == null) {
                        num2 = -1;
                    }
                    int intValue2 = num2.intValue();
                    arrayList.remove(i17);
                    if (intValue2 > i17 && intValue2 != -1) {
                        i18 = intValue2 - 1;
                    } else if (intValue2 != i17) {
                        i18 = intValue2;
                    }
                    j0Var.postValue(java.lang.Integer.valueOf(i18));
                }
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "deletesongItem item:" + item + " songList size:" + arrayList.size() + ", locsongItem:" + ygVar + " , curPlayPos:" + j0Var);
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, "FinderLiveAnchorMusicData deletesongItem");
            }
            mm2.m6 m6Var2 = (mm2.m6) xVar.business(mm2.m6.class);
            java.lang.String songName = item.f234393a;
            m6Var2.getClass();
            kotlin.jvm.internal.o.g(songName, "songName");
            pm0.v.d0(m6Var2.f329247o, new mm2.l6(songName));
            java.util.ArrayList arrayList2 = ((mm2.m6) xVar.business(mm2.m6.class)).f329241f.f234053b;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                aVar.d(false);
            } else {
                gn2.a.q(aVar, false, 1, null);
            }
        } else {
            db5.t7.g(xVar.O6(), xVar.O6().getResources().getString(com.tencent.mm.R.string.f491851ef4));
        }
        return jz5.f0.f302826a;
    }
}
