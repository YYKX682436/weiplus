package zm1;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f474133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f474133d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f474133d;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.BizAudioFlutterActivity");
        android.widget.FrameLayout U6 = ((com.tencent.mm.plugin.audio.BizAudioFlutterActivity) appCompatActivity).U6();
        if (U6.getChildCount() > 0) {
            android.view.View childAt = U6.getChildAt(0);
            if (childAt instanceof io.flutter.embedding.android.FlutterView) {
                return (io.flutter.embedding.android.FlutterView) childAt;
            }
        }
        return null;
    }
}
