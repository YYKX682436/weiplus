package l26;

/* loaded from: classes16.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final n16.g f315264a;

    /* renamed from: b, reason: collision with root package name */
    public final r26.t f315265b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Collection f315266c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f315267d;

    /* renamed from: e, reason: collision with root package name */
    public final l26.i[] f315268e;

    public q(n16.g gVar, r26.t tVar, java.util.Collection collection, yz5.l lVar, l26.i... iVarArr) {
        this.f315264a = gVar;
        this.f315265b = tVar;
        this.f315266c = collection;
        this.f315267d = lVar;
        this.f315268e = iVarArr;
    }

    public /* synthetic */ q(n16.g gVar, l26.i[] iVarArr, yz5.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        this(gVar, iVarArr, (i17 & 4) != 0 ? l26.n.f315257d : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(n16.g name, l26.i[] checks, yz5.l additionalChecks) {
        this(name, (r26.t) null, (java.util.Collection) null, additionalChecks, (l26.i[]) java.util.Arrays.copyOf(checks, checks.length));
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(checks, "checks");
        kotlin.jvm.internal.o.g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ q(java.util.Collection collection, l26.i[] iVarArr, yz5.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        this(collection, iVarArr, (i17 & 4) != 0 ? l26.p.f315262d : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(java.util.Collection nameList, l26.i[] checks, yz5.l additionalChecks) {
        this((n16.g) null, (r26.t) null, nameList, additionalChecks, (l26.i[]) java.util.Arrays.copyOf(checks, checks.length));
        kotlin.jvm.internal.o.g(nameList, "nameList");
        kotlin.jvm.internal.o.g(checks, "checks");
        kotlin.jvm.internal.o.g(additionalChecks, "additionalChecks");
    }
}
