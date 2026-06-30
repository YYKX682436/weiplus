package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class pf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.tf f174179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f174180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(com.tencent.mm.plugin.textstatus.ui.tf tfVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f174179d = tfVar;
        this.f174180e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.FragmentManager supportFragmentManager = this.f174180e.getSupportFragmentManager();
        kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
        return new com.tencent.mm.plugin.textstatus.ui.ef(this.f174179d, supportFragmentManager);
    }
}
