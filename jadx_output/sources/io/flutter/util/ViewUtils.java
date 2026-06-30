package io.flutter.util;

/* loaded from: classes14.dex */
public final class ViewUtils {

    /* loaded from: classes14.dex */
    public interface DisplayUpdater {
        void updateDisplayMetrics(float f17, float f18, float f19);
    }

    /* loaded from: classes14.dex */
    public interface ViewVisitor {
        boolean run(android.view.View view);
    }

    public static void calculateMaximumDisplayMetrics(android.content.Context context, io.flutter.util.ViewUtils.DisplayUpdater displayUpdater) {
        if (context != null) {
            android.graphics.Point displayRealSize = getDisplayRealSize(context);
            displayUpdater.updateDisplayMetrics(displayRealSize.x, displayRealSize.y, context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean childHasFocus(android.view.View view) {
        return traverseHierarchy(view, new ez5.a$$a());
    }

    public static android.app.Activity getActivity(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return getActivity(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static android.graphics.Point getDisplayRealSize(android.content.Context context) {
        android.graphics.Point point = new android.graphics.Point();
        if (context == null) {
            return point;
        }
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static boolean hasChildViewOfType(android.view.View view, final java.lang.Class<? extends android.view.View>[] clsArr) {
        return traverseHierarchy(view, new io.flutter.util.ViewUtils.ViewVisitor() { // from class: ez5.a$$b
            @Override // io.flutter.util.ViewUtils.ViewVisitor
            public final boolean run(android.view.View view2) {
                boolean lambda$hasChildViewOfType$1;
                lambda$hasChildViewOfType$1 = io.flutter.util.ViewUtils.lambda$hasChildViewOfType$1(clsArr, view2);
                return lambda$hasChildViewOfType$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$hasChildViewOfType$1(java.lang.Class[] clsArr, android.view.View view) {
        for (java.lang.Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean traverseHierarchy(android.view.View view, io.flutter.util.ViewUtils.ViewVisitor viewVisitor) {
        if (view == null) {
            return false;
        }
        if (viewVisitor.run(view)) {
            return true;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                if (traverseHierarchy(viewGroup.getChildAt(i17), viewVisitor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
