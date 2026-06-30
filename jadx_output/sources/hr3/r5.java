package hr3;

/* loaded from: classes8.dex */
public final class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283939e;

    public r5(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, int i17) {
        this.f283938d = contactMoreInfoUIWxContact;
        this.f283939e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f283938d;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact.V6(contactMoreInfoUIWxContact, contactMoreInfoUIWxContact.f153697f, this.f283939e);
    }
}
