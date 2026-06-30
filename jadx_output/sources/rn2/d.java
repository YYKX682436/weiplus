package rn2;

/* loaded from: classes3.dex */
public final class d implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.a94 f397686a;

    public d(r45.a94 a94Var) {
        this.f397686a = a94Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.e("FinderLiveLotteryCreateConfig", "setLiveLotterySetting fail!");
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        g92.b bVar = g92.b.f269769e;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        m92.c cVar = new m92.c(xy2.c.e(context));
        r45.kz0 kz0Var = cVar.field_liveInfo;
        r45.a94 a94Var = this.f397686a;
        if (kz0Var != null) {
            kz0Var.set(4, a94Var);
        }
        bVar.C(cVar, m92.j.f325001s);
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateConfig", "setLiveLotterySetting success:" + a94Var.f369857d + ", " + a94Var.f369858e + '!');
    }
}
