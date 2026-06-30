package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class a3 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f123524d;

    public a3(com.tencent.mm.plugin.finder.profile.uic.j3 j3Var) {
        this.f123524d = j3Var;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (!(j5Var instanceof so2.k0)) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick position:");
        sb6.append(i17);
        sb6.append("} ");
        so2.k0 k0Var = (so2.k0) j5Var;
        sb6.append(k0Var.f410452d.field_objectType);
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileDraftUIC", sb6.toString());
        com.tencent.mm.plugin.finder.profile.uic.j3 j3Var = this.f123524d;
        rl5.r rVar = j3Var.f123834p;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        androidx.appcompat.app.AppCompatActivity activity = j3Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.profile.uic.f4.a7((com.tencent.mm.plugin.finder.profile.uic.f4) a17, "draftdelete", 0, pm0.v.u(k0Var.f410452d.field_localId), 0, null, 24, null);
        rl5.r rVar2 = j3Var.f123834p;
        if (rVar2 != null) {
            rVar2.h(view, new com.tencent.mm.plugin.finder.profile.uic.g3(j3Var), new com.tencent.mm.plugin.finder.profile.uic.h3(k0Var, j3Var), com.tencent.mm.view.HardTouchableLayout.f213305q, com.tencent.mm.view.HardTouchableLayout.f213306r);
            return true;
        }
        kotlin.jvm.internal.o.o("popupMenu");
        throw null;
    }
}
