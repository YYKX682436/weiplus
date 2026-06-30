package uo1;

/* loaded from: classes5.dex */
public final class u extends com.tencent.mm.ui.widget.dialog.g2 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.backup.roambackup.k f429590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f429591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f429592g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f429593h;

    public u(po1.d dVar, qo1.f0 f0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f429591f = dVar;
        this.f429592g = f0Var;
        this.f429593h = y1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488712dq3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s8y)).setText(com.tencent.mm.R.string.mfj);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.riz);
        button.setOnClickListener(new uo1.q(this.f429591f, this.f429592g, this, this.f429593h));
        com.tencent.mm.plugin.backup.roambackup.MmAoaManager mmAoaManager = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92553a;
        jz5.l a17 = mmAoaManager.a();
        button.setEnabled(a17.f302833d != null && ((java.lang.Boolean) a17.f302834e).booleanValue());
        uo1.s sVar = new uo1.s(button);
        this.f429590e = sVar;
        mmAoaManager.d(sVar);
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.cyy)).setOnClickListener(new uo1.t(this));
        return inflate;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void f() {
        com.tencent.mm.plugin.backup.roambackup.MmAoaManager mmAoaManager = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92553a;
        com.tencent.mm.plugin.backup.roambackup.k kVar = this.f429590e;
        if (kVar != null) {
            mmAoaManager.f(kVar);
        } else {
            kotlin.jvm.internal.o.o("accessoryListener");
            throw null;
        }
    }
}
