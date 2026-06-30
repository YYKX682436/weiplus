package com.tencent.mm.plugin.media.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/media/view/ShrinkNestedLayout;", "Lcom/google/android/flexbox/FlexboxLayout;", "Lkg3/e;", "", "compressed", "Ljz5/f0;", "setShrunk", "", "y", "I", "getPriority", "()I", "setPriority", "(I)V", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, "Lkg3/o;", "z", "Lkg3/o;", "getShrinkListener", "()Lkg3/o;", "setShrinkListener", "(Lkg3/o;)V", "shrinkListener", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getViewId", "viewId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ShrinkNestedLayout extends com.google.android.flexbox.FlexboxLayout implements kg3.e {

    /* renamed from: A, reason: from kotlin metadata */
    public final int viewId;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f148577x;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public int priority;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public kg3.o shrinkListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShrinkNestedLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // kg3.e
    /* renamed from: a */
    public boolean getF148575f() {
        java.util.Iterator it = this.f148577x.iterator();
        while (it.hasNext()) {
            if (!((kg3.e) it.next()).getF148575f()) {
                return false;
            }
        }
        return true;
    }

    @Override // kg3.e
    public int getPriority() {
        return this.priority;
    }

    public kg3.o getShrinkListener() {
        return this.shrinkListener;
    }

    @Override // kg3.e
    public int getViewId() {
        return this.viewId;
    }

    @Override // com.google.android.flexbox.FlexboxLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        measureChildren(i17, i18);
        super.onMeasure(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        super.onViewAdded(child);
        w();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        super.onViewRemoved(child);
        w();
    }

    public void setPriority(int i17) {
        this.priority = i17;
    }

    public void setShrinkListener(kg3.o oVar) {
        this.shrinkListener = oVar;
    }

    @Override // kg3.e
    public void setShrunk(boolean z17) {
        for (kg3.e eVar : this.f148577x) {
            getResources().getResourceEntryName(eVar.getViewId());
            eVar.setShrunk(z17);
        }
    }

    public final void w() {
        java.util.List list = this.f148577x;
        ((java.util.ArrayList) list).clear();
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt instanceof kg3.e) {
                ((java.util.ArrayList) list).add(childAt);
            }
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new kg3.p());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShrinkNestedLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f148577x = new java.util.ArrayList();
        this.viewId = getId();
    }
}
