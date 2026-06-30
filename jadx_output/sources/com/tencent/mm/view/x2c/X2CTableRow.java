package com.tencent.mm.view.x2c;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/view/x2c/X2CTableRow;", "Landroid/widget/TableRow;", "Lxn5/a0;", "Landroid/content/res/Resources;", "getResources", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class X2CTableRow extends android.widget.TableRow implements xn5.a0 {
    public X2CTableRow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources = getContext().getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        return resources;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
    }
}
