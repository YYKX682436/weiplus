package com.tencent.mm.plugin.game.ui;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f141749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f141750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(yz5.a aVar, android.content.Context context) {
        super(0);
        this.f141749d = aVar;
        this.f141750e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f141749d.invoke();
        android.widget.Toast.makeText(this.f141750e, "执行完成", 0).show();
        return jz5.f0.f302826a;
    }
}
