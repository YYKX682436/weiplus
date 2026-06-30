package so2;

/* loaded from: classes2.dex */
public final class g2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.s11 f410359d;

    /* renamed from: e, reason: collision with root package name */
    public int f410360e;

    public g2(r45.s11 findeEcrObj) {
        kotlin.jvm.internal.o.g(findeEcrObj, "findeEcrObj");
        this.f410359d = findeEcrObj;
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
        return so2.g2.class.hashCode();
    }
}
