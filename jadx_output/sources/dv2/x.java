package dv2;

/* loaded from: classes.dex */
public final class x extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f243970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fss);
        if (findViewById != null) {
            findViewById.setOnClickListener(new dv2.w(this));
        } else {
            findViewById = null;
        }
        this.f243970d = findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
