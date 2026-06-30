package com.tencent.mm.plugin.sns.ad.widget.stackup;

/* loaded from: classes4.dex */
public class StackUpLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f163878d;

    /* renamed from: e, reason: collision with root package name */
    public int f163879e;

    /* renamed from: f, reason: collision with root package name */
    public int f163880f;

    public StackUpLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163878d = 0;
        this.f163879e = 0;
        this.f163880f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:26:0x00d1, B:31:0x00da, B:33:0x00e0, B:38:0x00ef, B:40:0x00f9, B:44:0x0100, B:48:0x0108, B:50:0x010b, B:52:0x010f, B:54:0x0117, B:56:0x011b), top: B:25:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setAdapterInternal(c94.a r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout.setAdapterInternal(c94.a):void");
    }

    public void setAdapter(c94.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
        try {
            setAdapterInternal(aVar);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
    }

    public void setStackUpWidthSize(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStackUpWidthSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
        this.f163878d = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStackUpWidthSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
    }

    public StackUpLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163878d = 0;
        this.f163879e = 0;
        this.f163880f = 0;
    }
}
