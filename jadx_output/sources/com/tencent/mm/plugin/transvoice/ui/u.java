package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f175471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f175471d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f175471d.getIntent().getStringExtra("intent_key_language_name");
    }
}
