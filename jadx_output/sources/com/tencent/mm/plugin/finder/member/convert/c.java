package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.plugin.finder.storage.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.member.question.c f121129a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f121130b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f121131c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f121132d;

    /* renamed from: e, reason: collision with root package name */
    public final int f121133e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f121134f;

    public c(com.tencent.mm.plugin.finder.member.question.c cVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String authorFinderUsername, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        this.f121129a = cVar;
        this.f121130b = appCompatActivity;
        this.f121131c = authorFinderUsername;
        this.f121132d = z17;
        this.f121133e = i17;
        this.f121134f = jz5.h.b(new com.tencent.mm.plugin.finder.member.convert.b(this));
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.member.convert.MemberCommonConfig$DynamicConvertFactory
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == -19) {
                    return new com.tencent.mm.plugin.finder.member.convert.k(com.tencent.mm.plugin.finder.member.convert.c.this.f121131c);
                }
                if (type == -17) {
                    return new com.tencent.mm.plugin.finder.member.convert.a();
                }
                if (type == 4) {
                    com.tencent.mm.plugin.finder.member.convert.c cVar = com.tencent.mm.plugin.finder.member.convert.c.this;
                    return new com.tencent.mm.plugin.finder.member.convert.r(cVar.f121129a, cVar.f121130b, cVar.f121131c, cVar.f121132d, cVar.f121133e);
                }
                if (type == 1) {
                    com.tencent.mm.plugin.finder.member.convert.c cVar2 = com.tencent.mm.plugin.finder.member.convert.c.this;
                    return new com.tencent.mm.plugin.finder.member.convert.n(cVar2.f121129a, cVar2.f121130b, cVar2.f121131c, cVar2.f121132d, cVar2.f121133e);
                }
                if (type == 2) {
                    com.tencent.mm.plugin.finder.member.convert.c cVar3 = com.tencent.mm.plugin.finder.member.convert.c.this;
                    return new com.tencent.mm.plugin.finder.member.convert.i(cVar3.f121129a, cVar3.f121130b, cVar3.f121131c, cVar3.f121132d, cVar3.f121133e);
                }
                com.tencent.mm.plugin.finder.member.convert.c.this.getClass();
                hc2.l.a("Finder.FinderMemberQAConfig", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        int a17 = ym5.x.a(this.f121130b, 20.0f);
        jz5.g gVar = this.f121134f;
        return this.f121132d ? new mo2.r(new android.graphics.drawable.ColorDrawable(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_97)), new int[]{a17, 0, a17, 0}, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue()) : new mo2.r(new android.graphics.drawable.ColorDrawable(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_97)), new int[]{0, 0, 0, 0}, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.member.convert.MemberCommonConfig$getLayoutManager$1 memberCommonConfig$getLayoutManager$1 = new com.tencent.mm.plugin.finder.member.convert.MemberCommonConfig$getLayoutManager$1(context);
        if (this.f121132d) {
            memberCommonConfig$getLayoutManager$1.C = false;
        }
        return memberCommonConfig$getLayoutManager$1;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.y2 e(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        return ((ey2.o1) pf5.z.f353948a.a(context).a(ey2.o1.class)).f257461m;
    }
}
