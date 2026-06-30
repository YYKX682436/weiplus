package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class zb implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f200365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jb f200366c;

    public zb(com.tencent.mm.ui.chatting.component.jb jbVar, java.lang.String str, com.tencent.mm.storage.z3 z3Var) {
        this.f200366c = jbVar;
        this.f200364a = str;
        this.f200365b = z3Var;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (z17 && com.tencent.mm.sdk.platformtools.t8.D0(this.f200366c.f198580d.x(), str)) {
            gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.yb(this));
        }
    }
}
