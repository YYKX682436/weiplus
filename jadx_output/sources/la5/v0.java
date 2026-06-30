package la5;

/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final la5.v0 f317645d = new la5.v0();

    public v0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewParent parent = it.getParent().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        return java.lang.Boolean.valueOf((viewGroup == null || (mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) viewGroup.findViewById(com.tencent.mm.R.id.btf)) == null) ? false : mMSwitchBtn.f211363x);
    }
}
