package ml2;

/* loaded from: classes10.dex */
public final class s5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ml2.s5 f327927d = new ml2.s5();

    public s5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.init(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int[] dRMCapabilities = com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.getDRMCapabilities();
        kotlin.jvm.internal.o.d(dRMCapabilities);
        return java.lang.Boolean.valueOf(kz5.z.F(dRMCapabilities, 0));
    }
}
