package od3;

/* loaded from: classes7.dex */
public abstract class b extends lc3.b0 implements od3.a {
    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            s().invoke(h(300005, "url is null or nil"));
            return;
        }
        java.lang.String taskId = getTaskId();
        if (com.tencent.mm.sdk.platformtools.t8.K0(taskId)) {
            s().invoke(h(300004, "taskId is null or nil"));
            return;
        }
        java.lang.String instanceName = e().f344331a;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        if (data.optInt("timeout", ((com.tencent.mm.plugin.magicbrush.d6) ((com.tencent.mm.plugin.magicbrush.e4) i95.n0.c(com.tencent.mm.plugin.magicbrush.e4.class))).wi(s07).f298968d) <= 0) {
            s().invoke(h(300005, "timeout is invalid"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(a(), taskId);
        s().invoke(l(hashMap));
        d(data, taskId, optString, s07);
    }

    public final void u(com.tencent.mm.plugin.magicbrush.base.MBJsEventBase event) {
        kotlin.jvm.internal.o.g(event, "event");
        lc3.h0 h0Var = (lc3.h0) this.f317890a;
        if (h0Var != null) {
            h0Var.C0(event);
        }
    }
}
