package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f114174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f114175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f114176f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(java.util.LinkedList linkedList, ek2.i2 i2Var, com.tencent.mm.plugin.finder.live.plugin.dq dqVar) {
        super(0);
        this.f114174d = linkedList;
        this.f114175e = i2Var;
        this.f114176f = dqVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ek2.i2 i2Var;
        java.lang.Object obj;
        java.util.Iterator it = this.f114174d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i2Var = this.f114175e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.ad5 ad5Var = (r45.ad5) obj;
            boolean z17 = false;
            if (kotlin.jvm.internal.o.b(ad5Var.getString(3), i2Var.f253470y) && kotlin.jvm.internal.o.b(ad5Var.getString(0), i2Var.f253471z)) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.ad5 ad5Var2 = (r45.ad5) obj;
        if (ad5Var2 != null) {
            if (ad5Var2.getLong(6) < c01.id.e()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "gift is already expire_time, it.expire_time = " + ad5Var2.getLong(6));
                ad5Var2.set(1, 0L);
                java.lang.String str = i2Var.f253466u;
                if (str != null) {
                    dk2.u7.f234181a.j(str);
                }
            } else {
                ad5Var2.set(1, java.lang.Long.valueOf(ad5Var2.getLong(1) + i2Var.f253467v));
            }
            this.f114176f.w1("resumePkgGiftPatchInfoOnFail");
        }
        return jz5.f0.f302826a;
    }
}
