package ov2;

/* loaded from: classes10.dex */
public abstract class e extends pv2.m {

    /* renamed from: e */
    public final java.lang.String f349175e;

    /* renamed from: f */
    public long f349176f;

    /* renamed from: g */
    public long f349177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String taskId) {
        super(taskId);
        kotlin.jvm.internal.o.g(taskId, "taskId");
        this.f349175e = "Finder.FinderTaskStage";
    }

    public static /* synthetic */ void i(ov2.e eVar, java.lang.String str, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, java.lang.String str2, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportTrace");
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            str2 = "";
        }
        eVar.h(str, finderItem, i17, str2);
    }

    @Override // pv2.m
    public pv2.g c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task-");
        java.lang.String str = this.f358582d;
        sb6.append(str);
        sb6.append(" start");
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f349175e;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        this.f349176f = c01.id.c();
        this.f349177g = 0L;
        pv2.g j17 = j();
        this.f349177g = c01.id.c() - this.f349176f;
        com.tencent.mars.xlog.Log.i(str2, "task-" + str + " end");
        return j17;
    }

    public final long g() {
        long j17 = this.f349177g;
        return j17 == 0 ? c01.id.c() - this.f349176f : j17;
    }

    public final void h(java.lang.String customKey, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(customKey, "customKey");
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.I(customKey, finderItem.field_reportObject, p2Var.q(finderItem.field_reportObject, finderItem, i17, str));
    }

    public abstract pv2.g j();
}
