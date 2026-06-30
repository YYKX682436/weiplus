package com.tencent.mm.plugin.wenote.model.nativenote.spans;

/* loaded from: classes12.dex */
public class IndentationSpan extends android.text.style.LeadingMarginSpan.Standard implements oz4.h, oz4.g {

    /* renamed from: d, reason: collision with root package name */
    public final int f188127d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f188128e;

    public IndentationSpan(int i17, boolean z17) {
        super(i17);
        this.f188127d = i17;
        this.f188128e = z17;
    }

    @Override // oz4.g
    public oz4.g a() {
        return new com.tencent.mm.plugin.wenote.model.nativenote.spans.IndentationSpan(this.f188127d, this.f188128e);
    }

    @Override // android.text.style.LeadingMarginSpan.Standard, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        if (this.f188128e) {
            return 0;
        }
        return this.f188127d;
    }

    @Override // oz4.h
    public java.lang.Object getValue() {
        return java.lang.Integer.valueOf(this.f188127d);
    }
}
