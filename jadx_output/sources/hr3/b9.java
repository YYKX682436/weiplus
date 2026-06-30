package hr3;

/* loaded from: classes9.dex */
public class b9 implements hr3.i9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f283423a;

    public b9(android.content.Context context) {
        this.f283423a = context;
    }

    @Override // hr3.i9
    public void a(com.tencent.mm.plugin.profile.ui.HelperHeaderPreference helperHeaderPreference) {
        helperHeaderPreference.O(true);
    }

    @Override // hr3.i9
    public java.lang.CharSequence getHint() {
        return this.f283423a.getString(com.tencent.mm.R.string.bdw);
    }

    @Override // hr3.i9
    public void onDetach() {
    }
}
