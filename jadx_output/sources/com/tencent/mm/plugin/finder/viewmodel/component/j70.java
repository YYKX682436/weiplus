package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j70 implements com.tencent.mm.plugin.finder.view.sr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.l70 f134823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f134825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f134826d;

    public j70(com.tencent.mm.plugin.finder.viewmodel.component.l70 l70Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.util.List list, long j17) {
        this.f134823a = l70Var;
        this.f134824b = baseFinderFeed;
        this.f134825c = list;
        this.f134826d = j17;
    }

    @Override // com.tencent.mm.plugin.finder.view.sr
    public void a(com.tencent.mm.plugin.finder.view.tr optionItem, android.content.Context context) {
        kotlin.jvm.internal.o.g(optionItem, "optionItem");
        kotlin.jvm.internal.o.g(context, "context");
        long j17 = this.f134826d;
        java.util.List list = optionItem.f133151d;
        if (list != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var = (com.tencent.mm.plugin.finder.viewmodel.component.o70) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
            if (o70Var != null) {
                o70Var.T6(j17, list);
            }
        } else {
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.o70) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
            if (o70Var2 != null) {
                o70Var2.T6(j17, new java.util.ArrayList());
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.l70 l70Var = this.f134823a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f134824b;
        int size = this.f134825c.size();
        pf5.z zVar3 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var3 = (com.tencent.mm.plugin.finder.viewmodel.component.o70) zVar3.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
        l70Var.R6(context, baseFinderFeed, "view_clk", size, o70Var3 != null ? o70Var3.P6(j17) : null);
    }
}
