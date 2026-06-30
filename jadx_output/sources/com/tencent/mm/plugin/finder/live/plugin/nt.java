package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f113677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(df2.ug ugVar) {
        super(0);
        this.f113677d = ugVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
        this.f113677d.X6(qo0.b.W, bundle);
        return jz5.f0.f302826a;
    }
}
