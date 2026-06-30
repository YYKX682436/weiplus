package gk5;

/* loaded from: classes9.dex */
public final class c1 extends wm3.a {
    static {
        new gk5.b1(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
        }
    }
}
