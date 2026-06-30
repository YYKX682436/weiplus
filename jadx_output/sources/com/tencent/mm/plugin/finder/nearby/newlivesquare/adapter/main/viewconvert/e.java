package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class e implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.b f121635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.f f121636e;

    public e(vp2.b bVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.f fVar) {
        this.f121635d = bVar;
        this.f121636e = fVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        vp2.b bVar = this.f121635d;
        java.lang.Object obj = bVar.f438906e.get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.f fVar = this.f121636e;
        r45.qt2 qt2Var = fVar.f121657f;
        if (qt2Var == null || (str = qt2Var.getString(2)) == null) {
            str = "";
        }
        tp2.f fVar2 = fVar.f121656e;
        if (fVar2 != null) {
            tp2.f.d(fVar2, j5Var, i17, i18, view, bVar.f438906e, str, 4, null, null, null, 0L, 1920, null);
        }
    }
}
