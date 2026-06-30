package fb2;

/* loaded from: classes2.dex */
public final class c implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db2.c3 f260842a;

    public c(db2.c3 c3Var) {
        this.f260842a = c3Var;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        return ((com.tencent.mm.protocal.protobuf.FinderObject) obj).getId() == this.f260842a.d().getLong(12);
    }
}
