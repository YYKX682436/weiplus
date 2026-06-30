package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f161996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f161996d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f161996d;
        sb6.append(appCompatActivity.getClass().getName());
        sb6.append('@');
        sb6.append(java.lang.System.identityHashCode(appCompatActivity));
        return sb6.toString();
    }
}
