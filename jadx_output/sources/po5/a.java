package po5;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po5.i f357345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f357346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(po5.i iVar, int i17) {
        super(0);
        this.f357345d = iVar;
        this.f357346e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f357345d.getClass();
        int i17 = this.f357346e;
        if (i17 == 2) {
            ((jp5.o) i95.n0.c(jp5.o.class)).A2();
            ((jp5.o) i95.n0.c(jp5.o.class)).je();
        }
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.y(i17 != 0 ? i17 != 1 ? i17 != 2 ? null : er4.v.VOIPMP_SYSTEM_CALL_STATUS_OFFHOOK : er4.v.VOIPMP_SYSTEM_CALL_STATUS_RINGING : er4.v.VOIPMP_SYSTEM_CALL_STATUS_IDLE, po5.g.f357352a);
        return jz5.f0.f302826a;
    }
}
