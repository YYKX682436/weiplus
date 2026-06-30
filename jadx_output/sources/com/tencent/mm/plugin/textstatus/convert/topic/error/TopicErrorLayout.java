package com.tencent.mm.plugin.textstatus.convert.topic.error;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/convert/topic/error/TopicErrorLayout;", "Landroid/widget/LinearLayout;", "Lbi4/s0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TopicErrorLayout extends android.widget.LinearLayout implements bi4.s0 {
    public TopicErrorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        java.lang.String a17 = en1.a.a();
        kotlin.jvm.internal.o.f(a17, "username(...)");
        new ej4.a0(a17, this, null, 4, null);
        setOrientation(1);
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopicErrorLayout", "update updateByStatusId:" + str);
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopicErrorLayout", "update username:" + str);
        boolean z17 = false;
        if (str != null && str.equals(en1.a.a())) {
            z17 = true;
        }
        if (z17) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new pi4.d(this, null), 2, null);
        }
    }

    public TopicErrorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String a17 = en1.a.a();
        kotlin.jvm.internal.o.f(a17, "username(...)");
        new ej4.a0(a17, this, null, 4, null);
        setOrientation(1);
    }
}
