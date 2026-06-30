package i33;

/* loaded from: classes.dex */
public final class y1 extends i33.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.o17);
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(11);
            findViewById.setLayoutParams(layoutParams2);
        }
    }
}
