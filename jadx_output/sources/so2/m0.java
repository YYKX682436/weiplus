package so2;

/* loaded from: classes2.dex */
public final class m0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.ra f410478d;

    public m0(bw5.ra emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f410478d = emojiInfo;
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
        return so2.m0.class.getName().hashCode();
    }
}
