package com.tencent.mm.ui.chatting.atsomeone;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/atsomeone/AtSomeoneSearchDataSource;", "Lym3/b;", "Lcom/tencent/mm/ui/chatting/atsomeone/b;", "", "Landroidx/lifecycle/x;", "Ljz5/f0;", "destroy", "chatroom", "<init>", "(Ljava/lang/String;)V", "com/tencent/mm/ui/chatting/atsomeone/c", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AtSomeoneSearchDataSource extends ym3.b implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198464d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f198465e;

    /* renamed from: f, reason: collision with root package name */
    public p13.c f198466f;

    public AtSomeoneSearchDataSource(java.lang.String chatroom) {
        kotlin.jvm.internal.o.g(chatroom, "chatroom");
        this.f198464d = chatroom;
        this.f198465e = jz5.h.b(com.tencent.mm.ui.chatting.atsomeone.d.f198478d);
    }

    @Override // ym3.b
    public kotlinx.coroutines.flow.j d(v65.i scope, xm3.v0 dataRequest) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(dataRequest, "dataRequest");
        u26.k0 k0Var = new u26.k0();
        p13.u uVar = new p13.u();
        uVar.f351142d = this.f198464d;
        uVar.f351141c = (java.lang.String) dataRequest.f455390e;
        uVar.f351140b = 12;
        uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f198465e).getValue();
        uVar.f351151m = new com.tencent.mm.ui.chatting.atsomeone.c(this, dataRequest, k0Var);
        uVar.f351148j.add(c01.z1.r());
        if (this.f198466f != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f198466f);
        }
        this.f198466f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void destroy() {
        if (this.f198466f != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f198466f);
        }
        this.f198466f = null;
    }

    @Override // ym3.b
    public void e() {
        if (this.f198466f != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f198466f);
        }
    }
}
