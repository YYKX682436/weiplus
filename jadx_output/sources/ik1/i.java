package ik1;

/* loaded from: classes7.dex */
public final class i implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.h f291831a;

    public i(ik1.h hVar) {
        this.f291831a = hVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        return this.f291831a.invoke(obj);
    }
}
