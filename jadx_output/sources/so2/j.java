package so2;

/* loaded from: classes2.dex */
public final class j implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.la0 f410437d;

    public j(com.tencent.mm.plugin.finder.storage.la0 localItem) {
        kotlin.jvm.internal.o.g(localItem, "localItem");
        this.f410437d = localItem;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof so2.j) && ((so2.j) obj).f410437d.a(this.f410437d)) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return ((java.lang.Number) ((jz5.n) this.f410437d.f127125b).getValue()).longValue();
    }

    @Override // in5.c
    public int h() {
        return this.f410437d.f127124a.getInteger(0);
    }

    public java.lang.String toString() {
        return "ItemId=" + getItemId() + ",ItemType=" + h() + ' ';
    }
}
