package nm2;

/* loaded from: classes10.dex */
public final class b extends nm2.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f338470a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f338471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String songMid, boolean z17) {
        super(songMid, z17);
        kotlin.jvm.internal.o.g(songMid, "songMid");
        this.f338470a = songMid;
        this.f338471b = z17;
    }

    @Override // nm2.a
    public java.lang.String b() {
        return this.f338470a;
    }

    @Override // nm2.a
    public boolean d() {
        return this.f338471b;
    }
}
