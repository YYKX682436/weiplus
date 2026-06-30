package vp2;

/* loaded from: classes2.dex */
public final class d extends wp2.b {

    /* renamed from: u, reason: collision with root package name */
    public final int f438913u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.storage.FinderItem feedObject, r45.ea2 streamCard, r45.fa2 container, boolean z17, java.lang.String str, java.lang.String str2, int i17) {
        super(feedObject, streamCard, container, str, str2, z17);
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(streamCard, "streamCard");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438913u = i17;
    }

    @Override // wp2.b
    public int g2() {
        return this.f438913u;
    }
}
