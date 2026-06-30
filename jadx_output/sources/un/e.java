package un;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f429248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f429248d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f429248d;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.MMPreference");
        return ((com.tencent.mm.ui.base.preference.MMPreference) appCompatActivity).getPreferenceScreen();
    }
}
