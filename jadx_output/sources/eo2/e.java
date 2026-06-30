package eo2;

/* loaded from: classes2.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255564a;

    public e(java.lang.String str) {
        this.f255564a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        eo2.f fVar2 = eo2.f.f255565a;
        kotlin.jvm.internal.o.d(fVar);
        java.lang.String str = this.f255564a;
        fVar2.g(str, fVar);
        return java.lang.Boolean.valueOf(((java.util.HashSet) eo2.f.f255567c).remove(str));
    }
}
