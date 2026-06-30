package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mw implements ke2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az2.f f119128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f119129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f119130c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nw f119131d;

    public mw(az2.f fVar, int i17, java.util.List list, com.tencent.mm.plugin.finder.live.widget.nw nwVar) {
        this.f119128a = fVar;
        this.f119129b = i17;
        this.f119130c = list;
        this.f119131d = nwVar;
    }

    @Override // ke2.l0
    public void a(int i17, int i18, java.lang.String str) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.kw(this.f119128a, i17, i18, str, this.f119131d));
    }

    @Override // ke2.l0
    public void b(r45.jb2 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.lw(this.f119128a, this.f119129b, this.f119130c, this.f119131d));
    }
}
