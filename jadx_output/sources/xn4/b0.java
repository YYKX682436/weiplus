package xn4;

/* loaded from: classes11.dex */
public final class b0 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f455601a;

    public b0(r45.mm6 mm6Var) {
        this.f455601a = mm6Var;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        xn4.c0.f455607d = false;
        r45.mm6 mm6Var = this.f455601a;
        if (num != null && num.intValue() == 0) {
            xn4.c0 c0Var = xn4.c0.f455604a;
            java.lang.String cdnUrl = mm6Var.f380677p;
            kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
            xn4.c0.a(c0Var, c0Var.g(cdnUrl), new xn4.a0(mm6Var));
            java.lang.String cdnUrl2 = mm6Var.f380677p;
            kotlin.jvm.internal.o.f(cdnUrl2, "cdnUrl");
            c0Var.i(cdnUrl2, 4);
            return null;
        }
        xn4.c0 c0Var2 = xn4.c0.f455604a;
        java.lang.String cdnUrl3 = mm6Var.f380677p;
        kotlin.jvm.internal.o.f(cdnUrl3, "cdnUrl");
        java.lang.String cdnUrl4 = mm6Var.f380677p;
        kotlin.jvm.internal.o.f(cdnUrl4, "cdnUrl");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_MERGE_TRYTIME").putInt(cdnUrl3, com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_MERGE_TRYTIME").getInt(cdnUrl4, 0) + 1);
        java.lang.String cdnUrl5 = mm6Var.f380677p;
        kotlin.jvm.internal.o.f(cdnUrl5, "cdnUrl");
        if (com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_MERGE_TRYTIME").getInt(cdnUrl5, 0) < 2) {
            java.lang.String cdnUrl6 = mm6Var.f380677p;
            kotlin.jvm.internal.o.f(cdnUrl6, "cdnUrl");
            c0Var2.i(cdnUrl6, 0);
            return null;
        }
        xn4.e0 e0Var = xn4.e0.f455614d;
        java.lang.String newApkMd5 = mm6Var.f380671g;
        kotlin.jvm.internal.o.f(newApkMd5, "newApkMd5");
        e0Var.c(newApkMd5);
        java.lang.String cdnUrl7 = mm6Var.f380677p;
        kotlin.jvm.internal.o.f(cdnUrl7, "cdnUrl");
        c0Var2.i(cdnUrl7, 2);
        return null;
    }
}
