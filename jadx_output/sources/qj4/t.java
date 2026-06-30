package qj4;

/* loaded from: classes11.dex */
public final class t extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ui();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPostDestroyed() {
        super.onPostDestroyed();
        java.util.Stack stack = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).f363960e;
        if (stack.empty()) {
            return;
        }
        stack.pop();
    }
}
