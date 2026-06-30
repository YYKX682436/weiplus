package dr5;

/* loaded from: classes15.dex */
public abstract class c {
    public static android.graphics.Matrix a(android.graphics.Matrix applyTransform, zq5.v transform, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        kotlin.jvm.internal.o.g(applyTransform, "$this$applyTransform");
        kotlin.jvm.internal.o.g(transform, "transform");
        if (z17) {
            applyTransform.reset();
        }
        long j18 = transform.f475099e;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j18 >> 32));
        int i18 = zq5.g.f475066c;
        float f17 = (int) (j17 >> 32);
        applyTransform.postRotate(transform.f475097c, intBitsToFloat * f17, java.lang.Float.intBitsToFloat((int) (j18 & io.flutter.embedding.android.KeyboardMap.kValueMask)) * zq5.g.b(j17));
        long j19 = transform.f475095a;
        float b17 = zq5.q.b(j19);
        float c17 = zq5.q.c(j19);
        long j27 = transform.f475098d;
        applyTransform.postScale(b17, c17, java.lang.Float.intBitsToFloat((int) (j27 >> 32)) * f17, java.lang.Float.intBitsToFloat((int) (j27 & io.flutter.embedding.android.KeyboardMap.kValueMask)) * zq5.g.b(j17));
        long j28 = transform.f475096b;
        applyTransform.postTranslate(zq5.l.b(j28), zq5.l.c(j28));
        return applyTransform;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.lifecycle.o b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        if (context instanceof androidx.lifecycle.y) {
            return ((androidx.lifecycle.y) context).mo133getLifecycle();
        }
        if (!(context instanceof android.content.ContextWrapper)) {
            return null;
        }
        android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
        kotlin.jvm.internal.o.f(baseContext, "getBaseContext(...)");
        return b(baseContext);
    }

    public static final gr5.b c(android.widget.ImageView.ScaleType scaleType) {
        kotlin.jvm.internal.o.g(scaleType, "<this>");
        int i17 = dr5.b.f242771a[scaleType.ordinal()];
        gr5.b bVar = gr5.a.f274899a;
        gr5.b bVar2 = gr5.a.f274903e;
        switch (i17) {
            case 1:
                int i18 = gr5.b.f274909a;
                return bVar;
            case 2:
                int i19 = gr5.b.f274909a;
                return bVar;
            case 3:
                int i27 = gr5.b.f274909a;
                return bVar;
            case 4:
                int i28 = gr5.b.f274909a;
                break;
            case 5:
                int i29 = gr5.b.f274909a;
                return gr5.a.f274907i;
            case 6:
                int i37 = gr5.b.f274909a;
                break;
            case 7:
                int i38 = gr5.b.f274909a;
                break;
            case 8:
                int i39 = gr5.b.f274909a;
                break;
            default:
                throw new jz5.j();
        }
        return bVar2;
    }

    public static final gr5.n d(android.widget.ImageView.ScaleType scaleType) {
        kotlin.jvm.internal.o.g(scaleType, "<this>");
        int i17 = dr5.b.f242771a[scaleType.ordinal()];
        gr5.w wVar = gr5.m.f274939f;
        gr5.n nVar = gr5.m.f274935b;
        switch (i17) {
            case 1:
                int i18 = gr5.n.f274941a;
                return wVar;
            case 2:
                int i19 = gr5.n.f274941a;
                return gr5.m.f274940g;
            case 3:
                int i27 = gr5.n.f274941a;
                break;
            case 4:
                int i28 = gr5.n.f274941a;
                break;
            case 5:
                int i29 = gr5.n.f274941a;
                break;
            case 6:
                int i37 = gr5.n.f274941a;
                return wVar;
            case 7:
                int i38 = gr5.n.f274941a;
                return gr5.m.f274934a;
            case 8:
                int i39 = gr5.n.f274941a;
                return gr5.m.f274938e;
            default:
                throw new jz5.j();
        }
        return nVar;
    }
}
