package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class z0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137753q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137753q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchTopContactInnerRankTaskByPinyin";
    }

    @Override // p13.c
    public int k() {
        return 50;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f351135n;
        p13.u a17 = uVar.a();
        a17.f351151m = null;
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137753q;
        com.tencent.mm.plugin.fts.logic.y0 y0Var = new com.tencent.mm.plugin.fts.logic.y0(lVar, a17);
        y0Var.h();
        p13.v vVar2 = y0Var.f351136o;
        p13.u a18 = uVar.a();
        a18.f351141c = o13.n.j(uVar.f351141c);
        a18.f351151m = null;
        com.tencent.mm.plugin.fts.logic.y0 y0Var2 = new com.tencent.mm.plugin.fts.logic.y0(lVar, a18);
        y0Var2.h();
        p13.v vVar3 = y0Var2.f351136o;
        vVar.f351159d = vVar2.f351159d;
        java.util.List list = vVar2.f351160e;
        java.util.List list2 = vVar3.f351160e;
        if (list == null || list.isEmpty()) {
            list = list2;
        } else if (list2 != null && !list2.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                p13.y yVar = (p13.y) arrayList.get(i17);
                if (yVar != null) {
                    hashSet.add(yVar.f351187e);
                }
            }
            for (int i18 = 0; i18 < list2.size(); i18++) {
                p13.y yVar2 = (p13.y) list2.get(i18);
                if (!hashSet.contains(yVar2.f351187e)) {
                    arrayList.add(yVar2);
                }
            }
            list = arrayList;
        }
        vVar.f351160e = list;
    }
}
