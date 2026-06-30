package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ou extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f113783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(com.tencent.mm.plugin.finder.live.plugin.iv ivVar) {
        super(1);
        this.f113783d = ivVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String username;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact6;
        java.lang.String username2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact7;
        r45.xn1 xn1Var = (r45.xn1) obj;
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f113783d;
        boolean z17 = ivVar.z1();
        java.lang.String str = ivVar.f113016r;
        java.lang.String str2 = null;
        if (z17 || ivVar.A1()) {
            java.lang.String str3 = "";
            if (ivVar.f113015q.getLiveRole() == 0) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327534r, "", 0);
            }
            ivVar.f113026y0 = xn1Var;
            boolean c27 = zl2.r4.f473950a.c2((xn1Var == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact5.getUsername());
            int integer = xn1Var != null ? xn1Var.getInteger(7) : 1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemClick username:");
            r45.xn1 xn1Var2 = ivVar.f113026y0;
            sb6.append((xn1Var2 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact4.getUsername());
            sb6.append(", nickname:");
            r45.xn1 xn1Var3 = ivVar.f113026y0;
            sb6.append((xn1Var3 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact3.getNickname());
            sb6.append(", disableComment:");
            r45.xn1 xn1Var4 = ivVar.f113026y0;
            sb6.append(xn1Var4 != null ? java.lang.Integer.valueOf(xn1Var4.getInteger(2)) : null);
            sb6.append(",isMySelf:");
            sb6.append(c27);
            sb6.append(",userRoleType:");
            sb6.append(integer);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (ivVar.z1() || ivVar.A1()) {
                r45.xn1 xn1Var5 = ivVar.f113026y0;
                if (xn1Var5 != null && (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) != null) {
                    str2 = finderContact2.getUsername();
                }
                if (str2 != null && str2.length() != 0) {
                    r4 = false;
                }
                if (!r4 && integer != 4) {
                    r45.xn1 xn1Var6 = ivVar.f113026y0;
                    if (xn1Var6 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var6.getCustom(0)) != null && (username = finderContact.getUsername()) != null) {
                        str3 = username;
                    }
                    com.tencent.mm.plugin.finder.live.plugin.iv.w1(ivVar, str3);
                }
            } else if (!c27) {
                com.tencent.mm.plugin.finder.live.plugin.iv.v1(ivVar, integer);
            }
        } else {
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (xn1Var != null && (finderContact7 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
                str2 = finderContact7.getUsername();
            }
            if (r4Var.c2(str2)) {
                com.tencent.mars.xlog.Log.i(str, "Clicked member is myself. Do not go to profile");
            } else {
                if ((xn1Var != null && xn1Var.getInteger(7) == 3) && (finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null && (username2 = finderContact6.getUsername()) != null) {
                    dk2.q4 q4Var = dk2.q4.f233938a;
                    android.content.Context context = ivVar.R0().getContext();
                    gk2.e S0 = ivVar.S0();
                    android.content.Context context2 = ivVar.R0().getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    dk2.q4.j(q4Var, context, S0, false, username2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.ra.class))).V6(), false, null, 96, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
