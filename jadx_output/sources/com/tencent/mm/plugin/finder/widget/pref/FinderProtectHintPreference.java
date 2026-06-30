package com.tencent.mm.plugin.finder.widget.pref;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/pref/FinderProtectHintPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderProtectHintPreference extends com.tencent.mm.ui.base.preference.Preference {
    public boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProtectHintPreference(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.G = com.tencent.mm.R.layout.edz;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        android.content.Context context = this.f197770d;
        if (textView != null) {
            java.lang.CharSequence charSequence = this.f197774h;
            if (charSequence != null) {
                if (!(charSequence.length() == 0)) {
                    textView.setVisibility(0);
                    textView.setText(charSequence);
                    textView.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479628b3) * i65.a.m(context));
                }
            }
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.uvd);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.uvc);
        float f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479628b3) * i65.a.m(context);
        if (!this.L) {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(8);
            return;
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setText(context.getString(com.tencent.mm.R.string.nzz));
        }
        if (textView2 != null) {
            textView2.setTextSize(0, f17);
        }
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        if (textView3 != null) {
            textView3.setText(context.getString(com.tencent.mm.R.string.p4r));
        }
        if (textView3 != null) {
            textView3.setTextSize(0, f17);
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new sy2.b(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProtectHintPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.G = com.tencent.mm.R.layout.edz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProtectHintPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.G = com.tencent.mm.R.layout.edz;
    }
}
