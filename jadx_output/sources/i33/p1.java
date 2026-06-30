package i33;

/* loaded from: classes.dex */
public final class p1 extends i33.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f288235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288235d = "MicroMsg.ImagePreviewCheckBoxUIC";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kvd);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/ImagePreviewCheckBoxUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/gallery/ui/uic/ImagePreviewCheckBoxUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
