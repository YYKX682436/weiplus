package hk2;

/* loaded from: classes3.dex */
public final class m implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.o84 f281908d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f281909e;

    public m(r45.o84 floatMsg) {
        kotlin.jvm.internal.o.g(floatMsg, "floatMsg");
        this.f281908d = floatMsg;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f281908d.getInteger(0);
    }

    @Override // in5.c
    public int h() {
        return this.f281908d.getInteger(0);
    }
}
