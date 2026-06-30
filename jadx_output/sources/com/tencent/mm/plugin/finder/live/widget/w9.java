package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f120163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.x9 x9Var) {
        super(0);
        this.f120162d = context;
        this.f120163e = x9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f120162d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var = (com.tencent.mm.plugin.finder.live.viewmodel.z2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.z2.class);
        com.tencent.mm.plugin.finder.live.widget.v9 v9Var = new com.tencent.mm.plugin.finder.live.widget.v9(this.f120163e);
        z2Var.getClass();
        z2Var.f117568r = v9Var;
        return z2Var;
    }
}
