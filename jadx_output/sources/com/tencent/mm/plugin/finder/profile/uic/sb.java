package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class sb implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.yb f124212d;

    public sb(com.tencent.mm.plugin.finder.profile.uic.yb ybVar) {
        this.f124212d = ybVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 >= 0) {
            com.tencent.mm.plugin.finder.profile.uic.yb ybVar = this.f124212d;
            if (i17 < ybVar.O6().getDataList().size()) {
                so2.j5 j5Var = (so2.j5) ybVar.O6().getDataList().get(i17);
                if (j5Var instanceof zb2.a) {
                    android.content.Context context = holder.f293121e;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    int integer = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6().getInteger(5);
                    com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    zb2.a aVar = (zb2.a) j5Var;
                    long j17 = aVar.f471255d.getLong(0);
                    r45.qj2 qj2Var = aVar.f471255d;
                    i0Var.ak(context, null, j17, 0L, null, qj2Var.getString(1), 0L, null, integer, qj2Var.getString(9));
                }
            }
        }
    }
}
