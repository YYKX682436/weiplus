package eo2;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f255558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        android.content.Intent intent = getActivity().getIntent();
        this.f255558d = intent != null ? intent.getIntExtra("key_member_inlet_source", 0) : 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
