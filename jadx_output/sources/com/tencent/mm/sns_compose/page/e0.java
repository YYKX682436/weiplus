package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class e0 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f193455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.v f193456b;

    public e0(androidx.lifecycle.y yVar, androidx.lifecycle.v vVar) {
        this.f193455a = yVar;
        this.f193456b = vVar;
    }

    @Override // n0.a2
    public void dispose() {
        this.f193455a.mo133getLifecycle().c(this.f193456b);
    }
}
