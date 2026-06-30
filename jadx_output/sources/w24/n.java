package w24;

/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference f442632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference privacyUpdatePreference) {
        super(0);
        this.f442632d = privacyUpdatePreference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f442632d.M;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(android.R.id.title);
        }
        return null;
    }
}
