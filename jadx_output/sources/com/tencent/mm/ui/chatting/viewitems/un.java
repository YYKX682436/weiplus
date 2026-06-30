package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class un implements com.tencent.mm.storage.a9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f205715d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f205716e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f205717f;

    public un(com.tencent.mm.storage.f9 f9Var) {
        this.f205716e = 0;
        this.f205717f = x63.g.G(f9Var);
        this.f205716e = go.d.f273696a.d(f9Var.Q0(), f9Var.getMsgId());
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.un unVar = (com.tencent.mm.ui.chatting.viewitems.un) obj;
        if (this.f205717f != unVar.f205717f || this.f205716e != unVar.f205716e) {
            return false;
        }
        java.lang.Boolean bool = this.f205715d;
        java.lang.Boolean bool2 = unVar.f205715d;
        return (bool == null && bool2 == null) || (bool != null && bool2 != null && bool.booleanValue() == bool2.booleanValue());
    }
}
