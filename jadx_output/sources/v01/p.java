package v01;

/* loaded from: classes11.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.ui.BizProfileCardFragment f432216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f432217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment, boolean z17) {
        super(0);
        this.f432216d = bizProfileCardFragment;
        this.f432217e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.modelbiz.ui.BizProfileCardFragment.f70865q;
        com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment = this.f432216d;
        if (!bizProfileCardFragment.u0()) {
            if (!this.f432217e) {
                bizProfileCardFragment.z0(false);
            } else if (bizProfileCardFragment.getContext() != null) {
                if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                    em.e eVar = bizProfileCardFragment.f70868p;
                    if (eVar == null) {
                        kotlin.jvm.internal.o.o("binding");
                        throw null;
                    }
                    if (eVar.f254249e == null) {
                        eVar.f254249e = (android.widget.TextView) eVar.f254245a.findViewById(com.tencent.mm.R.id.uvm);
                    }
                    android.widget.TextView textView = eVar.f254249e;
                    android.content.Context context = bizProfileCardFragment.getContext();
                    kotlin.jvm.internal.o.d(context);
                    textView.setText(context.getString(com.tencent.mm.R.string.f491226nh1));
                }
                em.e eVar2 = bizProfileCardFragment.f70868p;
                if (eVar2 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                if (eVar2.f254249e == null) {
                    eVar2.f254249e = (android.widget.TextView) eVar2.f254245a.findViewById(com.tencent.mm.R.id.uvm);
                }
                com.tencent.mm.ui.bk.r0(eVar2.f254249e.getPaint(), 0.8f);
                em.e eVar3 = bizProfileCardFragment.f70868p;
                if (eVar3 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                if (eVar3.f254254j == null) {
                    eVar3.f254254j = (android.widget.TextView) eVar3.f254245a.findViewById(com.tencent.mm.R.id.vpk);
                }
                com.tencent.mm.ui.bk.r0(eVar3.f254254j.getPaint(), 0.8f);
                em.e eVar4 = bizProfileCardFragment.f70868p;
                if (eVar4 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                android.widget.RelativeLayout d17 = eVar4.d();
                d17.setVisibility(0);
                d17.setOnClickListener(new v01.d(bizProfileCardFragment));
                em.e eVar5 = bizProfileCardFragment.f70868p;
                if (eVar5 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                android.widget.RelativeLayout h17 = eVar5.h();
                h17.setVisibility(0);
                h17.setOnClickListener(new v01.e(bizProfileCardFragment));
                em.e eVar6 = bizProfileCardFragment.f70868p;
                if (eVar6 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                eVar6.f().setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
