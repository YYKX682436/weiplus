package de4;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.plugin.sns.ui.n1 implements com.tencent.mm.plugin.sns.ui.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.sns.ui.t4
    public void a(java.lang.Object o17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        kotlin.jvm.internal.o.g(o17, "o");
        ((ee4.v) k(ee4.v.class)).q(o17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        return null;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pContentType, java.lang.String str2, int i27, int i28) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        kotlin.jvm.internal.o.g(pContentType, "pContentType");
        ce4.a k17 = k(ee4.c0.class);
        kotlin.jvm.internal.o.f(k17, "component(...)");
        ee4.c0 c0Var = (ee4.c0) k17;
        com.tencent.mm.plugin.sns.ui.m1 commitBlockCallback = this.f169958d;
        kotlin.jvm.internal.o.f(commitBlockCallback, "commitBlockCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommitBlockCallback", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        c0Var.f251694p = commitBlockCallback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommitBlockCallback", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        kotlinx.coroutines.l.d(c0Var.o().p(), null, null, new ee4.a0(c0Var, i17, i18, iVar, str, list, ed4Var, linkedList, i19, z17, list2, pContentType, str2, i27, i28, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void d(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPicWidget", "handleExitAndNeedSave >> isNeedSave: " + z17);
        if (z17) {
            ee4.i0 i0Var = (ee4.i0) k(ee4.i0.class);
            i0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveMultiPicItemDraft", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc");
            java.lang.String stringExtra = i0Var.c().getIntent().getStringExtra("sns_media_publish_multi_pic_item_mmkv_key");
            i0Var.f("saveMultiPicItemDraft >> last mmkvKey >> " + stringExtra);
            if (stringExtra == null || stringExtra.length() == 0) {
                byte[] bytes = java.lang.String.valueOf(java.lang.System.currentTimeMillis()).getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                stringExtra = kk.k.g(bytes);
            }
            i0Var.f("saveMultiPicItemDraft >> size: " + i0Var.m().v().e().size() + " pathSize: " + ((java.util.ArrayList) i0Var.m().v().d()).size() + " mmkvKey: " + stringExtra);
            com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems snsDraftMultiPicItems = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems(i0Var.m().v().e());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDraftMMKV", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc");
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) i0Var.f251718o).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDraftMMKV", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc");
            boolean C = o4Var.C("KEY_MULTI_PIC_ITEMS_" + stringExtra, snsDraftMultiPicItems);
            i0Var.c().getIntent().putExtra("sns_media_publish_multi_pic_item_mmkv_key", stringExtra);
            i0Var.c().getIntent().putStringArrayListExtra("sns_kemdia_path_list", new java.util.ArrayList<>(i0Var.m().v().d()));
            i0Var.f("saveMultiPicItemDraft result: " + C);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveMultiPicItemDraft", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        super.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        fe4.b v17 = ((ee4.b1) k(ee4.b1.class)).v();
        v17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enable", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        boolean z17 = !v17.f261562a.isEmpty();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enable", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiPicWidget", "enableNext, enable: " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        if (bundle != null) {
            ee4.b1 b1Var = (ee4.b1) k(ee4.b1.class);
            b1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleOnSave", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
            bundle.putParcelableArrayList("sns_media_publish_multi_pic_list", new java.util.ArrayList<>(b1Var.m().f251678n.e()));
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            for (java.util.Map.Entry entry : b1Var.f251679o.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                fp.n nVar = (fp.n) entry.getValue();
                java.lang.String format = java.lang.String.format("%s\n%f\n%f", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Double.valueOf(nVar.f265213a), java.lang.Double.valueOf(nVar.f265214b)}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                arrayList.add(format);
            }
            bundle.putStringArrayList("sns_media_latlong_list", arrayList);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnSave", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    @Override // com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h() {
        /*
            r9 = this;
            java.lang.String r0 = "beforeCommit"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.Class<ee4.w> r2 = ee4.w.class
            ce4.a r2 = r9.k(r2)
            ee4.w r2 = (ee4.w) r2
            r2.getClass()
            java.lang.String r3 = "checkCanCommit"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCheckCommitPc"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.mm.ui.MMActivity r5 = r2.c()
            boolean r6 = r5 instanceof com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI
            r7 = 1
            if (r6 == 0) goto L38
            ee4.b1 r6 = r2.m()
            fe4.b r6 = r6.v()
            java.util.List r6 = r6.e()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L38
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L7c
        L38:
            java.lang.String r6 = "checkMediaFile"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            ee4.b1 r2 = r2.m()
            fe4.b r2 = r2.v()
            java.util.List r2 = r2.e()
            boolean r8 = r2.isEmpty()
            r8 = r8 ^ r7
            if (r8 == 0) goto L6a
            java.util.Iterator r2 = r2.iterator()
        L54:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L6b
            java.lang.Object r8 = r2.next()
            com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem r8 = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) r8
            java.lang.String r8 = r8.b()
            boolean r8 = com.tencent.mm.vfs.w6.j(r8)
            if (r8 != 0) goto L54
        L6a:
            r7 = 0
        L6b:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            if (r7 != 0) goto L79
            r2 = 2131777216(0x7f1056c0, float:1.9185926E38)
            r6 = 2131756315(0x7f10051b, float:1.9143534E38)
            db5.e1.i(r5, r2, r6)
        L79:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L7c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: de4.a.h():boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        super.i(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1
    public boolean l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedSetCommitBlockCallback", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedSetCommitBlockCallback", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1
    public void n(java.util.HashSet pcSet) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerComponent", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
        kotlin.jvm.internal.o.g(pcSet, "pcSet");
        pcSet.add(new ee4.b1(this));
        pcSet.add(new ee4.b(this));
        pcSet.add(new ee4.e(this));
        pcSet.add(new ee4.v(this));
        pcSet.add(new ee4.i0(this));
        pcSet.add(new ee4.l0(this));
        pcSet.add(new ee4.m0(this));
        pcSet.add(new ee4.e1(this));
        pcSet.add(new ee4.f1(this));
        pcSet.add(new ee4.g1(this));
        pcSet.add(new ee4.w(this));
        pcSet.add(new ee4.r0(this));
        pcSet.add(new ee4.c0(this));
        pcSet.add(new ee4.x0(this));
        pcSet.add(new ee4.f0(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerComponent", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0282  */
    @Override // com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onActivityResult(int r26, int r27, android.content.Intent r28) {
        /*
            Method dump skipped, instructions count: 1399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de4.a.onActivityResult(int, int, android.content.Intent):boolean");
    }
}
