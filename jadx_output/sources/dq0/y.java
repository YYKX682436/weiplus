package dq0;

/* loaded from: classes16.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f242343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f242343d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.flutter.plugin.proto.a0 builder = com.tencent.mm.flutter.plugin.proto.b0.f67941h.toBuilder();
        java.lang.String optString = it.optString("type");
        optString.getClass();
        builder.f67929d |= 1;
        builder.f67930e = optString;
        builder.onChanged();
        org.json.JSONObject optJSONObject = it.optJSONObject("rect");
        com.tencent.mm.flutter.plugin.proto.x builder2 = com.tencent.mm.flutter.plugin.proto.y.f68105m.toBuilder();
        double optDouble = optJSONObject != null ? optJSONObject.optDouble("x", 0.0d) : 0.0d;
        builder2.f68100d |= 1;
        builder2.f68101e = optDouble;
        builder2.onChanged();
        double optDouble2 = optJSONObject != null ? optJSONObject.optDouble("y", 0.0d) : 0.0d;
        builder2.f68100d |= 2;
        builder2.f68102f = optDouble2;
        builder2.onChanged();
        double optDouble3 = optJSONObject != null ? optJSONObject.optDouble("w", 0.0d) : 0.0d;
        builder2.f68100d |= 4;
        builder2.f68103g = optDouble3;
        builder2.onChanged();
        double optDouble4 = optJSONObject != null ? optJSONObject.optDouble("h", 0.0d) : 0.0d;
        builder2.f68100d |= 8;
        builder2.f68104h = optDouble4;
        builder2.onChanged();
        com.tencent.mm.flutter.plugin.proto.y buildPartial = builder2.buildPartial();
        if (!buildPartial.isInitialized()) {
            throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
        }
        com.google.protobuf.t9 t9Var = builder.f67932g;
        if (t9Var == null) {
            builder.f67931f = buildPartial;
            builder.onChanged();
        } else {
            t9Var.i(buildPartial);
        }
        builder.f67929d |= 2;
        com.tencent.mm.flutter.plugin.proto.b0 buildPartial2 = builder.buildPartial();
        if (!buildPartial2.isInitialized()) {
            throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial2);
        }
        ((java.util.List) this.f242343d.f310123d).add(buildPartial2);
        return jz5.f0.f302826a;
    }
}
