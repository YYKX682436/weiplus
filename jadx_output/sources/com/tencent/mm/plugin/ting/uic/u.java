package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes8.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f174800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f174800d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f174800d;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.TingFlutterActivity");
        android.widget.FrameLayout U6 = ((com.tencent.mm.plugin.ting.TingFlutterActivity) appCompatActivity).U6();
        if (U6.getChildCount() > 0) {
            android.view.View childAt = U6.getChildAt(0);
            if (childAt instanceof io.flutter.embedding.android.FlutterView) {
                return (io.flutter.embedding.android.FlutterView) childAt;
            }
        }
        return null;
    }
}
