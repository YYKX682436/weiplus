package qs3;

/* loaded from: classes3.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f366340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f366341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.app.Activity activity, int i17) {
        super(0);
        this.f366340d = activity;
        this.f366341e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f366340d.findViewById(this.f366341e);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type T of com.tencent.mm.plugin.radar.ui.ViewBindKt.bind");
        return findViewById;
    }
}
