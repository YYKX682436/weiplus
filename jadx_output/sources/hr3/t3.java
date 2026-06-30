package hr3;

/* loaded from: classes8.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283998e;

    public t3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, int i17) {
        this.f283997d = contactMoreInfoUI;
        this.f283998e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283997d;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.V6(contactMoreInfoUI, contactMoreInfoUI.f153677f, this.f283998e);
    }
}
