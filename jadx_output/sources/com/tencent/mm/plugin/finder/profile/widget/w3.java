package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.e4 f124813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.m3 f124814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.n3 f124815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.widget.e4 e4Var, com.tencent.mm.plugin.finder.profile.widget.m3 m3Var, com.tencent.mm.plugin.finder.profile.widget.n3 n3Var) {
        super(0);
        this.f124812d = s4Var;
        this.f124813e = e4Var;
        this.f124814f = m3Var;
        this.f124815g = n3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f124812d.f124757k;
        if (z2Var != null) {
            z2Var.B();
        }
        com.tencent.mm.plugin.finder.profile.widget.e4 e4Var = this.f124813e;
        android.content.Context context = e4Var.f124530f;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.member.preview.c0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.member.preview.c0.class)).X6(e4Var.f124528d, this.f124814f.f124624a, this.f124815g.f124638p);
        return jz5.f0.f302826a;
    }
}
