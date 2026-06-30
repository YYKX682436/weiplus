package w24;

/* loaded from: classes9.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference f442631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference privacyUpdatePreference) {
        super(0);
        this.f442631d = privacyUpdatePreference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f442631d.M;
        if (view != null) {
            return (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.lqe);
        }
        return null;
    }
}
