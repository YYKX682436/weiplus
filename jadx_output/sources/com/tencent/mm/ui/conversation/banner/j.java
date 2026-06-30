package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public abstract class j {
    public static s35.a a(android.content.Context context, com.tencent.mm.ui.conversation.banner.i iVar, java.lang.Object[] objArr) {
        s35.a mVar;
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            return new com.tencent.mm.ui.conversation.banner.a0(context);
        }
        boolean z17 = false;
        if (ordinal == 1) {
            if (objArr == null || objArr.length != 2) {
                return null;
            }
            java.lang.Object obj = objArr[0];
            java.lang.String obj2 = obj != null ? obj.toString() : null;
            java.lang.Object obj3 = objArr[1];
            java.lang.String obj4 = obj3 != null ? obj3.toString() : null;
            if (c01.d9.b().n() == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BannerFactory", "recommend banner stg is null. this may be caused by account async init.");
            }
            if (c01.d9.b().n() == null) {
                return null;
            }
            if (c01.d9.b().n().f(obj2) || c01.d9.b().n().f(obj4)) {
                return new com.tencent.mm.ui.conversation.banner.l(context, obj2, obj4);
            }
            return null;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return new com.tencent.mm.ui.conversation.banner.k0(context);
                }
                if (ordinal == 5) {
                    return new com.tencent.mm.ui.conversation.banner.l0(context);
                }
                if (ordinal == 7) {
                    return new com.tencent.mm.ui.conversation.banner.o0(context);
                }
                if (ordinal == 9) {
                    return new com.tencent.mm.ui.conversation.banner.e(context);
                }
                if (ordinal == 12) {
                    return new com.tencent.mm.ui.conversation.banner.q0(context);
                }
                if (ordinal == 14) {
                    return new cb5.e(context, (objArr == null || objArr.length <= 0) ? e01.c.Main : (e01.c) objArr[0]);
                }
                if (ordinal != 15) {
                    return null;
                }
                return new zf5.g(context);
            }
            if (objArr == null || objArr.length != 3) {
                return null;
            }
            java.lang.Object obj5 = objArr[0];
            java.lang.String obj6 = obj5 != null ? obj5.toString() : null;
            java.lang.Object obj7 = objArr[1];
            java.lang.String obj8 = obj7 != null ? obj7.toString() : null;
            java.lang.Object obj9 = objArr[2];
            if (obj9 != null && (obj9 instanceof java.lang.Boolean)) {
                z17 = ((java.lang.Boolean) obj9).booleanValue();
            }
            if ((!gm0.j1.a() || c01.d9.b().o() == null || !c01.d9.b().o().f(obj6)) && !c01.d9.b().o().f(obj8)) {
                return null;
            }
            mVar = new com.tencent.mm.ui.conversation.banner.o(context, obj6, obj8, z17);
        } else {
            if (objArr == null || objArr.length != 3) {
                return null;
            }
            java.lang.Object obj10 = objArr[0];
            java.lang.String obj11 = obj10 != null ? obj10.toString() : null;
            java.lang.Object obj12 = objArr[1];
            java.lang.String obj13 = obj12 != null ? obj12.toString() : null;
            java.lang.Object obj14 = objArr[2];
            if (obj14 != null && (obj14 instanceof java.lang.Boolean)) {
                z17 = ((java.lang.Boolean) obj14).booleanValue();
            }
            if ((!gm0.j1.a() || c01.d9.b().o() == null || !c01.d9.b().o().f(obj11)) && !c01.d9.b().o().f(obj13)) {
                return null;
            }
            mVar = new com.tencent.mm.ui.conversation.banner.m(context, obj11, obj13, z17);
        }
        return mVar;
    }
}
