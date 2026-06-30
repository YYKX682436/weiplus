package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.i f153036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.performance.watchdogs.i iVar) {
        super(0);
        this.f153036d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(java.lang.Math.random() < 1.0d / ((double) this.f153036d.f153055b));
    }
}
