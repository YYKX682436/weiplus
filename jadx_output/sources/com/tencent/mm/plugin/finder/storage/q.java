package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class q implements com.tencent.mm.plugin.finder.storage.uj0 {

    /* renamed from: a, reason: collision with root package name */
    public final bu2.o f127397a = new bu2.o("blockPoster.fp");

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f127398b = new java.util.Vector();

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public boolean a() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public com.tencent.mm.modelbase.m1 b(java.util.List nameList) {
        kotlin.jvm.internal.o.g(nameList, "nameList");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public boolean c() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public com.tencent.mm.modelbase.m1 d(com.tencent.mm.protocal.protobuf.FinderContact contact, com.tencent.mm.plugin.finder.storage.tj0 tj0Var) {
        kotlin.jvm.internal.o.g(contact, "contact");
        java.lang.String username = contact.getUsername();
        if (username == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.storage.p pVar = new com.tencent.mm.plugin.finder.storage.p(this, tj0Var, contact);
        this.f127398b.add(pVar);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.b(ya2.r.f460525a, username, false, null, null, pVar, 12, null);
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence e(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.eok);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.util.LinkedList g() {
        return this.f127397a.b();
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public x51.h h() {
        return this.f127397a;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence i() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cha);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.util.Set j(java.util.List contacts, com.tencent.mm.plugin.finder.storage.tj0 tj0Var) {
        kotlin.jvm.internal.o.g(contacts, "contacts");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence k(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cmn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public void l(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        try {
            intent.putExtra("request_type", 8);
            intent.putExtra("need_history", false);
        } catch (java.lang.Exception unused) {
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).oj(context, null, intent);
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence m() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.exn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence n() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.exo);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
