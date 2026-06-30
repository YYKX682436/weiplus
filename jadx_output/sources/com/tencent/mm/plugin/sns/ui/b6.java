package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class b6 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public m21.v f167885g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.o50 f167886h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167887i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f167888j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f167889k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f167890l;

    /* renamed from: m, reason: collision with root package name */
    public m21.w f167891m;

    /* renamed from: n, reason: collision with root package name */
    public int f167892n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f167888j = "";
        this.f167889k = "";
    }

    public static final void o(com.tencent.mm.plugin.sns.ui.b6 b6Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        b6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        if (!(str == null || str.length() == 0) && com.tencent.mm.vfs.w6.j(str)) {
            b6Var.f167890l = com.tencent.mm.vfs.w6.N(str, 0, -1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f169957c).inflate(com.tencent.mm.R.layout.d2z, (android.view.ViewGroup) null);
        com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView = (com.tencent.mm.plugin.ting.widget.TingCategoryView) inflate.findViewById(com.tencent.mm.R.id.o9e);
        if (tingCategoryView != null) {
            tingCategoryView.setContainerBackgroundColor(tingCategoryView.getContext().getResources().getColor(com.tencent.mm.R.color.f478492d));
            android.content.Context context = tingCategoryView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            tingCategoryView.b(il4.d.c(context, this.f167886h, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return inflate;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        if (this.f167890l != null) {
            p(str, linkedList, iVar, ed4Var, z17, list2, i17, i27, i28, pInt, i19, list);
            str4 = "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget";
            str3 = "commit";
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicTingCategoryWidget", "commit thumbData null and try to download, coverUrl: %s", this.f167887i);
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            java.lang.String str5 = this.f167887i;
            if (str5 == null) {
                str5 = "";
            }
            str3 = "commit";
            str4 = "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget";
            ((dl4.m0) tVar).Bi(str5, new com.tencent.mm.plugin.sns.ui.z5(this, str, linkedList, iVar, ed4Var, z17, list2, i17, i27, i28, pInt, i19, list));
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        this.f169957c.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        super.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_ting_album_share_object_xml");
        boolean z17 = true;
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(stringExtra, "tingCategoryItem", null);
            if (d17 != null) {
                m21.v vVar = new m21.v();
                r45.km6 Zi = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).Zi("", d17);
                vVar.f323001a = Zi;
                this.f167885g = vVar;
                bw5.o50 v17 = il4.d.v(Zi.f378839e);
                this.f167886h = v17;
                this.f167887i = il4.d.k(v17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareTingCategory tingAlbumXml: ");
                sb6.append(stringExtra);
                sb6.append(", tingCategoryItem.type: ");
                bw5.o50 o50Var = this.f167886h;
                sb6.append(o50Var != null ? java.lang.Integer.valueOf(o50Var.f30964n) : null);
                sb6.append(", tingCategoryItem.category_id: ");
                bw5.o50 o50Var2 = this.f167886h;
                sb6.append(o50Var2 != null ? o50Var2.c() : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicTingCategoryWidget", sb6.toString());
            }
        }
        this.f167891m = m21.w.f(mMActivity.getIntent());
        this.f167892n = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Ksnsupload_title");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f167889k = stringExtra2;
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("Ksnsupload_link");
        this.f167888j = stringExtra3 != null ? stringExtra3 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        java.lang.String str = this.f167887i;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(this.f167887i, new com.tencent.mm.plugin.sns.ui.a6(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initThumbData", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        return false;
    }

    public final void p(java.lang.String str, java.util.LinkedList linkedList, l56.i iVar, r45.ed4 ed4Var, boolean z17, java.util.List list, int i17, int i18, int i19, com.tencent.mm.pointers.PInt pInt, int i27, java.util.List list2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(48, this.f169957c);
        m21.v vVar = this.f167885g;
        if (vVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareTingAlbum", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            y7Var.f164781f.ContentObj.A = vVar.f323001a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareTingAlbum", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        y7Var.C(this.f167889k);
        y7Var.B(this.f167888j);
        y7Var.D(this.f167888j);
        y7Var.t(str);
        byte[] bArr = this.f167890l;
        if (bArr != null) {
            y7Var.c(bArr, "", "");
        }
        y7Var.N(this.f167892n);
        y7Var.x(linkedList);
        if (iVar != null) {
            y7Var.U(iVar.f316692d, iVar.f316693e);
        }
        y7Var.A(ed4Var);
        y7Var.z(z17 ? 1 : 0);
        y7Var.y(list);
        y7Var.G(i17);
        y7Var.O(null, null, null, i18, i19);
        if (pInt != null) {
            pInt.value = y7Var.l();
        }
        if (i27 > q94.a.f360928a) {
            y7Var.u(1, 4);
        }
        if (list2 != null) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
            java.util.List b17 = k35.c.b();
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b17).contains(str2)) {
                    r45.jb6 jb6Var = new r45.jb6();
                    jb6Var.f377690d = str2;
                    linkedList2.add(jb6Var);
                }
            }
            y7Var.W(linkedList2);
        }
        m(y7Var);
        int i28 = y7Var.i();
        m21.w wVar = this.f167891m;
        if (wVar != null) {
            wVar.a(i28);
            com.tencent.mm.plugin.sns.statistics.x0.f164998b.b(wVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCommit", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget");
    }
}
