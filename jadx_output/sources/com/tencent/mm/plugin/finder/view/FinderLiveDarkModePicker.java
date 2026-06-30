package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveDarkModePicker;", "Lcom/tencent/mm/ui/widget/picker/CustomOptionPickNew;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLiveDarkModePicker extends com.tencent.mm.ui.widget.picker.CustomOptionPickNew {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f131195i = 0;

    public FinderLiveDarkModePicker(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve));
    }

    @Override // com.tencent.mm.ui.widget.picker.CustomOptionPickNew
    public void b() {
        t51.a aVar = new t51.a(getContext(), new com.tencent.mm.plugin.finder.view.cd(this));
        int i17 = this.f212214h;
        u51.a aVar2 = aVar.f415707a;
        aVar2.f424784e = i17;
        aVar2.f424791l = b3.l.getColor(getContext(), com.tencent.mm.R.color.FG_3);
        w51.e eVar = this.f212211e;
        aVar.a(eVar);
        setDividerHeight(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480137pc));
        setItemHeight(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz));
        setDividerColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.FG_3));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        w51.i iVar = eVar.f442972p;
        iVar.f442981b.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize2);
        com.tencent.mm.picker.base.view.WheelView wheelView = iVar.f442981b;
        wheelView.e(b3.l.getColor(getContext(), com.tencent.mm.R.color.FG_0));
        wheelView.f72379d = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        wheelView.invalidate();
    }

    public FinderLiveDarkModePicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve), attributeSet);
    }

    public FinderLiveDarkModePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
