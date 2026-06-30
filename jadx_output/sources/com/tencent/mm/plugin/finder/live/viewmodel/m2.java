package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f117235a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f117236b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f117237c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f117238d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.viewmodel.l2 f117239e;

    public m2(int i17, java.lang.String title, java.lang.String desc, boolean z17, com.tencent.mm.plugin.finder.live.viewmodel.l2 l2Var) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f117235a = i17;
        this.f117236b = title;
        this.f117237c = desc;
        this.f117238d = z17;
        this.f117239e = l2Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.viewmodel.m2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.m2 m2Var = (com.tencent.mm.plugin.finder.live.viewmodel.m2) obj;
        return this.f117235a == m2Var.f117235a && kotlin.jvm.internal.o.b(this.f117236b, m2Var.f117236b) && kotlin.jvm.internal.o.b(this.f117237c, m2Var.f117237c) && this.f117238d == m2Var.f117238d && kotlin.jvm.internal.o.b(this.f117239e, m2Var.f117239e);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f117235a) * 31) + this.f117236b.hashCode()) * 31) + this.f117237c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f117238d)) * 31;
        com.tencent.mm.plugin.finder.live.viewmodel.l2 l2Var = this.f117239e;
        return hashCode + (l2Var == null ? 0 : l2Var.hashCode());
    }

    public java.lang.String toString() {
        return "VisibleInfo(type=" + this.f117235a + ", title=" + this.f117236b + ", desc=" + this.f117237c + ", isChosen=" + this.f117238d + ", subInfo=" + this.f117239e + ')';
    }

    public /* synthetic */ m2(int i17, java.lang.String str, java.lang.String str2, boolean z17, com.tencent.mm.plugin.finder.live.viewmodel.l2 l2Var, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, str, str2, z17, (i18 & 16) != 0 ? null : l2Var);
    }
}
