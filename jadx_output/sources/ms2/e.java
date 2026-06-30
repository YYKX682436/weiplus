package ms2;

/* loaded from: classes2.dex */
public final class e implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.dg4 f330973d;

    public e(r45.dg4 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f330973d = item;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return !android.text.TextUtils.equals(((ms2.e) obj).f330973d.f372417d, this.f330973d.f372417d) ? 1 : 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return ms2.e.class.hashCode();
    }
}
