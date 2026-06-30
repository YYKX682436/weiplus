package zf0;

/* loaded from: classes12.dex */
public final class m0 implements zf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f472476b;

    public m0(zf0.v0 v0Var, java.util.Map map) {
        this.f472475a = v0Var;
        this.f472476b = map;
    }

    @Override // zf0.a
    public boolean a(int i17) {
        java.lang.Integer d17 = this.f472475a.d(false);
        if (d17 == null) {
            return false;
        }
        d17.intValue();
        java.util.Map map = this.f472476b;
        if (map != null) {
            map.put("e_gen_compress_video_failed", "cancel_from_origin");
        }
        return true;
    }
}
