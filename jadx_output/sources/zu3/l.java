package zu3;

/* loaded from: classes10.dex */
public final class l extends com.tencent.mm.emoji.view.AbsEmojiView implements zu3.n, cw3.s {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f475814r;

    /* renamed from: s, reason: collision with root package name */
    public final bw3.e f475815s;

    /* renamed from: t, reason: collision with root package name */
    public zu3.f f475816t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f475817u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.Rect f475818v;

    /* renamed from: w, reason: collision with root package name */
    public final cw3.a f475819w;

    /* renamed from: x, reason: collision with root package name */
    public zu3.j f475820x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f475821y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f475822z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f475814r = "MicroMsg.EmojiItemView";
        bw3.e eVar = new bw3.e();
        this.f475815s = eVar;
        this.f475817u = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.f475818v = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.f475822z = new float[2];
        eVar.f24928r = 0.5f;
        eVar.f24927q = 3.0f;
        android.content.res.Resources resources = getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        this.f475819w = new cw3.a(resources);
    }

    @Override // zu3.n
    public zu3.a g() {
        float f17;
        zu3.j jVar;
        bv3.d dVar;
        bv3.d dVar2;
        if (getEmojiInfo() == null) {
            return null;
        }
        boolean z17 = getDrawable() instanceof android.graphics.drawable.BitmapDrawable;
        bw3.e eVar = this.f475815s;
        if (z17) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postConcat(eVar.f24917g);
            jVar = new zu3.j(getEmojiInfo(), matrix, matrix);
            zu3.j jVar2 = this.f475820x;
            if (jVar2 != null && (dVar2 = jVar2.f475760c) != null) {
                jVar.f475760c.d(dVar2.c(), dVar2.b());
            }
            zu3.j jVar3 = this.f475820x;
            jVar.f475761d = jVar3 != null ? jVar3.f475761d : null;
        } else {
            if (getDrawable() instanceof com.tencent.mm.plugin.gif.k) {
                android.graphics.drawable.Drawable drawable = getDrawable();
                kotlin.jvm.internal.o.e(drawable, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
                f17 = ((com.tencent.mm.plugin.gif.k) drawable).e();
            } else if (getDrawable() instanceof com.tencent.mm.plugin.gif.u) {
                android.graphics.drawable.Drawable drawable2 = getDrawable();
                kotlin.jvm.internal.o.e(drawable2, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
                f17 = ((com.tencent.mm.plugin.gif.u) drawable2).e();
            } else {
                f17 = 1.0f;
            }
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createEditorData displayRect:");
            sb6.append(this.f475818v);
            sb6.append(" validRect:");
            sb6.append(this.f475817u);
            com.tencent.mars.xlog.Log.i(this.f475814r, sb6.toString());
            matrix3.set(eVar.f24917g);
            matrix3.postTranslate((-(r6.width() - r7.width())) / 2.0f, -r7.top);
            matrix2.setScale(f17, f17);
            matrix2.postConcat(eVar.f24917g);
            jVar = new zu3.j(getEmojiInfo(), matrix3, matrix2);
            zu3.j jVar4 = this.f475820x;
            if (jVar4 != null && (dVar = jVar4.f475760c) != null) {
                jVar.f475760c.d(dVar.c(), dVar.b());
            }
            zu3.j jVar5 = this.f475820x;
            jVar.f475761d = jVar5 != null ? jVar5.f475761d : null;
        }
        return jVar;
    }

    @Override // cw3.s
    public float[] getContentBoundary() {
        return (float[]) this.f475815s.f24924n.clone();
    }

    @Override // cw3.s
    public android.graphics.RectF getDrawRect() {
        float[] fArr = this.f475815s.f24924n;
        return new android.graphics.RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    @Override // cw3.s
    public zu3.a getEditorData() {
        return this.f475820x;
    }

    public android.graphics.Rect getSafeArea() {
        android.graphics.Rect rect = this.f475815s.f24918h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final bw3.e getTouchTracker() {
        return this.f475815s;
    }

    @Override // cw3.s
    public cw3.j getType() {
        return cw3.j.f224169h;
    }

    public final android.graphics.Matrix getViewMatrix() {
        return null;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        kotlin.jvm.internal.o.g(displayRect, "displayRect");
        this.f475818v.set(displayRect);
        this.f475815s.f24917g.postTranslate(displayRect.width() / 2.0f, displayRect.height() * f17);
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        kotlin.jvm.internal.o.g(safeRect, "safeRect");
        bw3.e eVar = this.f475815s;
        eVar.f24918h = safeRect;
        eVar.f24919i = i65.a.b(getContext(), i17);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        bw3.e eVar = this.f475815s;
        canvas.setMatrix(eVar.f24917g);
        if (isActivated()) {
            this.f475819w.draw(canvas);
        }
        canvas.restore();
        canvas.clipRect(this.f475817u);
        canvas.save();
        canvas.setMatrix(eVar.f24917g);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        boolean z17;
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        bw3.e eVar = this.f475815s;
        if (actionMasked == 3 || event.getActionMasked() == 1) {
            z17 = true;
        } else {
            z17 = eVar.a(event);
            if (z17) {
                bringToFront();
                zu3.f fVar = this.f475816t;
                if (fVar != null) {
                    fVar.a(this, event);
                }
                postInvalidate();
            }
        }
        int actionMasked2 = event.getActionMasked();
        float[] fArr = this.f475822z;
        if (actionMasked2 == 0) {
            fArr[0] = eVar.f24926p / 2.0f;
            fArr[1] = eVar.f24925o / 2.0f;
            eVar.f24917g.mapPoints(fArr);
        } else if (event.getActionMasked() == 1) {
            bw3.b bVar = new bw3.b();
            bVar.f24902c = eVar.f24928r;
            bVar.f24903d = eVar.f24927q;
            bVar.f24901b = new float[]{eVar.f24926p / 2.0f, eVar.f24925o / 2.0f};
            android.graphics.Rect rect = this.f475817u;
            bVar.f24900a = new android.graphics.RectF(rect.left, rect.top, rect.right, rect.bottom);
            float[] fArr2 = {eVar.f24926p / 2.0f, eVar.f24925o / 2.0f};
            eVar.f24917g.mapPoints(fArr2);
            if (!bVar.f24900a.contains(fArr2[0], fArr2[1])) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                bVar.f24900a = new android.graphics.RectF(f17, f18, f17, f18);
            }
            bVar.a(eVar.f24917g, new zu3.k(this, event));
        }
        return z17;
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        float f17;
        if (getEmojiInfo() == null) {
            return null;
        }
        boolean z17 = getDrawable() instanceof android.graphics.drawable.BitmapDrawable;
        bw3.e eVar = this.f475815s;
        if (z17) {
            android.graphics.drawable.Drawable drawable = getDrawable();
            kotlin.jvm.internal.o.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            matrix2.postConcat(eVar.f24917g);
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            return new av3.c(bitmap, matrix2);
        }
        if (getDrawable() instanceof com.tencent.mm.plugin.gif.k) {
            android.graphics.drawable.Drawable drawable2 = getDrawable();
            kotlin.jvm.internal.o.e(drawable2, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
            f17 = ((com.tencent.mm.plugin.gif.k) drawable2).e();
        } else if (getDrawable() instanceof com.tencent.mm.plugin.gif.u) {
            android.graphics.drawable.Drawable drawable3 = getDrawable();
            kotlin.jvm.internal.o.e(drawable3, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
            f17 = ((com.tencent.mm.plugin.gif.u) drawable3).e();
        } else {
            f17 = 1.0f;
        }
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        com.tencent.mars.xlog.Log.i(this.f475814r, "createEditorItem displayRect:" + this.f475818v + " validRect:" + this.f475817u);
        matrix3.setScale(f17, f17);
        matrix3.postConcat(eVar.f24917g);
        if (matrix != null) {
            matrix3.postConcat(matrix);
        }
        com.tencent.mm.api.IEmojiInfo emojiInfo = getEmojiInfo();
        kotlin.jvm.internal.o.d(emojiInfo);
        return new av3.e(emojiInfo, matrix3);
    }

    public final void setEmojiItem(zu3.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f475820x = item;
        setEmojiInfo(item.f475810g);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof com.tencent.mm.plugin.gif.u) {
                ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).wi(((com.tencent.mm.plugin.gif.u) drawable).S, 0L);
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            boolean z17 = this.f475821y;
            bw3.e eVar = this.f475815s;
            if (!z17) {
                eVar.f24917g.postTranslate(eVar.f24926p / 2.0f, eVar.f24925o / 2.0f);
                eVar.f24926p = intrinsicWidth;
                eVar.f24925o = intrinsicHeight;
                android.graphics.Rect rect = this.f475818v;
                float f17 = (rect.top + rect.bottom) / 2;
                android.graphics.Rect rect2 = this.f475817u;
                eVar.f24917g.postTranslate((-intrinsicWidth) / 2.0f, -((f17 - ((rect2.top + rect2.bottom) / 2.0f)) + (intrinsicHeight / 2.0f)));
            }
            this.f475819w.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f18 = intrinsicWidth;
            float f19 = intrinsicHeight;
            eVar.getClass();
            eVar.f24922l = new float[]{0.0f, 0.0f, f18, 0.0f, 0.0f, f19, f18, f19};
        }
        super.setImageDrawable(drawable);
    }

    public final void setStateResolve(zu3.f stateResolve) {
        kotlin.jvm.internal.o.g(stateResolve, "stateResolve");
        this.f475816t = stateResolve;
    }

    @Override // cw3.s
    public void setValidArea(android.graphics.Rect validRect) {
        kotlin.jvm.internal.o.g(validRect, "validRect");
        this.f475817u.set(validRect);
    }

    public final void setViewMatrix(android.graphics.Matrix matrix) {
        if (kotlin.jvm.internal.o.b(null, matrix) || matrix == null) {
            return;
        }
        bw3.e eVar = this.f475815s;
        eVar.getClass();
        eVar.f24917g = matrix;
    }
}
