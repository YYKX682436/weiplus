package r26;

/* loaded from: classes10.dex */
public final class e implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f368874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f368875b;

    /* renamed from: c, reason: collision with root package name */
    public final int f368876c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f368877d;

    public e(java.lang.CharSequence input, int i17, int i18, yz5.p getNextMatch) {
        kotlin.jvm.internal.o.g(input, "input");
        kotlin.jvm.internal.o.g(getNextMatch, "getNextMatch");
        this.f368874a = input;
        this.f368875b = i17;
        this.f368876c = i18;
        this.f368877d = getNextMatch;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new r26.d(this);
    }
}
