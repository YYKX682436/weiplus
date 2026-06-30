package com.tencent.mm.plugin.sport.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/sport/model/l;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class l implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        long j17 = data.getLong("lastTickTime");
        long j18 = data.getLong("lastStep");
        long j19 = data.getLong("lastTime");
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.sport.model.n(j17, j18, j19, "MM"), "PushUpdateStepTag");
        callback.a(new android.os.Bundle());
    }
}
