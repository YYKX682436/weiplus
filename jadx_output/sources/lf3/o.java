package lf3;

/* loaded from: classes12.dex */
public abstract class o extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public abstract int T6();

    public final pf5.c U6(java.lang.Class apiClass) {
        kotlin.jvm.internal.o.g(apiClass, "apiClass");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        return pf5.z.f353948a.a(activity).d(apiClass);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        setRootView(contentView);
    }
}
