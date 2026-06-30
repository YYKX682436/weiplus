package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f209594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f209595e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(boolean z17, boolean z18) {
        super(4);
        this.f209594d = z17;
        this.f209595e = z18;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View v17 = (android.view.View) obj;
        ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.ui.a4.b(com.tencent.mm.ui.a4.f197117a, ((java.lang.Number) obj2).intValue(), (e3.d) obj3, v17, this.f209594d, this.f209595e);
        return jz5.f0.f302826a;
    }
}
