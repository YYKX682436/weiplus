package com.tencent.mm.plugin.newtips;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/newtips/NormalIconNewTipPluginPreference;", "Lcom/tencent/mm/plugin/newtips/NormalIconNewTipPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-newtips_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class NormalIconNewTipPluginPreference extends com.tencent.mm.plugin.newtips.NormalIconNewTipPreference {
    public NormalIconNewTipPluginPreference(android.content.Context context) {
        super(context);
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference
    public void c0(int i17) {
        super.c0(i17);
        if (i17 == 0) {
            this.Y = 0;
            this.T1 = com.tencent.mm.R.drawable.b8i;
        }
    }

    public NormalIconNewTipPluginPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NormalIconNewTipPluginPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
