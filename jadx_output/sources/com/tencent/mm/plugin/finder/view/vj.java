package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class vj implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f133250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133251b;

    public vj(android.content.Intent intent, java.lang.String str) {
        this.f133250a = intent;
        this.f133251b = str;
    }

    @Override // ss5.d0
    public void b(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        r45.md5 md5Var = new r45.md5();
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        md5Var.set(1, java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L));
        ((com.tencent.mm.feature.finder.live.v4) w0Var).Cj(this.f133250a, this.f133251b, md5Var);
    }
}
