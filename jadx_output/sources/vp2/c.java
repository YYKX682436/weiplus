package vp2;

/* loaded from: classes2.dex */
public abstract class c implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.le1 f438910d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fa2 f438911e;

    /* renamed from: f, reason: collision with root package name */
    public int f438912f;

    public c(r45.le1 aggregationCard, r45.fa2 container) {
        kotlin.jvm.internal.o.g(aggregationCard, "aggregationCard");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438910d = aggregationCard;
        this.f438911e = container;
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
}
