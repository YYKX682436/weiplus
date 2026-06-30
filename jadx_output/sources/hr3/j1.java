package hr3;

/* loaded from: classes11.dex */
public class j1 implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283666d;

    public j1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI) {
        this.f283666d = contactInfoUI;
    }

    @Override // vj5.k
    public void n6(int i17) {
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283666d;
        if (contactInfoUI.f153668u || contactInfoUI.f153669v) {
            contactInfoUI.K.setPadding(0, i17, 0, 0);
        }
    }
}
