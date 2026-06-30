package mz0;

/* loaded from: classes3.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.l2 f332964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(mz0.l2 l2Var) {
        super(0);
        this.f332964d = l2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArrayExtra;
        mz0.l2 l2Var = this.f332964d;
        if (l2Var.getIntent().hasExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO") && (byteArrayExtra = l2Var.getIntent().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO")) != null) {
            r45.zi2 zi2Var = new r45.zi2();
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
