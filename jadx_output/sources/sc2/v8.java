package sc2;

/* loaded from: classes2.dex */
public final class v8 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final xc2.p0 f406317d;

    /* renamed from: e, reason: collision with root package name */
    public int f406318e;

    public v8(xc2.p0 jumpInfoEx) {
        kotlin.jvm.internal.o.g(jumpInfoEx, "jumpInfoEx");
        this.f406317d = jumpInfoEx;
        this.f406318e = -1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof sc2.v8) && kotlin.jvm.internal.o.b(((sc2.v8) obj).f406317d.f453234a.getJump_id(), this.f406317d.f453234a.getJump_id())) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return sc2.v8.class.hashCode();
    }
}
