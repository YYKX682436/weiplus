package sf2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f407359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e0 f407360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f407361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.xg7 f407363h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.pt1 f407364i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407365m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i17, sf2.e0 e0Var, int i18, java.lang.String str, r45.xg7 xg7Var, r45.pt1 pt1Var, yz5.l lVar) {
        super(0);
        this.f407359d = i17;
        this.f407360e = e0Var;
        this.f407361f = i18;
        this.f407362g = str;
        this.f407363h = xg7Var;
        this.f407364i = pt1Var;
        this.f407365m = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        sf2.e0 e0Var = this.f407360e;
        int i17 = this.f407359d;
        if (i17 < 0) {
            zl2.r4.f473950a.f3(e0Var.O6(), "(DEBUG)获取 Tab 失败 " + i17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getTabList onCgiBack] errType=");
        sb6.append(this.f407361f);
        sb6.append(" errCode=");
        sb6.append(i17);
        sb6.append(" errMsg=");
        sb6.append(this.f407362g);
        sb6.append(" tab type = ");
        r45.xg7 type = this.f407363h;
        sb6.append(type);
        sb6.append(" list size=");
        r45.pt1 pt1Var = this.f407364i;
        sb6.append(pt1Var.getList(1).size());
        sb6.append(" hide recommend=");
        sb6.append(pt1Var.getBoolean(4));
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorSearchMusicController", sb6.toString());
        java.util.List list = (java.util.List) ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().f233884m.get(type);
        int size = list != null ? list.size() : 0;
        dk2.p Z6 = ((mm2.c1) e0Var.business(mm2.c1.class)).Z6();
        Z6.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        java.util.List list2 = (java.util.List) Z6.f233884m.get(type);
        java.util.LinkedList<r45.d22> list3 = pt1Var.getList(1);
        if (list3 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
            for (r45.d22 d22Var : list3) {
                kotlin.jvm.internal.o.d(d22Var);
                arrayList.add(new dk2.vg(d22Var, 0, Z6.h(d22Var) ? 51 : 0, 0, false, 0L, 56, null));
            }
        } else {
            arrayList = null;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateMusicListData size:");
        sb7.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", sb7.toString());
        if (arrayList != null && list2 != null) {
            list2.addAll(arrayList);
        }
        Z6.f233883l.put(type, pt1Var.getByteString(2));
        Z6.f233882k.put(type, java.lang.Integer.valueOf(pt1Var.getInteger(3)));
        boolean z17 = !pt1Var.getBoolean(4);
        int size2 = pt1Var.getList(1).size();
        java.util.List list4 = (java.util.List) ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().f233884m.get(type);
        if (list4 == null || list4.isEmpty()) {
            com.tencent.mm.plugin.finder.live.widget.i8 i8Var = e0Var.f407111m;
            if (i8Var != null) {
                i8Var.k0(list4 == null ? kz5.p0.f313996d : list4, type, z17);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorSearchMusicController", "updateMusicListView, musicList:" + list4);
        } else {
            com.tencent.mm.plugin.finder.live.widget.i8 i8Var2 = e0Var.f407111m;
            if (i8Var2 != null) {
                i8Var2.k0(list4, type, z17);
            }
            bm2.a0 a0Var = (bm2.a0) ((java.util.LinkedHashMap) e0Var.f407113o).get(type);
            if (a0Var != null) {
                java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().f233882k).get(type);
                a0Var.B(list4, num == null || num.intValue() != 0);
                a0Var.notifyItemRangeInserted(size, size2);
            }
        }
        yz5.l lVar = this.f407365m;
        if (lVar != null) {
            java.util.LinkedList list5 = pt1Var.getList(1);
            lVar.invoke(java.lang.Integer.valueOf(list5 != null ? list5.size() : 0));
        }
        return jz5.f0.f302826a;
    }
}
