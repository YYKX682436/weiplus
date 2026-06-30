package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ck extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f123601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f123602b;

    public ck(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        this.f123601a = arrayList;
        this.f123602b = dkVar;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        return true;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return ((so2.j5) this.f123601a.get(i17)).getItemId() == ((so2.j5) this.f123602b.O6().get(i18)).getItemId();
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f123602b.O6().size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f123601a.size();
    }
}
