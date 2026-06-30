package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class g40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h40 f118400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(com.tencent.mm.plugin.finder.live.widget.h40 h40Var) {
        super(0);
        this.f118400d = h40Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.h40 h40Var = this.f118400d;
        android.content.Context context = h40Var.f118543d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new ni2.u2(context, h40Var.f118544e);
    }
}
