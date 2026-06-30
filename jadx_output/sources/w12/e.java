package w12;

/* loaded from: classes.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyFireworkPlayEnd";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.COL_ID);
        com.tencent.mars.xlog.Log.i("MagicSnsTimeline", "firework " + optString + " play end");
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() > 0)) {
            s().invoke(i(lc3.x.f317937d));
            return;
        }
        v12.f fVar = (v12.f) this.f317890a;
        if (fVar != null) {
            v12.e eVar = fVar.f432503e;
        }
        s().invoke(k());
    }
}
