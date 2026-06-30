package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f201145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.l6 f201146e;

    public k6(com.tencent.mm.ui.chatting.gallery.l6 l6Var, boolean z17) {
        this.f201146e = l6Var;
        this.f201145d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap;
        oc5.d dVar = this.f201146e.f201178f.f200591a3;
        oc5.b bVar = dVar.f344396c;
        boolean z17 = false;
        if (!(bVar != null)) {
            if (bVar != null && (hashMap = bVar.f344385b) != null) {
                z17 = kotlin.jvm.internal.o.b(hashMap.get("1,2"), java.lang.Boolean.TRUE);
            }
            if (!z17) {
                oc5.b bVar2 = dVar.f344396c;
                if (bVar2 != null) {
                    bVar2.f344385b.put("1,2", java.lang.Boolean.TRUE);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                oc5.b bVar3 = dVar.f344396c;
                if (bVar3 != null) {
                    ((ku5.t0) ku5.t0.f312615d).b(new oc5.c(bVar3, 1, 2, currentTimeMillis), "ReportSearchButtonAction");
                }
            }
        }
        if (this.f201145d) {
            ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(1, 2, tg0.e1.f419061d);
        }
    }
}
