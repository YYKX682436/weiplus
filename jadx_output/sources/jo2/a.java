package jo2;

/* loaded from: classes2.dex */
public final class a implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.t50 f300878d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f300879e;

    public a(r45.t50 info, boolean z17, java.lang.String username) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(username, "username");
        this.f300878d = info;
        this.f300879e = z17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return -20;
    }
}
