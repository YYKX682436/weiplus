package nm2;

/* loaded from: classes10.dex */
public final class c extends nm2.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f338472a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f338473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String songMid, int i17, boolean z17) {
        super(songMid, z17);
        kotlin.jvm.internal.o.g(songMid, "songMid");
        this.f338472a = songMid;
        this.f338473b = z17;
    }

    @Override // nm2.a
    public java.lang.String b() {
        return this.f338472a;
    }

    @Override // nm2.a
    public boolean d() {
        return this.f338473b;
    }
}
