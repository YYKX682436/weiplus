package sk2;

/* loaded from: classes3.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final uk2.b f408951d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f408952e;

    public a(uk2.b data, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(data, "data");
        this.f408951d = data;
        this.f408952e = z17;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
