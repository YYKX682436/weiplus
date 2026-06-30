package com.tencent.mm.plugin.finder.live.controller.screenshotshare.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/screenshotshare/view/PortraitShellView;", "Lcom/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView;", "", "m", "I", "getViewId", "()I", "viewId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class PortraitShellView extends com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final int viewId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortraitShellView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.viewId = com.tencent.mm.R.layout.ayq;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView
    public int getViewId() {
        return this.viewId;
    }
}
