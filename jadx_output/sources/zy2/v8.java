package zy2;

/* loaded from: classes10.dex */
public interface v8 {
    static /* synthetic */ void a(zy2.v8 v8Var, java.lang.String str, android.widget.ImageView imageView, mn2.f1 f1Var, java.lang.ref.WeakReference weakReference, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadThumbForSns");
        }
        if ((i17 & 4) != 0) {
            f1Var = mn2.f1.B;
        }
        if ((i17 & 8) != 0) {
            weakReference = null;
        }
        ((ya2.l) v8Var).l(str, imageView, f1Var, weakReference);
    }

    static /* synthetic */ void b(zy2.v8 v8Var, java.lang.String str, android.widget.ImageView imageView, mn2.f1 f1Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
        }
        if ((i17 & 4) != 0) {
            f1Var = mn2.f1.B;
        }
        ((ya2.l) v8Var).h(str, imageView, f1Var);
    }

    static /* synthetic */ void c(zy2.v8 v8Var, android.widget.ImageView imageView, java.lang.String str, com.tencent.mm.plugin.finder.storage.y90 y90Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFinderAvatar");
        }
        if ((i17 & 4) != 0) {
            y90Var = com.tencent.mm.plugin.finder.storage.y90.W;
        }
        ((ya2.l) v8Var).g(imageView, str, y90Var);
    }

    static /* synthetic */ void d(zy2.v8 v8Var, java.lang.String str, android.widget.ImageView imageView, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRingtoneBgImage");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        ((ya2.l) v8Var).k(str, imageView, str2);
    }
}
