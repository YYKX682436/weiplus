package hr3;

/* loaded from: classes11.dex */
public class i1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283644a;

    public i1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI) {
        this.f283644a = contactInfoUI;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283644a;
        if (contactInfoUI.f153661n == null) {
            return null;
        }
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("page_type", java.lang.Integer.valueOf((contactInfoUI.f153661n.k2() || contactInfoUI.f153661n.l2()) ? 0 : !contactInfoUI.f153661n.r2() ? com.tencent.mm.storage.z3.m4(contactInfoUI.f153661n.d1()) ? 1 : 2 : contactInfoUI.f153661n.r2() ? com.tencent.mm.storage.z3.m4(contactInfoUI.f153661n.d1()) ? 3 : 4 : -1));
        return arrayMap;
    }
}
