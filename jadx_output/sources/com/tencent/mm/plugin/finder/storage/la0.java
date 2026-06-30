package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class la0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.eh2 f127124a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f127125b;

    public la0(r45.eh2 localPb) {
        kotlin.jvm.internal.o.g(localPb, "localPb");
        this.f127124a = localPb;
        this.f127125b = jz5.h.b(new com.tencent.mm.plugin.finder.storage.ka0(this));
    }

    public final boolean a(com.tencent.mm.plugin.finder.storage.la0 other) {
        kotlin.jvm.internal.o.g(other, "other");
        r45.eh2 eh2Var = this.f127124a;
        int integer = eh2Var.getInteger(0);
        r45.eh2 eh2Var2 = other.f127124a;
        if (integer != eh2Var2.getInteger(0)) {
            return false;
        }
        java.lang.String string = eh2Var.getString(1);
        if (string == null) {
            string = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return false;
        }
        java.lang.String string2 = eh2Var.getString(1);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String string3 = eh2Var2.getString(1);
        return kotlin.jvm.internal.o.b(string2, string3 != null ? string3 : "");
    }
}
