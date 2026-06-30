package zu3;

/* loaded from: classes10.dex */
public final class m extends zu3.v {

    /* renamed from: p0, reason: collision with root package name */
    public long f475823p0;

    private final long getLastLrcTime() {
        return getMusicDuration() > 0 ? getMusicDuration() : ((r45.ge4) kz5.n0.i0(getLyricsList())).f375168e + getLAST_INTERVAL();
    }

    private final long getMusicDuration() {
        zu3.t lyricsItem = getLyricsItem();
        if (lyricsItem != null) {
            return lyricsItem.f475831h;
        }
        return 0L;
    }

    @Override // cw3.s
    public boolean a(long j17) {
        this.f475823p0 = j17;
        while (this.f475823p0 > getLastLrcTime()) {
            this.f475823p0 -= getLastLrcTime();
        }
        return super.a(j17);
    }

    @Override // zu3.v
    public void f() {
        if (getCurIndex() < getLyricsList().size()) {
            long j17 = getLyricsList().get(getCurIndex()).f375168e;
            r45.ge4 ge4Var = (r45.ge4) kz5.n0.a0(getLyricsList(), getCurIndex() + 1);
            long lastLrcTime = ge4Var != null ? ge4Var.f375168e : getLastLrcTime();
            long trans_time = getTRANS_TIME();
            long j18 = this.f475823p0;
            long j19 = j18 - j17;
            if (0 <= j19 && j19 <= trans_time) {
                setAlpha((int) ((255 * ((float) (j18 - j17))) / ((float) getTRANS_TIME())));
                return;
            }
            long trans_time2 = getTRANS_TIME();
            long j27 = this.f475823p0;
            long j28 = lastLrcTime - j27;
            if (0 <= j28 && j28 <= trans_time2) {
                setAlpha((int) (255 * (((float) (lastLrcTime - j27)) / ((float) getTRANS_TIME()))));
            } else if (j27 - j17 <= getTRANS_TIME() || lastLrcTime - this.f475823p0 <= getTRANS_TIME()) {
                setAlpha(0);
            } else {
                setAlpha(255);
            }
        }
    }

    @Override // zu3.v
    public void k(long j17) {
        if (getWaveAlpha() < 255) {
            long trans_time = getTRANS_TIME();
            long j18 = this.f475823p0;
            long j19 = j18 - j17;
            boolean z17 = false;
            if (0 <= j19 && j19 <= trans_time) {
                z17 = true;
            }
            if (z17) {
                setWaveAlpha((int) ((255 * ((float) (j18 - j17))) / ((float) getTRANS_TIME())));
            } else if (j18 - j17 > getTRANS_TIME()) {
                setWaveAlpha(255);
            }
        }
    }

    @Override // zu3.v
    public void m() {
        int i17;
        if (getLyricsList().isEmpty()) {
            return;
        }
        java.util.ArrayList<r45.ge4> lyricsList = getLyricsList();
        java.util.ListIterator<r45.ge4> listIterator = lyricsList.listIterator(lyricsList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else {
                if (this.f475823p0 >= listIterator.previous().f375168e) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
        }
        setCurIndex(java.lang.Math.max(0, i17));
    }

    @Override // zu3.v, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        if (getViewMatrix() != null) {
            canvas.setMatrix(getViewMatrix());
        } else {
            canvas.setMatrix(getTouchTracker().f24917g);
        }
        if (isActivated()) {
            getFrameDrawable().draw(canvas);
        }
        m();
        d(canvas);
        if ((!getBitmapList().isEmpty()) && getCurIndex() < getBitmapList().size()) {
            f();
            getPaint().setAlpha(getAlpha());
            canvas.drawBitmap(getBitmapList().get(getCurIndex()), 0.0f, getLYRICS_VERTICAL_OFFSET(), getPaint());
        }
        canvas.restore();
        if (getNeedInvalidate()) {
            invalidate();
        }
    }

    @Override // zu3.v, zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        if (getBitmapList().isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : getLyricsList()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.ge4 ge4Var = (r45.ge4) obj;
            if (i17 < getBitmapList().size()) {
                android.graphics.Bitmap bitmap = getBitmapList().get(i17);
                kotlin.jvm.internal.o.f(bitmap, "get(...)");
                arrayList.add(new av3.g(ge4Var, bitmap));
            }
            i17 = i18;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postConcat(getTouchTracker().f24917g);
        return new av3.f(arrayList, matrix2, getMusicDuration());
    }

    public av3.h r(zu3.t item) {
        kotlin.jvm.internal.o.g(item, "item");
        n(item.f475830g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : getLyricsList()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.graphics.Bitmap bitmap = getBitmapList().get(i17);
            kotlin.jvm.internal.o.f(bitmap, "get(...)");
            arrayList.add(new av3.g((r45.ge4) obj, bitmap));
            i17 = i18;
        }
        return new av3.f(arrayList, item.f475763f, getMusicDuration());
    }
}
