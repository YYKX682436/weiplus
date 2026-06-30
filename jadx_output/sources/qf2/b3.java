package qf2;

/* loaded from: classes3.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f362300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.o4 f362302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(dk2.u4 u4Var, qf2.c3 c3Var, mm2.o4 o4Var) {
        super(0);
        this.f362300d = u4Var;
        this.f362301e = c3Var;
        this.f362302f = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f362300d.f234160g;
        qf2.c3 c3Var = this.f362301e;
        if (i17 != 1) {
            if (i17 == 2) {
                java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
                kotlin.jvm.internal.o.f(arrayList, "getRemoteUserConfigList(...)");
                java.util.Iterator it = arrayList.iterator();
                int i18 = 0;
                int i19 = 0;
                while (it.hasNext()) {
                    if (((mm2.y2) this.f362302f.business(mm2.y2.class)).b7(((zn0.v) it.next()).f474413n)) {
                        i18++;
                    } else {
                        i19++;
                    }
                }
                if (i18 == 0 || i19 == 0) {
                    db5.t7.m(c3Var.O6(), c3Var.O6().getResources().getString(com.tencent.mm.R.string.lzz));
                }
            }
        } else if (zn0.x.f474414a.f474415a.size() == 0) {
            db5.t7.m(c3Var.O6(), c3Var.O6().getResources().getString(com.tencent.mm.R.string.lzx));
        }
        return jz5.f0.f302826a;
    }
}
