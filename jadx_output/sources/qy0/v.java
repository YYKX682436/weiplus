package qy0;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qy0.d0 d0Var) {
        super(0);
        this.f367652d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArrayExtra = this.f367652d.getIntent().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO");
        r45.zi2 zi2Var = new r45.zi2();
        if (byteArrayExtra != null) {
            try {
                zi2Var.parseFrom(byteArrayExtra);
                return zi2Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        return null;
    }
}
