package kz3;

/* loaded from: classes15.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final kz3.r f313931a;

    /* renamed from: b, reason: collision with root package name */
    public sy3.a f313932b;

    /* renamed from: c, reason: collision with root package name */
    public kz3.m f313933c;

    /* renamed from: d, reason: collision with root package name */
    public kz3.q f313934d;

    /* renamed from: e, reason: collision with root package name */
    public int f313935e;

    /* renamed from: f, reason: collision with root package name */
    public float f313936f;

    /* renamed from: g, reason: collision with root package name */
    public int f313937g;

    /* renamed from: h, reason: collision with root package name */
    public float f313938h;

    /* renamed from: i, reason: collision with root package name */
    public float f313939i;

    /* renamed from: j, reason: collision with root package name */
    public final kz3.s f313940j;

    public w(kz3.r ocrViewModel) {
        kotlin.jvm.internal.o.g(ocrViewModel, "ocrViewModel");
        this.f313931a = ocrViewModel;
        this.f313938h = 0.01f;
        this.f313939i = 0.01f;
        this.f313940j = new kz3.s();
    }

    public final boolean a() {
        kz3.p pVar = ((kz3.l) this.f313931a).f313893k;
        return (pVar != null ? pVar.f313922w : false) || this.f313940j.f313926a;
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageOCRZoomHelper", "onZoomStateChanged currentZoomState: %s, target: %s", java.lang.Integer.valueOf(this.f313935e), java.lang.Integer.valueOf(i17));
        if (this.f313935e != i17) {
            this.f313935e = i17;
            uy3.q qVar = ((kz3.l) this.f313931a).f313897o;
            if (qVar != null) {
                com.tencent.mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView scanOCRDialogBackgroundOpView = (com.tencent.mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView) qVar;
                if (i17 == 1) {
                    android.widget.ImageView imageView = scanOCRDialogBackgroundOpView.f158713e;
                    if (imageView != null) {
                        imageView.setImageResource(com.tencent.mm.R.drawable.c77);
                    }
                    android.widget.ImageView imageView2 = scanOCRDialogBackgroundOpView.f158713e;
                    if (imageView2 == null) {
                        return;
                    }
                    imageView2.setContentDescription(scanOCRDialogBackgroundOpView.getResources().getString(com.tencent.mm.R.string.i_9));
                    return;
                }
                android.widget.ImageView imageView3 = scanOCRDialogBackgroundOpView.f158713e;
                if (imageView3 != null) {
                    imageView3.setImageResource(com.tencent.mm.R.drawable.c78);
                }
                android.widget.ImageView imageView4 = scanOCRDialogBackgroundOpView.f158713e;
                if (imageView4 == null) {
                    return;
                }
                imageView4.setContentDescription(scanOCRDialogBackgroundOpView.getResources().getString(com.tencent.mm.R.string.i__));
            }
        }
    }

    public final void c(float f17, float f18) {
        d();
        sy3.a aVar = this.f313932b;
        if (aVar == null) {
            return;
        }
        float d17 = aVar.d();
        float c17 = aVar.c();
        java.lang.Float valueOf = java.lang.Float.valueOf(d17);
        kz3.q qVar = this.f313934d;
        kotlin.jvm.internal.o.d(qVar);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(qVar.f313923a);
        kz3.q qVar2 = this.f313934d;
        kotlin.jvm.internal.o.d(qVar2);
        java.lang.Float valueOf3 = java.lang.Float.valueOf(qVar2.f313924b);
        kz3.q qVar3 = this.f313934d;
        kotlin.jvm.internal.o.d(qVar3);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageOCRZoomHelper", "processZoom currentScale: %s, isLongImage: %s, showDoubleScale: %s, showDefaultScale: %s, scaleRate: %s, centerX: %s, centerY: %s, zoomState: %s", valueOf, valueOf2, valueOf3, java.lang.Float.valueOf(qVar3.f313925c), java.lang.Float.valueOf(c17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(this.f313935e));
        kz3.q qVar4 = this.f313934d;
        kotlin.jvm.internal.o.d(qVar4);
        boolean z17 = qVar4.f313923a;
        kz3.s sVar = this.f313940j;
        if (!z17) {
            int i17 = this.f313935e;
            if (i17 == 1) {
                float b17 = aVar.b(f17, f18);
                sVar.getClass();
                sVar.f313927b = b17;
                sVar.f313926a = true;
                kz3.m mVar = this.f313933c;
                if (mVar != null) {
                    ((kz3.n) mVar).a(2);
                }
                b(2);
                return;
            }
            if (i17 == 2) {
                sVar.getClass();
                kz3.q qVar5 = this.f313934d;
                kotlin.jvm.internal.o.d(qVar5);
                sVar.f313927b = qVar5.f313925c;
                sVar.f313926a = true;
                kz3.m mVar2 = this.f313933c;
                if (mVar2 != null) {
                    ((kz3.n) mVar2).b(2);
                }
                b(1);
                kz3.q qVar6 = this.f313934d;
                kotlin.jvm.internal.o.d(qVar6);
                aVar.a(qVar6.f313925c, f17, f18);
                return;
            }
            return;
        }
        int i18 = this.f313935e;
        if (i18 == 1) {
            sVar.getClass();
            kz3.q qVar7 = this.f313934d;
            kotlin.jvm.internal.o.d(qVar7);
            sVar.f313927b = qVar7.f313924b;
            sVar.f313926a = true;
            kz3.m mVar3 = this.f313933c;
            if (mVar3 != null) {
                ((kz3.n) mVar3).a(2);
            }
            kz3.q qVar8 = this.f313934d;
            kotlin.jvm.internal.o.d(qVar8);
            aVar.a(qVar8.f313924b, f17, f18);
            b(2);
            return;
        }
        if (i18 == 2) {
            sVar.getClass();
            kz3.q qVar9 = this.f313934d;
            kotlin.jvm.internal.o.d(qVar9);
            sVar.f313927b = qVar9.f313925c;
            sVar.f313926a = true;
            kz3.m mVar4 = this.f313933c;
            if (mVar4 != null) {
                ((kz3.n) mVar4).b(2);
            }
            kz3.q qVar10 = this.f313934d;
            kotlin.jvm.internal.o.d(qVar10);
            aVar.a(qVar10.f313925c, f17, f18);
            b(1);
        }
    }

    public final void d() {
        if (this.f313934d == null) {
            kz3.p pVar = ((kz3.l) this.f313931a).f313893k;
            this.f313934d = pVar != null ? pVar.f313917r : new kz3.q();
        }
        if (this.f313932b instanceof kz3.z) {
            return;
        }
        kz3.q qVar = this.f313934d;
        if (qVar != null) {
            qVar.f313925c = 1.0f;
        }
        if (qVar == null) {
            return;
        }
        qVar.f313924b = 2.0f;
    }
}
