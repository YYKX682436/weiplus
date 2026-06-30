package zb2;

/* loaded from: classes2.dex */
public final class a implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.qj2 f471255d;

    /* renamed from: e, reason: collision with root package name */
    public int f471256e;

    /* renamed from: f, reason: collision with root package name */
    public int f471257f;

    public a(r45.qj2 dramaData) {
        kotlin.jvm.internal.o.g(dramaData, "dramaData");
        this.f471255d = dramaData;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f471255d.getLong(0);
    }

    @Override // in5.c
    public int h() {
        return zb2.a.class.hashCode();
    }
}
