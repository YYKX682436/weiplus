package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/LoadingSwitchBtn;", "Lcom/tencent/mm/ui/widget/MMSwitchBtn;", "Laz2/f;", "loadingComponent", "Ljz5/f0;", "setDelayLoading", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "Laz2/f;", "getLoadingComponent", "()Laz2/f;", "setLoadingComponent", "(Laz2/f;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LoadingSwitchBtn extends com.tencent.mm.ui.widget.MMSwitchBtn {
    public final java.lang.String R;

    /* renamed from: S, reason: from kotlin metadata */
    public az2.f loadingComponent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingSwitchBtn(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.R = "Finder.LoadingSwitchBtn";
    }

    public final void g(kotlinx.coroutines.y0 scope, yz5.a currentState, yz5.p onChanged) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(currentState, "currentState");
        kotlin.jvm.internal.o.g(onChanged, "onChanged");
        setEnabled(true);
        setSwitchListener(new com.tencent.mm.plugin.finder.view.pr(currentState, this, scope, onChanged));
    }

    public final az2.f getLoadingComponent() {
        return this.loadingComponent;
    }

    public final void setDelayLoading(az2.f fVar) {
        this.loadingComponent = fVar;
    }

    public final void setLoadingComponent(az2.f fVar) {
        this.loadingComponent = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingSwitchBtn(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.R = "Finder.LoadingSwitchBtn";
    }
}
