package dk2;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f233265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, dk2.g0 g0Var) {
        super(0);
        this.f233264d = context;
        this.f233265e = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233264d;
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.d5s));
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f233265e.f233469b;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(k0Var, false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
