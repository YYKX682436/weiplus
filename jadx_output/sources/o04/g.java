package o04;

/* loaded from: classes4.dex */
public class g implements o04.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f341908a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f341909b = jz5.h.b(o04.f.f341907d);

    public g(int i17) {
        this.f341908a = i17;
    }

    public void a(java.lang.String fromKey, java.lang.String toKey) {
        kotlin.jvm.internal.o.g(fromKey, "fromKey");
        kotlin.jvm.internal.o.g(toKey, "toKey");
        jz5.g gVar = this.f341909b;
        com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) ((java.util.HashMap) ((jz5.n) gVar).getValue()).get(fromKey);
        if (fVar != null) {
            ((java.util.HashMap) ((jz5.n) gVar).getValue()).put(toKey, fVar);
        }
    }

    public void b(java.lang.String key, com.tencent.mm.protobuf.f value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        ((java.util.HashMap) ((jz5.n) this.f341909b).getValue()).put(key, value);
    }
}
