package gi5;

/* loaded from: classes12.dex */
public final class q extends bg3.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // bg3.e
    public void W6(mf3.k mediaInfo, java.lang.String destPath) {
        r45.gp0 gp0Var;
        java.lang.String str;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        super.W6(mediaInfo, destPath);
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(destPath);
        ai5.c cVar = mediaInfo instanceof ai5.c ? (ai5.c) mediaInfo : null;
        if (cVar == null || (gp0Var = cVar.f5207a) == null || (str = gp0Var.f375431q2) == null) {
            return;
        }
        ((yb0.g) ((zb0.d0) i95.n0.c(zb0.d0.class))).getClass();
        x51.x0.f452109a.a(p17, str);
    }
}
