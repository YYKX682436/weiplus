package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class j implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v f158431d;

    public j(com.tencent.mm.plugin.ringtone.uic.v vVar) {
        this.f158431d = vVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        t45.f fVar;
        vx3.i a17;
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        if (i17 < 0 || i17 >= wxRecyclerAdapter.getItemCount() - wxRecyclerAdapter.Z()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneDataUIC", "invalid position:" + i17);
            return;
        }
        int a07 = wxRecyclerAdapter.a0();
        com.tencent.mm.plugin.ringtone.uic.v vVar = this.f158431d;
        if (i17 < a07) {
            java.lang.Object obj = wxRecyclerAdapter.f293102i.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            if (((in5.w) obj) instanceof ox3.p) {
                androidx.appcompat.app.AppCompatActivity activity = vVar.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                ((com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class)).T6();
                return;
            }
            return;
        }
        int a08 = i17 - wxRecyclerAdapter.a0();
        ox3.f fVar2 = (ox3.f) kz5.n0.a0(wxRecyclerAdapter.getData(), a08);
        if (fVar2 == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = vVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.ringtone.uic.c3 c3Var = (com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.c3.class);
        c3Var.getClass();
        ed0.z0.i1(c3Var, 7L, a08, fVar2, 0L, 8, null);
        t45.g gVar = ((ox3.g) fVar2).f349749d.f415617f;
        if (gVar == null || (fVar = gVar.f415560d) == null || (a17 = qx3.d.a(fVar.f415549d)) == null) {
            return;
        }
        t45.p0 p0Var = gVar.f415575v;
        int i18 = vVar.getActivity() instanceof com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ? 26 : 25;
        long j17 = p0Var != null ? p0Var.f415630f : 0L;
        if (p0Var == null || (str = p0Var.f415631g) == null) {
            str = "";
        }
        vVar.R6(a17, 38, i18, j17, str, a08);
    }
}
