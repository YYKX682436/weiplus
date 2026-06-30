package sa0;

/* loaded from: classes8.dex */
public final class i extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final r45.fv4 f405251b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f405252c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qv4 f405253d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f405254e;

    public /* synthetic */ i(r45.fv4 fv4Var, boolean z17, r45.qv4 qv4Var, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : fv4Var, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? null : qv4Var, (i17 & 8) != 0 ? "" : str);
    }

    public i(r45.fv4 fv4Var, boolean z17, r45.qv4 qv4Var, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f405251b = fv4Var;
        this.f405252c = z17;
        this.f405253d = qv4Var;
        this.f405254e = source;
    }
}
