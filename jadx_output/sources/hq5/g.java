package hq5;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.i f283230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hq5.i iVar) {
        super(1);
        this.f283230d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        eq5.h hVar;
        eq5.h hVar2;
        j75.f Q6;
        eq5.h hVar3;
        java.lang.String str;
        eq5.h state = (eq5.h) obj;
        kotlin.jvm.internal.o.g(state, "state");
        eq5.c cVar = (eq5.c) state.a(eq5.c.class);
        hq5.i iVar = this.f283230d;
        if (cVar != null && (Q6 = iVar.Q6()) != null && (hVar3 = (eq5.h) Q6.getState()) != null && (str = hVar3.f255916g) != null) {
            int f17 = i65.a.f(iVar.getContext(), com.tencent.mm.R.dimen.f479731dn);
            gk0.k kVar = new gk0.k(f17, f17);
            kVar.f272434e = com.tencent.mm.R.drawable.bhm;
            kVar.f272433d = 0.1f;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            com.tencent.mm.ui.MMImageView a17 = iVar.V6().a();
            kotlin.jvm.internal.o.f(a17, "getAvatarIv(...)");
            ((h83.g) n0Var).wi(a17, str, kVar);
        }
        eq5.i iVar2 = (eq5.i) state.a(eq5.i.class);
        if (iVar2 != null) {
            iVar.V6().a().setVisibility(8);
            boolean z17 = false;
            iVar.V6().b().setVisibility(0);
            em.f4 V6 = iVar.V6();
            if (V6.f254321f == null) {
                V6.f254321f = (android.widget.ProgressBar) V6.f254316a.findViewById(com.tencent.mm.R.id.vfw);
            }
            V6.f254321f.setVisibility(8);
            iVar.V6().c().setVisibility(8);
            switch (iVar2.f255922b) {
                case 1:
                case 2:
                    iVar.V6().a().setVisibility(0);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nqq, iVar.U6()));
                    em.f4 V62 = iVar.V6();
                    if (V62.f254321f == null) {
                        V62.f254321f = (android.widget.ProgressBar) V62.f254316a.findViewById(com.tencent.mm.R.id.vfw);
                    }
                    V62.f254321f.setVisibility(0);
                    iVar.V6().b().setText(iVar.getContext().getString(com.tencent.mm.R.string.nqo));
                    break;
                case 3:
                case 4:
                    iVar.V6().c().s(com.tencent.mm.R.raw.exclamation_mark_circle_regular, com.tencent.mm.R.color.Red_100);
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nsj, iVar.U6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 5:
                    iVar.V6().a().setVisibility(0);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nye, iVar.U6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 6:
                    iVar.V6().a().setVisibility(0);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nqm, iVar.U6()));
                    iVar.V6().b().setText(iVar.getContext().getString(com.tencent.mm.R.string.nzh));
                    break;
                case 7:
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nyo, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 8:
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nxt, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 9:
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nyr, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 10:
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nxp, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 11:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().c().s(com.tencent.mm.R.raw.exclamation_mark_circle_regular, com.tencent.mm.R.color.Red_100);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nz8));
                    j75.f Q62 = iVar.Q6();
                    if (Q62 != null && (hVar = (eq5.h) Q62.getState()) != null && hVar.f255921o) {
                        z17 = true;
                    }
                    if (!z17) {
                        iVar.V6().b().setText(iVar.getContext().getString(com.tencent.mm.R.string.nz9));
                        break;
                    } else {
                        iVar.V6().b().setText(iVar.getContext().getString(com.tencent.mm.R.string.nsz));
                        break;
                    }
                    break;
                case 12:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().c().s(com.tencent.mm.R.raw.exclamation_mark_circle_regular, com.tencent.mm.R.color.Red_100);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nyx));
                    j75.f Q63 = iVar.Q6();
                    if (Q63 != null && (hVar2 = (eq5.h) Q63.getState()) != null && hVar2.f255921o) {
                        z17 = true;
                    }
                    if (!z17) {
                        iVar.V6().b().setText(iVar.getContext().getString(com.tencent.mm.R.string.f491994nz2));
                        break;
                    } else {
                        iVar.V6().b().setText(iVar.getContext().getString(com.tencent.mm.R.string.nsv));
                        break;
                    }
                    break;
                case 13:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nyi));
                    iVar.V6().b().setText(iVar.getContext().getString(com.tencent.mm.R.string.nyh));
                    iVar.V6().c().s(com.tencent.mm.R.raw.radar, com.tencent.mm.R.color.Indigo_100);
                    break;
                case 14:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nsj, iVar.U6()));
                    iVar.V6().b().setVisibility(8);
                    iVar.V6().c().s(com.tencent.mm.R.raw.exclamation_mark_circle_regular, com.tencent.mm.R.color.Red_100);
                    break;
                case 15:
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nt8, iVar.T6()));
                    iVar.V6().b().setVisibility(8);
                    break;
                case 16:
                    iVar.V6().c().s(com.tencent.mm.R.raw.exclamation_mark_circle_regular, com.tencent.mm.R.color.Red_100);
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nsj, iVar.U6()));
                    iVar.V6().b().setText(iVar.getContext().getString(com.tencent.mm.R.string.nyg));
                    break;
                case 17:
                    iVar.V6().c().setVisibility(0);
                    iVar.V6().c().s(com.tencent.mm.R.raw.info_circle_regular, com.tencent.mm.R.color.f478520a84);
                    iVar.V6().d().setText(iVar.getContext().getString(com.tencent.mm.R.string.nms));
                    iVar.V6().b().setVisibility(8);
                    break;
            }
        }
        return jz5.f0.f302826a;
    }
}
