package hr3;

/* loaded from: classes9.dex */
public class k9 implements hr3.i9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f283719a;

    public k9(android.content.Context context) {
        this.f283719a = context;
    }

    @Override // hr3.i9
    public void a(com.tencent.mm.plugin.profile.ui.HelperHeaderPreference helperHeaderPreference) {
        helperHeaderPreference.O((c01.z1.n() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0);
    }

    @Override // hr3.i9
    public java.lang.CharSequence getHint() {
        return this.f283719a.getString(com.tencent.mm.R.string.ber);
    }

    @Override // hr3.i9
    public void onDetach() {
    }
}
