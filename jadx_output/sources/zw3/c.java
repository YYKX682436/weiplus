package zw3;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final zw3.c f476874d = new zw3.c();

    public c() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = it instanceof com.tencent.mm.ui.widget.MMSwitchBtn ? (com.tencent.mm.ui.widget.MMSwitchBtn) it : null;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(false);
        }
        return jz5.f0.f302826a;
    }
}
