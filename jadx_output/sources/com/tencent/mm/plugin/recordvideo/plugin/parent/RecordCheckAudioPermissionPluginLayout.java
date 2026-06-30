package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordCheckAudioPermissionPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseScopePluginLayout;", "", "i", "Z", "getCheckAudioPermission", "()Z", "setCheckAudioPermission", "(Z)V", "checkAudioPermission", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class RecordCheckAudioPermissionPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean checkAudioPermission;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f155829m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordCheckAudioPermissionPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public abstract void A(boolean z17);

    public final boolean getCheckAudioPermission() {
        return this.checkAudioPermission;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        this.f155829m = configProvider;
        if (!(this instanceof com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout)) {
            z();
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordCheckAudioPermissionPluginLayout", "onRequestPermissionsResult requestCode:" + i17 + " permissions:" + permissions + " grantResults:" + grantResults);
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (i17 == 80) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                A(true);
            } else {
                db5.e1.C(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.hss), i65.a.r(getContext(), com.tencent.mm.R.string.hsu), i65.a.r(getContext(), com.tencent.mm.R.string.hst), i65.a.r(getContext(), com.tencent.mm.R.string.hsr), false, new ju3.g1(this), new ju3.h1(this));
            }
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onResume() {
        super.onResume();
        if (this.checkAudioPermission || !(!(this instanceof com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout))) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f155829m;
            if (recordConfigProvider != null ? kotlin.jvm.internal.o.b(recordConfigProvider.f155682t, java.lang.Boolean.TRUE) : false) {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((sb0.f) jVar).getClass();
                A(j35.u.h((android.app.Activity) context, "android.permission.RECORD_AUDIO"));
            }
        }
    }

    public final void setCheckAudioPermission(boolean z17) {
        this.checkAudioPermission = z17;
    }

    public boolean z() {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f155829m;
        if (recordConfigProvider != null ? kotlin.jvm.internal.o.b(recordConfigProvider.f155682t, java.lang.Boolean.FALSE) : false) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "jump check audio permission");
            return true;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a((android.app.Activity) context, "android.permission.RECORD_AUDIO", 80, "", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordCheckAudioPermissionPluginLayout", "checkAudioPermission " + a17 + " !");
        return a17;
    }
}
