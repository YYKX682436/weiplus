package y94;

/* loaded from: classes10.dex */
public final class i extends yt3.a implements android.view.View.OnClickListener, com.tencent.mm.plugin.mmsight.segment.h {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f460377f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f460378g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f460379h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f460380i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f460381m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.b f460382n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        this.f460377f = jz5.h.b(new y94.f(status));
        this.f460378g = jz5.h.b(new y94.h(status));
        this.f460379h = jz5.h.b(new y94.b(status));
        this.f460380i = jz5.h.b(new y94.a(status));
    }

    public final android.view.View A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        android.view.View view = (android.view.View) ((jz5.n) this.f460377f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        return view;
    }

    public final void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        z().animate().alpha(0.0f).setDuration(300L).setListener(new y94.g(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    public final void C(float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("syncCropVideoLength", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        if (this.f460382n != null) {
            int b17 = a06.d.b(r2.f162382a * f17);
            int b18 = a06.d.b(r2.f162382a * f18);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT", b17);
            bundle.putInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT", b18);
            this.f465332d.w(ju3.c0.f301916y0, bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("syncCropVideoLength", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void d(boolean z17, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMove", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMove", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void j(boolean z17, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        ju3.d0.k(this.f465332d, ju3.c0.f301895p1, null, 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPress", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        if (A().getVisibility() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPress", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            return false;
        }
        B();
        ju3.d0.k(this.f465332d, ju3.c0.f301917y1, null, 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPress", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.n7i) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCropLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            android.view.View A = A();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(A, arrayList2.toArray(), "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            A.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(A, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            android.view.View view2 = (android.view.View) ((jz5.n) this.f460378g).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverGuideView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            android.view.View view3 = (android.view.View) ((jz5.n) this.f460380i).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverGuideView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "showCropLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z().setVisibility(0);
            z().setAlpha(0.0f);
            z().clearAnimation();
            z().animate().alpha(1.0f).setDuration(100L).setListener(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCropLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initThumbBarView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            if (this.f460382n == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initThumbBarView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            } else {
                if (!z().getHasInit()) {
                    com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f460381m;
                    if (recordConfigProvider == null) {
                        kotlin.jvm.internal.o.o("configProvider");
                        throw null;
                    }
                    int i17 = recordConfigProvider.f155685w;
                    com.tencent.mm.plugin.sight.base.b bVar = this.f460382n;
                    kotlin.jvm.internal.o.d(bVar);
                    int min = java.lang.Math.min(i17, bVar.f162382a);
                    com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView z17 = z();
                    com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f460381m;
                    if (recordConfigProvider2 == null) {
                        kotlin.jvm.internal.o.o("configProvider");
                        throw null;
                    }
                    java.lang.String inputVideoPath = recordConfigProvider2.A;
                    kotlin.jvm.internal.o.f(inputVideoPath, "inputVideoPath");
                    if (this.f460381m == null) {
                        kotlin.jvm.internal.o.o("configProvider");
                        throw null;
                    }
                    z17.a(inputVideoPath, min, (int) java.lang.Math.ceil((r7.f155686x * 1.0d) / 1000), new y94.c(min));
                    z().setThumbBarSeekListener(this);
                    z().setCancelButtonClickListener(new y94.d(this));
                    z().setFinishButtonClickListener(new y94.e(this));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initThumbBarView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            }
            ju3.d0.k(this.f465332d, ju3.c0.f301894p0, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void p(boolean z17, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUp", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        C(f17, f18);
        ju3.d0.k(this.f465332d, ju3.c0.f301913x1, null, 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUp", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        java.lang.Object obj = this.f465332d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) obj).findViewById(com.tencent.mm.R.id.n7i).setOnClickListener(this);
        this.f460381m = configProvider;
        this.f460382n = com.tencent.mm.plugin.sight.base.e.d(configProvider.A, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.h
    public void u(float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRecyclerChanged", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        C(f17, f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRecyclerChanged", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
    }

    public final com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView = (com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView) ((jz5.n) this.f460379h).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        return editVideoSeekBarView;
    }
}
