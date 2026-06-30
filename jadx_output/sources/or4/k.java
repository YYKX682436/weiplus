package or4;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final or4.k f347702d = new or4.k();

    public k() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewGroup viewGroup = it instanceof android.view.ViewGroup ? (android.view.ViewGroup) it : null;
        return java.lang.Boolean.valueOf((viewGroup == null || (mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) viewGroup.findViewById(com.tencent.mm.R.id.btf)) == null) ? false : mMSwitchBtn.f211363x);
    }
}
