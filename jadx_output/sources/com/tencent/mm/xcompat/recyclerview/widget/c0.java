package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class c0 {

    /* renamed from: b, reason: collision with root package name */
    public int f214475b;

    /* renamed from: c, reason: collision with root package name */
    public int f214476c;

    /* renamed from: d, reason: collision with root package name */
    public int f214477d;

    /* renamed from: e, reason: collision with root package name */
    public int f214478e;

    /* renamed from: f, reason: collision with root package name */
    public int f214479f;

    /* renamed from: g, reason: collision with root package name */
    public int f214480g;

    /* renamed from: j, reason: collision with root package name */
    public int f214483j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f214485l;

    /* renamed from: a, reason: collision with root package name */
    public boolean f214474a = true;

    /* renamed from: h, reason: collision with root package name */
    public int f214481h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f214482i = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f214484k = null;

    public void a(android.view.View view) {
        int a17;
        int size = this.f214484k.size();
        android.view.View view2 = null;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < size; i18++) {
            android.view.View view3 = ((com.tencent.mm.xcompat.recyclerview.widget.y1) this.f214484k.get(i18)).f214703d;
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view3.getLayoutParams();
            if (view3 != view && !layoutParams.f214425a.m() && (a17 = (layoutParams.a() - this.f214477d) * this.f214478e) >= 0 && a17 < i17) {
                view2 = view3;
                if (a17 == 0) {
                    break;
                } else {
                    i17 = a17;
                }
            }
        }
        if (view2 == null) {
            this.f214477d = -1;
        } else {
            this.f214477d = ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view2.getLayoutParams()).a();
        }
    }
}
