package vm2;

/* loaded from: classes3.dex */
public final class b0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public int f438082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f438083e;

    /* renamed from: f, reason: collision with root package name */
    public int f438084f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f438085g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f438086h;

    public b0(int i17, java.lang.String text, int i18, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f438082d = i17;
        this.f438083e = text;
        this.f438084f = i18;
        this.f438085g = z17;
        this.f438086h = z18;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public /* synthetic */ b0(int i17, java.lang.String str, int i18, boolean z17, boolean z18, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, str, i18, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? false : z18);
    }
}
