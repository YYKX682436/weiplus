package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyAutoScrollItem extends android.widget.ListView {

    /* renamed from: m, reason: collision with root package name */
    public static final android.util.SparseArray f145947m;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f145948d;

    /* renamed from: e, reason: collision with root package name */
    public long f145949e;

    /* renamed from: f, reason: collision with root package name */
    public int f145950f;

    /* renamed from: g, reason: collision with root package name */
    public int f145951g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.CountDownTimer f145952h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.i f145953i;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        f145947m = sparseArray;
        sparseArray.put(0, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cby));
        sparseArray.put(1, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cbz));
        sparseArray.put(2, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482013cc0));
        sparseArray.put(3, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482014cc1));
        sparseArray.put(4, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482015cc2));
        sparseArray.put(5, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482016cc3));
        sparseArray.put(6, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482017cc4));
        sparseArray.put(7, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482018cc5));
        sparseArray.put(8, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cc6));
        sparseArray.put(9, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cc7));
    }

    public LuckyMoneyAutoScrollItem(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f145949e = 900L;
        this.f145950f = 0;
        this.f145951g = 0;
        this.f145953i = null;
        this.f145948d = context;
        setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.luckymoney.ui.h(this, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: scroll height is: %d", java.lang.Integer.valueOf((int) ((this.f145948d.getResources().getDisplayMetrics().density * 60.0f) + 0.5f)));
    }

    public static void setResouceMap(android.util.SparseArray<java.lang.Integer> sparseArray) {
        android.util.SparseArray sparseArray2 = f145947m;
        sparseArray2.clear();
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            int keyAt = sparseArray.keyAt(i17);
            sparseArray2.put(keyAt, sparseArray.get(keyAt));
        }
    }

    public void b() {
        android.os.CountDownTimer countDownTimer = this.f145952h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.f(this, (this.f145950f * 50) + this.f145949e));
    }

    public void setFinalNumber(int i17) {
        this.f145950f = i17;
    }

    public void setOnScrollEndListener(com.tencent.mm.plugin.luckymoney.ui.i iVar) {
        this.f145953i = iVar;
    }

    public void setScrollTime(long j17) {
        this.f145949e = j17;
    }

    public LuckyMoneyAutoScrollItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
