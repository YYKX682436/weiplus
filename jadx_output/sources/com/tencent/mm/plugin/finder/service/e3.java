package com.tencent.mm.plugin.finder.service;

/* loaded from: classes5.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f126042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(java.lang.Throwable th6) {
        super(0);
        this.f126042d = th6;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String message = this.f126042d.getMessage();
        return message == null ? "" : message;
    }
}
