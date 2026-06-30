package rf2;

/* loaded from: classes10.dex */
public final class d2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.l30 f394695d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f394696e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f394697f;

    /* renamed from: g, reason: collision with root package name */
    public long f394698g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f394699h;

    public d2(r45.l30 choice) {
        kotlin.jvm.internal.o.g(choice, "choice");
        this.f394695d = choice;
        this.f394696e = choice.getInteger(2) > 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String string = choice.getString(4);
        sb6.append(string == null ? "" : string);
        sb6.append(". ");
        java.lang.String string2 = choice.getString(1);
        sb6.append(string2 != null ? string2 : "");
        this.f394699h = sb6.toString();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f394695d.getInteger(0);
    }

    @Override // in5.c
    public int h() {
        return rf2.d2.class.hashCode();
    }
}
