package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class ya implements com.tencent.mm.pluginsdk.ui.chat.kb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f190765a;

    public ya(com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        this.f190765a = ibVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.kb
    public void a(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190765a;
        if (z17) {
            ibVar.m(10, ibVar.f190416r.b());
        } else {
            ibVar.m(8, ibVar.f190416r.b());
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.kb
    public void b(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190765a;
        if (z17) {
            ibVar.m(9, ibVar.f190416r.b());
        } else {
            ibVar.m(7, ibVar.f190416r.b());
        }
    }
}
