package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f119931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var) {
        super(0);
        this.f119931d = e30Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.nn1 nn1Var;
        r45.nn1 nn1Var2;
        mm2.l0 l0Var = (mm2.l0) this.f119931d.f118212q.P0(mm2.l0.class);
        com.tencent.mars.xlog.Log.i("LiveCheerAnimationSlice", "notifyCheerAnimationFinish");
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = l0Var.f329210i;
        androidx.lifecycle.g0 g0Var = l0Var.f329211m;
        mm2.j0 j0Var = (mm2.j0) g0Var.getValue();
        if (j0Var == null || (nn1Var = j0Var.f329151a) == null) {
            nn1Var = new r45.nn1();
        }
        liveMutableData.postValue(new mm2.j0(nn1Var, false, 1.0d, 0L));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2 = l0Var.f329212n;
        mm2.j0 j0Var2 = (mm2.j0) g0Var.getValue();
        if (j0Var2 == null || (nn1Var2 = j0Var2.f329151a) == null) {
            nn1Var2 = new r45.nn1();
        }
        liveMutableData2.postValue(new mm2.j0(nn1Var2, false, 1.0d, 0L));
        return jz5.f0.f302826a;
    }
}
