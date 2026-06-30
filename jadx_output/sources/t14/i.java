package t14;

/* loaded from: classes.dex */
public final class i extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.b().j();
        java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }
}
