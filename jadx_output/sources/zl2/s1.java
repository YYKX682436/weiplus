package zl2;

/* loaded from: classes3.dex */
public final class s1 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f473964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473966c;

    public s1(kotlin.coroutines.Continuation continuation, java.lang.String str, java.lang.String str2) {
        this.f473964a = continuation;
        this.f473965b = str;
        this.f473966c = str2;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        kotlin.coroutines.Continuation continuation = this.f473964a;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("FinderLiveUtil", "[genSecurityData] downloadImage error:" + this.f473965b);
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        fo3.s sVar = fo3.s.INSTANCE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f473966c);
        java.util.ArrayList id6 = sVar.id(arrayList);
        kotlin.jvm.internal.o.f(id6, "getSecSdkImageInfoBuffers(...)");
        continuation.resumeWith(kotlin.Result.m521constructorimpl(kz5.n0.Z(id6)));
    }
}
