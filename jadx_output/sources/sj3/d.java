package sj3;

/* loaded from: classes14.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f408459d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f408460e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f408461f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f408462g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f408463h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashSet f408464i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f408465m;

    /* renamed from: n, reason: collision with root package name */
    public final int f408466n;

    /* renamed from: o, reason: collision with root package name */
    public int f408467o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.j f408468p;

    public d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f408459d = context;
        this.f408460e = new java.util.concurrent.CopyOnWriteArrayList();
        this.f408466n = 1;
        this.f408467o = 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f408460e;
        int size = copyOnWriteArrayList.size();
        int i17 = this.f408466n;
        if (size > 12) {
            this.f408465m = true;
            this.f408467o = 1;
            return copyOnWriteArrayList.size() + i17 + this.f408467o;
        }
        this.f408465m = false;
        this.f408467o = 0;
        return copyOnWriteArrayList.size() + i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 == 0) {
            return 2;
        }
        return (i17 == getItemCount() - 1 && this.f408465m) ? 3 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r28, int r29) {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.d.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f408459d).inflate(com.tencent.mm.R.layout.bvq, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new sj3.j(inflate);
    }

    public final int x() {
        android.content.Context context = this.f408459d;
        int k17 = i65.a.k(context) - i65.a.b(context, com.tencent.mm.plugin.appbrand.jsapi.pay.k2.CTRL_INDEX);
        int i17 = com.tencent.mm.ui.bk.h(context).x;
        int i18 = this.f408466n;
        return k17 > i17 ? (getItemCount() - i18) - this.f408467o < 5 ? i17 / 2 : i17 / 3 : (getItemCount() - i18) - this.f408467o < 5 ? k17 / 2 : k17 / 3;
    }
}
