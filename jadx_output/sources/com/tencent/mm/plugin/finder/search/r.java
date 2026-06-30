package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class r extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchUI f125831g;

    public r(com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI) {
        this.f125831g = finderContactSearchUI;
    }

    @Override // fc2.d
    public boolean E0() {
        return true;
    }

    @Override // fc2.d
    public void G0(fc2.a event) {
        fc2.t tVar;
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(event, "event");
        if (!(event instanceof fc2.t) || (i17 = (tVar = (fc2.t) event).f260987f) > (i18 = tVar.f260989h)) {
            return;
        }
        while (true) {
            com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI = this.f125831g;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.mu2) finderContactSearchUI.f125534z.get(i17)).getCustom(0);
            com.tencent.mm.plugin.finder.search.FinderContactSearchUI.c7(finderContactSearchUI, finderContact != null ? finderContact.getUsername() : null, i17, 0, 4, null);
            if (i17 == i18) {
                return;
            } else {
                i17++;
            }
        }
    }
}
