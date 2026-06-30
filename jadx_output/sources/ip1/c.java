package ip1;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ip1.c f293582d = new ip1.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ip1.e eVar = ip1.e.f293584a;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((java.lang.Number) ((jz5.n) ip1.e.f293585b).getValue()).intValue() == 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarConfig", "tingConfig inAudioPanelBlackList: " + valueOf.booleanValue());
        return valueOf;
    }
}
