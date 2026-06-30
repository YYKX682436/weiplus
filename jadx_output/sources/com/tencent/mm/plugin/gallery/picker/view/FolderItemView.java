package com.tencent.mm.plugin.gallery.picker.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/FolderItemView;", "Landroid/widget/FrameLayout;", "", "getLayoutId", "Leb5/e;", "d", "Leb5/e;", "getHolder", "()Leb5/e;", "setHolder", "(Leb5/e;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FolderItemView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public eb5.e holder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.id.b(getContext()).inflate(getLayoutId(), this).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    public final eb5.e getHolder() {
        eb5.e eVar = this.holder;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final int getLayoutId() {
        return com.tencent.mm.R.layout.cif;
    }

    public final void setHolder(eb5.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.holder = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.id.b(getContext()).inflate(getLayoutId(), this).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
    }
}
