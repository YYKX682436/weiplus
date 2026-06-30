package zl2;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.f f473753a = new zl2.f();

    public static final void a(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar, com.tencent.mm.plugin.finder.assist.v0 v0Var) {
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(v0Var));
    }

    public final java.lang.Object b(android.content.Context context, int i17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2, long j17, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        long c17 = c01.id.c();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        zl2.e eVar = new zl2.e(c0Var, rVar);
        ((sb0.f) ((tb0.i) i95.n0.c(tb0.i.class))).getClass();
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.R6(context, i17, str, eVar, z17, z18, str2);
        pm0.v.V(3000L, new zl2.c(c0Var, c17, str3, eVar, rVar));
        pm0.v.V(j17, new zl2.d(c0Var, str3, eVar, rVar));
        java.lang.Object j18 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j18;
    }
}
