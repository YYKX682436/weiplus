package l95;

/* loaded from: classes14.dex */
public abstract class c {
    public static final int GetHeight = 1;
    public static final int GetWidth = 0;
    public static final int Render = 2;

    public static void done(android.os.Looper looper) {
        if (looper != null) {
            l95.a aVar = l95.b.f317413a;
            synchronized (l95.b.class) {
                l95.b.f317413a.b(looper);
                l95.b.f317414b.b(looper);
                l95.b.f317415c.b(looper);
                l95.b.f317416d.b(looper);
            }
        }
    }

    public static int getHeight(l95.c cVar) {
        return cVar.doCommand(1, new java.lang.Object[0]);
    }

    public static int getWidth(l95.c cVar) {
        return cVar.doCommand(0, new java.lang.Object[0]);
    }

    public static android.graphics.Matrix instanceMatrix(android.os.Looper looper) {
        android.graphics.Matrix matrix;
        l95.a aVar = l95.b.f317413a;
        synchronized (l95.b.class) {
            l95.a aVar2 = l95.b.f317415c;
            matrix = (android.graphics.Matrix) aVar2.a(looper);
            if (matrix == null) {
                matrix = new android.graphics.Matrix();
            } else {
                matrix.reset();
            }
            aVar2.c(looper, matrix);
        }
        return matrix;
    }

    public static float[] instanceMatrixArray(android.os.Looper looper) {
        float[] fArr;
        l95.a aVar = l95.b.f317413a;
        synchronized (l95.b.class) {
            l95.a aVar2 = l95.b.f317414b;
            fArr = (float[]) aVar2.a(looper);
            if (fArr == null) {
                fArr = new float[9];
            } else {
                java.lang.System.arraycopy(l95.b.f317417e, 0, fArr, 0, 9);
            }
            aVar2.c(looper, fArr);
        }
        return fArr;
    }

    public static android.graphics.Paint instancePaint(android.os.Looper looper) {
        return l95.b.a(looper, null);
    }

    public static android.graphics.Path instancePath(android.os.Looper looper) {
        return l95.b.b(looper, null);
    }

    public static void render(l95.c cVar, android.graphics.Canvas canvas, android.os.Looper looper) {
        cVar.doCommand(2, canvas, looper);
    }

    public static float[] setMatrixFloatArray(float[] fArr, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39) {
        if (fArr != null) {
            fArr[0] = f17;
            fArr[1] = f18;
            fArr[2] = f19;
            fArr[3] = f27;
            fArr[4] = f28;
            fArr[5] = f29;
            fArr[6] = f37;
            fArr[7] = f38;
            fArr[8] = f39;
        }
        return fArr;
    }

    public abstract int doCommand(int i17, java.lang.Object... objArr);

    public static android.graphics.Paint instancePaint(android.graphics.Paint paint, android.os.Looper looper) {
        return l95.b.a(looper, paint);
    }

    public static android.graphics.Path instancePath(android.graphics.Path path, android.os.Looper looper) {
        return l95.b.b(looper, path);
    }
}
