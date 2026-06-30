package io.flutter.embedding.engine.mutatorsstack;

/* loaded from: classes14.dex */
public class FlutterMutatorsStack {
    private java.util.List<io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutator> mutators = new java.util.ArrayList();
    private android.graphics.Matrix finalMatrix = new android.graphics.Matrix();
    private java.util.List<android.graphics.Path> finalClippingPaths = new java.util.ArrayList();
    private float finalOpacity = 1.0f;

    /* loaded from: classes14.dex */
    public enum FlutterMutatorType {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public java.util.List<android.graphics.Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public android.graphics.Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public java.util.List<io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutator> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(android.graphics.Path path) {
        this.mutators.add(new io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutator(path));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i17, int i18, int i19, int i27, float[] fArr) {
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, i19, i27);
        this.mutators.add(new io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutator(rect, fArr));
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(new android.graphics.RectF(rect), fArr, android.graphics.Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i17, int i18, int i19, int i27) {
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, i19, i27);
        this.mutators.add(new io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutator(rect));
        android.graphics.Path path = new android.graphics.Path();
        path.addRect(new android.graphics.RectF(rect), android.graphics.Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f17) {
        this.mutators.add(new io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutator(f17));
        this.finalOpacity *= f17;
    }

    public void pushTransform(float[] fArr) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutator flutterMutator = new io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutator(matrix);
        this.mutators.add(flutterMutator);
        this.finalMatrix.preConcat(flutterMutator.getMatrix());
    }

    /* loaded from: classes14.dex */
    public class FlutterMutator {
        private android.graphics.Matrix matrix;
        private float opacity;
        private android.graphics.Path path;
        private float[] radiis;
        private android.graphics.Rect rect;
        private io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutatorType type;

        public FlutterMutator(android.graphics.Rect rect) {
            this.opacity = 1.0f;
            this.type = io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutatorType.CLIP_RECT;
            this.rect = rect;
        }

        public android.graphics.Matrix getMatrix() {
            return this.matrix;
        }

        public float getOpacity() {
            return this.opacity;
        }

        public android.graphics.Path getPath() {
            return this.path;
        }

        public android.graphics.Rect getRect() {
            return this.rect;
        }

        public io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutatorType getType() {
            return this.type;
        }

        public FlutterMutator(android.graphics.Rect rect, float[] fArr) {
            this.opacity = 1.0f;
            this.type = io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutatorType.CLIP_RRECT;
            this.rect = rect;
            this.radiis = fArr;
        }

        public FlutterMutator(android.graphics.Path path) {
            this.opacity = 1.0f;
            this.type = io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutatorType.CLIP_PATH;
            this.path = path;
        }

        public FlutterMutator(android.graphics.Matrix matrix) {
            this.opacity = 1.0f;
            this.type = io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutatorType.TRANSFORM;
            this.matrix = matrix;
        }

        public FlutterMutator(float f17) {
            this.opacity = 1.0f;
            this.type = io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack.FlutterMutatorType.OPACITY;
            this.opacity = f17;
        }
    }
}
