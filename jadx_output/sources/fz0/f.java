package fz0;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f267286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Intent intent) {
        super(0);
        this.f267286d = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] byteArrayExtra = this.f267286d.getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO");
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
