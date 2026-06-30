package dz4;

/* loaded from: classes12.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.b3 f245162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245163e;

    public a3(dz4.b3 b3Var, java.lang.String str) {
        this.f245162d = b3Var;
        this.f245163e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.b3 b3Var = this.f245162d;
        com.tencent.wechat.aff.favorites.h hVar = b3Var.f245175b;
        if (hVar != null) {
            java.lang.String str = hVar.f216790s[12] ? hVar.f216789r : "";
            dz4.i3 c17 = ((ez4.u) b3Var.f245174a).c();
            java.lang.String path = this.f245163e;
            kotlin.jvm.internal.o.f(path, "$path");
            com.tencent.wechat.aff.favorites.j a17 = c17.a(path);
            dz4.m0 m0Var = b3Var.f245176c;
            if (m0Var != null) {
                kotlin.jvm.internal.o.d(str);
                ((dz4.a0) m0Var).a(str, a17);
            }
        }
    }
}
