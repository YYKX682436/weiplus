package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gs implements com.tencent.mm.plugin.finder.ui.at.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f112730a;

    public gs(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f112730a = etVar;
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.a
    public void a(java.lang.String displayName, java.lang.String username) {
        kotlin.jvm.internal.o.g(displayName, "displayName");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f112730a;
        etVar.f112463y1 = username;
        com.tencent.mm.plugin.finder.live.plugin.et.z1(etVar, username, displayName);
    }
}
