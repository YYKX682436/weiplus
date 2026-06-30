package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderMemberActionEvent f121341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.autogen.events.FinderMemberActionEvent finderMemberActionEvent) {
        super(1);
        this.f121341d = finderMemberActionEvent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            ya2.b2 contact = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it).getContact();
            if (kotlin.jvm.internal.o.b(contact != null ? contact.D0() : null, this.f121341d.f54304g.f7024a)) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
