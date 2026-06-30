package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class i7 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f123789e;

    public i7(com.tencent.mm.plugin.finder.profile.uic.ob obVar, boolean z17) {
        this.f123788d = obVar;
        this.f123789e = z17;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        ya2.b2 profileContact;
        r45.lh2 req = (r45.lh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123788d;
        if (integer != 0) {
            db5.t7.makeText(obVar.getActivity(), obVar.getString(com.tencent.mm.R.string.eoi), 0).show();
            return;
        }
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 b17 = gVar.b(obVar.getUsername());
        if (b17 != null) {
            int integer2 = req.getInteger(1);
            boolean z17 = this.f123789e;
            if (integer2 == 1) {
                b17.field_extFlag |= 16384;
                if (z17) {
                    db5.t7.i(obVar.getActivity(), obVar.getString(com.tencent.mm.R.string.eom), com.tencent.mm.R.raw.icons_filled_eyes_off);
                }
                if (ya2.g.h(gVar, obVar.getUsername(), null, true, false, 10, null) && (profileContact = obVar.getProfileContact()) != null) {
                    com.tencent.mm.plugin.finder.profile.uic.ob.O6(obVar, profileContact);
                }
            } else {
                b17.field_extFlag &= -16385;
                if (z17) {
                    db5.t7.i(obVar.getActivity(), obVar.getString(com.tencent.mm.R.string.eon), com.tencent.mm.R.raw.icons_filled_done);
                }
            }
            gVar.o(b17);
            boolean z18 = req.getInteger(1) == 1;
            jz5.g gVar2 = obVar.f124071p0;
            if (z18) {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar2).getValue()).setVisibility(0);
            } else {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar2).getValue()).setVisibility(8);
            }
        }
    }
}
