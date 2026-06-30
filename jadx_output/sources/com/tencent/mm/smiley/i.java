package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public class i implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f193271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f193272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f193273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f193274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f193275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pg5.a f193276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.smiley.g f193277g;

    public i(com.tencent.mm.smiley.g gVar, com.tencent.mm.pointers.PInt pInt, int i17, com.tencent.mm.pointers.PInt pInt2, int i18, android.text.Spannable spannable, pg5.a aVar) {
        this.f193277g = gVar;
        this.f193271a = pInt;
        this.f193272b = i17;
        this.f193273c = pInt2;
        this.f193274d = i18;
        this.f193275e = spannable;
        this.f193276f = aVar;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(final com.tencent.mm.smiley.a1 a1Var, final int i17, final int i18) {
        android.graphics.Bitmap bitmap;
        final boolean z17 = a1Var instanceof com.tencent.mm.smiley.h1;
        com.tencent.mm.pointers.PInt pInt = this.f193271a;
        boolean z18 = true;
        boolean z19 = pInt.value < this.f193272b;
        this.f193273c.value++;
        final int i19 = this.f193274d;
        final android.text.Spannable spannable = this.f193275e;
        final r.a aVar = new r.a() { // from class: com.tencent.mm.smiley.i$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                boolean z27 = z17;
                android.text.Spannable spannable2 = spannable;
                int i27 = i17;
                int i28 = i18;
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
                com.tencent.mm.smiley.i iVar = com.tencent.mm.smiley.i.this;
                iVar.getClass();
                int i29 = i19;
                if (i29 == 0) {
                    return null;
                }
                if (i29 == 2) {
                    if (z27) {
                        return null;
                    }
                    iVar.f193277g.e(spannable2, drawable, i27, i28, false);
                    return null;
                }
                if (i29 != 3) {
                    iVar.f193277g.e(spannable2, drawable, i27, i28, z27);
                    return null;
                }
                if (!z27) {
                    return null;
                }
                iVar.f193277g.e(spannable2, drawable, i27, i28, true);
                return null;
            }
        };
        if (a1Var instanceof com.tencent.mm.smiley.b2) {
            if (z19 && (!((com.tencent.mm.smiley.b2) a1Var).f193221b || this.f193276f.f354249h)) {
                pInt.value++;
            } else {
                z18 = false;
            }
        }
        if (!z18) {
            return false;
        }
        int i27 = com.tencent.mm.smiley.e.f193236b;
        com.tencent.mm.smiley.d.f193233a.getClass();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = null;
        if (a1Var != null) {
            if (a1Var instanceof com.tencent.mm.smiley.b2) {
                gr.q.f274676a.getClass();
                bitmap = gr.q.f274677b.d(java.lang.String.valueOf(((com.tencent.mm.smiley.b2) a1Var).f193220a.f193259d));
            } else if (a1Var instanceof com.tencent.mm.smiley.h1) {
                com.tencent.mm.smiley.t1.f193375m.a();
                com.tencent.mm.smiley.h1 h1Var = (com.tencent.mm.smiley.h1) a1Var;
                int i28 = h1Var.f193266a;
                if (i28 >= 0) {
                    gr.q.f274676a.getClass();
                    bitmap = gr.q.f274677b.c(i28 + ".wxam");
                } else {
                    gr.q.f274676a.getClass();
                    bitmap = gr.q.f274677b.c(h1Var.f193269d);
                }
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap);
            }
        }
        if (bitmapDrawable != null) {
            aVar.apply(bitmapDrawable);
        } else {
            ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.smiley.i$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.smiley.a1 a1Var2 = com.tencent.mm.smiley.a1.this;
                    final r.a aVar2 = aVar;
                    int i29 = com.tencent.mm.smiley.e.f193236b;
                    final android.graphics.drawable.Drawable a17 = com.tencent.mm.smiley.d.f193233a.a(a1Var2, true);
                    if (a17 != null) {
                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.smiley.i$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                r.a.this.apply(a17);
                            }
                        });
                    }
                }
            });
        }
        return false;
    }
}
