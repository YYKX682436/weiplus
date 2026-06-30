package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f134181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f134181d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wa2.u uVar = wa2.u.f444181d;
        android.content.Intent intent = this.f134181d.getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        uVar.getClass();
        return java.lang.Boolean.valueOf(intent.hasExtra("key_anim_intent_id"));
    }
}
