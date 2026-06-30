package eb1;

/* loaded from: classes7.dex */
public interface d extends si1.k0, fl1.e2 {
    si1.i0 b(com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str, vi1.j2 j2Var, com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem, vi1.f0 f0Var);

    void f(boolean z17);

    void setAppBrandName(java.lang.String str);

    void setDialogApplyWording(java.lang.String str);

    void setDialogRequestDesc(java.lang.String str);

    void setDialogSubDesc(java.lang.String str);

    void setIconUrl(java.lang.String str);

    void setOnAccept(yz5.l lVar);

    void setOnAddPhoneNumber(yz5.a aVar);

    void setOnCancel(yz5.a aVar);

    void setOnDeny(yz5.a aVar);

    void setOnExplain(yz5.a aVar);

    void setOnManagePhoneNumber(yz5.a aVar);

    void setOnPhoneItemSelect(yz5.l lVar);

    void setPhoneItems(java.util.ArrayList arrayList);
}
