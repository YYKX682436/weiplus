package ks1;

/* loaded from: classes4.dex */
public final class c implements js1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f311580a;

    public c(kotlin.coroutines.Continuation continuation) {
        this.f311580a = continuation;
    }

    @Override // js1.a
    public void a(js1.b bVar, boolean z17) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f311580a.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(bVar, java.lang.Boolean.valueOf(z17))));
    }
}
