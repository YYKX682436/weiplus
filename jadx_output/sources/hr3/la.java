package hr3;

/* loaded from: classes11.dex */
public class la implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.ma f283756d;

    public la(hr3.ma maVar) {
        this.f283756d = maVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.va vaVar = this.f283756d.f283799d.f283859f;
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = vaVar.f284109e;
        c01.e2.k0(normalUserFooterPreference.L);
        normalUserFooterPreference.L.E2();
        if (normalUserFooterPreference.X) {
            normalUserFooterPreference.H1.setVisibility(0);
            vaVar.f();
        }
    }
}
