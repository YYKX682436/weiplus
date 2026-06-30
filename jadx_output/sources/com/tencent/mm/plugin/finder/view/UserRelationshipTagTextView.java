package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/UserRelationshipTagTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class UserRelationshipTagTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f131608g = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRelationshipTagTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void b(com.tencent.mm.plugin.finder.view.ss tagType, java.lang.String str) {
        kotlin.jvm.internal.o.g(tagType, "tagType");
        switch (tagType.ordinal()) {
            case 1:
                if (str == null) {
                    str = getResources().getString(com.tencent.mm.R.string.f6n);
                }
                setText(str);
                setTextColor(getResources().getColor(com.tencent.mm.R.color.adj, null));
                return;
            case 2:
                if (str == null) {
                    str = getResources().getString(com.tencent.mm.R.string.f6l);
                }
                setText(str);
                setTextColor(getResources().getColor(com.tencent.mm.R.color.f478502m, null));
                return;
            case 3:
                if (str == null) {
                    str = getResources().getString(com.tencent.mm.R.string.f6m);
                }
                setText(str);
                setTextColor(getResources().getColor(com.tencent.mm.R.color.f478502m, null));
                return;
            case 4:
                if (str == null) {
                    str = "";
                }
                setText(str);
                setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_2, null));
                return;
            case 5:
                if (str == null) {
                    str = getResources().getString(com.tencent.mm.R.string.cpv);
                }
                setText(str);
                setTextColor(getResources().getColor(com.tencent.mm.R.color.f478502m, null));
                return;
            case 6:
                if (str == null) {
                    str = "";
                }
                setText(str);
                setTextColor(getResources().getColor(com.tencent.mm.R.color.f478502m, null));
                return;
            default:
                setText("");
                return;
        }
    }

    public final void e(int i17) {
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.f492098lp1, com.tencent.mm.plugin.finder.assist.w2.i(i17));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        b(com.tencent.mm.plugin.finder.view.ss.f133078g, string);
    }

    public final void g(int i17) {
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.f492099lp2, com.tencent.mm.plugin.finder.assist.w2.i(i17));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        b(com.tencent.mm.plugin.finder.view.ss.f133078g, string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRelationshipTagTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
