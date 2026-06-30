package rv3;

/* loaded from: classes5.dex */
public class h implements in5.c, com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f400395d;

    /* renamed from: e, reason: collision with root package name */
    public rv3.v f400396e;

    /* renamed from: f, reason: collision with root package name */
    public rv3.g f400397f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f400398g;

    /* renamed from: h, reason: collision with root package name */
    public rv3.z f400399h;

    public h(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f400395d = item;
        this.f400396e = rv3.w.f400417a;
        this.f400397f = rv3.g.f400392d;
        this.f400399h = rv3.z.f400420d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((rv3.h) obj).f400395d.f155711e == this.f400395d.f155711e ? 0 : 1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
