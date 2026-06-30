package md3;

/* loaded from: classes.dex */
public final class j implements c00.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325855a;

    public j(java.lang.String str) {
        this.f325855a = str;
    }

    @Override // c00.q3
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String str = this.f325855a;
        if (str == null) {
            return null;
        }
        com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
        java.lang.String str2 = com.tencent.mm.plugin.magicbrush.a5.f147843h;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("MBJsApiHandleEcsAction", "serverProcessName is null, cannot invoke allocTempFile");
            return null;
        }
        com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileResult mBJsApiHandleEcsAction$AllocTempFileResult = (com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileResult) com.tencent.mm.ipcinvoker.extension.l.b(str2, new com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileRequest(str, name), md3.f.class);
        java.lang.String str3 = mBJsApiHandleEcsAction$AllocTempFileResult != null ? mBJsApiHandleEcsAction$AllocTempFileResult.f148053d : null;
        if (str3 == null || str3.length() == 0) {
            return null;
        }
        return new com.tencent.mm.vfs.r6(str3);
    }

    @Override // c00.q3
    public java.lang.String getAbsoluteFilePath(java.lang.String rawPath) {
        kotlin.jvm.internal.o.g(rawPath, "rawPath");
        java.lang.String str = this.f325855a;
        if (str == null) {
            return null;
        }
        com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
        java.lang.String str2 = com.tencent.mm.plugin.magicbrush.a5.f147843h;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("MBJsApiHandleEcsAction", "serverProcessName is null, cannot invoke getAbsoluteFilePath");
            return null;
        }
        com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathResult mBJsApiHandleEcsAction$GetAbsoluteFilePathResult = (com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathResult) com.tencent.mm.ipcinvoker.extension.l.b(str2, new com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest(str, rawPath), md3.i.class);
        if (mBJsApiHandleEcsAction$GetAbsoluteFilePathResult != null) {
            return mBJsApiHandleEcsAction$GetAbsoluteFilePathResult.f148056d;
        }
        return null;
    }

    @Override // c00.q3
    public org.json.JSONObject getConfig() {
        return null;
    }
}
