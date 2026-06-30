package hr3;

/* loaded from: classes9.dex */
public class d9 implements hr3.i9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f283480a;

    public d9(android.content.Context context) {
        this.f283480a = context;
    }

    @Override // hr3.i9
    public void a(com.tencent.mm.plugin.profile.ui.HelperHeaderPreference helperHeaderPreference) {
        helperHeaderPreference.O((c01.z1.n() & 32768) == 0);
    }

    @Override // hr3.i9
    public java.lang.CharSequence getHint() {
        return this.f283480a.getString(com.tencent.mm.R.string.bdt);
    }

    @Override // hr3.i9
    public void onDetach() {
    }
}
