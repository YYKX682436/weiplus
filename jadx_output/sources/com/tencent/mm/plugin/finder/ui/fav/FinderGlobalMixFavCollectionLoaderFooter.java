package com.tencent.mm.plugin.finder.ui.fav;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalMixFavCollectionLoaderFooter;", "Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGlobalMixFavCollectionLoaderFooter extends com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter {
    public FinderGlobalMixFavCollectionLoaderFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter
    public java.lang.String j(int i17) {
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f491409nn0, java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public FinderGlobalMixFavCollectionLoaderFooter(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
