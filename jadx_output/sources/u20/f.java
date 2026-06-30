package u20;

/* loaded from: classes9.dex */
public final class f implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u20.h f423868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f423869b;

    public f(u20.h hVar, int i17) {
        this.f423868a = hVar;
        this.f423869b = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        this.f423868a.mmOnActivityResult(i17, i18, intent);
        return i17 == this.f423869b;
    }
}
