package ms2;

/* loaded from: classes2.dex */
public final class b implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.vx0 f330968d;

    public b(r45.vx0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f330968d = item;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return !android.text.TextUtils.equals(((ms2.b) obj).f330968d.getString(14), this.f330968d.getString(14)) ? 1 : 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return ms2.b.class.hashCode();
    }
}
