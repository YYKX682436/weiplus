package cu2;

/* loaded from: classes10.dex */
public final class v implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f222445a;

    public v(so2.i3 i3Var) {
        this.f222445a = i3Var;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        return kotlin.jvm.internal.o.b(((so2.i3) obj).field_mediaId, this.f222445a.field_mediaId);
    }
}
