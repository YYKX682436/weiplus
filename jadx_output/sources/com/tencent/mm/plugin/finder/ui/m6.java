package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class m6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.o6 f129508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.tencent.mm.plugin.finder.ui.o6 o6Var) {
        super(0);
        this.f129508d = o6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f129508d.f129573h;
        if (linearLayoutManager != null) {
            return new androidx.recyclerview.widget.u1(linearLayoutManager);
        }
        kotlin.jvm.internal.o.o("layoutManager");
        throw null;
    }
}
