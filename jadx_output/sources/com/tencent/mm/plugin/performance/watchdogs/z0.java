package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f153168a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f153169b = new java.util.LinkedList();

    public z0(java.lang.String str) {
        this.f153168a = str;
    }

    public int a() {
        return ((java.util.LinkedList) this.f153169b).size();
    }

    public boolean b() {
        java.util.List list = this.f153169b;
        if (((java.util.LinkedList) list).size() > 0) {
            return ((com.tencent.mm.plugin.performance.watchdogs.a1) ((java.util.LinkedList) list).get(0)).f153006c;
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.performance.watchdogs.a1) {
            return this.f153168a.equals(((com.tencent.mm.plugin.performance.watchdogs.a1) obj).f153004a);
        }
        return false;
    }

    public int hashCode() {
        return this.f153168a.hashCode();
    }

    public java.lang.String toString() {
        return this.f153168a + "=" + a();
    }
}
