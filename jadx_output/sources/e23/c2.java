package e23;

/* loaded from: classes9.dex */
public class c2 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f246798q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f246799r;

    /* renamed from: s, reason: collision with root package name */
    public final e23.a2 f246800s;

    /* renamed from: t, reason: collision with root package name */
    public final e23.b2 f246801t;

    public c2(int i17) {
        super(16, i17);
        this.f246799r = false;
        this.f246800s = new e23.a2(this);
        this.f246801t = new e23.b2(this);
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246800s;
    }
}
