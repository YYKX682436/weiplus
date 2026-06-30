package cw1;

/* loaded from: classes12.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Integer[][] f223333a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean[] f223334b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f223335c;

    static {
        java.lang.Integer[][] numArr = {new java.lang.Integer[]{0, 20, 2, 3, 16}, new java.lang.Integer[]{4}, new java.lang.Integer[]{5}, new java.lang.Integer[]{6}, new java.lang.Integer[]{7}, new java.lang.Integer[]{8}, new java.lang.Integer[]{9}, new java.lang.Integer[]{15}, new java.lang.Integer[]{18}, new java.lang.Integer[]{17}, new java.lang.Integer[]{10, 11}, new java.lang.Integer[]{19}};
        f223333a = numArr;
        boolean[] zArr = new boolean[numArr.length];
        zArr[3] = true;
        f223334b = zArr;
        f223335c = kz5.z.D0(new java.lang.String[]{"wxaFlattenFileSystem", "wxaNonFlattenFileSystem", "WxaJsCodeCache", "WxaSnapshotJsCodeCache", "WxaWASMCache", "appBrandXnetModelCache", "WxaCodePkgsCache", "WxaCodePkgsCacheGlobal", "AppBrandWxAudioCache", "WxaShaderCache"});
    }

    public static final long a(com.tencent.mm.plugin.appbrand.appstorage.m0 m0Var) {
        return (m0Var.f76265a.hashCode() & io.flutter.embedding.android.KeyboardMap.kValueMask) | ((io.flutter.embedding.android.KeyboardMap.kValueMask & ((m0Var.f76267c.hashCode() ^ m0Var.f76266b.hashCode()) & Integer.MAX_VALUE)) << 32);
    }
}
