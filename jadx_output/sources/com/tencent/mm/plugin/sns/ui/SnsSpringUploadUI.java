package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsSpringUploadUI;", "Lcom/tencent/mm/plugin/sns/ui/SnsUploadUI;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsSpringUploadUI extends com.tencent.mm.plugin.sns.ui.SnsUploadUI {

    /* renamed from: y1, reason: collision with root package name */
    public final java.lang.String f167418y1 = "MicroMsg.SnsSpringUploadUI";

    public SnsSpringUploadUI() {
        jz5.h.b(new com.tencent.mm.plugin.sns.ui.pq(this));
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsUploadUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        android.content.Intent resultData = getResultData();
        if (resultData == null) {
            resultData = new android.content.Intent();
        }
        resultData.putExtra("is_spring", this.G);
        setResult(getResultCode(), resultData);
        super.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsUploadUI
    public void g7(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        super.g7(bundle);
        getIntent().putExtra("is_spring", true);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.otq);
        if (relativeLayout != null) {
            relativeLayout.setClipChildren(false);
            relativeLayout.setClipToPadding(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((com.tencent.mm.plugin.sns.ui.i6) r6).f() == false) goto L10;
     */
    @Override // com.tencent.mm.plugin.sns.ui.SnsUploadUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.String r0 = "onActivityResult"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            super.onActivityResult(r6, r7, r8)
            com.tencent.mm.plugin.sns.ui.z4 r6 = r5.f167536u
            boolean r7 = r6 instanceof com.tencent.mm.plugin.sns.ui.p7
            r8 = 0
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView"
            if (r7 != 0) goto L44
            boolean r7 = r6 instanceof com.tencent.mm.plugin.sns.ui.i6
            if (r7 == 0) goto L27
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.NewSightWidget"
            kotlin.jvm.internal.o.e(r6, r7)
            com.tencent.mm.plugin.sns.ui.i6 r6 = (com.tencent.mm.plugin.sns.ui.i6) r6
            boolean r6 = r6.f()
            if (r6 != 0) goto L27
            goto L44
        L27:
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r6 = r5.f167529p
            r6.getClass()
            java.lang.String r7 = "setSyncGone"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            android.widget.ImageView r3 = r6.f167507d
            r4 = 8
            r3.setVisibility(r4)
            android.widget.ImageView r3 = r6.f167508e
            r3.setVisibility(r4)
            r6.f167512i = r8
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            goto L5f
        L44:
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r6 = r5.f167529p
            r6.getClass()
            java.lang.String r7 = "showQzone"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            boolean r3 = r6.f167509f
            if (r3 == 0) goto L5c
            boolean r3 = r6.f167510g
            if (r3 == 0) goto L5c
            android.widget.ImageView r6 = r6.f167507d
            r6.setVisibility(r8)
        L5c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
        L5f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsUploadUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        super.onCreate(bundle);
        this.f167521f.addTextChangedListener(new com.tencent.mm.plugin.sns.ui.qq(this));
        android.content.Intent intent = getIntent();
        xa4.h[] hVarArr = xa4.h.f452837d;
        com.tencent.mars.xlog.Log.i(this.f167418y1, "onCreate: springFeedType=" + intent.getIntExtra("spring_feed_type", 0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsUploadUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsUploadUI
    public void q7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        enableOptionMenu(t7());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMMTitle", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        xa4.g gVar = xa4.g.f452830d;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        super.setMMTitle(gVar.m(context));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMMTitle", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }

    public final boolean t7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCurrentEnableSend", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        com.tencent.mm.plugin.sns.ui.z4 z4Var = this.f167536u;
        boolean z17 = true;
        boolean z18 = z4Var != null && z4Var.f();
        java.lang.String obj = this.f167521f.getText().toString();
        boolean o17 = com.tencent.mm.plugin.sns.ui.y6.o(obj);
        obj.length();
        if (!z18 && !o17) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCurrentEnableSend", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        return z17;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMMTitle", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
        xa4.g gVar = xa4.g.f452830d;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        super.setMMTitle(gVar.m(context));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMMTitle", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI");
    }
}
