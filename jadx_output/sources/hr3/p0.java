package hr3;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final hr3.p0 f283870d = new hr3.p0();

    public p0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewGroup viewGroup = it instanceof android.view.ViewGroup ? (android.view.ViewGroup) it : null;
        return java.lang.Boolean.valueOf((viewGroup != null ? (com.tencent.mm.ui.widget.MMSwitchBtn) viewGroup.findViewById(com.tencent.mm.R.id.btf) : null) != null);
    }
}
