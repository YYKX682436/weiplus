package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wx extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f114999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        super(1);
        this.f114999d = tyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        byte[] byteArray;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        java.lang.String str2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact6;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact7;
        java.lang.String str3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact8;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact9;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact10;
        r45.xn1 xn1Var = (r45.xn1) obj;
        boolean z17 = true;
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = null;
        if (this.f114999d.w1()) {
            if (this.f114999d.f114485p.getLiveRole() == 0) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327534r, "", 0);
            }
            this.f114999d.V = xn1Var;
            boolean c27 = zl2.r4.f473950a.c2((xn1Var == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact5.getUsername());
            int integer = xn1Var != null ? xn1Var.getInteger(7) : 1;
            java.lang.String str4 = this.f114999d.f114488q;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemClick username:");
            r45.xn1 xn1Var2 = this.f114999d.V;
            sb6.append((xn1Var2 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact4.getUsername());
            sb6.append(", nickname:");
            r45.xn1 xn1Var3 = this.f114999d.V;
            sb6.append((xn1Var3 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact3.getNickname());
            sb6.append(", disableComment:");
            r45.xn1 xn1Var4 = this.f114999d.V;
            sb6.append(xn1Var4 != null ? java.lang.Integer.valueOf(xn1Var4.getInteger(2)) : null);
            sb6.append(",isMySelf:");
            sb6.append(c27);
            sb6.append(",userRoleType:");
            sb6.append(integer);
            com.tencent.mars.xlog.Log.i(str4, sb6.toString());
            if (this.f114999d.w1()) {
                r45.xn1 xn1Var5 = this.f114999d.V;
                java.lang.String username = (xn1Var5 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) == null) ? null : finderContact2.getUsername();
                if ((username == null || username.length() == 0) == false && integer != 4) {
                    this.f114999d.B1(2, xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(7)) : null);
                    com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f114999d;
                    r45.xn1 xn1Var6 = tyVar.V;
                    if (xn1Var6 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var6.getCustom(0)) == null || (str = finderContact.getUsername()) == null) {
                        str = "";
                    }
                    r45.xn1 xn1Var7 = this.f114999d.V;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", str);
                    bundle.putBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE", false);
                    bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 10);
                    bundle.putInt("PARAM_MEMBERS_PROFILE_SORT_TYPE", tyVar.Z == 0 ? 1 : 2);
                    if (xn1Var7 != null && (byteArray = xn1Var7.toByteArray()) != null) {
                        bundle.putByteArray("PARAM_MEMBERS_PROFILE_CONTACT", byteArray);
                    }
                    qo0.b bVar = qo0.b.f365376l1;
                    qo0.c cVar = tyVar.f114485p;
                    cVar.statusChange(bVar, bundle);
                    tyVar.u1();
                    if (cVar.getLiveRole() == 1) {
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).Xj(ml2.r3.f327901f);
                    }
                }
            } else if (!c27) {
                this.f114999d.B1(2, xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(7)) : null);
                com.tencent.mm.plugin.finder.live.plugin.ty tyVar2 = this.f114999d;
                if (tyVar2.W == null) {
                    tyVar2.W = new com.tencent.mm.ui.widget.dialog.k0(tyVar2.R0().getContext(), 1, false);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var = tyVar2.W;
                if (k0Var != null) {
                    k0Var.t(true);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = tyVar2.W;
                if (k0Var2 != null) {
                    k0Var2.f211872n = new com.tencent.mm.plugin.finder.live.plugin.ny(tyVar2, integer);
                }
                if (k0Var2 != null) {
                    k0Var2.f211881s = tyVar2.f114486p0;
                }
                if (k0Var2 != null) {
                    k0Var2.p(new com.tencent.mm.plugin.finder.live.plugin.oy(tyVar2));
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var3 = tyVar2.W;
                if (k0Var3 != null) {
                    k0Var3.v();
                }
                if (integer == 3) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327536t, "", 0);
                }
            }
        } else {
            if (zl2.r4.f473950a.c2((xn1Var == null || (finderContact10 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact10.getUsername()) || ((mm2.c1) this.f114999d.P0(mm2.c1.class)).A) {
                com.tencent.mars.xlog.Log.i(this.f114999d.f114488q, "Clicked member is myself or visitorAnoymous. Do not go to profile");
            } else {
                if ((xn1Var != null && xn1Var.getInteger(7) == 3) == true) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putByteArray("PARAM_MEMBERS_PROFILE_CONTACT", xn1Var != null ? xn1Var.toByteArray() : null);
                    bundle2.putBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE", false);
                    if (xn1Var == null || (finderContact9 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str3 = finderContact9.getUsername()) == null) {
                        str3 = "";
                    }
                    bundle2.putString("PARAM_MEMBERS_PROFILE_USERNAME", str3);
                    bundle2.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 10);
                    bundle2.putInt("PARAM_MEMBERS_PROFILE_SORT_TYPE", this.f114999d.Z == 0 ? 1 : 2);
                    java.util.List list = ((mm2.o4) this.f114999d.P0(mm2.o4.class)).f329327v;
                    if (list != null) {
                        synchronized (list) {
                            java.util.Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it.next();
                                if (kotlin.jvm.internal.o.b(((km2.q) next).f309172c, (xn1Var == null || (finderContact8 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact8.getUsername())) {
                                    obj2 = next;
                                    break;
                                }
                            }
                        }
                        km2.q qVar = (km2.q) obj2;
                        if (qVar != null) {
                            java.lang.String str5 = qVar.f309170a;
                            if (str5 == null) {
                                str5 = "";
                            }
                            bundle2.putString("PARAM_MEMBERS_PROFILE_USER_MIC_ID", str5);
                            bundle2.putBoolean("PARAM_MEMBERS_PROFILE_REPLAY_GIFT", qVar.f309177h);
                            if (!qVar.f309177h) {
                                java.lang.Boolean bool = qVar.f309189t;
                                if (!(bool != null ? bool.booleanValue() : false)) {
                                    z17 = false;
                                }
                            }
                            bundle2.putBoolean("PARAM_MEMBERS_PROFILE_IS_OTHER_ROOM_USER", z17);
                        }
                    }
                    this.f114999d.f113325g.statusChange(qo0.b.f365376l1, bundle2);
                } else {
                    this.f114999d.B1(2, xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(7)) : null);
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putByteArray("PARAM_MEMBERS_PROFILE_CONTACT", xn1Var != null ? xn1Var.toByteArray() : null);
                    bundle3.putBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE", false);
                    if (xn1Var == null || (finderContact7 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str2 = finderContact7.getUsername()) == null) {
                        str2 = "";
                    }
                    bundle3.putString("PARAM_MEMBERS_PROFILE_USERNAME", str2);
                    bundle3.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 10);
                    bundle3.putInt("PARAM_MEMBERS_PROFILE_SORT_TYPE", this.f114999d.Z == 0 ? 1 : 2);
                    java.util.List list2 = ((mm2.o4) this.f114999d.P0(mm2.o4.class)).f329327v;
                    if (list2 != null) {
                        synchronized (list2) {
                            java.util.Iterator it6 = list2.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    break;
                                }
                                java.lang.Object next2 = it6.next();
                                if (kotlin.jvm.internal.o.b(((km2.q) next2).f309172c, (xn1Var == null || (finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact6.getUsername())) {
                                    obj3 = next2;
                                    break;
                                }
                            }
                        }
                        km2.q qVar2 = (km2.q) obj3;
                        if (qVar2 != null) {
                            java.lang.String str6 = qVar2.f309170a;
                            if (str6 == null) {
                                str6 = "";
                            }
                            bundle3.putString("PARAM_MEMBERS_PROFILE_USER_MIC_ID", str6);
                        }
                    }
                    this.f114999d.f113325g.statusChange(qo0.b.f365376l1, bundle3);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
