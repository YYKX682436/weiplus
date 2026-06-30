package hr3;

/* loaded from: classes11.dex */
public class x5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI f284171d;

    public x5(com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI contactSocialInfoUI) {
        this.f284171d = contactSocialInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI.f153713s;
        this.f284171d.W6();
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_PROFILE_WEIDIANINFO_ALERT_INT, 1);
    }
}
