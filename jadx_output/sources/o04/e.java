package o04;

/* loaded from: classes10.dex */
public class e implements o04.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f341904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f341905b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f341906c;

    public e(java.lang.Class clazz, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        this.f341904a = clazz;
        this.f341905b = i17;
        this.f341906c = jz5.h.b(new o04.d(this));
    }

    @Override // o04.o
    public boolean b(android.content.Intent intent) {
        return true;
    }

    @Override // o04.o
    public com.tencent.mm.protobuf.f c() {
        com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) ((jz5.n) this.f341906c).getValue();
        kotlin.jvm.internal.o.f(fVar, "<get-data>(...)");
        return fVar;
    }

    @Override // o04.o
    public int getType() {
        return this.f341905b;
    }
}
