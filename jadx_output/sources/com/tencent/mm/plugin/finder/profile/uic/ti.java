package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes8.dex */
public final class ti extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f124240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC f124241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124242f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(boolean z17, com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC finderProfileUiStyleUIC, java.lang.String str) {
        super(0);
        this.f124240d = z17;
        this.f124241e = finderProfileUiStyleUIC;
        this.f124242f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String queryParameter;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC finderProfileUiStyleUIC = this.f124241e;
        boolean z17 = this.f124240d;
        if (z17) {
            finderProfileUiStyleUIC.f123499e = -1;
        }
        ya2.b2 b17 = ya2.h.f460484a.b(this.f124242f);
        finderProfileUiStyleUIC.f123502h = b17;
        jz5.l lVar = null;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = b17 != null ? b17.field_authInfo : null;
        if (finderAuthInfo == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh  profileContact=");
            sb6.append(finderProfileUiStyleUIC.f123502h != null);
            com.tencent.mars.xlog.Log.w("Finder.ProfileUiStyleUIC", sb6.toString());
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            boolean z18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderProfileCoverSettingShowEntrance", 1) == 1;
            com.tencent.mars.xlog.Log.i("FinderUserApi", "isEnableSetProfileCover:" + z18);
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E2).getValue()).r()).intValue() == 1;
            com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "isGlobalSetCoverOpen :" + z18 + " isForceUpdateCover:" + z19 + " isHard=" + z17);
            ya2.b2 b2Var = finderProfileUiStyleUIC.f123502h;
            if (b2Var != null) {
                if ((z18 && finderAuthInfo.getAuthIconType() == 2 && b2Var.field_coverEntranceFlag == 1) || z19) {
                    com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "refresh getCoverInfo");
                    java.lang.String str = b2Var.field_coverUrl;
                    if (str == null) {
                        str = "";
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && finderProfileUiStyleUIC.f123511t) {
                        int length = str.length() - 1;
                        if (length >= 0) {
                            while (true) {
                                int i17 = length - 1;
                                if (str.charAt(length) == '&') {
                                    break;
                                }
                                if (i17 < 0) {
                                    break;
                                }
                                length = i17;
                            }
                        }
                        length = -1;
                        if (length != -1) {
                            try {
                                android.net.Uri parse = android.net.Uri.parse(str);
                                int parseInt = (parse == null || (queryParameter = parse.getQueryParameter("bgColor")) == null) ? 0 : java.lang.Integer.parseInt(queryParameter, 16);
                                java.lang.String obj = str.subSequence(0, length).toString();
                                com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "getCoverInfo bgColor:" + parseInt + "  coverPath :" + obj);
                                lVar = new jz5.l(obj, java.lang.Integer.valueOf(parseInt));
                            } catch (java.lang.NullPointerException e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.ProfileUiStyleUIC", e17, "", new java.lang.Object[0]);
                            } catch (java.lang.NumberFormatException e18) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.ProfileUiStyleUIC", e18, "", new java.lang.Object[0]);
                            } catch (java.lang.Exception e19) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.ProfileUiStyleUIC", e19, "", new java.lang.Object[0]);
                            }
                        }
                    }
                    if (lVar != null) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("refresh ");
                        java.lang.String str2 = (java.lang.String) lVar.f302833d;
                        sb7.append(str2);
                        sb7.append("  ");
                        java.lang.Number number = (java.lang.Number) lVar.f302834e;
                        sb7.append(number.intValue());
                        com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", sb7.toString());
                        com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.O6(finderProfileUiStyleUIC, str2, number.intValue());
                    } else {
                        finderProfileUiStyleUIC.setNormalStyle();
                    }
                } else {
                    finderProfileUiStyleUIC.setNormalStyle();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
