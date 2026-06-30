package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class a6 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.g6 f191513a;

    public a6(com.tencent.mm.pluginsdk.ui.tools.g6 g6Var) {
        this.f191513a = g6Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        android.app.Activity activity = this.f191513a.f191644a;
        dp.a.makeText(activity, activity.getString(com.tencent.mm.R.string.jzm, q75.c.c(destPath)), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        android.app.Activity activity = this.f191513a.f191644a;
        dp.a.makeText(activity, activity.getString(com.tencent.mm.R.string.jzl), 1).show();
    }
}
