package qs3;

/* loaded from: classes3.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f366343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(android.view.View view, int i17) {
        super(0);
        this.f366342d = view;
        this.f366343e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f366342d.findViewById(this.f366343e);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type T of com.tencent.mm.plugin.radar.ui.ViewBindKt.bind");
        return findViewById;
    }
}
