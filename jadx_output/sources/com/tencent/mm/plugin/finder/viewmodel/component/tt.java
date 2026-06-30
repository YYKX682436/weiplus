package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class tt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ut f136059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(com.tencent.mm.plugin.finder.viewmodel.component.ut utVar) {
        super(0);
        this.f136059d = utVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f136059d.getIntent().getStringExtra("key_udf_kv");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return stringExtra.length() > 0 ? new cl0.g(stringExtra) : new cl0.g();
    }
}
