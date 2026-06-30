package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class lj extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f123962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f123964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(int i17, com.tencent.mm.plugin.finder.profile.uic.f4 f4Var, com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        super(2);
        this.f123962d = i17;
        this.f123963e = f4Var;
        this.f123964f = dkVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        if (intValue > this.f123962d) {
            java.util.Iterator it = this.f123964f.O6().iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((so2.j5) it.next()).getItemId() == longValue) {
                    break;
                }
                i17++;
            }
            this.f123963e.P6(i17, com.tencent.mm.R.id.rlb);
        }
        return jz5.f0.f302826a;
    }
}
