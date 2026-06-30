package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC f124374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC) {
        super(0);
        this.f124374d = finderProfileAllLayoutUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.aw0 aw0Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        r45.uw2 uw2Var;
        ya2.b2 b17 = ya2.h.f460484a.b(this.f124374d.getUsername());
        if (b17 == null || (aw0Var = b17.field_bindInfoList) == null || (list = aw0Var.getList(0)) == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.zv0) obj).getInteger(0) == 5) {
                break;
            }
        }
        r45.zv0 zv0Var = (r45.zv0) obj;
        if (zv0Var == null || (uw2Var = (r45.uw2) zv0Var.getCustom(5)) == null) {
            return null;
        }
        return java.lang.Integer.valueOf(uw2Var.getInteger(0));
    }
}
