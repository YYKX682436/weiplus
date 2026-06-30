package iu;

/* loaded from: classes12.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final int a(gu.j params, java.lang.String key) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Object obj = ((java.util.LinkedHashMap) params.f275613g).get(key);
        if (obj == null) {
            obj = "0";
        }
        return com.tencent.mm.sdk.platformtools.t8.O(obj, 0);
    }
}
