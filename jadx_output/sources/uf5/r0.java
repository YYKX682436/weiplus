package uf5;

/* loaded from: classes10.dex */
public class r0 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrUIBase f427293d;

    public r0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase) {
        this.f427293d = contactMgrUIBase;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase = this.f427293d;
        if (equals) {
            contactMgrUIBase.f207102f.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = contactMgrUIBase.f207103g.f427315o;
        int intValue = hashMap.get(str) == null ? -1 : ((java.lang.Integer) hashMap.get(str)).intValue();
        if (intValue != -1) {
            contactMgrUIBase.f207102f.setSelection(intValue);
        }
    }
}
