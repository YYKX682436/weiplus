package jy0;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void a(com.tencent.mm.protobuf.f proto, java.lang.String json) {
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(json, "json");
        if (com.tencent.mm.sdk.platformtools.t8.K0(json)) {
            return;
        }
        proto.fromJson(json);
    }
}
