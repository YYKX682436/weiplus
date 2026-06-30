package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f174467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.j2 f174468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f174469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f174470g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(boolean[] zArr, com.tencent.mm.plugin.textstatus.ui.j2 j2Var, java.lang.Runnable runnable, yz5.a aVar) {
        super(0);
        this.f174467d = zArr;
        this.f174468e = j2Var;
        this.f174469f = runnable;
        this.f174470g = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean[] zArr = this.f174467d;
        if (!zArr[0]) {
            zArr[0] = true;
            com.tencent.mm.plugin.textstatus.ui.j2 j2Var = this.f174468e;
            j2Var.f173999i.removeCallbacks(this.f174469f);
            com.tencent.mm.plugin.textstatus.ui.j2.b(j2Var, this.f174470g);
        }
        return jz5.f0.f302826a;
    }
}
