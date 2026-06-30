package ug5;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ug5.g f427584a;

    public c(ug5.b action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f427584a = new ug5.g(action);
    }

    public static /* synthetic */ ug5.c h(ug5.c cVar, java.lang.Class cls, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTransparentActivity");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        cVar.g(cls, z17);
        return cVar;
    }

    public final ug5.v a() {
        ug5.g gVar = this.f427584a;
        ug5.i iVar = gVar.f427590d;
        gVar.f427596j.isEmpty();
        gVar.f427597k.isEmpty();
        android.view.Window window = gVar.f427588b;
        if (window == null && window == null) {
            java.lang.Class cls = gVar.f427607u;
        }
        com.tencent.mars.xlog.Log.i("ViewFluentPerformer", "[build] " + gVar);
        return new ug5.v(gVar);
    }

    public final ug5.c b(float f17) {
        float[] fArr = this.f427584a.f427612z;
        fArr[0] = f17;
        fArr[1] = f17;
        fArr[2] = f17;
        fArr[3] = f17;
        return this;
    }

    public final ug5.c c(java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f427584a.f427595i.put(key, obj);
        return this;
    }

    public final ug5.c d(java.util.Map extra) {
        kotlin.jvm.internal.o.g(extra, "extra");
        this.f427584a.f427595i.putAll(extra);
        return this;
    }

    public final ug5.c e(android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        this.f427584a.f427596j.set(rect);
        return this;
    }

    public final ug5.c f(android.animation.TimeInterpolator interpolator) {
        kotlin.jvm.internal.o.g(interpolator, "interpolator");
        ug5.g gVar = this.f427584a;
        gVar.getClass();
        gVar.f427605s = interpolator;
        return this;
    }

    public final ug5.c g(java.lang.Class cls, boolean z17) {
        ug5.g gVar = this.f427584a;
        gVar.f427607u = cls;
        gVar.f427608v = z17;
        return this;
    }

    public final ug5.c i(android.graphics.Rect rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        this.f427584a.f427597k.set(rect);
        return this;
    }
}
