package hr3;

/* loaded from: classes11.dex */
public class v9 extends l75.v0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference f284107e;

    public v9(com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference) {
        this.f284107e = normalUserFooterPreference;
    }

    @Override // l75.v0
    public void a(java.lang.Object obj, android.os.Looper looper) {
        android.support.v4.media.f.a(obj);
        if (looper == null) {
            looper = android.os.Looper.getMainLooper();
        }
        super.a(null, looper);
    }

    @Override // l75.v0
    public void h(java.lang.Object obj, java.lang.Object obj2) {
        android.support.v4.media.f.a(obj);
        java.lang.String str = (java.lang.String) obj2;
        boolean equals = str.equals("show_btn");
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f284107e;
        if (equals) {
            normalUserFooterPreference.L.d1();
            throw null;
        }
        if (str.equals("hide_btn")) {
            normalUserFooterPreference.L.d1();
            throw null;
        }
    }
}
