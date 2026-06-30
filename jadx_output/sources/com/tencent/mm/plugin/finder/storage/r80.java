package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class r80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f127473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r80(java.lang.Exception exc) {
        super(0);
        this.f127473d = exc;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "[checkOldConv] crash, errMsg" + this.f127473d.getMessage();
    }
}
