package so2;

/* loaded from: classes9.dex */
public final class n0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ri0 f410489d;

    public n0(r45.ri0 emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f410489d = emojiInfo;
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
        return so2.n0.class.getName().hashCode();
    }
}
