package so2;

/* loaded from: classes10.dex */
public class b1 extends so2.y0 {
    public final com.tencent.mm.plugin.finder.storage.FinderItem E;
    public final r45.ns2 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.finder.storage.FinderItem feed, r45.ns2 info) {
        super(new com.tencent.mm.plugin.finder.storage.yj0());
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(info, "info");
        this.E = feed;
        this.F = info;
    }

    @Override // so2.y0, com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // so2.y0, in5.c
    public long getItemId() {
        return 6;
    }

    @Override // so2.y0, in5.c
    public int h() {
        return 6;
    }

    @Override // so2.y0
    public java.lang.String i() {
        return this.F.getString(0);
    }
}
