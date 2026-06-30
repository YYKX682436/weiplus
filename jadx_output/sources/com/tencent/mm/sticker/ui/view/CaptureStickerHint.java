package com.tencent.mm.sticker.ui.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/sticker/ui/view/CaptureStickerHint;", "Landroid/widget/LinearLayout;", "", "Lt85/j;", "stickerPack", "Ljz5/f0;", "setStickerPack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sticker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class CaptureStickerHint extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: m, reason: collision with root package name */
    public static final android.util.SparseArray f193696m;

    /* renamed from: n, reason: collision with root package name */
    public static final android.util.SparseArray f193697n;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f193698d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f193699e;

    /* renamed from: f, reason: collision with root package name */
    public t85.j f193700f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f193701g;

    /* renamed from: h, reason: collision with root package name */
    public int f193702h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f193703i;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        f193696m = sparseArray;
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        f193697n = sparseArray2;
        sparseArray.put(10, new int[]{com.tencent.mm.R.drawable.bs8, com.tencent.mm.R.drawable.bs9});
        sparseArray.put(11, new int[]{com.tencent.mm.R.drawable.bs6, com.tencent.mm.R.drawable.bs7});
        sparseArray.put(12, new int[]{com.tencent.mm.R.drawable.f482140bs4, com.tencent.mm.R.drawable.f482141bs5});
        sparseArray.put(13, new int[]{com.tencent.mm.R.drawable.bs_, com.tencent.mm.R.drawable.bsa});
        sparseArray.put(14, new int[]{com.tencent.mm.R.drawable.brw, com.tencent.mm.R.drawable.brx});
        sparseArray.put(15, new int[]{com.tencent.mm.R.drawable.bry, com.tencent.mm.R.drawable.brz});
        sparseArray.put(16, new int[]{com.tencent.mm.R.drawable.f482138bs2, com.tencent.mm.R.drawable.f482139bs3});
        sparseArray.put(17, new int[]{com.tencent.mm.R.drawable.f482136bs0, com.tencent.mm.R.drawable.f482137bs1});
        sparseArray.put(100, new int[]{com.tencent.mm.R.drawable.bsh, com.tencent.mm.R.drawable.bsi});
        sparseArray.put(101, new int[]{com.tencent.mm.R.drawable.bsr, com.tencent.mm.R.drawable.bss});
        sparseArray.put(102, new int[]{com.tencent.mm.R.drawable.bsv, com.tencent.mm.R.drawable.bsw});
        sparseArray.put(103, new int[]{com.tencent.mm.R.drawable.bsd, com.tencent.mm.R.drawable.bse});
        sparseArray.put(104, new int[]{com.tencent.mm.R.drawable.bsp, com.tencent.mm.R.drawable.bsq});
        sparseArray.put(105, new int[]{com.tencent.mm.R.drawable.bsl, com.tencent.mm.R.drawable.bsm});
        sparseArray.put(106, new int[]{com.tencent.mm.R.drawable.bsj, com.tencent.mm.R.drawable.bsk});
        sparseArray.put(107, new int[]{com.tencent.mm.R.drawable.bsn, com.tencent.mm.R.drawable.bso});
        sparseArray.put(108, new int[]{com.tencent.mm.R.drawable.bst, com.tencent.mm.R.drawable.bsu});
        sparseArray.put(109, new int[]{com.tencent.mm.R.drawable.bsx, com.tencent.mm.R.drawable.bsy});
        sparseArray.put(110, new int[]{com.tencent.mm.R.drawable.bsb, com.tencent.mm.R.drawable.bsc});
        sparseArray.put(112, new int[]{com.tencent.mm.R.drawable.bsf, com.tencent.mm.R.drawable.bsg});
        sparseArray2.put(10, new int[]{com.tencent.mm.R.string.jkl, com.tencent.mm.R.string.jkm});
        sparseArray2.put(11, new int[]{com.tencent.mm.R.string.jkj, com.tencent.mm.R.string.jkk});
        sparseArray2.put(12, new int[]{com.tencent.mm.R.string.jkh, com.tencent.mm.R.string.jki});
        sparseArray2.put(13, new int[]{com.tencent.mm.R.string.jkn, com.tencent.mm.R.string.jko});
        sparseArray2.put(14, new int[]{com.tencent.mm.R.string.jk_, com.tencent.mm.R.string.jka});
        sparseArray2.put(15, new int[]{com.tencent.mm.R.string.jkb, com.tencent.mm.R.string.jkc});
        sparseArray2.put(16, new int[]{com.tencent.mm.R.string.jkf, com.tencent.mm.R.string.jkg});
        sparseArray2.put(17, new int[]{com.tencent.mm.R.string.jkd, com.tencent.mm.R.string.jke});
        sparseArray2.put(100, new int[]{com.tencent.mm.R.string.jkv, com.tencent.mm.R.string.jkw});
        sparseArray2.put(101, new int[]{com.tencent.mm.R.string.f493288jl5, com.tencent.mm.R.string.jl6});
        sparseArray2.put(102, new int[]{com.tencent.mm.R.string.jl9, com.tencent.mm.R.string.jl_});
        sparseArray2.put(103, new int[]{com.tencent.mm.R.string.jkr, com.tencent.mm.R.string.jks});
        sparseArray2.put(104, new int[]{com.tencent.mm.R.string.f493286jl3, com.tencent.mm.R.string.f493287jl4});
        sparseArray2.put(105, new int[]{com.tencent.mm.R.string.jkz, com.tencent.mm.R.string.f493283jl0});
        sparseArray2.put(106, new int[]{com.tencent.mm.R.string.jkx, com.tencent.mm.R.string.jky});
        sparseArray2.put(107, new int[]{com.tencent.mm.R.string.f493284jl1, com.tencent.mm.R.string.f493285jl2});
        sparseArray2.put(108, new int[]{com.tencent.mm.R.string.jl7, com.tencent.mm.R.string.jl8});
        sparseArray2.put(109, new int[]{com.tencent.mm.R.string.jla, com.tencent.mm.R.string.jlb});
        sparseArray2.put(110, new int[]{com.tencent.mm.R.string.jkp, com.tencent.mm.R.string.jkq});
        sparseArray2.put(112, new int[]{com.tencent.mm.R.string.jkt, com.tencent.mm.R.string.jku});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureStickerHint(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f193701g = new java.util.LinkedList();
        this.f193703i = new y85.a(this);
        android.view.View.inflate(context, com.tencent.mm.R.layout.cvw, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487112nj2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f193698d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487113nj3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f193699e = (android.widget.TextView) findViewById2;
    }

    public final void a() {
        int i17 = this.f193702h;
        java.util.LinkedList linkedList = this.f193701g;
        int size = linkedList.size();
        android.widget.ImageView imageView = this.f193698d;
        if (i17 >= size) {
            imageView.setImageDrawable(null);
            setVisibility(8);
            return;
        }
        setVisibility(0);
        android.util.SparseArray sparseArray = f193697n;
        java.lang.Object obj = linkedList.get(this.f193702h);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        int[] iArr = (int[]) sparseArray.get(((java.lang.Number) obj).intValue());
        android.widget.TextView textView = this.f193699e;
        if (iArr == null) {
            textView.setText((java.lang.CharSequence) null);
        } else if (this.f193702h == 0) {
            textView.setText(iArr[0]);
        } else {
            textView.setText(iArr[1]);
        }
        android.util.SparseArray sparseArray2 = f193696m;
        java.lang.Object obj2 = linkedList.get(this.f193702h);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        int[] iArr2 = (int[]) sparseArray2.get(((java.lang.Number) obj2).intValue());
        if (iArr2 != null) {
            ig5.a aVar = new ig5.a();
            for (int i18 : iArr2) {
                android.graphics.drawable.Drawable drawable = getContext().getDrawable(i18);
                kotlin.jvm.internal.o.d(drawable);
                aVar.addFrame(drawable, 300);
            }
            imageView.setImageDrawable(aVar);
            aVar.start();
        } else {
            imageView.setImageDrawable(null);
        }
        this.f193702h++;
        postDelayed(this.f193703i, 2000L);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(1);
        setGravity(17);
    }

    public final void setStickerPack(t85.j jVar) {
        java.util.HashMap hashMap;
        java.util.Collection values;
        java.util.HashMap hashMap2;
        java.util.Collection values2;
        java.util.HashMap hashMap3;
        java.util.Collection values3;
        if (kotlin.jvm.internal.o.b(this.f193700f, jVar)) {
            return;
        }
        removeCallbacks(this.f193703i);
        this.f193700f = jVar;
        java.util.LinkedList linkedList = this.f193701g;
        linkedList.clear();
        if (jVar != null) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            t85.f fVar = jVar.f416481h;
            if (fVar != null && (hashMap3 = fVar.f416470f) != null && (values3 = hashMap3.values()) != null) {
                linkedList2.addAll(values3);
            }
            t85.f fVar2 = jVar.f416482i;
            if (fVar2 != null && (hashMap2 = fVar2.f416470f) != null && (values2 = hashMap2.values()) != null) {
                linkedList2.addAll(values2);
            }
            t85.f fVar3 = jVar.f416483j;
            if (fVar3 != null && (hashMap = fVar3.f416470f) != null && (values = hashMap.values()) != null) {
                linkedList2.addAll(values);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                int i17 = ((t85.e) it.next()).f416460b;
                java.lang.Integer valueOf = i17 > 0 ? java.lang.Integer.valueOf(i17) : null;
                if (valueOf != null) {
                    arrayList.add(valueOf);
                }
            }
            linkedList.addAll(arrayList);
        }
        if (linkedList.size() > 0) {
            this.f193702h = 0;
            a();
        } else {
            this.f193698d.setImageDrawable(null);
            setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureStickerHint(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
