package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f123968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f123968d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f123968d.getIntent().getStringExtra("key_export_username");
        return stringExtra == null ? "" : stringExtra;
    }
}
