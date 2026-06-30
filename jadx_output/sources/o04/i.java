package o04;

/* loaded from: classes4.dex */
public class i implements o04.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f341911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f341912b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f341913c;

    public i(java.lang.Class clazz, int i17) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        this.f341911a = clazz;
        this.f341912b = i17;
        this.f341913c = jz5.h.b(new o04.h(this));
    }

    @Override // o04.o
    public boolean b(android.content.Intent intent) {
        return false;
    }

    @Override // o04.o
    public com.tencent.mm.protobuf.f c() {
        com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) ((jz5.n) this.f341913c).getValue();
        kotlin.jvm.internal.o.f(fVar, "<get-data>(...)");
        return fVar;
    }

    @Override // o04.o
    public int getType() {
        return this.f341912b;
    }
}
