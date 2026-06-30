package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes12.dex */
public abstract class n2 extends com.tencent.mm.ui.widget.dialog.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f211931d;

    public n2(java.lang.String[] strArr, int i17) {
        super(strArr[i17], i17);
        this.f211931d = strArr;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public int a() {
        return this.f211931d.length;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public java.lang.CharSequence c(int i17) {
        return this.f211931d[i17];
    }
}
