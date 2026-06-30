package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes9.dex */
public abstract class f7 {
    public static int a(com.tencent.mm.pluginsdk.ui.tools.v3 v3Var) {
        if (v3Var == null) {
            return 0;
        }
        int childCount = v3Var.getChildCount();
        int height = v3Var.getHeight() - v3Var.getPaddingBottom();
        android.view.View childAt = v3Var.getChildAt(childCount - 1);
        return (childAt != null ? childAt.getBottom() : 0) - height;
    }

    public static void b(com.tencent.mm.pluginsdk.ui.tools.v3 v3Var, int i17, int i18, boolean z17, boolean z18) {
        int i19;
        if (v3Var == null) {
            return;
        }
        if ((v3Var.getFirstVisiblePosition() < i17 && i17 < v3Var.getLastVisiblePosition()) && z18) {
            com.tencent.mars.xlog.Log.getLogLevel();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ScrollController", "setSelectionFromTop position22 %s smooth %s, y %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        v3Var.setItemChecked(i17, true);
        if (!z17 || !fp.h.c(24) || c(v3Var, i17)) {
            com.tencent.mars.xlog.Log.getLogLevel();
            v3Var.setSelectionFromTop(i17, i18);
            return;
        }
        int lastVisiblePosition = v3Var.getLastVisiblePosition();
        int firstVisiblePosition = v3Var.getFirstVisiblePosition();
        int c17 = v3Var.getHeight() > 0 ? (int) ((i65.a.c(v3Var.getContext(), r0) / 712.0f) * 1800.0f) : 1800;
        if (i17 < firstVisiblePosition) {
            c17 /= firstVisiblePosition - i17;
        } else if (i17 > lastVisiblePosition) {
            c17 /= ((i17 - lastVisiblePosition) + 1) * 2;
        } else if (i17 == v3Var.s().getCount() - 1) {
            int c18 = i65.a.c(v3Var.getContext(), a(v3Var));
            boolean z19 = v3Var instanceof com.tencent.mm.pluginsdk.ui.tools.ScrollControlListView;
            if (z19) {
                i19 = i65.a.c(v3Var.getContext(), ((com.tencent.mm.pluginsdk.ui.tools.ScrollControlListView) v3Var).getF191440h());
                if (i19 != 0) {
                    c18 -= i19;
                }
            } else {
                i19 = 0;
            }
            float f17 = c18;
            if (f17 >= 52.0f) {
                c17 = (int) ((52.0f / f17) * c17);
            }
            if (z19 && i19 < 15) {
                v3Var.getChildCount();
                long j17 = 0;
                if (j17 > 0) {
                    c17 = (int) (c17 + j17);
                }
            }
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        com.tencent.mars.xlog.Log.getLogLevel();
        v3Var.smoothScrollToPositionFromTop(i17, i18, c17);
    }

    public static boolean c(com.tencent.mm.pluginsdk.ui.tools.v3 v3Var, int i17) {
        int lastVisiblePosition = v3Var.getLastVisiblePosition();
        int firstVisiblePosition = v3Var.getFirstVisiblePosition();
        if (i17 < firstVisiblePosition && firstVisiblePosition - i17 >= 20) {
            com.tencent.mars.xlog.Log.getLogLevel();
            return true;
        }
        if (i17 <= lastVisiblePosition || i17 - lastVisiblePosition < 20) {
            com.tencent.mars.xlog.Log.getLogLevel();
            return false;
        }
        com.tencent.mars.xlog.Log.getLogLevel();
        return true;
    }
}
