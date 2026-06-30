package so2;

/* loaded from: classes.dex */
public final class r1 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f410573d;

    public r1(com.tencent.mm.plugin.finder.storage.FinderItem feedObject, java.lang.String wording) {
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(wording, "wording");
        this.f410573d = wording;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return -1L;
    }

    @Override // in5.c
    public int h() {
        return -11;
    }
}
