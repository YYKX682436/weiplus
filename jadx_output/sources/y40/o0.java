package y40;

/* loaded from: classes7.dex */
public abstract class o0 {
    public static final com.tencent.mm.protobuf.f a(com.tencent.mm.protobuf.f fVar, com.tencent.mm.protobuf.f result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (fVar == null) {
            return result;
        }
        try {
            com.tencent.mm.protobuf.f parseFrom = result.parseFrom(fVar.toByteArray());
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type T of com.tencent.mm.feature.finderbox.FinderBoxPbExtKt.fitIn");
            rk0.c.a("Finder.BoxPbExt", "fit in origin" + fVar.toJSON() + ", result: " + result.toJSON(), new java.lang.Object[0]);
            return parseFrom;
        } catch (java.lang.Exception e17) {
            rk0.c.b("Finder.BoxPbExt", "fit in origin" + fVar.toJSON(), e17);
            return result;
        }
    }
}
