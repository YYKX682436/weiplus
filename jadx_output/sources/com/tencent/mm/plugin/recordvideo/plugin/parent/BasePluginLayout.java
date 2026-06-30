package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Landroid/widget/RelativeLayout;", "Lyt3/r2;", "", "visibility", "Ljz5/f0;", "setVisibility", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "getPluginList", "()Ljava/util/ArrayList;", "pluginList", "", "e", "Z", "isAttached", "()Z", "setAttached", "(Z)V", "", "f", "J", "getStartTimeMs", "()J", "setStartTimeMs", "(J)V", "startTimeMs", "g", "getBrowserTimeMs", "setBrowserTimeMs", "browserTimeMs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class BasePluginLayout extends android.widget.RelativeLayout implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.util.ArrayList pluginList;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isAttached;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long startTimeMs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long browserTimeMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.pluginList = new java.util.ArrayList();
    }

    public final long getBrowserTimeMs() {
        return this.browserTimeMs;
    }

    public final java.util.ArrayList<yt3.r2> getPluginList() {
        return this.pluginList;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final yt3.r2 j(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        for (yt3.r2 r2Var : this.pluginList) {
            if (kotlin.jvm.internal.o.b(r2Var.name(), clazz.getName())) {
                return r2Var;
            }
        }
        return null;
    }

    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).t(configProvider);
        }
    }

    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).onActivityResult(i17, i18, intent);
        }
    }

    public void onAttach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BasePluginLayout", "onAttach: ");
        this.isAttached = true;
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).onAttach();
        }
    }

    public boolean onBackPress() {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            if (((yt3.r2) it.next()).onBackPress()) {
                return true;
            }
        }
        return false;
    }

    public void onDetach() {
        this.browserTimeMs = java.lang.System.currentTimeMillis() - this.startTimeMs;
        this.isAttached = false;
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).onDetach();
        }
    }

    public void onPause() {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).onPause();
        }
    }

    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).onRequestPermissionsResult(i17, permissions, grantResults);
        }
    }

    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BasePluginLayout", "onResume: ");
        this.startTimeMs = java.lang.System.currentTimeMillis();
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).onResume();
        }
    }

    public void p(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        m(navigator, configProvider);
    }

    public void r(ct0.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BasePluginLayout", "loadCurrentPage: start");
        onAttach();
        reset();
        setVisibility(0);
    }

    public void release() {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).release();
        }
    }

    public void reset() {
        java.util.Iterator it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((yt3.r2) it.next()).reset();
        }
    }

    public void s() {
    }

    public final void setAttached(boolean z17) {
        this.isAttached = z17;
    }

    public final void setBrowserTimeMs(long j17) {
        this.browserTimeMs = j17;
    }

    public final void setStartTimeMs(long j17) {
        this.startTimeMs = j17;
    }

    @Override // android.view.View, yt3.r2
    public void setVisibility(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BasePluginLayout", "setVisibility: visibility = " + i17);
        super.setVisibility(i17);
        if (i17 == 0) {
            onResume();
        } else {
            onPause();
        }
    }

    public void u() {
    }

    public void x(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
    }
}
