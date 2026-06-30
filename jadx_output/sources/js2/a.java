package js2;

/* loaded from: classes2.dex */
public final class a implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f301504d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f301505e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f301506f;

    public a(int i17, java.lang.String wording, yz5.a aVar) {
        kotlin.jvm.internal.o.g(wording, "wording");
        this.f301504d = i17;
        this.f301505e = wording;
        this.f301506f = aVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return js2.a.class.hashCode();
    }
}
