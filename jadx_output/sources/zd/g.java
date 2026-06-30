package zd;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 100;
    public static final java.lang.String NAME = "canvasToTempFilePath";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f471513g = "";

    public static java.lang.String C() {
        if (f471513g.isEmpty()) {
            f471513g = j62.e.g().j("clicfg_wagame_disable_canvas_to_temp_file_path_compress_png", "0", true, true);
        }
        return f471513g;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[Catch: RuntimeException -> 0x001f, OutOfMemoryError -> 0x0022, TryCatch #14 {OutOfMemoryError -> 0x0022, RuntimeException -> 0x001f, blocks: (B:8:0x0015, B:14:0x0037, B:17:0x0041, B:19:0x0065, B:22:0x0079, B:167:0x0048), top: B:6:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096 A[Catch: RuntimeException -> 0x04c0, OutOfMemoryError -> 0x04c4, TRY_ENTER, TRY_LEAVE, TryCatch #20 {OutOfMemoryError -> 0x04c4, RuntimeException -> 0x04c0, blocks: (B:4:0x000d, B:11:0x0026, B:25:0x0096), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.appbrand.jsapi.file.b0 D(com.tencent.mm.plugin.appbrand.page.v5 r35, org.json.JSONObject r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.g.D(com.tencent.mm.plugin.appbrand.page.v5, org.json.JSONObject, boolean):com.tencent.mm.plugin.appbrand.jsapi.file.b0");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        ik1.h0.a().postToWorker(new zd.f(this, (com.tencent.mm.plugin.appbrand.e9) lVar, i17, jSONObject));
    }
}
