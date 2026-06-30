package vj;

/* loaded from: classes7.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyMiniProgramPlayableStatus";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        z31.a aVar;
        x31.a E0;
        kotlin.jvm.internal.o.g(data, "data");
        boolean optBoolean = data.optBoolean("isEnd");
        com.tencent.mars.xlog.Log.i("MbJsApiNotifyMiniProgramPlayableStatus", "isEnd:" + optBoolean);
        if (optBoolean && (aVar = (z31.a) this.f317890a) != null && (E0 = aVar.E0()) != null) {
            x31.b[] bVarArr = x31.b.f451599d;
            x31.a.a(E0, 0, "", null, 4, null);
        }
        s().invoke(k());
    }
}
