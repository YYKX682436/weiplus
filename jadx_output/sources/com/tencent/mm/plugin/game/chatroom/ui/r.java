package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes5.dex */
public final class r extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f138856a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f138857b;

    public r(java.util.List oldList, java.util.List newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        this.f138856a = oldList;
        this.f138857b = newList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        w33.c cVar = (w33.c) this.f138856a.get(i17);
        w33.c cVar2 = (w33.c) this.f138857b.get(i18);
        if (cVar.f442711c == cVar2.f442711c && kotlin.jvm.internal.o.b(cVar.f442709a, cVar2.f442709a)) {
            w33.e eVar = cVar.f442710b;
            java.lang.String str = eVar.f442716b;
            w33.e eVar2 = cVar2.f442710b;
            if (kotlin.jvm.internal.o.b(str, eVar2.f442716b) && kotlin.jvm.internal.o.b(eVar.f442717c, eVar2.f442717c) && cVar.f442712d == cVar2.f442712d) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return kotlin.jvm.internal.o.b(((w33.c) this.f138856a.get(i17)).f442710b.f442715a, ((w33.c) this.f138857b.get(i18)).f442710b.f442715a);
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f138857b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f138856a.size();
    }
}
