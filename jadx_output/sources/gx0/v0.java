package gx0;

/* loaded from: classes3.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f277044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        super(0);
        this.f277044d = recordConfigProvider;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f277044d.M.getInt("KEY_POST_ENTERSCENE", 0);
        return java.lang.Boolean.valueOf(60 == i17 || 61 == i17);
    }
}
