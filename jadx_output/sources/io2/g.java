package io2;

/* loaded from: classes2.dex */
public final class g implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io2.i f293475d;

    public g(io2.i iVar) {
        this.f293475d = iVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter = this.f293475d.f293477d.getDataListJustForAdapter();
        if (i17 >= 0 && i17 < dataListJustForAdapter.size()) {
            java.lang.Object obj = dataListJustForAdapter.get(i17);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
            so2.j3 j3Var = (so2.j3) obj;
            android.content.Intent intent = new android.content.Intent();
            j3Var.f410441d.f391038h = null;
            j3Var.f410442e = null;
            adapter.notifyItemChanged(i17);
            intent.putExtra("key_member_inlet_source", 8);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.yf2 yf2Var = j3Var.f410441d;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = yf2Var.f391034d;
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            i0Var.Nk(context, intent, str, 0, 0);
            cl0.g gVar = new cl0.g();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = yf2Var.f391034d;
            gVar.h("finderusername", finderContact2 != null ? finderContact2.getUsername() : null);
            gVar.h("tabtype", "会员专区");
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            com.tencent.mm.plugin.finder.report.o3.Mj(o3Var, context, 16L, 1L, false, 0, 0, r26.i0.t(gVar2, ",", ";", false), 56, null);
        }
    }
}
