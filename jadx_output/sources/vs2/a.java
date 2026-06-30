package vs2;

/* loaded from: classes2.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.m66 f439871d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f439872e;

    public a(r45.m66 cover) {
        kotlin.jvm.internal.o.g(cover, "cover");
        this.f439871d = cover;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f439871d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
