package com.tencent.mm.plugin.wenote.multitask;

/* loaded from: classes8.dex */
public final class f extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public android.app.Activity f188135q;

    public f(android.app.Activity activity) {
        super(activity);
        this.f188135q = activity;
    }

    @Override // ak3.i, ak3.c
    public android.app.Activity getActivity() {
        return this.f188135q;
    }

    @Override // ak3.i
    public boolean p() {
        return this.f5591p;
    }

    @Override // ak3.i
    public boolean q() {
        return false;
    }

    @Override // ak3.i
    public void r(android.app.Activity activity) {
        this.f188135q = activity;
    }
}
