package rk4;

/* loaded from: classes11.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingMembershipTransparentUI f396863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.tencent.mm.plugin.ting.TingMembershipTransparentUI tingMembershipTransparentUI) {
        super(0);
        this.f396863d = tingMembershipTransparentUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (android.os.ResultReceiver) this.f396863d.getIntent().getParcelableExtra("key_result_receiver");
    }
}
