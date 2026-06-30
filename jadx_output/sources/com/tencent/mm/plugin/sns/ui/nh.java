package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class nh extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f169993d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f169994e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f169995f;

    /* renamed from: g, reason: collision with root package name */
    public long f169996g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f169997h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f169998i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.n4 f169999m;

    /* renamed from: n, reason: collision with root package name */
    public int f170000n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f170001o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f170002p;

    /* renamed from: q, reason: collision with root package name */
    public final kotlinx.coroutines.flow.n2 f170003q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f170004r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.flow.n2 f170005s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.flow.n2 f170006t;

    public nh() {
        u26.u uVar = u26.u.DROP_OLDEST;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        this.f170002p = b17;
        this.f170003q = kotlinx.coroutines.flow.l.a(b17);
        kotlinx.coroutines.flow.i2 b18 = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        this.f170004r = b18;
        this.f170005s = kotlinx.coroutines.flow.l.a(b18);
        this.f170006t = kotlinx.coroutines.flow.l.a(kotlinx.coroutines.flow.r2.b(0, Integer.MAX_VALUE, null, 5, null));
    }

    public final java.util.ArrayList N6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentDataList", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        java.util.ArrayList arrayList = this.f170001o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentDataList", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        return arrayList;
    }

    public final long O6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEnterCommentId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        long j17 = this.f169996g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEnterCommentId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        return j17;
    }

    public final java.lang.String P6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        java.lang.String str = this.f169995f;
        if (str != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
            return str;
        }
        kotlin.jvm.internal.o.o("snsId");
        throw null;
    }

    public final void clear() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        java.util.ArrayList arrayList = this.f170001o;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.ui.ei) it.next()).d();
        }
        arrayList.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
    }
}
