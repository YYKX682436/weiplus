package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f116962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f116963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderMedia f116964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(gk2.e eVar, com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var, com.tencent.mm.protocal.protobuf.FinderMedia finderMedia) {
        super(1);
        this.f116962d = eVar;
        this.f116963e = a1Var;
        this.f116964f = finderMedia;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        java.util.LinkedList linkedList;
        r45.z73 z73Var;
        r45.kz0 kz0Var;
        gk2.e eVar = this.f116962d;
        int i18 = ((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f329078s).getValue()).d() ? 0 : ((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f329078s).getValue()).f329581e;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (pm0.v.z(((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f329078s).getValue()).f329581e, 1)) {
            linkedList2.addAll(zl2.r4.f473950a.p0(((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f329078s).getValue()).f329580d));
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        if (pm0.v.z(i18, 4)) {
            linkedList3.addAll(((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f329078s).getValue()).f329584h);
        }
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        if (pm0.v.z(i18, 2)) {
            linkedList4.addAll(((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f329078s).getValue()).f329583g);
        }
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        if (pm0.v.z(i18, 32)) {
            linkedList5.addAll(((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f329078s).getValue()).f329585i);
        }
        ((mm2.c1) eVar.a(mm2.c1.class)).p8(((int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q) & (-257));
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f116963e;
        a1Var.getClass();
        java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).H5;
        com.tencent.mars.xlog.Log.i(a1Var.f116871d, "fromChatRoomId:" + str + ", visibilityRoomList:" + kz5.n0.g0(linkedList4, ",", null, null, 0, null, null, 62, null));
        int i19 = ((str == null || str.length() == 0) || !linkedList4.contains(str)) ? 0 : 1;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = this.f116964f;
        com.tencent.mm.ui.widget.MMEditText mMEditText = a1Var.B;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("descTv");
            throw null;
        }
        java.lang.String obj2 = mMEditText.getText().toString();
        java.lang.String str2 = a1Var.f116883s;
        java.lang.String str3 = a1Var.f116884t;
        int i27 = a1Var.f116885u;
        r45.z53 z53Var = a1Var.f116887w;
        int integer = z53Var != null ? z53Var.getInteger(12) : 0;
        gk2.e eVar2 = dk2.ef.I;
        if (eVar2 == null) {
            i17 = i27;
            linkedList = linkedList4;
            eVar2 = new gk2.e(null, 1, null);
        } else {
            i17 = i27;
            linkedList = linkedList4;
        }
        r45.o92 o92Var = ((mm2.u0) eVar2.a(mm2.u0.class)).f329448n;
        java.util.LinkedList linkedList6 = ((mm2.c1) eVar.a(mm2.c1.class)).f328803f4.f309049a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        r45.n73 n73Var = a1Var.f116886v;
        db2.z zVar = new db2.z(finderMedia, obj2, str2, str3, i17, integer, o92Var, linkedList6, valueOf, linkedList3, linkedList, valueOf2, linkedList2, java.lang.Integer.valueOf((n73Var == null || (z73Var = (r45.z73) n73Var.getCustom(5)) == null || (kz0Var = (r45.kz0) z73Var.getCustom(10)) == null) ? 0 : kz0Var.getInteger(1)), ((mm2.c1) eVar.a(mm2.c1.class)).D5, (byte[]) ((jz5.l) ((kotlinx.coroutines.flow.h3) ((mm2.c1) eVar.a(mm2.c1.class)).E5).getValue()).f302834e, i19, ((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) eVar.a(mm2.g1.class)).f329078s).getValue()).f329582f);
        r45.xl6 xl6Var = a1Var.f116888x;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(xl6Var != null ? xl6Var.getInteger(2) : 0);
        r45.e01 e01Var = zVar.f228256u;
        e01Var.set(22, valueOf3);
        r45.xl6 xl6Var2 = a1Var.f116888x;
        e01Var.set(23, xl6Var2 != null ? xl6Var2.getString(3) : null);
        zVar.t(a1Var.getActivity(), a1Var.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        pq5.g l17 = zVar.l();
        androidx.appcompat.app.AppCompatActivity activity = a1Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI");
        l17.f((com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI) activity);
        l17.K(new com.tencent.mm.plugin.finder.live.viewmodel.b0(a1Var));
        return jz5.f0.f302826a;
    }
}
