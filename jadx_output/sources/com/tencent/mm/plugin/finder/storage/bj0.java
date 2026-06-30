package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class bj0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f126535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(java.lang.Exception exc) {
        super(0);
        this.f126535d = exc;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "[checkOldSessionInfo] crash, errMsg" + this.f126535d.getMessage();
    }
}
