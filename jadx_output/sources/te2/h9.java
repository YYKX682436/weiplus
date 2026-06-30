package te2;

/* loaded from: classes10.dex */
public final class h9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f418064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(r45.z22 z22Var) {
        super(1);
        this.f418064d = z22Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(bundle, "bundle");
        r45.z22 z22Var = this.f418064d;
        java.lang.String str = z22Var.f391627d;
        if (str != null) {
            bundle.putString("PARAM_FINDER_LIVE_SING_SONG_MID", str);
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_SING_SONG_ONLY_SEGMENT", z22Var.f391628e);
        java.lang.String str2 = z22Var.f391629f;
        if (str2 != null) {
            bundle.putString("PARAM_FINDER_LIVE_SING_SONG_UNIQUE_ADD_ID", str2);
        }
        return jz5.f0.f302826a;
    }
}
