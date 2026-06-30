package db5;

/* loaded from: classes4.dex */
public final class z4 implements db5.x4 {

    /* renamed from: a, reason: collision with root package name */
    public final db5.y4 f228593a;

    public z4(db5.y4 provider) {
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f228593a = provider;
    }

    @Override // db5.x4
    public boolean a() {
        return true;
    }

    @Override // db5.x4
    public boolean d(boolean z17, boolean z18) {
        if (!z18) {
            return false;
        }
        if (z17) {
            return true;
        }
        db5.y4 y4Var = this.f228593a;
        ((db5.b5) y4Var).e(-((db5.b5) y4Var).c(), 150);
        return true;
    }

    @Override // db5.x4
    public boolean e(float f17) {
        db5.y4 y4Var = this.f228593a;
        if (f17 < -4000.0f) {
            db5.b5 b5Var = (db5.b5) y4Var;
            com.tencent.mm.ui.base.MMOverScrollView mMOverScrollView = b5Var.f228294a;
            mMOverScrollView.f197506p = true;
            mMOverScrollView.f197500g.fling(0, b5Var.c(), 0, -((int) f17), 0, 0, 0, 1);
            mMOverScrollView.f197507q = true;
            mMOverScrollView.postInvalidate();
        } else {
            db5.y4.a(y4Var, -((db5.b5) y4Var).c(), 0, 2, null);
        }
        return true;
    }

    @Override // db5.x4
    public boolean f(float f17) {
        int i17 = (int) f17;
        db5.y4 y4Var = this.f228593a;
        int c17 = ((db5.b5) y4Var).c() + i17;
        if (((db5.b5) y4Var).f228294a.f197509s) {
            if (c17 <= 0) {
                ((db5.b5) y4Var).d(i17 / 2);
                return true;
            }
            if (((db5.b5) y4Var).c() >= 0) {
                return false;
            }
            ((db5.b5) y4Var).d(-((db5.b5) y4Var).c());
            return true;
        }
        if (!((db5.b5) y4Var).f228294a.f197510t) {
            return false;
        }
        if (c17 >= 0) {
            ((db5.b5) y4Var).d(i17 / 2);
            return true;
        }
        if (((db5.b5) y4Var).c() <= 0) {
            return false;
        }
        ((db5.b5) y4Var).d(-((db5.b5) y4Var).c());
        return true;
    }
}
