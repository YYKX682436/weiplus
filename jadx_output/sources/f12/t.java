package f12;

/* loaded from: classes4.dex */
public final class t implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258671a;

    public t(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258671a = springLuckyEggActivity;
    }

    @Override // p11.k
    public final void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object[] objArr) {
        if (bitmap == null) {
            int i17 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.f97437o;
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258671a;
            f21.d0 d0Var = (f21.d0) springLuckyEggActivity.X6().f258628r.getValue();
            if (d0Var != null) {
                java.lang.String str2 = d0Var.f258868w;
                if (str2 == null || str2.length() == 0) {
                    return;
                }
                java.lang.String str3 = (y12.j.c() + "/egg/") + '/' + d0Var.f258868w;
                if (com.tencent.mm.vfs.w6.j(str3)) {
                    f12.c0 c0Var = springLuckyEggActivity.f97440f;
                    if (c0Var != null) {
                        c0Var.f258588q.post(new f12.s(springLuckyEggActivity, str3));
                    } else {
                        kotlin.jvm.internal.o.o("viewBinding");
                        throw null;
                    }
                }
            }
        }
    }
}
