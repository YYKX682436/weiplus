package m14;

/* loaded from: classes.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f322868d;

    public e(android.graphics.Bitmap bitmap) {
        this.f322868d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.a();
        c01.z1.r();
        if (gm0.j1.a()) {
            android.graphics.Bitmap bitmap = this.f322868d;
            if (bitmap != null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.T6(bitmap, com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r() + ".last", true, false));
            }
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            c01.b9.f37069c.b(com.tencent.mm.modelavatar.g.c(r17, false, true));
            ((p03.e) ((f50.c0) i95.n0.c(f50.c0.class))).wi();
        }
    }
}
