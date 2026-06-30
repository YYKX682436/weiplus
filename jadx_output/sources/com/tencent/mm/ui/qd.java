package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public final class qd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.LayoutInflater f209550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f209551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f209552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f209553g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(android.view.LayoutInflater layoutInflater, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        super(0);
        this.f209550d = layoutInflater;
        this.f209551e = i17;
        this.f209552f = viewGroup;
        this.f209553g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f209550d.inflate(this.f209551e, this.f209552f, this.f209553g);
    }
}
