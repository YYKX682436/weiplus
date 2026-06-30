package jc2;

/* loaded from: classes8.dex */
public final class g implements jc2.c {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vs2 f298951a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f298952b;

    /* renamed from: c, reason: collision with root package name */
    public final int f298953c;

    public g(r45.vs2 ctrlInfo, java.util.List interceptors, int i17, jc2.b bVar) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(interceptors, "interceptors");
        this.f298951a = ctrlInfo;
        this.f298952b = interceptors;
        this.f298953c = i17;
    }

    public com.tencent.mm.plugin.finder.extension.reddot.jb a(r45.vs2 ctrlInfo) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        java.util.List list = this.f298952b;
        int size = list.size();
        int i17 = this.f298953c;
        if (i17 < size) {
            return ((jc2.d) list.get(i17)).a(new jc2.g(ctrlInfo, list, i17 + 1, null));
        }
        com.tencent.mars.xlog.Log.e("Finder.RedDotChain", "index out of bounds");
        return null;
    }
}
