package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f174182a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f174183b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f174184c;

    public q(int i17, java.util.ArrayList labelIdList, java.util.ArrayList userNameList) {
        kotlin.jvm.internal.o.g(labelIdList, "labelIdList");
        kotlin.jvm.internal.o.g(userNameList, "userNameList");
        this.f174182a = i17;
        this.f174183b = labelIdList;
        this.f174184c = userNameList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.textstatus.ui.q)) {
            return false;
        }
        com.tencent.mm.plugin.textstatus.ui.q qVar = (com.tencent.mm.plugin.textstatus.ui.q) obj;
        return this.f174182a == qVar.f174182a && kotlin.jvm.internal.o.b(this.f174183b, qVar.f174183b) && kotlin.jvm.internal.o.b(this.f174184c, qVar.f174184c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f174182a) * 31) + this.f174183b.hashCode()) * 31) + this.f174184c.hashCode();
    }

    public java.lang.String toString() {
        return "LastRecentVisibleRange(state=" + this.f174182a + ", labelIdList=" + this.f174183b + ", userNameList=" + this.f174184c + ')';
    }
}
