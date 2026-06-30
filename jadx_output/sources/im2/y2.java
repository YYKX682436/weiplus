package im2;

/* loaded from: classes.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f292617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f292617d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) this.f292617d.findViewById(com.tencent.mm.R.id.fkl);
        mMSwitchBtn.setCheck(true);
        return mMSwitchBtn;
    }
}
