package mz0;

/* loaded from: classes4.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f333072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(mz0.x2 x2Var) {
        super(0);
        this.f333072d = x2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArrayExtra = this.f333072d.getIntent().getByteArrayExtra("key_video_template_info");
        if (byteArrayExtra == null) {
            return null;
        }
        r45.ib6 ib6Var = new r45.ib6();
        try {
            ib6Var.parseFrom(byteArrayExtra);
            return ib6Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            return ib6Var;
        }
    }
}
