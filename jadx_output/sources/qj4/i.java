package qj4;

/* loaded from: classes11.dex */
public final class i extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ri();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Di();
    }
}
