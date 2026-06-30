package fo5;

/* loaded from: classes3.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final fo5.u1 f265122d = new fo5.u1();

    public u1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.ilink_voip.RepairerConfigMultiTalkSwitchVoIPMPSwitch()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "isMultitalkChangeToVoipMP: " + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
