package vp2;

/* loaded from: classes2.dex */
public class j0 extends wp2.b {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f438929u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.c72 f438930v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.storage.FinderItem feedObject, r45.ea2 streamCard, r45.fa2 container, java.util.List relateLiving, r45.c72 c72Var, java.lang.String str, boolean z17) {
        super(feedObject, streamCard, container, str, null, z17);
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(streamCard, "streamCard");
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(relateLiving, "relateLiving");
        this.f438929u = relateLiving;
        this.f438930v = c72Var;
    }

    @Override // wp2.b
    public int g2() {
        return 6;
    }
}
