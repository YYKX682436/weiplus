package com.tencent.mm.plugin.profile.ui.tab.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileRecyclerView;", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;", "Las3/s;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnScrollToTopListener", "i2", "Las3/s;", "getMOnScrollToTopListener", "()Las3/s;", "setMOnScrollToTopListener", "(Las3/s;)V", "mOnScrollToTopListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class BizProfileRecyclerView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView {

    /* renamed from: i2, reason: collision with root package name and from kotlin metadata */
    public as3.s mOnScrollToTopListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileRecyclerView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void a1(int i17) {
        super.a1(i17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void c1(int i17) {
        as3.s sVar;
        super.c1(i17);
        if (i17 != 0 || (sVar = this.mOnScrollToTopListener) == null) {
            return;
        }
        sVar.a();
    }

    public final as3.s getMOnScrollToTopListener() {
        return this.mOnScrollToTopListener;
    }

    public final void setMOnScrollToTopListener(as3.s sVar) {
        this.mOnScrollToTopListener = sVar;
    }

    public final void setOnScrollToTopListener(as3.s listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.mOnScrollToTopListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
