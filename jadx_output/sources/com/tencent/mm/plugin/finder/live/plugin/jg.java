package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jg extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f113102b;

    public jg(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, java.util.List list) {
        this.f113101a = mgVar;
        this.f113102b = list;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        dk2.zf zfVar = (dk2.zf) kz5.n0.a0(this.f113102b, i18);
        return ((zfVar instanceof dk2.eg) && ((dk2.eg) zfVar).A()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return kotlin.jvm.internal.o.b(kz5.n0.a0(this.f113101a.D.f22180m, i17), kz5.n0.a0(this.f113102b, i18));
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f113102b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f113101a.D.f22180m.size();
    }
}
