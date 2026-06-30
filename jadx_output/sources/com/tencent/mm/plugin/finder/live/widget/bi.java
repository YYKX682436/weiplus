package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bi implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ei f117896a;

    public bi(com.tencent.mm.plugin.finder.live.widget.ei eiVar) {
        this.f117896a = eiVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.widget.ei eiVar = this.f117896a;
        boolean z17 = true;
        eiVar.d(true);
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            db5.t7.i(eiVar.getContext(), eiVar.getContext().getResources().getString(com.tencent.mm.R.string.de9), com.tencent.mm.R.raw.icons_filled_done);
        } else {
            int i17 = fVar.f70616b;
            if (i17 == -200143) {
                java.lang.String str = fVar.f70617c;
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                db5.t7.i(eiVar.getContext(), z17 ? eiVar.getContext().getResources().getString(com.tencent.mm.R.string.de7) : fVar.f70617c, com.tencent.mm.R.raw.icons_filled_report_problem);
            } else if (i17 == -200144) {
                db5.t7.g(eiVar.getContext(), fVar.f70617c);
            } else {
                java.lang.String str2 = fVar.f70617c;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                db5.t7.g(eiVar.getContext(), z17 ? eiVar.getContext().getResources().getString(com.tencent.mm.R.string.de6) : fVar.f70617c);
            }
        }
        return jz5.f0.f302826a;
    }
}
