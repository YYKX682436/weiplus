package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class e0 extends bu2.l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r45.p21 source) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
    }

    @Override // bu2.l0
    public so2.j5 a() {
        r45.ro2 ro2Var;
        r45.p21 data = this.f24548a;
        kotlin.jvm.internal.o.g(data, "data");
        if (!(data.getInteger(5) == 3) || (ro2Var = (r45.ro2) data.getCustom(7)) == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.im imVar = com.tencent.mm.plugin.finder.feed.im.f107046a;
        r45.dh2 dh2Var = new r45.dh2();
        dh2Var.set(0, 4);
        dh2Var.set(4, ro2Var);
        return imVar.b(dh2Var);
    }

    public e0(int i17, r45.ro2 finderPoiInfo) {
        kotlin.jvm.internal.o.g(finderPoiInfo, "finderPoiInfo");
        r45.p21 p21Var = this.f24548a;
        p21Var.set(0, java.lang.Integer.valueOf(i17));
        p21Var.set(7, finderPoiInfo);
        p21Var.set(5, 3);
    }
}
