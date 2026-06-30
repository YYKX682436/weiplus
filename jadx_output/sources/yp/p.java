package yp;

/* loaded from: classes5.dex */
public abstract class p extends yp.a {
    public p() {
        new android.util.SparseArray();
    }

    @Override // yp.a
    public boolean a(wp.a aVar) {
        return aVar instanceof wp.i;
    }

    @Override // yp.a
    public yp.o b(wp.a aVar) {
        wp.i iVar = (wp.i) aVar;
        int j17 = j(iVar.f448354y);
        yp.o a17 = yp.f.f464378a.a(j17, this);
        l(j17, a17, iVar);
        yp.o oVar = iVar.H;
        if (oVar != null && oVar != a17) {
            h(iVar, false, null);
        }
        return a17;
    }

    @Override // yp.a
    public wp.b c(wp.a aVar) {
        wp.i iVar = (wp.i) aVar;
        int j17 = j(iVar.f448354y);
        yp.o oVar = iVar.H;
        if (oVar == null) {
            oVar = yp.f.f464378a.a(j17, this);
        }
        return d(iVar, oVar);
    }

    @Override // yp.a
    public wp.b e(wp.a aVar, yp.o oVar) {
        return i((wp.i) aVar, oVar);
    }

    @Override // yp.a
    public void f(android.graphics.Canvas canvas, wp.a aVar, xp.d dVar, float f17, float f18) {
        wp.i iVar = (wp.i) aVar;
        yp.o oVar = iVar.H;
        if (oVar == null) {
            return;
        }
        boolean z17 = iVar.I;
        android.view.View view = oVar.f464394a;
        if (!z17) {
            oVar.e(android.view.View.MeasureSpec.makeMeasureSpec(oVar.b(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(oVar.a(), 1073741824));
            view.layout(0, 0, oVar.b(), oVar.a());
            iVar.I = true;
        }
        canvas.save();
        canvas.translate(f17, f18);
        android.graphics.RectF rectF = oVar.f464395b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        android.graphics.Paint paint = oVar.f464396c;
        paint.setAlpha((int) (view.getAlpha() * 255.0f));
        int saveLayer = canvas.saveLayer(rectF, paint, 31);
        view.draw(canvas);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
    }

    public final wp.b i(wp.i iVar, yp.o oVar) {
        oVar.e(android.view.View.MeasureSpec.makeMeasureSpec(iVar.h(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(xp.d.f().f455854k, Integer.MIN_VALUE));
        oVar.f464394a.layout(0, 0, oVar.b(), oVar.a());
        iVar.H = oVar;
        iVar.f448350u = oVar.b();
        iVar.f448351v = oVar.a();
        com.tencent.mars.xlog.Log.i("ViewDanmakuRender", "executeMeasureViewHolder: width = %d, height = %d", java.lang.Integer.valueOf(oVar.b()), java.lang.Integer.valueOf(oVar.a()));
        return new wp.b(oVar.b(), oVar.a());
    }

    public abstract int j(java.lang.Object obj);

    @Override // yp.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public wp.b d(wp.i iVar, yp.o oVar) {
        l(j(iVar.f448354y), oVar, iVar);
        yp.o oVar2 = iVar.H;
        if (oVar2 != null && oVar2 != oVar) {
            h(iVar, false, null);
        }
        return i(iVar, oVar);
    }

    public abstract void l(int i17, yp.o oVar, wp.i iVar);

    public abstract yp.o m(int i17);

    @Override // yp.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void g(wp.i iVar, xp.d dVar, float f17, float f18, android.view.View view) {
        yp.o oVar = iVar.H;
        if (oVar == null) {
            return;
        }
        boolean z17 = iVar.I;
        android.view.View view2 = oVar.f464394a;
        boolean z18 = false;
        if (!z17) {
            oVar.e(android.view.View.MeasureSpec.makeMeasureSpec(oVar.b(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(oVar.a(), 1073741824));
            view2.layout(0, 0, oVar.b(), oVar.a());
            z18 = true;
            iVar.I = true;
        }
        if (!(view instanceof com.tencent.mm.danmaku.render.NativeDanmakuView)) {
            com.tencent.mars.xlog.Log.w("ViewDanmakuRender", "onDrawNative: error, danmakuView=" + view);
            return;
        }
        if (view2.getParent() != view) {
            if (view2.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) view2.getParent()).removeView(view2);
            }
            ((com.tencent.mm.danmaku.render.NativeDanmakuView) view).addView(view2, oVar.b(), oVar.a());
        } else if (iVar.f448347r) {
            view2.bringToFront();
        }
        view2.setTranslationX(f17);
        view2.setTranslationY(f18);
        if (z18) {
            o(iVar, dVar);
        }
    }

    public void o(wp.i iVar, xp.d dVar) {
    }

    @Override // yp.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h(wp.i iVar, boolean z17, java.lang.Runnable runnable) {
        yp.o oVar = iVar.H;
        if (oVar != null) {
            android.view.View view = oVar.f464394a;
            if (view != null && view.getParent() != null && (view.getParent() instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            int j17 = j(iVar.f448354y);
            oVar.f();
            yp.f.f464378a.c(j17, oVar);
            iVar.H = null;
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
