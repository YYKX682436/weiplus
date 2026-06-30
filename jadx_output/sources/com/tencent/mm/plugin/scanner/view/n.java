package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class n implements yy3.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f159959a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Integer f159960b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f159961c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Integer f159962d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanCardRectView f159963e;

    public n(com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView) {
        this.f159963e = scanCardRectView;
    }

    public void a(long j17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = this.f159963e;
        if (j17 == scanCardRectView.f159889q && bundle.containsKey("param_card_edge")) {
            boolean[] booleanArray = bundle.getBooleanArray("param_card_edge");
            scanCardRectView.f159891s.setHighLightEdges(booleanArray);
            int i17 = scanCardRectView.f159888p;
            if ((i17 == 9 || i17 == 11) && scanCardRectView.o()) {
                this.f159962d = java.lang.Integer.valueOf(this.f159962d.intValue() + 1);
                boolean z17 = booleanArray[0];
                java.util.LinkedList linkedList = this.f159959a;
                if (z17 && booleanArray[1] && booleanArray[2] && booleanArray[3]) {
                    linkedList.add(0);
                } else {
                    this.f159960b = java.lang.Integer.valueOf(this.f159960b.intValue() + 1);
                    linkedList.add(1);
                }
                if (linkedList.size() > 60 && ((java.lang.Integer) linkedList.pollFirst()).intValue() == 1) {
                    this.f159960b = java.lang.Integer.valueOf(this.f159960b.intValue() - 1);
                }
                if (this.f159962d.intValue() < 0) {
                    this.f159962d = 0;
                }
                if (this.f159962d.intValue() < 70) {
                    return;
                }
                if (this.f159960b.intValue() >= 53) {
                    android.widget.TextView textView = (android.widget.TextView) scanCardRectView.f159893u.findViewById(com.tencent.mm.R.id.avx);
                    textView.post(new com.tencent.mm.plugin.scanner.view.k(this, scanCardRectView.f159893u.findViewById(com.tencent.mm.R.id.avw), textView, scanCardRectView.f159893u.findViewById(com.tencent.mm.R.id.avv)));
                } else {
                    if (this.f159960b.intValue() < 40 || this.f159961c.intValue() == 2) {
                        return;
                    }
                    this.f159961c = 2;
                    android.widget.TextView textView2 = (android.widget.TextView) scanCardRectView.f159893u.findViewById(com.tencent.mm.R.id.avx);
                    textView2.post(new com.tencent.mm.plugin.scanner.view.m(this, scanCardRectView.f159893u.findViewById(com.tencent.mm.R.id.avw), textView2, scanCardRectView.f159893u.findViewById(com.tencent.mm.R.id.avv)));
                }
            }
        }
    }
}
