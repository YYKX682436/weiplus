package hr3;

/* loaded from: classes11.dex */
public class ka implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283720d;

    public ka(hr3.va vaVar) {
        this.f283720d = vaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hr3.va vaVar = this.f283720d;
        if (vaVar.f284109e.K1.isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = vaVar.f284109e;
        xp1.c.c(normalUserFooterPreference.K1, normalUserFooterPreference.L.d1(), true);
        xp1.c.l(vaVar.f284109e.K1);
    }
}
