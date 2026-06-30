package so2;

/* loaded from: classes2.dex */
public final class o0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f410516d;

    public o0(java.util.List emojiInfos) {
        kotlin.jvm.internal.o.g(emojiInfos, "emojiInfos");
        this.f410516d = emojiInfos;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.o0.class.getName().hashCode();
    }
}
