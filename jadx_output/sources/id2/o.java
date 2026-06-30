package id2;

/* loaded from: classes3.dex */
public final class o extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f290697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.g9b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById;
        this.f290697d = mMSwitchBtn;
        mMSwitchBtn.setCheck(zl2.r4.f473950a.O0());
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f290697d;
        if (mMSwitchBtn2 != null) {
            mMSwitchBtn2.setSwitchListener(id2.n.f290677a);
        } else {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
