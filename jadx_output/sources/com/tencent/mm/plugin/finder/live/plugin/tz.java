package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tz implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.zz f114501d;

    public tz(com.tencent.mm.plugin.finder.live.plugin.zz zzVar) {
        this.f114501d = zzVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.ok1 ok1Var = (r45.ok1) obj;
        com.tencent.mm.plugin.finder.live.plugin.zz zzVar = this.f114501d;
        mm2.h7 h7Var = (mm2.h7) zzVar.P0(mm2.h7.class);
        java.lang.String N6 = h7Var.N6();
        com.tencent.mars.xlog.Log.i("MultiStreamPlugin", "multiStreamDelete is curStreamId: curStreamIddelete success: " + pm0.v.d0(h7Var.f329117i, new com.tencent.mm.plugin.finder.live.plugin.sz(ok1Var)));
        if (kotlin.jvm.internal.o.b(N6, ok1Var.getString(2))) {
            android.view.ViewGroup viewGroup = zzVar.f365323d;
            db5.t7.makeText(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491703dz2), 0).show();
            ((mm2.h7) h7Var.business(mm2.h7.class)).f329116h = 0;
        }
        if (((mm2.h7) h7Var.business(mm2.h7.class)).f329116h == h7Var.f329117i.size()) {
            mm2.h7 h7Var2 = (mm2.h7) h7Var.business(mm2.h7.class);
            h7Var2.f329116h--;
        }
        if (((mm2.h7) h7Var.business(mm2.h7.class)).f329116h < 0) {
            ((mm2.h7) h7Var.business(mm2.h7.class)).f329116h = 0;
        }
        zzVar.y1(h7Var.f329117i);
    }
}
