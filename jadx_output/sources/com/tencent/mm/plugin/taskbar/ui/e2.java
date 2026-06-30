package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public final class e2 implements s40.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.o2 f172604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f172605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f172606c;

    public e2(com.tencent.mm.plugin.taskbar.ui.o2 o2Var, java.util.HashMap hashMap, java.util.HashMap hashMap2) {
        this.f172604a = o2Var;
        this.f172605b = hashMap;
        this.f172606c = hashMap2;
    }

    public void a(java.util.Map map, int i17) {
        com.tencent.mm.plugin.taskbar.ui.a2 a2Var;
        byte[] bArr;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(map, "map");
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = this.f172604a;
        if (i17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "new interval:" + i17);
            o2Var.f172672r = i17;
        }
        boolean z17 = false;
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (((java.lang.Number) entry.getValue()).intValue() == 2) {
                r45.b22 b22Var = (r45.b22) this.f172605b.get(entry.getKey());
                if (b22Var != null && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7)) != null && (liveInfo = finderObject.getLiveInfo()) != null) {
                    liveInfo.set(2, 2);
                }
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) this.f172606c.get(entry.getKey());
                if (multiTaskInfo != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "live end: " + multiTaskInfo.v0().getString(0));
                    if (b22Var == null || (bArr = b22Var.toByteArray()) == null) {
                        bArr = multiTaskInfo.field_data;
                    }
                    multiTaskInfo.field_data = bArr;
                    ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(multiTaskInfo.field_id, true, 2);
                    z17 = true;
                }
            }
        }
        if (!z17 || (a2Var = o2Var.f172655a) == null) {
            return;
        }
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var;
        taskBarView.post(new com.tencent.mm.plugin.taskbar.ui.p1(taskBarView));
    }
}
