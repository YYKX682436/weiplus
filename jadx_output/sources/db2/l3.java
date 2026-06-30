package db2;

/* loaded from: classes2.dex */
public final class l3 implements db2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db2.z2 f228057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f228058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f228059c;

    public l3(db2.z2 z2Var, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f228057a = z2Var;
        this.f228058b = c0Var;
        this.f228059c = continuation;
    }

    @Override // db2.z2
    public void onCgiBack(int i17, int i18, java.lang.String str, db2.c3 resp, java.util.List interceptors) {
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(interceptors, "interceptors");
        this.f228057a.onCgiBack(i17, i18, str, resp, interceptors);
        kotlin.jvm.internal.c0 c0Var = this.f228058b;
        if (!c0Var.f310112d) {
            this.f228059c.resumeWith(kotlin.Result.m521constructorimpl(resp));
        }
        c0Var.f310112d = true;
    }
}
