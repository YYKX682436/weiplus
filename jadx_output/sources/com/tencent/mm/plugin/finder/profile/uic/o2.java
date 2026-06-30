package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f124040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f124040d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f124040d.getIntent().getStringExtra("finder_username");
        return stringExtra == null ? "" : stringExtra;
    }
}
