package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f121291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f121294g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(tx2.i0 i0Var, com.tencent.mm.plugin.finder.member.preview.c0 c0Var, java.lang.String str, r45.h32 h32Var) {
        super(0);
        this.f121291d = i0Var;
        this.f121292e = c0Var;
        this.f121293f = str;
        this.f121294g = h32Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f121291d.a();
        com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121292e;
        androidx.appcompat.app.AppCompatActivity activity = c0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.member.preview.f0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.member.preview.f0.V6((com.tencent.mm.plugin.finder.member.preview.f0) a17, null, new com.tencent.mm.plugin.finder.member.preview.v(this.f121293f, this.f121294g, c0Var), 1, null);
        return jz5.f0.f302826a;
    }
}
